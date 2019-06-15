package com.zhujunwei.domain3;

import java.util.HashSet;
import java.util.Set;

public class S {
	
	private Long s_id;
	private String s_name;
	private Set<C> cc = new HashSet<C>();
	
	public Long getS_id() {
		return s_id;
	}
	public void setS_id(Long s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Set<C> getCc() {
		return cc;
	}
	public void setCc(Set<C> cc) {
		this.cc = cc;
	}
}
