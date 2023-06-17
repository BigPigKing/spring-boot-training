/*
 * This file is generated by jOOQ.
 */
package org.jooq.your.packagename.cht_newcomer_training.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.your.packagename.cht_newcomer_training.ChtNewcomerTraining;
import org.jooq.your.packagename.cht_newcomer_training.Keys;
import org.jooq.your.packagename.cht_newcomer_training.enums.MembersRegion;
import org.jooq.your.packagename.cht_newcomer_training.tables.records.MembersRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Members extends TableImpl<MembersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>cht_newcomer_training.members</code>
     */
    public static final Members MEMBERS = new Members();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MembersRecord> getRecordType() {
        return MembersRecord.class;
    }

    /**
     * The column <code>cht_newcomer_training.members.id</code>.
     */
    public final TableField<MembersRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>cht_newcomer_training.members.name</code>.
     */
    public final TableField<MembersRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>cht_newcomer_training.members.region</code>.
     */
    public final TableField<MembersRecord, MembersRegion> REGION = createField(DSL.name("region"), SQLDataType.VARCHAR(7).nullable(false).asEnumDataType(org.jooq.your.packagename.cht_newcomer_training.enums.MembersRegion.class), this, "");

    /**
     * The column <code>cht_newcomer_training.members.user_id</code>.
     */
    public final TableField<MembersRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Members(Name alias, Table<MembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Members(Name alias, Table<MembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>cht_newcomer_training.members</code> table
     * reference
     */
    public Members(String alias) {
        this(DSL.name(alias), MEMBERS);
    }

    /**
     * Create an aliased <code>cht_newcomer_training.members</code> table
     * reference
     */
    public Members(Name alias) {
        this(alias, MEMBERS);
    }

    /**
     * Create a <code>cht_newcomer_training.members</code> table reference
     */
    public Members() {
        this(DSL.name("members"), null);
    }

    public <O extends Record> Members(Table<O> child, ForeignKey<O, MembersRecord> key) {
        super(child, key, MEMBERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ChtNewcomerTraining.CHT_NEWCOMER_TRAINING;
    }

    @Override
    public Identity<MembersRecord, Integer> getIdentity() {
        return (Identity<MembersRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MembersRecord> getPrimaryKey() {
        return Keys.KEY_MEMBERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<MembersRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_MEMBERS_UNQ_MEMBERS);
    }

    @Override
    public List<ForeignKey<MembersRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_MEMBERS_USERS);
    }

    private transient Users _users;

    /**
     * Get the implicit join path to the
     * <code>cht_newcomer_training.users</code> table.
     */
    public Users users() {
        if (_users == null)
            _users = new Users(this, Keys.FK_MEMBERS_USERS);

        return _users;
    }

    @Override
    public Members as(String alias) {
        return new Members(DSL.name(alias), this);
    }

    @Override
    public Members as(Name alias) {
        return new Members(alias, this);
    }

    @Override
    public Members as(Table<?> alias) {
        return new Members(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Members rename(String name) {
        return new Members(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Members rename(Name name) {
        return new Members(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Members rename(Table<?> name) {
        return new Members(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, MembersRegion, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super MembersRegion, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super MembersRegion, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}