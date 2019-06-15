package com.zhujunwei.domain3;

import java.util.HashSet;
import java.util.Set;

public class C {
	
	private Long c_id ;
	private String c_name ;
	private Set<S> ss = new HashSet<S>();
	
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Set<S> getSs() {
		return ss;
	}
	public void setSs(Set<S> ss) {
		this.ss = ss;
	}
	
	
}
