package oo.p01_design_prinzipien.koppelung.p01_stark;

public class LKWStarter {
  
  private LKW lkw;
  
  public LKWStarter(LKW lkw) {
    this.lkw = lkw;
  }
  public void start() {
    // andere Aktionen vorher
    lkw.start();
    // andere Aktionen nachher
  }

}
