package oo.p08_design_pattern;

public class TestService {

  // #################### Singleton Design Pattern (Entwurfsmuster) ####################
  private static TestService testService;

  public static TestService getInstance() {
    if (testService == null)
      testService = new TestService();
    return testService;
  }

  private TestService() {
  }
  // ###################################################################################
  
  
}


class Test{
  void test() {
    TestService service1 = TestService.getInstance();
    TestService service2 = TestService.getInstance();
    
    
  }
}