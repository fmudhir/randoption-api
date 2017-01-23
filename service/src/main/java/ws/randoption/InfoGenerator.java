package ws.randoption;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import java.security.SecureRandom;
import java.math.BigInteger;


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

        String newId = nextSessionId();
        newId = randomUpper(newId, 0.5);

        return new InfoGeneratorJson(newId);
    }
}