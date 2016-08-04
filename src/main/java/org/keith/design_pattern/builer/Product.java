package org.keith.design_pattern.builer;

import java.util.HashSet;
import java.util.Set;

public class Product {

	private Set<String> parts = new HashSet<String>();
	
	public void addPart(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("展示部件：");
		for(String str : parts){
			System.out.print(str);
		}
	}
}
