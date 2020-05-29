package com.smi;

public class BeanClass {
	
	int scount;
	int acount;
	public int getScount() {
		return scount++;
	}
	public void setScount(int scount) {
		this.scount = scount;
	}
	public int getAcount() {
		return acount++;
	}
	public void setAcount(int acount) {
		this.acount = acount;
	}
	

}
