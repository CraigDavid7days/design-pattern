package com.sun.prototype;

import java.io.Serializable;
import java.util.List;

import com.sun.CoderUtil;

public class User implements Cloneable,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7668455399838680274L;
	private String name;
	private Integer age;
	private List<String> accounts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<String> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		byte[] bytes = CoderUtil.serialize(this);
		Object obj = CoderUtil.deserialize(bytes);
		return obj;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", accounts=" + accounts + "]";
	}
	
	

}
