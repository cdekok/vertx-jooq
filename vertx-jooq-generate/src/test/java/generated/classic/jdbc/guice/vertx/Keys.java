/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.guice.vertx;


import generated.classic.jdbc.guice.vertx.tables.Something;
import generated.classic.jdbc.guice.vertx.tables.Somethingcomposite;
import generated.classic.jdbc.guice.vertx.tables.records.SomethingRecord;
import generated.classic.jdbc.guice.vertx.tables.records.SomethingcompositeRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * VERTX.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SomethingRecord> SYS_PK_10292 = Internal.createUniqueKey(Something.SOMETHING, DSL.name("SYS_PK_10292"), new TableField[] { Something.SOMETHING.SOMEID }, true);
    public static final UniqueKey<SomethingcompositeRecord> SYS_PK_10296 = Internal.createUniqueKey(Somethingcomposite.SOMETHINGCOMPOSITE, DSL.name("SYS_PK_10296"), new TableField[] { Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID }, true);
}
