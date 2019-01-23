package oo.p03_interfaces;

public class InterfaceTest {
  
  public static void main(String[] args) {
//    Startable s1 = new Startable(); // FEHLER

//    PC pc20 = new PC();
//    pc20.start();
//    
//    Waschmaschine wm20 = new Waschmaschine();
//    wm20.start();
    
    Startable st1 = null;
    
    st1 = new PC();
    start(st1);
    
    st1 = new Waschmaschine();
    start(st1);

    PC pc2 = new PC();
    Waschmaschine wm2 = new Waschmaschine();
    start(st1, pc2, wm2, new Waschmaschine());
  }
  
// varargs
  public static void start(Startable... startables) {
    
    for (Startable startable : startables) {
      System.out.print(startable.getClass().getName() + " ---> ");
      // vorher
      startable.start();
      // nachher
    }
  }
  
//  public static void start(Startable st) {
//    // Zeit festhalten --> t0
//    st.start();
//    // Zeit festhalten --> t1
//  }

//  public static void start(Waschmaschine wm) {
//    // Zeit festhalten --> t0
//    wm.start();
//    // Zeit festhalten --> t1
//  }
//  public static void start(PC pc) {
//    // Zeit festhalten --> t0
//    pc.start();
//    // Zeit festhalten --> t1
//  }
}

