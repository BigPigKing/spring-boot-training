/*
 * This file is generated by jOOQ.
 */
package cht.eric.models.cht_newcomer_training.tables;


import cht.eric.models.cht_newcomer_training.ChtNewcomerTraining;
import cht.eric.models.cht_newcomer_training.Keys;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>cht_newcomer_training.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>cht_newcomer_training.users.id</code>.
     */
    public final TableField<Record, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>cht_newcomer_training.users.account</code>.
     */
    public final TableField<Record, String> ACCOUNT = createField(DSL.name("account"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>cht_newcomer_training.users.password</code>.
     */
    public final TableField<Record, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(6000).nullable(false), this, "");

    private Users(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>cht_newcomer_training.users</code> table
     * reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>cht_newcomer_training.users</code> table
     * reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    /**
     * Create a <code>cht_newcomer_training.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ChtNewcomerTraining.CHT_NEWCOMER_TRAINING;
    }

    @Override
    public Identity<Record, Integer> getIdentity() {
        return (Identity<Record, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_USERS_UNQ_USERS);
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    @Override
    public Users as(Table<?> alias) {
        return new Users(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Table<?> name) {
        return new Users(name.getQualifiedName(), null);
    }
}
