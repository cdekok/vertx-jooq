/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.custom.vertx.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Something implements VertxPojo, Serializable {

    private static final long serialVersionUID = -1875632433;

    private Integer       someid;
    private String        somestring;
    private Long          somehugenumber;
    private Short         somesmallnumber;
    private Integer       someregularnumber;
    private Boolean       someboolean;
    private Double        somedouble;
    private JsonObject    somejsonobject;
    private JsonArray     somejsonarray;
    private LocalDateTime sometimestamp;

    public Something() {}

    public Something(Something value) {
        this.someid = value.someid;
        this.somestring = value.somestring;
        this.somehugenumber = value.somehugenumber;
        this.somesmallnumber = value.somesmallnumber;
        this.someregularnumber = value.someregularnumber;
        this.someboolean = value.someboolean;
        this.somedouble = value.somedouble;
        this.somejsonobject = value.somejsonobject;
        this.somejsonarray = value.somejsonarray;
        this.sometimestamp = value.sometimestamp;
    }

    public Something(
        Integer       someid,
        String        somestring,
        Long          somehugenumber,
        Short         somesmallnumber,
        Integer       someregularnumber,
        Boolean       someboolean,
        Double        somedouble,
        JsonObject    somejsonobject,
        JsonArray     somejsonarray,
        LocalDateTime sometimestamp
    ) {
        this.someid = someid;
        this.somestring = somestring;
        this.somehugenumber = somehugenumber;
        this.somesmallnumber = somesmallnumber;
        this.someregularnumber = someregularnumber;
        this.someboolean = someboolean;
        this.somedouble = somedouble;
        this.somejsonobject = somejsonobject;
        this.somejsonarray = somejsonarray;
        this.sometimestamp = sometimestamp;
    }

    public Integer getSomeid() {
        return this.someid;
    }

    public Something setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    public String getSomestring() {
        return this.somestring;
    }

    public Something setSomestring(String somestring) {
        this.somestring = somestring;
        return this;
    }

    public Long getSomehugenumber() {
        return this.somehugenumber;
    }

    public Something setSomehugenumber(Long somehugenumber) {
        this.somehugenumber = somehugenumber;
        return this;
    }

    public Short getSomesmallnumber() {
        return this.somesmallnumber;
    }

    public Something setSomesmallnumber(Short somesmallnumber) {
        this.somesmallnumber = somesmallnumber;
        return this;
    }

    public Integer getSomeregularnumber() {
        return this.someregularnumber;
    }

    public Something setSomeregularnumber(Integer someregularnumber) {
        this.someregularnumber = someregularnumber;
        return this;
    }

    public Boolean getSomeboolean() {
        return this.someboolean;
    }

    public Something setSomeboolean(Boolean someboolean) {
        this.someboolean = someboolean;
        return this;
    }

    public Double getSomedouble() {
        return this.somedouble;
    }

    public Something setSomedouble(Double somedouble) {
        this.somedouble = somedouble;
        return this;
    }

    public JsonObject getSomejsonobject() {
        return this.somejsonobject;
    }

    public Something setSomejsonobject(JsonObject somejsonobject) {
        this.somejsonobject = somejsonobject;
        return this;
    }

    public JsonArray getSomejsonarray() {
        return this.somejsonarray;
    }

    public Something setSomejsonarray(JsonArray somejsonarray) {
        this.somejsonarray = somejsonarray;
        return this;
    }

    public LocalDateTime getSometimestamp() {
        return this.sometimestamp;
    }

    public Something setSometimestamp(LocalDateTime sometimestamp) {
        this.sometimestamp = sometimestamp;
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
        final Something other = (Something) obj;
        if (someid == null) {
            if (other.someid != null)
                return false;
        }
        else if (!someid.equals(other.someid))
            return false;
        if (somestring == null) {
            if (other.somestring != null)
                return false;
        }
        else if (!somestring.equals(other.somestring))
            return false;
        if (somehugenumber == null) {
            if (other.somehugenumber != null)
                return false;
        }
        else if (!somehugenumber.equals(other.somehugenumber))
            return false;
        if (somesmallnumber == null) {
            if (other.somesmallnumber != null)
                return false;
        }
        else if (!somesmallnumber.equals(other.somesmallnumber))
            return false;
        if (someregularnumber == null) {
            if (other.someregularnumber != null)
                return false;
        }
        else if (!someregularnumber.equals(other.someregularnumber))
            return false;
        if (someboolean == null) {
            if (other.someboolean != null)
                return false;
        }
        else if (!someboolean.equals(other.someboolean))
            return false;
        if (somedouble == null) {
            if (other.somedouble != null)
                return false;
        }
        else if (!somedouble.equals(other.somedouble))
            return false;
        if (somejsonobject == null) {
            if (other.somejsonobject != null)
                return false;
        }
        else if (!somejsonobject.equals(other.somejsonobject))
            return false;
        if (somejsonarray == null) {
            if (other.somejsonarray != null)
                return false;
        }
        else if (!somejsonarray.equals(other.somejsonarray))
            return false;
        if (sometimestamp == null) {
            if (other.sometimestamp != null)
                return false;
        }
        else if (!sometimestamp.equals(other.sometimestamp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.someid == null) ? 0 : this.someid.hashCode());
        result = prime * result + ((this.somestring == null) ? 0 : this.somestring.hashCode());
        result = prime * result + ((this.somehugenumber == null) ? 0 : this.somehugenumber.hashCode());
        result = prime * result + ((this.somesmallnumber == null) ? 0 : this.somesmallnumber.hashCode());
        result = prime * result + ((this.someregularnumber == null) ? 0 : this.someregularnumber.hashCode());
        result = prime * result + ((this.someboolean == null) ? 0 : this.someboolean.hashCode());
        result = prime * result + ((this.somedouble == null) ? 0 : this.somedouble.hashCode());
        result = prime * result + ((this.somejsonobject == null) ? 0 : this.somejsonobject.hashCode());
        result = prime * result + ((this.somejsonarray == null) ? 0 : this.somejsonarray.hashCode());
        result = prime * result + ((this.sometimestamp == null) ? 0 : this.sometimestamp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Something (");

        sb.append(someid);
        sb.append(", ").append(somestring);
        sb.append(", ").append(somehugenumber);
        sb.append(", ").append(somesmallnumber);
        sb.append(", ").append(someregularnumber);
        sb.append(", ").append(someboolean);
        sb.append(", ").append(somedouble);
        sb.append(", ").append(somejsonobject);
        sb.append(", ").append(somejsonarray);
        sb.append(", ").append(sometimestamp);

        sb.append(")");
        return sb.toString();
    }

    public Something(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Something fromJson(io.vertx.core.json.JsonObject json) {
        setSomeid(json.getInteger("SOMEID"));
        setSomestring(json.getString("SOMESTRING"));
        setSomehugenumber(json.getLong("SOMEHUGENUMBER"));
        setSomesmallnumber(json.getInteger("SOMESMALLNUMBER")==null?null:json.getInteger("SOMESMALLNUMBER").shortValue());
        setSomeregularnumber(json.getInteger("SOMEREGULARNUMBER"));
        setSomeboolean(json.getBoolean("SOMEBOOLEAN"));
        setSomedouble(json.getDouble("SOMEDOUBLE"));
        setSomejsonobject(json.getJsonObject("SOMEJSONOBJECT"));
        setSomejsonarray(json.getJsonArray("SOMEJSONARRAY"));
        setSometimestamp(json.getString("SOMETIMESTAMP")==null?null:LocalDateTime.parse(json.getString("SOMETIMESTAMP")));
        return this;
    }


    @Override
    public io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("SOMEID",getSomeid());
        json.put("SOMESTRING",getSomestring());
        json.put("SOMEHUGENUMBER",getSomehugenumber());
        json.put("SOMESMALLNUMBER",getSomesmallnumber());
        json.put("SOMEREGULARNUMBER",getSomeregularnumber());
        json.put("SOMEBOOLEAN",getSomeboolean());
        json.put("SOMEDOUBLE",getSomedouble());
        json.put("SOMEJSONOBJECT",getSomejsonobject());
        json.put("SOMEJSONARRAY",getSomejsonarray());
        json.put("SOMETIMESTAMP",getSometimestamp()==null?null:getSometimestamp().toString());
        return json;
    }

}
