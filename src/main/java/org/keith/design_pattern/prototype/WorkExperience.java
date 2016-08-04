package org.keith.design_pattern.prototype;

/**
 * 工作经历
 * 
 *
 * @date 2016-7-19
 * @author keith
 */
public class WorkExperience implements Cloneable {

	private String company;
	
	private String workDate;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	@Override
	public WorkExperience clone() {
		
		try {
			return (WorkExperience) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return null;
	}
	
	@Override
	public String toString() {
		return this.company+";"+this.hashCode();
	}
	
	public static void main(String[] args) {
		WorkExperience workExperience = new WorkExperience();
		workExperience.setCompany("A");
		System.out.println(workExperience);
		WorkExperience workExperience2 = workExperience.clone();
		workExperience2.setCompany("B");
		System.out.println(workExperience2);
	}
}
