package com.americancsm.gdpr.webassess.model;

public enum CertificationEnum {
	NONE, ISO, PCI, HIPAA, US_FEDERAL;
    
    public String properName() {
    	    return this.name().replaceAll("_", " ");
    }
}
