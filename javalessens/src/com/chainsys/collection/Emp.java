package com.chainsys.collection;

import java.io.Serializable;

public class Emp implements Serializable {
	final int id;
	public String Name;
	
	public Emp(int v1,String sName) {
		id = v1;
		Name=sName;
	}
	public double getId() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Class c1 = obj.getClass();
		boolean flag = false;
		if(c1 == this.getClass()) {
			Emp other =(Emp) obj;
			if (this.hashCode()== other.hashCode()) {
				flag = true;
			}
		}
		return flag;
	}
}
