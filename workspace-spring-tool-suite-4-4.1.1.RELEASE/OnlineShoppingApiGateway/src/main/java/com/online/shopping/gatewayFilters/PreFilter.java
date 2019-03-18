package com.online.shopping.gatewayFilters;

import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
 

/*
 * pre filter code – We will add the below pre filter. Currently filters are doing nothing apart 
 * from a println for testing purpose. 
 * But actually those are powerful enough to do many important aspects as mentioned before.
 * 
 */
public class PreFilter extends ZuulFilter {
 
  @Override
  public String filterType() {
    return "pre";
  }
 
  @Override
  public int filterOrder() {
    return 1;
  }
 
  @Override
  public boolean shouldFilter() {
    return true;
  }
 
  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
 
    System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
    return null;
  }
}