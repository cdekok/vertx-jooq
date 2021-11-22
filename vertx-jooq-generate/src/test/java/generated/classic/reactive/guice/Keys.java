/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.guice;


import generated.classic.reactive.guice.tables.Something;
import generated.classic.reactive.guice.tables.Somethingcomposite;
import generated.classic.reactive.guice.tables.Somethingwithoutjson;
import generated.classic.reactive.guice.tables.records.SomethingRecord;
import generated.classic.reactive.guice.tables.records.SomethingcompositeRecord;
import generated.classic.reactive.guice.tables.records.SomethingwithoutjsonRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * vertx.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SomethingRecord> SOMETHING_PKEY = Internal.createUniqueKey(Something.SOMETHING, DSL.name("something_pkey"), new TableField[] { Something.SOMETHING.SOMEID }, true);
    public static final UniqueKey<SomethingcompositeRecord> SOMETHINGCOMPOSITE_PKEY = Internal.createUniqueKey(Somethingcomposite.SOMETHINGCOMPOSITE, DSL.name("somethingComposite_pkey"), new TableField[] { Somethingcomposite.SOMETHINGCOMPOSITE.SOMEID, Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID }, true);
    public static final UniqueKey<SomethingwithoutjsonRecord> SOMETHINGWITHOUTJSON_PKEY = Internal.createUniqueKey(Somethingwithoutjson.SOMETHINGWITHOUTJSON, DSL.name("somethingWithoutJson_pkey"), new TableField[] { Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID }, true);
}
