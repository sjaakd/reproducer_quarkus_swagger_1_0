package nl.reproducer.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.ExampleObject;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path( "" )
public interface RestResource {

    @POST
    @Path( "/reproduce" )
    @Consumes( MediaType.TEXT_PLAIN  )
    @Produces( MediaType.TEXT_PLAIN )
    @Operation(
        operationId = "test",
        summary = "this is a tester",
        description = "a long story for something short: test"
    )
    @RequestBody(
        content = @Content(
            mediaType = MediaType.TEXT_PLAIN,
            examples = {
                @ExampleObject(
                    name = "version",
                    description = "1.0",
                    value = "1.0"
                )
            }
        )
    )
    @APIResponse(
        responseCode = "200",
        content = @Content( mediaType = MediaType.TEXT_PLAIN),
        description = "The result."
    )
    Response test(String xml);
}
