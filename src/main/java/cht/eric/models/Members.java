package cht.eric.models;
// Generated 2023年6月19日 下午2:30:18 by Hibernate Tools 6.1.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Members generated by hbm2java
 */
public class Members implements java.io.Serializable {

	private int id;
	private Users users;
	private String name;
	private String region;
	private Set memberPrivilegeses = new HashSet(0);

	public Members() {
	}

	public Members(int id, Users users, String name, String region) {
		this.id = id;
		this.users = users;
		this.name = name;
		this.region = region;
	}

	public Members(int id, Users users, String name, String region, Set memberPrivilegeses) {
		this.id = id;
		this.users = users;
		this.name = name;
		this.region = region;
		this.memberPrivilegeses = memberPrivilegeses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set getMemberPrivilegeses() {
		return this.memberPrivilegeses;
	}

	public void setMemberPrivilegeses(Set memberPrivilegeses) {
		this.memberPrivilegeses = memberPrivilegeses;
	}

}