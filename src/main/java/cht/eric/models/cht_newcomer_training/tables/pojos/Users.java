/*
 * This file is generated by jOOQ.
 */
package cht.eric.models.cht_newcomer_training.tables.pojos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "users",
    schema = "cht_newcomer_training",
    uniqueConstraints = {
        @UniqueConstraint(name = "KEY_users_unq_users", columnNames = { "account" })
    }
)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String account;
    private String password;

    public Users() {}

    public Users(Users value) {
        this.id = value.id;
        this.account = value.account;
        this.password = value.password;
    }

    public Users(
        Integer id,
        String account,
        String password
    ) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    /**
     * Getter for <code>cht_newcomer_training.users.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>cht_newcomer_training.users.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>cht_newcomer_training.users.account</code>.
     */
    @Column(name = "account", nullable = false, length = 20)
    @NotNull
    @Size(max = 20)
    public String getAccount() {
        return this.account;
    }

    /**
     * Setter for <code>cht_newcomer_training.users.account</code>.
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Getter for <code>cht_newcomer_training.users.password</code>.
     */
    @Column(name = "password", nullable = false, length = 6000)
    @NotNull
    @Size(max = 6000)
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>cht_newcomer_training.users.password</code>.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Users other = (Users) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.account == null) {
            if (other.account != null)
                return false;
        }
        else if (!this.account.equals(other.account))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.account == null) ? 0 : this.account.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        return result;
    }
}
