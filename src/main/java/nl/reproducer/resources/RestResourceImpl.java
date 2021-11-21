package nl.reproducer.resources;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

public class RestResourceImpl implements RestResource {

    private static final Logger LOG = Logger.getLogger( RestResourceImpl.class );

    public Response test(String version) {
        LOG.debug( String.format( "register: %s", version ) );
        return Response.ok().entity( "ok: " + version ).type( MediaType.APPLICATION_XML ).build();
    }
}
