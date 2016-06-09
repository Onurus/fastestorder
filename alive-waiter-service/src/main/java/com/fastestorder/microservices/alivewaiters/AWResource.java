package com.fastestorder.microservices.alivewaiters;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fastestorder.dto.FORestaurant;

/**
 * Root resource (exposed at "aw" path)
 */
@Path("aw")
public class AWResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public FORestaurant getRestaurantByCode(String code) {
	return new FORestaurant();
    }

}
