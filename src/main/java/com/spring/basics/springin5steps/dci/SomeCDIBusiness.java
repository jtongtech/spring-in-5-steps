package com.spring.basics.springin5steps.dci;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void SomeCdiDao(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

}
