package io.github.jklingsporn.vertx.jooq.generate.completablefuture.async.regular;

import generated.cf.async.regular.Tables;
import generated.cf.async.regular.enums.SomethingSomeenum;
import generated.cf.async.regular.tables.daos.SomethingDao;
import generated.cf.async.regular.tables.pojos.Something;
import io.github.jklingsporn.vertx.jooq.generate.AsyncDatabaseClientProvider;
import io.github.jklingsporn.vertx.jooq.generate.Credentials;
import io.github.jklingsporn.vertx.jooq.generate.MySQLConfigurationProvider;
import io.github.jklingsporn.vertx.jooq.generate.completablefuture.CompletableFutureTestBase;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import org.jooq.Condition;
import org.junit.BeforeClass;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Created by jensklingsporn on 02.11.16.
 */
public class SomethingDaoNoDefaultValueTest extends CompletableFutureTestBase<Something, Integer, Long, SomethingDao> {

    public SomethingDaoNoDefaultValueTest() {
        super(Tables.SOMETHING.SOMEHUGENUMBER, new SomethingDao(MySQLConfigurationProvider.getInstance().createDAOConfiguration(), AsyncDatabaseClientProvider.getInstance().getVertx(), AsyncDatabaseClientProvider.getInstance().getClient(Credentials.MYSQL)));
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        MySQLConfigurationProvider.getInstance().setupDatabase();
    }

    @Override
    protected Something create() {
        return createWithId().setSomeid(null);
    }

    @Override
    protected Something createWithId() {
        Random random = new Random();
        Something something = new Something();
        something.setSomeid(random.nextInt());
        something.setSomedouble(random.nextDouble());
        something.setSomeregularnumber(random.nextInt());
        something.setSomehugenumber(random.nextLong());
        something.setSomejsonarray(new JsonArray().add(1).add(2).add(3));
        something.setSomejsonobject(new JsonObject().put("key", "value"));
        something.setSomesmallnumber((short) random.nextInt(Short.MAX_VALUE));
        something.setSomestring("my_string");
        something.setSometimestamp(LocalDateTime.now());
        something.setSomeenum(SomethingSomeenum.values()[random.nextInt(SomethingSomeenum.values().length)]);
        return something;
    }

    @Override
    protected Something setId(Something pojo, Integer id) {
        return pojo.setSomeid(id);
    }

    @Override
    protected Something setSomeO(Something pojo, Long someO) {
        return pojo.setSomehugenumber(someO);
    }

    @Override
    protected Integer getId(Something pojo) {
        return pojo.getSomeid();
    }

    @Override
    protected Long createSomeO() {
        return new Random().nextLong();
    }

    @Override
    protected Condition eqPrimaryKey(Integer id) {
        return Tables.SOMETHING.SOMEID.eq(id);
    }

    @Override
    protected void assertDuplicateKeyException(Throwable x) {
        assertException(com.github.jasync.sql.db.mysql.exceptions.MySQLException.class, x);
    }
}
