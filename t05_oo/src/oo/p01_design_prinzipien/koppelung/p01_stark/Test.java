package oo.p01_design_prinzipien.koppelung.p01_stark;

public class Test {

  public static void main(String[] args) {
   
    PKW pkw1 = new PKW();
    PKWStarter pkwStarter = new PKWStarter(pkw1);
    pkwStarter.start();
    
    LKW lkw1 = new LKW();
    LKWStarter lkwStarter = new LKWStarter(lkw1);
    lkwStarter.start();
  }

}
