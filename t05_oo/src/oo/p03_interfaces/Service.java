package oo.p03_interfaces;


public class Service {
  private int size; // 5
  private int maxIndex; // maxIndex=0,1,2,3,4  maxIndex=5 --> Fehlermeldung: "Hinzufügen von Obj..."
  Startable[] startables;
  
  public Service(int size) {
    this.size = size;
    startables = new Startable[size];
  }
  
  public void startAll() {
    for (int i = 0; i < startables.length; i++) {
      startables[i].start();
     }
  }
  public void add(Startable startable) {
    if (maxIndex == size)
      System.out.println("Hinzufügen von Objekten nicht mehr möglich.");
    else {
      startables[maxIndex] = startable;
      maxIndex++;
    }
  }
  
}
