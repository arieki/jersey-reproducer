package com.example.jerseyreproducer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/entity")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Entity getSimpleEntity() {
        SimpleEntity simpleEntity = new SimpleEntity();
        simpleEntity.setName("this is simple entity");
        return simpleEntity;
    }
}