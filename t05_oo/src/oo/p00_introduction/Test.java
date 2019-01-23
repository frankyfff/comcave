package oo.p00_introduction;

import java.io.Serializable;

public class Test {
  public static void main(String[] args) {
    Kfz kfz1 = new Kfz();
    
    // Fahrtmittel fm1 = new Kfz();
    // Startable st1 = new Kfz();
    // Kfz kfz2 = (Kfz) new Fahrtmittel(); // --> ClassCastException
    // Kfz kfz3 = (Kfz) fm1; // KEIN PROBLEM, weil fm1 referenziert auf ein Kfz-Objekt

    System.out.println("kfz1 instanceof Startable --> " + (kfz1 instanceof Startable));
    System.out.println("kfz1 instanceof Fahrtmittel --> " + (kfz1 instanceof Fahrzeug));
  }
  
  public void test(Object obj) {
    if (obj instanceof Startable) {
      // ...
    }
  }
}


class Fahrzeug {
  private String hersteller;
}

interface Startable {
  void start();
}

interface Acceleratable {
  int STEP = 10; // public static final
  void accelerate(); // public abstract
}

/* abstract*/ class Kfz extends Fahrzeug implements Startable, Acceleratable, Serializable {

  @Override
  public void start() {
    System.out.println("Das Kfz wird gestartet ...");
  }


  @Override
  public void accelerate() {
    System.out.println("Das Kfz wird beschleunigt ...");
  }

  
}

