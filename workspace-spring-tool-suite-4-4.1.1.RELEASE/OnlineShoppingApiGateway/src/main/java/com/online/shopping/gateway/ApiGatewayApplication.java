package com.online.shopping.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.online.shopping.gatewayFilters.ErrorFilter;
import com.online.shopping.gatewayFilters.PostFilter;
import com.online.shopping.gatewayFilters.PreFilter;
import com.online.shopping.gatewayFilters.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	/*
	 * Add Zuul Filters
		We will now add few filters as we have already described, Zuul supports 4 types of filters namely 
		pre,post,route and error. Here we will create each type of filters.

		To write a filter we need to do basically those steps:

		Need to extend com.netflix.zuul.ZuulFilter
		Need to override filterType, filterOrder, shouldFilter and run methods. Here filterType method 
		can only return any one of four String – pre/post/route/error. Depedending on this value the filter 
		will act like a particular filter.
		run method is the place where our filter logic should be placed depending on our requirement.
		Also we can add any number of any particular filter based on our need, this case filterOrder will 
		come into place to determine the order of that filer at the phase of execution of that type of filter.
	 */
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
	 
}
