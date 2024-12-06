package com.lumen.LumenChatCoordinator.discovery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discovery")
public class LumenChatDiscovery {
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping(value = "/geturl")
	public String serviceUrl() {
	    List<ServiceInstance> list = discoveryClient.getInstances("chat");
	    if (list != null && list.size() > 0 ) {
	        return list.get(0).getUri().toString().split("//")[1];
	    }
	    return null;
	}

}
