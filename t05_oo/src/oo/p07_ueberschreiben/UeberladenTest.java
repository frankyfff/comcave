package oo.p07_ueberschreiben;

public class UeberladenTest {
  
// ################### Überladung in der gleichen Klasse ###################
  public double summe(double a, double b) {
    return a + b;
  }

  public double summe(double a, double b, double c) {
    return a + b + c;
  }
}


// ################### Überladung in Super- und -Unterklasse ###################
class Super {
  public double summe(double a, double b) {
    return a + b;
  }
}


class Unter extends Super {
  public double summe(double a, double b, double c) {
    return a + b + c;
  }
}