package com.snsystems;

import javax.sound.midi.Track;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/json/test")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public User getTrackInJSON() {

		User user = new User();
		user.setUsername("sathyamus");
		user.setPassword("sai");

		return user;
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(User user) {

		String result = "User submitted : " + user;
		return Response.status(201).entity(result).build();

	}
}
