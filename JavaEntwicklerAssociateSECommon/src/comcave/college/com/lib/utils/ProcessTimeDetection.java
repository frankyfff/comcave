/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.com.lib.utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author mamiri
 */
public class ProcessTimeDetection {
    
    private LocalDateTime startDate, endDate;
    /************************************************************************************/
    public ProcessTimeDetection()
    {
        this.setStartDate();
    }
    /************************************************************************************/
    private void setStartDate() 
    {
        this.startDate = LocalDateTime.now();
    }
    /************************************************************************************/
    private void steEndDate()
    {
        this.endDate = LocalDateTime.now();
    }
    /************************************************************************************/
    private String getChronoUnitForSecondAfterFirst(LocalDateTime firstLocalDateTime,
                                                    LocalDateTime secLocalDateTime,
                                                    long[] chronoUnits) 
    {
        /*Separate LocalDateTime to LocalDate & LocalTime*/
        LocalDate firstLocalDate = firstLocalDateTime.toLocalDate();
        LocalTime firstLocalTime = firstLocalDateTime.toLocalTime();
        LocalDate secondLocalDate = secLocalDateTime.toLocalDate();
        LocalTime secondLocalTime = secLocalDateTime.toLocalTime();
        
        /*Calculate the time difference*/
        Duration duration = Duration.between(firstLocalTime, secondLocalTime);
        long durationDays = duration.toDays();
        Duration throughoutTheDayDuration = duration.minusDays(durationDays);
        Period period = Period.between(firstLocalDate, secondLocalDate);
        
        /*Correct the date.difference*/
        if(secondLocalTime.isBefore(firstLocalTime))
        {
            period = period.minusDays(1);
            
            System.out.println("Period corrected " + period);
        }
            
        long hours = throughoutTheDayDuration.toHours();
        String rHours = Long.toString(((durationDays > 0) ? ((durationDays * 24)) : hours));
        String rMinutes = Long.toString((throughoutTheDayDuration.toMinutes() % 60));
        String rSeconds = Long.toString((throughoutTheDayDuration.getSeconds() % 60));
        String rMilliseconds = Long.toString(TimeUnit.NANOSECONDS.toMillis(throughoutTheDayDuration.getNano()));
        
        StringBuilder retVal = new StringBuilder();
        retVal.append(((rHours.length() == 1) ? "0" : "")).append(rHours).append(":");
        retVal.append(((rMinutes.length() == 1) ? "0" : "")).append(rMinutes).append(":");
        retVal.append(((rSeconds.length() == 1) ? "0" : "")).append(rSeconds).append(":");
        
        
        return retVal.toString();
    }
    /************************************************************************************/
    private LocalDateTime getTestStartDate() 
    {
        return LocalDateTime.of(2018,   // Jahr
                                10,     // Monat
                                18,     // Tag
                                11,     // Stunden
                                0,      // Minuten
                                0,      // Sekunden
                                0);     // Millisekunden
    }
    /************************************************************************************/
     private LocalDateTime getTestEndDate() 
    {
        return LocalDateTime.of(2018,   // Jahr
                                10,     // Monat
                                18,     // Tag
                                11,     // Stunden
                                0,      // Minuten
                                0,      // Sekunden
                                0);     // Millisekunden
    }
    /************************************************************************************/
}
