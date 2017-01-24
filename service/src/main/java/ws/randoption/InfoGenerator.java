package ws.randoption;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

import java.security.SecureRandom;
import java.math.BigInteger;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import javax.ws.rs.core.Context;
import javax.ws.rs.HeaderParam;


@Path("/gen")
public class InfoGenerator {

    private SecureRandom random = new SecureRandom();

    public String nextSessionId() {
        return new BigInteger(75, random).toString(32);
    }

    public static String randomUpper(String str, double p) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c) && Math.random() < p)
                c = Character.toUpperCase(c);
            sb.append(c);
        }
        return sb.toString();
    }

    @GET
    @Path("/pid")
    @Produces(MediaType.APPLICATION_JSON)
    public InfoGeneratorJson getNewId() {

        DatabaseManager dm = new DatabaseManager();
        DB db = dm.getRDB();
        DBCollection coll = db.getCollection("pidcol");

        String newId = null;
        do {
            newId = nextSessionId();
            newId = randomUpper(newId, 0.5);
        } while(coll.count(new BasicDBObject("pid", newId)) != 0);

        BasicDBObject doc = new BasicDBObject("pid", newId).
                append("createtime", Timestamp.nowString());
        coll.insert(doc);

        return new InfoGeneratorJson(newId);
    }
}