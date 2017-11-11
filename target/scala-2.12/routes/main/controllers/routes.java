
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/fpt/play-concurrent-connections/conf/routes
// @DATE:Sat Nov 11 21:09:53 ICT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseStaticController StaticController = new controllers.ReverseStaticController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseStaticController StaticController = new controllers.javascript.ReverseStaticController(RoutesPrefix.byNamePrefix());
  }

}
