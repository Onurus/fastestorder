package com.fastestorder.microservices.alivewaiters;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "aw" path)
 */
@Path("aw")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class AWResource {

    @GET
    @Path("/waiterAlive/{code}")
    public void waiterAlive(@PathParam("waiterCode") String waiterCode) {
    }

    @GET
    @Path("/waiterNotAlive/{code}")
    public void waiterNotAlive(@PathParam("waiterCode") String waiterCode) {
    }

}
