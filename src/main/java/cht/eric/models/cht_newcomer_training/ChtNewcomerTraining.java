/*
 * This file is generated by jOOQ.
 */
package cht.eric.models.cht_newcomer_training;


import cht.eric.models.DefaultCatalog;
import cht.eric.models.cht_newcomer_training.tables.MemberPrivileges;
import cht.eric.models.cht_newcomer_training.tables.Members;
import cht.eric.models.cht_newcomer_training.tables.MembersMemberPrivilegesRelations;
import cht.eric.models.cht_newcomer_training.tables.Orders;
import cht.eric.models.cht_newcomer_training.tables.Users;

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
     * The table <code>cht_newcomer_training.member_privileges</code>.
     */
    public final MemberPrivileges MEMBER_PRIVILEGES = MemberPrivileges.MEMBER_PRIVILEGES;

    /**
     * The table <code>cht_newcomer_training.members</code>.
     */
    public final Members MEMBERS = Members.MEMBERS;

    /**
     * The table
     * <code>cht_newcomer_training.members_member_privileges_relations</code>.
     */
    public final MembersMemberPrivilegesRelations MEMBERS_MEMBER_PRIVILEGES_RELATIONS = MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS;

    /**
     * The table <code>cht_newcomer_training.orders</code>.
     */
    public final Orders ORDERS = Orders.ORDERS;

    /**
     * The table <code>cht_newcomer_training.users</code>.
     */
    public final Users USERS = Users.USERS;

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
            MemberPrivileges.MEMBER_PRIVILEGES,
            Members.MEMBERS,
            MembersMemberPrivilegesRelations.MEMBERS_MEMBER_PRIVILEGES_RELATIONS,
            Orders.ORDERS,
            Users.USERS
        );
    }
}
