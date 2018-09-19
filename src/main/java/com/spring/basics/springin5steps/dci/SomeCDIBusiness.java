package com.spring.basics.springin5steps.dci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCDIBusiness {

	@Autowired
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void SomeCdiDao(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

}
