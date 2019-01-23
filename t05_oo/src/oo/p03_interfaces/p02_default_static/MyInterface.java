package oo.p03_interfaces.p02_default_static;

public abstract interface MyInterface {
  
  public abstract void m1();
  public abstract void m2();
  public abstract void m3();

  // ab java se 8
  public default void newMethod() {
    System.out.println("newMethod in Action ...");
  }
  
  public static void utilMethod() {
    // some util code
  }
}
