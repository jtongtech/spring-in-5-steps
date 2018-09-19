package com.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE);
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}

}
