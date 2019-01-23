package oo.p01_design_prinzipien.koppelung.p02_schwach;

public class Test {

  public static void main(String[] args) {
    FahrzeugStarter fzStarter = new FahrzeugStarter(new PKW());
    fzStarter.start();
    
    fzStarter.setFahrzeug(new LKW());
    fzStarter.start();
    
    fzStarter.setFahrzeug(new Motorad());
    fzStarter.start();
  }

}
