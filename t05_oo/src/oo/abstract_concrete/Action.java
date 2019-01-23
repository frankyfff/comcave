package oo.abstract_concrete;
// #########################################################
// #########################################################
// #########################################################

public abstract class Action {  // PersonSaveAction, PersonDeleteAction, PersonListAction, ....

  public void run() {
    //class FQN (fully qualified name): "oo.abstract_concrete.Action"
    String classFQN = this.getClass().getName();
    System.out.format("\n=================== %s BEGIN ===================%n", classFQN); 
    execute();
    System.out.format("=================== %s END   ===================%n", classFQN); 
  }

// abstract = nicht fertig / Implementierung steht noch nicht fest
  public abstract void execute();
}
// #########################################################
// #########################################################
// #########################################################

class PersonSaveAction extends Action {

//  @Override // KANN hier überschrieben werden
//  public void run() {
//
//  }
  @Override // MUSS hier überschrieben werden
  public void execute() {
    System.out.println("Person wird gespeichert ...");
  }
}
// #########################################################
// #########################################################
// #########################################################
class PersonListAction extends Action {

  @Override 
  public void execute() {
    System.out.println("Personen werden aufgelistet ...");
  }
}
