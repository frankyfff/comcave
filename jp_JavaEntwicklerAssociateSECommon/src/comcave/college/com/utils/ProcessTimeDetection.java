/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.com.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author RSTE203
 */
public class ProcessTimeDetection
{
    private LocalDateTime startDate, endDate;
    private boolean test   = false;
    private boolean verbose= false;
    /***********************************************************************************/
    public ProcessTimeDetection()
    {
        this.setStartDate();
    }
    /***********************************************************************************/
    /**
     * @param test 
     */
    public ProcessTimeDetection(boolean test)
    {
        this.test= test;
        
        this.setStartDate();
    }
    /***********************************************************************************/
    private void setStartDate()
    {
         this.startDate= ((!this.test) ? LocalDateTime.now() : this.getTestStartDate());
    }
    /***********************************************************************************/
    private void setEndDate()
    {
        this.endDate= ((!this.test) ? LocalDateTime.now() : this.getTestEndDate());
        
        if(verbose)
        {
            System.out.println("Start-Datum & Zeit: " + this.startDate);
            System.out.println("End-Datum & Zeit:   " + this.endDate);
        }
    }
    /***********************************************************************************/
    private String getChronoUnitForSecondsAfterFirst(LocalDateTime firstLocalDateTime,
                                                     LocalDateTime secondLocalDateTime)
    {
 //       System.out.println("Aktuell-Datum & Zeit: " + LocalDateTime.now());

        /*Separate LocalDateTime to LocalDate & LocalTime*/
        LocalDate firstLocalDate = firstLocalDateTime.toLocalDate();
        LocalTime firstLocalTime = firstLocalDateTime.toLocalTime();
        LocalDate secondLocalDate= secondLocalDateTime.toLocalDate();
        LocalTime secondLocalTime= secondLocalDateTime.toLocalTime();

        if(verbose)
        {
            System.out.println("Start-Datum:        " + firstLocalDate);
            System.out.println("Start-Zeit:         " + firstLocalTime);
            System.out.println("End-Datum:          " + secondLocalDate);
            System.out.println("End-Zeit:           " + secondLocalTime);
        }
        
        /*Calculate the time difference*/
        Duration duration                = Duration.between(firstLocalDateTime,secondLocalDateTime);
        if(verbose) System.out.println("Dauer:              " + duration); /*Dauer: PT48H24M10.00000008S*/
        long durationDays                = duration.toDays();
        if(verbose) System.out.println("Dauer-Tage:         " + durationDays); /*Dauer: PT48H24M10.00000008S*/
        Duration throughoutTheDayDuration= duration.minusDays(durationDays);
        Period period                    = Period.between(firstLocalDate,secondLocalDate);

        if(verbose) System.out.println("Period:             " + period);
        /*Correct the date-difference*/
        if(secondLocalTime.isBefore(firstLocalTime))
        {
            period= period.minusDays(1);

            if(verbose) System.out.println("Period corrected: " + period);
        }

        String rHours       = Long.toString(duration.toHours());
        String rMinutes     = Long.toString((throughoutTheDayDuration.toMinutes() % 60));
        String rSeconds     = Long.toString((throughoutTheDayDuration.getSeconds() % 60));
        if(verbose) System.out.println("Nanos:              " + throughoutTheDayDuration.getNano());
        String rMilliseconds= Long.toString(TimeUnit.NANOSECONDS.toMillis(throughoutTheDayDuration.getNano()));
        
        StringBuilder retVal= new StringBuilder();
        retVal.append(((rHours.length() == 1) ? "0" : "")).append(rHours).append(":");
        retVal.append(((rMinutes.length() == 1) ? "0" : "")).append(rMinutes).append(":");
        retVal.append(((rSeconds.length() == 1) ? "0" : "")).append(rSeconds).append(".");
        retVal.append(rMilliseconds);

        return retVal.toString();
    }
    /***********************************************************************************/
    /**
     * @return 
     */
    public String getFormatedReleaseTime()
    {
        this.setEndDate();
        
        return this.getChronoUnitForSecondsAfterFirst(this.startDate,this.endDate);
    }
    /***********************************************************************************/    
    private LocalDateTime getTestStartDate()
    {
        return LocalDateTime.of(2018, // Jahr
                                10,   // Monat
                                18,   // Tag
                                11,   // Stunden
                                0,    // Minuten
                                0,    // Sekunden
                                0);   // Nanosekunden
    }
    /***********************************************************************************/
    private LocalDateTime getTestEndDate()
    {
        /*59:24:10.80*/
        return LocalDateTime.of(2018, // Jahr
                                10,   // Monat
                                20,   // Tag
                                11,   // Stunden
                                24,   // Minuten
                                10,   // Sekunden
                                8000000); // Nanosekunden
    }
    /***********************************************************************************/
    /**
     * @param verbose 
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose= verbose;
    }
    /***********************************************************************************/
}
