package com.sun.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User();
		user.setName("张三");
		user.setAge(18);
		List<String> accounts  = new ArrayList<String>();
		accounts.add("123");
		accounts.add("456");
		user.setAccounts(accounts);
		ShallowClone sc = new ShallowClone();
		User su = sc.clone(user);
		System.out.println("浅克隆比较内存地址:"+(user.getAccounts()==su.getAccounts()));
		System.out.println("浅克隆:"+su);
		DeepClone dc = new DeepClone();
		User du =  dc.clone(user);
		System.out.println("深克隆:"+du);
		
	}

}
