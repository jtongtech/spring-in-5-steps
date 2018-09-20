package com.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCDIDAO someCdiDao;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
