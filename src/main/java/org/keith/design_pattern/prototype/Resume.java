package org.keith.design_pattern.prototype;

import com.alibaba.fastjson.JSON;
import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

/**
 * 简历
 *
 * @date 2016-7-19
 * @author keith
 */
public class Resume implements Cloneable {

	private String name;
	
	private String sex;
	
	private WorkExperience workExperience;

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getSex() {
		return sex;
	}

	
	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	
	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}
	
	public Resume clone() {
		
		try {
			return (Resume)super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return null;
	}

	public Resume deepClone() {
		
		try {
			Resume resume = (Resume)super.clone();
			resume.setWorkExperience(this.workExperience.clone());
			return resume;
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return null;
	}
	
	public Resume deepClone2() {
		
		RuntimeSchema<Resume> schema = (RuntimeSchema<Resume>) RuntimeSchema.createFrom(this.getClass());
		final byte[] bytes = ProtostuffIOUtil.toByteArray(this, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
		
		Resume resume = schema.newMessage();
		ProtostuffIOUtil.mergeFrom(bytes, resume, schema);
		return resume;
	}
	
	public Resume deepClone3() {
		String resumeJson = JSON.toJSONString(this);
		return JSON.parseObject(resumeJson, Resume.class);
	}
	
	@Override
	public String toString() {
		return this.name+";"+this.workExperience.getCompany()+";"+this.hashCode()+";"+this.getWorkExperience().hashCode();
	}
}
