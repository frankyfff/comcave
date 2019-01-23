package oo.p03_interfaces;

import java.util.ArrayList;
import java.util.List;

public class ServiceV2 {

  List<Startable> startables; // Collection API: List, ArrayList, Set, HashSet, TreeSet, Map, HashMap, TreeMap

  public ServiceV2() {
    startables = new ArrayList<Startable>(); 
  }

  public void startAll() {
    for (Startable startable : startables) {
      startable.start();
    }
  }

  public void add(Startable startable) {
    startables.add(startable);
  }

}
