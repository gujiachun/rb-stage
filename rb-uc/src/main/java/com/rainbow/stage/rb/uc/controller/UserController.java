package com.rainbow.stage.rb.uc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rainbow.stage.rb.uc.service.BaseUserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Value("${language.en:你好}")
	private String hello;
	
	@Autowired
	private BaseUserService BaseUserService;
	
	@Autowired  
    private DiscoveryClient discoveryClient;  
	
	@RequestMapping("/{id}")
	public String getUserInfo(@PathVariable int id){
		return hello + "," + BaseUserService.getUserName(id);
	}
	
	@RequestMapping("/services")
	public String getClientServices(){
		System.out.println(discoveryClient.getLocalServiceInstance()); 
		for( String s :  discoveryClient.getServices()){  
            System.out.println("services " + s);  
            List<ServiceInstance> serviceInstances =  discoveryClient.getInstances(s);  
            for(ServiceInstance si : serviceInstances){  
                System.out.println("    services:" + s + ":getHost()=" + si.getHost());  
                System.out.println("    services:" + s + ":getPort()=" + si.getPort());  
                System.out.println("    services:" + s + ":getServiceId()=" + si.getServiceId());  
                System.out.println("    services:" + s + ":getUri()=" + si.getUri());  
                System.out.println("    services:" + s + ":getMetadata()=" + si.getMetadata());  
            }  
              
        }  
		return "";
	}
}
