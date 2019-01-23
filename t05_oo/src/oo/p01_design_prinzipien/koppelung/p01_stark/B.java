package oo.p01_design_prinzipien.koppelung.p01_stark;

public class B {

  private A a;

  public void testMethode() {
    a = new A();
    
    a.methode1();
    
    a.methode2();
    
    a.methode3();
    
    a.methode4();
  }
}
