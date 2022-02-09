/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.guice.vertx.tables.daos;


import generated.classic.jdbc.guice.vertx.tables.Something;
import generated.classic.jdbc.guice.vertx.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class SomethingDao extends AbstractVertxDAO<SomethingRecord, generated.classic.jdbc.guice.vertx.tables.pojos.Something, Integer, Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>>, Future<generated.classic.jdbc.guice.vertx.tables.pojos.Something>, Future<Integer>, Future<Integer>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer> {
        @javax.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SomethingDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(Something.SOMETHING, generated.classic.jdbc.guice.vertx.tables.pojos.Something.class, new JDBCClassicQueryExecutor<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer>(configuration,generated.classic.jdbc.guice.vertx.tables.pojos.Something.class,vertx));
        }

        @Override
        protected Integer getId(generated.classic.jdbc.guice.vertx.tables.pojos.Something object) {
                return object.getSomeid();
        }

        /**
     * Find records that have <code>SOMESTRING IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomestring(Collection<String> values) {
                return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values));
        }

        /**
     * Find records that have <code>SOMESTRING IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomestring(Collection<String> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEHUGENUMBER IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomehugenumber(Collection<Long> values) {
                return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values));
        }

        /**
     * Find records that have <code>SOMEHUGENUMBER IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomehugenumber(Collection<Long> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values),limit);
        }

        /**
     * Find records that have <code>SOMESMALLNUMBER IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomesmallnumber(Collection<Short> values) {
                return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values));
        }

        /**
     * Find records that have <code>SOMESMALLNUMBER IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomesmallnumber(Collection<Short> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEREGULARNUMBER IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomeregularnumber(Collection<Integer> values) {
                return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values));
        }

        /**
     * Find records that have <code>SOMEREGULARNUMBER IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomeregularnumber(Collection<Integer> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEDECIMAL IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomedecimal(Collection<BigDecimal> values) {
                return findManyByCondition(Something.SOMETHING.SOMEDECIMAL.in(values));
        }

        /**
     * Find records that have <code>SOMEDECIMAL IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomedecimal(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEDECIMAL.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEBOOLEAN IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomeboolean(Collection<Boolean> values) {
                return findManyByCondition(Something.SOMETHING.SOMEBOOLEAN.in(values));
        }

        /**
     * Find records that have <code>SOMEBOOLEAN IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomeboolean(Collection<Boolean> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEBOOLEAN.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEDOUBLE IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomedouble(Collection<Double> values) {
                return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values));
        }

        /**
     * Find records that have <code>SOMEDOUBLE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomedouble(Collection<Double> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEJSONOBJECT IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomejsonobject(Collection<JsonObject> values) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>SOMEJSONOBJECT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomejsonobject(Collection<JsonObject> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEJSONARRAY IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomejsonarray(Collection<JsonArray> values) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values));
        }

        /**
     * Find records that have <code>SOMEJSONARRAY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySomejsonarray(Collection<JsonArray> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values),limit);
        }

        /**
     * Find records that have <code>SOMETIMESTAMP IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySometimestamp(Collection<LocalDateTime> values) {
                return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values));
        }

        /**
     * Find records that have <code>SOMETIMESTAMP IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.jdbc.guice.vertx.tables.pojos.Something>> findManyBySometimestamp(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer> queryExecutor(){
                return (JDBCClassicQueryExecutor<SomethingRecord,generated.classic.jdbc.guice.vertx.tables.pojos.Something,Integer>) super.queryExecutor();
        }
}
