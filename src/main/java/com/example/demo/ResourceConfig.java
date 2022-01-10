package com.example.demo;

import javax.ws.rs.ApplicationPath;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/jersey")
public class ResourceConfig extends org.glassfish.jersey.server.ResourceConfig implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		registerClasses(TestResource.class);
	}


}
