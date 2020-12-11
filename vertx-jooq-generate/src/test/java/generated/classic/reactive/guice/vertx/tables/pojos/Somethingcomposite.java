/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.guice.vertx.tables.pojos;


import generated.classic.reactive.guice.vertx.tables.interfaces.ISomethingcomposite;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Somethingcomposite implements VertxPojo, ISomethingcomposite {

    private static final long serialVersionUID = 1796658645;

    private Integer    someid;
    private Integer    somesecondid;
    private JsonObject somejsonobject;

    public Somethingcomposite() {}

    public Somethingcomposite(ISomethingcomposite value) {
        this.someid = value.getSomeid();
        this.somesecondid = value.getSomesecondid();
        this.somejsonobject = value.getSomejsonobject();
    }

    public Somethingcomposite(
        Integer    someid,
        Integer    somesecondid,
        JsonObject somejsonobject
    ) {
        this.someid = someid;
        this.somesecondid = somesecondid;
        this.somejsonobject = somejsonobject;
    }

    public Somethingcomposite(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Integer getSomeid() {
        return this.someid;
    }

    @Override
    public Somethingcomposite setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    @Override
    public Integer getSomesecondid() {
        return this.somesecondid;
    }

    @Override
    public Somethingcomposite setSomesecondid(Integer somesecondid) {
        this.somesecondid = somesecondid;
        return this;
    }

    @Override
    public JsonObject getSomejsonobject() {
        return this.somejsonobject;
    }

    @Override
    public Somethingcomposite setSomejsonobject(JsonObject somejsonobject) {
        this.somejsonobject = somejsonobject;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Somethingcomposite other = (Somethingcomposite) obj;
        if (someid == null) {
            if (other.someid != null)
                return false;
        }
        else if (!someid.equals(other.someid))
            return false;
        if (somesecondid == null) {
            if (other.somesecondid != null)
                return false;
        }
        else if (!somesecondid.equals(other.somesecondid))
            return false;
        if (somejsonobject == null) {
            if (other.somejsonobject != null)
                return false;
        }
        else if (!somejsonobject.equals(other.somejsonobject))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.someid == null) ? 0 : this.someid.hashCode());
        result = prime * result + ((this.somesecondid == null) ? 0 : this.somesecondid.hashCode());
        result = prime * result + ((this.somejsonobject == null) ? 0 : this.somejsonobject.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Somethingcomposite (");

        sb.append(someid);
        sb.append(", ").append(somesecondid);
        sb.append(", ").append(somejsonobject);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISomethingcomposite from) {
        setSomeid(from.getSomeid());
        setSomesecondid(from.getSomesecondid());
        setSomejsonobject(from.getSomejsonobject());
    }

    @Override
    public <E extends ISomethingcomposite> E into(E into) {
        into.from(this);
        return into;
    }
}
