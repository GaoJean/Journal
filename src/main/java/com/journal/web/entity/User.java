package com.journal.web.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class User implements Serializable {
	
	private static final long serialVersionUID = 9164429946837828474L;

	@ApiModelProperty(value="用户id")
	private Long id;
	
	@ApiModelProperty(value="用户名字")
	private String name;
	
	@ApiModelProperty(value="用户年纪")
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

}
