
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/ftel/play-concurrent-connections/conf/routes
// @DATE:Sun Nov 12 13:06:47 ICT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseStaticController StaticController = new controllers.ReverseStaticController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseStaticController StaticController = new controllers.javascript.ReverseStaticController(RoutesPrefix.byNamePrefix());
  }

}
