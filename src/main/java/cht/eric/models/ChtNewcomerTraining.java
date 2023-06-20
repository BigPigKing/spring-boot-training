/*
 * This file is generated by jOOQ.
 */
package cht.eric.models;


import cht.eric.models.tables.Member;
import cht.eric.models.tables.MemberMemberPrivilegeRelation;
import cht.eric.models.tables.MemberPrivilege;
import cht.eric.models.tables.Order;
import cht.eric.models.tables.User;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChtNewcomerTraining extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>cht_newcomer_training</code>
     */
    public static final ChtNewcomerTraining CHT_NEWCOMER_TRAINING = new ChtNewcomerTraining();

    /**
     * The table <code>cht_newcomer_training.member</code>.
     */
    public final Member MEMBER = Member.MEMBER;

    /**
     * The table
     * <code>cht_newcomer_training.member_member_privilege_relation</code>.
     */
    public final MemberMemberPrivilegeRelation MEMBER_MEMBER_PRIVILEGE_RELATION = MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION;

    /**
     * The table <code>cht_newcomer_training.member_privilege</code>.
     */
    public final MemberPrivilege MEMBER_PRIVILEGE = MemberPrivilege.MEMBER_PRIVILEGE;

    /**
     * The table <code>cht_newcomer_training.order</code>.
     */
    public final Order ORDER = Order.ORDER;

    /**
     * The table <code>cht_newcomer_training.user</code>.
     */
    public final User USER = User.USER;

    /**
     * No further instances allowed
     */
    private ChtNewcomerTraining() {
        super("cht_newcomer_training", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Member.MEMBER,
            MemberMemberPrivilegeRelation.MEMBER_MEMBER_PRIVILEGE_RELATION,
            MemberPrivilege.MEMBER_PRIVILEGE,
            Order.ORDER,
            User.USER
        );
    }
}