package com.qa.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import com.qa.model.Game;
import com.qa.model.Player;
import com.qa.repository.GameRepo;
import com.qa.repository.PlayerRepo;

@Path("/")
public class GameEnd {

	@Inject
	private GameRepo gameRepo;
	
	@GET
	@Path("/games")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		List<Game> list = gameRepo.readAll();
		if (list.size() == 0) {
			return Response.noContent().build();
		}
		return Response.ok(list).build();
	}
	
	@GET
	@Path("/games/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response readGame(@PathParam("id") int id) {
		if (gameRepo.readGame(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		Game game = gameRepo.readGame(id);
		return Response.ok(game).build();
	}
	
	@POST
	@Consumes({"application/json"})
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/games")
	public Response createGame(Game gameRS, @Context UriInfo uriInfo) {
		gameRS = gameRepo.createGame(gameRS);
		URI createdURI = uriInfo.getBaseUriBuilder().path(""+gameRS.getGame_id()).build();
		System.out.println(createdURI);
		return Response.ok(createdURI.toString()).status(Status.CREATED).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({"application/json"})
	@Path("/games/{id}")
	public Response updateGame(Game game, @PathParam("id") int id) {
		if (gameRepo.readGame(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		Game gameRS2 = gameRepo.updateGame(id, game);
		return Response.ok(gameRS2).build();
	}
	
	@DELETE
	@Path("/games/{id}")
	public Response deleteGame(@PathParam("id") int id) {
		if (gameRepo.readGame(id).equals(null)){
			return Response.status(Status.NOT_FOUND).build();
		}
		gameRepo.deleteGame(id);
		return Response.noContent().build();
	}
	
	
	
	
	
}
