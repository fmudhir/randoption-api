package ws.randoption;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/rand/")
public class RandResult {
    @GET
    @Path("/{pid}")
    @Produces(MediaType.APPLICATION_JSON)
    public RandResultJson displayResult(@PathParam("pid") String profileId) {
        return new RandResultJson(profileId);
    }
}