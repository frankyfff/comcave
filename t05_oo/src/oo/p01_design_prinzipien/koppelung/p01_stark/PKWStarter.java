package oo.p01_design_prinzipien.koppelung.p01_stark;

public class PKWStarter {
  
  private PKW pkw;
  
  public PKWStarter(PKW pkw) {
    this.pkw = pkw;
  }
  public void start() {
    // andere Aktionen vorher
    pkw.start();
    // andere Aktionen nachher
  }

}
