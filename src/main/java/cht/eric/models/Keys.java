/*
 * This file is generated by jOOQ.
 */
package cht.eric.models;


import cht.eric.models.tables.Member;
import cht.eric.models.tables.MemberMemberPrivilegeRelation;
import cht.eric.models.tables.MemberPrivilege;
import cht.eric.models.tables.Order;
import cht.eric.models.tables.User;

import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * cht_newcomer_training.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Record> KEY_MEMBER_KEY_MEMBER_UNQ_MEMBERS = Internal.createUniqueKey(Member.MEMBER, DSL.name("KEY_member_KEY_member_unq_members"), new TableField[] { Member.MEMBER.USER_ID }, true);
    public static final UniqueKey<Record> KEY_MEMBER_PRIMARY = Internal.createUniqueKey(Member.MEMBER, DSL.name("KEY_member_PRIMARY"), new TableField[] { Member.MEMBER.ID }, true);
    public static final UniqueKey<Record> KEY_MEMBER_UNQ_MEMBERS = Internal.createUniqueKey(Member.MEMBER, DSL.name("KEY_member_unq_members"), new TableField[] { Member.MEMBER.USER_ID }, true);
    public static final UniqueKey<Record> KEY_MEMBER_MEMBER_PRIVILEGE_RELATION_PRIMARY = Internal.createUniqueKey(MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION, DSL.name("KEY_member_member_privilege_relation_PRIMARY"), new TableField[] { MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION.MEMBER_ID, MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION.MEMBER_PRIVILEGE_ID }, true);
    public static final UniqueKey<Record> KEY_MEMBER_PRIVILEGE_PRIMARY = Internal.createUniqueKey(MemberPrivilege.MEMBER_PRIVILEGE, DSL.name("KEY_member_privilege_PRIMARY"), new TableField[] { MemberPrivilege.MEMBER_PRIVILEGE.ID }, true);
    public static final UniqueKey<Record> KEY_ORDER_PRIMARY = Internal.createUniqueKey(Order.ORDER, DSL.name("KEY_order_PRIMARY"), new TableField[] { Order.ORDER.ID }, true);
    public static final UniqueKey<Record> KEY_USER_KEY_USER_UNQ_USERS = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_KEY_user_unq_users"), new TableField[] { User.USER.ACCOUNT }, true);
    public static final UniqueKey<Record> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<Record> KEY_USER_UNQ_USERS = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_unq_users"), new TableField[] { User.USER.ACCOUNT }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<Record, Record> FK_MEMBERS_USERS = Internal.createForeignKey(Member.MEMBER, DSL.name("fk_members_users"), new TableField[] { Member.MEMBER.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<Record, Record> FK_MEMBERS_MEMBER_PRIVILEGES_RELATIONS_MEMBER_PRIVILEGES = Internal.createForeignKey(MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION, DSL.name("fk_members_member_privileges_relations_member_privileges"), new TableField[] { MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION.MEMBER_PRIVILEGE_ID }, Keys.KEY_MEMBER_PRIVILEGE_PRIMARY, new TableField[] { MemberPrivilege.MEMBER_PRIVILEGE.ID }, true);
    public static final ForeignKey<Record, Record> FK_MEMBERS_MEMBER_PRIVILEGES_RELATIONS_MEMBERS = Internal.createForeignKey(MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION, DSL.name("fk_members_member_privileges_relations_members"), new TableField[] { MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION.MEMBER_ID }, Keys.KEY_MEMBER_PRIMARY, new TableField[] { Member.MEMBER.ID }, true);
}