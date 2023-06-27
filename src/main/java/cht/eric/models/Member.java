package cht.eric.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


/**
 * The persistent class for the member database table.
 *
 */
@Entity
@Table(name="member")
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=100)
	private String name;

	@Column(nullable=false)
	private byte region;

	//bi-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name="user_id", referencedColumnName="id", nullable=false)
	private User user;

	//bi-directional many-to-many association to MemberPrivilege
	@ManyToMany(mappedBy="members", fetch=FetchType.EAGER)
	private List<MemberPrivilege> memberPrivileges;

	public Member() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getRegion() {
		return this.region;
	}

	public void setRegion(byte region) {
		this.region = region;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<MemberPrivilege> getMemberPrivileges() {
		return this.memberPrivileges;
	}

	public void setMemberPrivileges(List<MemberPrivilege> memberPrivileges) {
		this.memberPrivileges = memberPrivileges;
	}

}