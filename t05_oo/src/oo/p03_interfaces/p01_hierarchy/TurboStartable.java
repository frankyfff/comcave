package oo.p03_interfaces.p01_hierarchy;

import oo.p03_interfaces.Startable;
import oo.p03_interfaces.p01_hierarchy.Acceleratable;

public interface TurboStartable extends Startable, Acceleratable {
  void turboStart();
}
