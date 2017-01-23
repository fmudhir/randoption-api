package ws.randoption;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/rand/")
public class RandResult {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser() {
        return "found user:";
    }

    @GET
    @Path("/{pid}")
    @Produces(MediaType.TEXT_PLAIN)
    public String displayResult(@PathParam("pid") String profileId) {

        return "info for: " + profileId;
    }

}