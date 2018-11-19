package com.Sudeepta;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

@Path("/checkprocessingservice")
public interface checkProcessor {
	@POST
	@Path("/checks")
	public void processChecks(@Suspended AsyncResponse response, Checklist checkList);
}
