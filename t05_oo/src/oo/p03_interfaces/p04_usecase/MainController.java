package oo.p03_interfaces.p04_usecase;

public class MainController {

  public void userAction1() {
//    PersonServiceOracleDB personService = new PersonServiceOracleDB();
//    PersonServiceXml personService = new PersonServiceXml();
    PersonService personService = PersonServiceFactory.getInstance();
    personService.action1();
  }
  public void userAction2() {
//    PersonServiceOracleDB personService = new PersonServiceOracleDB();
//    PersonServiceXml personService = new PersonServiceXml();
    PersonService personService = PersonServiceFactory.getInstance();
    personService.action2();
  }
  public void userAction3() {
//    PersonServiceOracleDB personService = new PersonServiceOracleDB();
//    PersonServiceXml personService = new PersonServiceXml();
    PersonService personService = PersonServiceFactory.getInstance();
    personService.action3();
  }

}
