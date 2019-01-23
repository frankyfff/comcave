package oo.p03_interfaces;

public class ServiceTest {

  public static void main(String[] args) {
    
//    serviceTest();
    serviceV2Test();
    System.out.println("###################################################");

  }

  private static void serviceTest() {
    Service service = new Service(3);  // basiert auf ein Startable[]
    // PC pc1 = new PC();
    Startable pc1 = new PC(); // Polymorphismus
    PC pc2 = new PC();
    Waschmaschine wm1 = new Waschmaschine();
    PC pc3 = new PC();
    PC pc4 = new PC();
    Waschmaschine wm2 = new Waschmaschine();

    service.add(pc1);
    service.add(pc2);
    service.add(wm1);
    service.add(pc3);
    service.add(pc4);
    service.add(wm2);

    service.startAll();
  }

  private static void serviceV2Test() {
    ServiceV2 serviceV2 = new ServiceV2(); // Collection API: List<Startable>, ArrayList<Startable>
    Startable pc1 = new PC(); // Polymorphismus
    PC pc2 = new PC();
    Waschmaschine wm1 = new Waschmaschine();
    PC pc3 = new PC();
   
    serviceV2.add(wm1);
    serviceV2.add(pc1);
    serviceV2.add(pc3);
    serviceV2.add(pc2);

    serviceV2.startAll();
  }

}
