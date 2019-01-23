package oo.abstract_concrete;

public class ActionTest {

  public static void main(String[] args) {
    Action action = new PersonSaveAction();
    action.run();
    action = new PersonListAction();
    action.run();
  }
}
