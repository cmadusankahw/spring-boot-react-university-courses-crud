package com.cmadusankahw.springboot.maven.crud.departmentCourses.model;

public class Course {
	private Long id;
	private String department;
	private String description;
	private int target;

	public Course() {

	}

	public Course(long id, String department, String description, int target) {
		super();
		this.id = id;
		this.department = department;
		this.description = description;
		this.target = target;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return department;
	}

	public void setUsername(String username) {
		this.department = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target= target;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		return true;
	}

}
