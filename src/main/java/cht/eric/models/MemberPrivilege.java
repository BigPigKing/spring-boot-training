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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the member_privilege database table.
 *
 */
@Entity
@Table(name="member_privilege")
@NamedQuery(name="MemberPrivilege.findAll", query="SELECT m FROM MemberPrivilege m")
public class MemberPrivilege implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="privilege_name", nullable=false, length=100)
	private String privilegeName;

	//bi-directional many-to-many association to Member
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="member_member_privilege_relation"
		, joinColumns={
			@JoinColumn(name="member_privilege_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="member_id", nullable=false)
			}
		)
	private List<Member> members;

	public MemberPrivilege() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrivilegeName() {
		return this.privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}