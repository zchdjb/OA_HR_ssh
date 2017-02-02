package cn.edu.gcu.oa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 岗位
 * 
 * @author zch
 * 
 */
public class Role {

	private Long id;
	private String name;
	private String description;
	private Set<User> users = new HashSet<User>();

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + ", users=" + users + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
