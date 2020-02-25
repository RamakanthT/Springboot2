package com.example.demo.model;

import java.util.List;

public class Student {
	   private List<Integer> age;
	   private List<String> name;
	   private List<Integer> id;

	   public void setAge(List<Integer> age) {
	      this.age = age;
	   }
	   public List<Integer> getAge() {
	      return age;
	   }
	   public void setName(List<String> name) {
	      this.name = name;
	   }
	   public List<String> getName() {
	      return name;
	   }
	  
	public void setId(List<Integer> id) {
	      this.id = id;
	   }
	   public List<Integer> getId() {
	      return id;
	   }
	  
	}
