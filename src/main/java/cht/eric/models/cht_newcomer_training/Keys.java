/*
 * This file is generated by jOOQ.
 */
package cht.eric.models.cht_newcomer_training;


import cht.eric.models.cht_newcomer_training.tables.MemberPrivileges;
import cht.eric.models.cht_newcomer_training.tables.Members;
import cht.eric.models.cht_newcomer_training.tables.MembersMemberPrivilegesRelations;
import cht.eric.models.cht_newcomer_training.tables.Orders;
import cht.eric.models.cht_newcomer_training.tables.Users;

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

    public static final UniqueKey<Record> KEY_MEMBER_PRIVILEGES_PRIMARY = Internal.createUniqueKey(MemberPrivileges.MEMBER_PRIVILEGES, DSL.name("KEY_member_privileges_PRIMARY"), new TableField[] { MemberPrivileges.MEMBER_PRIVILEGES.ID }, true);
    public static final UniqueKey<Record> KEY_MEMBERS_PRIMARY = Internal.createUniqueKey(Members.MEMBERS, DSL.name("KEY_members_PRIMARY"), new TableField[] { Members.MEMBERS.ID }, true);
    public static final UniqueKey<Record> KEY_MEMBERS_UNQ_MEMBERS = Internal.createUniqueKey(Members.MEMBERS, DSL.name("KEY_members_unq_members"), new TableField[] { Members.MEMBERS.USER_ID }, true);
    public static final UniqueKey<Record> KEY_MEMBERS_MEMBER_PRIVILEGES_RELATIONS_PRIMARY = Internal.createUniqueKey(MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS, DSL.name("KEY_members_member_privileges_relations_PRIMARY"), new TableField[] { MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS.MEMBER_ID, MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS.MEMBER_PRIVILEGE_ID }, true);
    public static final UniqueKey<Record> KEY_ORDERS_PRIMARY = Internal.createUniqueKey(Orders.ORDERS, DSL.name("KEY_orders_PRIMARY"), new TableField[] { Orders.ORDERS.ID }, true);
    public static final UniqueKey<Record> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_PRIMARY"), new TableField[] { Users.USERS.ID }, true);
    public static final UniqueKey<Record> KEY_USERS_UNQ_USERS = Internal.createUniqueKey(Users.USERS, DSL.name("KEY_users_unq_users"), new TableField[] { Users.USERS.ACCOUNT }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<Record, Record> FK_MEMBERS_USERS = Internal.createForeignKey(Members.MEMBERS, DSL.name("fk_members_users"), new TableField[] { Members.MEMBERS.USER_ID }, Keys.KEY_USERS_PRIMARY, new TableField[] { Users.USERS.ID }, true);
    public static final ForeignKey<Record, Record> FK_MEMBERS_MEMBER_PRIVILEGES_RELATIONS_MEMBER_PRIVILEGES = Internal.createForeignKey(MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS, DSL.name("fk_members_member_privileges_relations_member_privileges"), new TableField[] { MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS.MEMBER_PRIVILEGE_ID }, Keys.KEY_MEMBER_PRIVILEGES_PRIMARY, new TableField[] { MemberPrivileges.MEMBER_PRIVILEGES.ID }, true);
    public static final ForeignKey<Record, Record> FK_MEMBERS_MEMBER_PRIVILEGES_RELATIONS_MEMBERS = Internal.createForeignKey(MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS, DSL.name("fk_members_member_privileges_relations_members"), new TableField[] { MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS.MEMBER_ID }, Keys.KEY_MEMBERS_PRIMARY, new TableField[] { Members.MEMBERS.ID }, true);
}
