package org.keith.design_pattern.prototype;

import com.alibaba.fastjson.JSON;

public class Main {

	public static void main(String[] args) {
		Resume resume = new Resume();
		resume.setName("X");
		WorkExperience w1 = new WorkExperience();
		w1.setCompany("A");
		resume.setWorkExperience(w1);

		Resume resume1 = resume.clone();
		resume1.setName("Y");
		resume1.getWorkExperience().setCompany("B");
		
		Resume resume2 = resume.deepClone();
		resume2.setName("Z");
		resume2.getWorkExperience().setCompany("C");
		
		Resume resume3 = resume.deepClone2();
		resume3.setName("U");
		resume3.getWorkExperience().setCompany("D");
		
		Resume resume4 = resume.deepClone3();
		resume4.setName("V");
		resume4.getWorkExperience().setCompany("E");
		
		System.out.println(resume);
		System.out.println(resume1);
		System.out.println(resume2);
		System.out.println(resume3);
		System.out.println(resume4);
	}
}
