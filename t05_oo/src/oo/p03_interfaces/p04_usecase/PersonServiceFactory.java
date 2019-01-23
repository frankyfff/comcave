package oo.p03_interfaces.p04_usecase;

public class PersonServiceFactory {

    public static PersonService getInstance() { 
      return new PersonServiceOracleDB();
//       return new PersonServiceXml();  
      // Alternative aus Konfigurationsdatei entscheiden, 
      // ob PersonServiceXml oder PersonServiceOracleDB zurückgegeben wird
    }

  
}
