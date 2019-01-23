package oo.p03_interfaces;



public /* abstract */ interface Startable {
  // ################# Innere Typdeklarationen #################
  interface InnerInt { }
  class     InnerClass {}
  enum      InnerEnum {}
  @interface InnerAnnot {}
  // ################# Konstanten #################
  /* public static final */ int MAX_SPEED = 1200; 
  // ################# Abstrakte Methoden #################
  /* public abstract */ void start();
}






















































abstract class StartableImpl implements Startable {

  public void test1() { // konkrete Methode
    // ...
  }
  
  public abstract void test2();
  
}

/*final*/ class ImmediateStarter extends StartableImpl {
  @Override
  public void test1() {
    // meine Aktionen 
//    super.test1();
  }

  // *************** MUSS ***************
  @Override
  public void test2() {
//    super.test1();
  }

  @Override
  public void start() {

  }
  // ************************************
}

class Banane extends ImmediateStarter {}

class Test {
  public void m() {
//    StartableImpl si = new StartableImpl();
    ImmediateStarter immediateStarter = new ImmediateStarter();
    immediateStarter.test1();
  }
  
  
}