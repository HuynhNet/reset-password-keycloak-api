package vn.nethuynh.keycloak.resetpasswordspi.resource;

import javax.ws.rs.core.Response;

import org.keycloak.authentication.actiontoken.AbstractActionTokenHander;
import org.keycloak.authentication.actiontoken.ActionTokenContext;
import org.keycloak.events.EventType;

public class AutoLoginActionTokenHandlerProvider extends AbstractActionTokenHander<AutoLoginActionToken>{

    public AutoLoginActionTokenHandlerProvider(String id, Class<AutoLoginActionToken> tokenClass,
            String defaultErrorMessage, EventType defaultEventType, String defaultEventError) {
        super(id, tokenClass, defaultErrorMessage, defaultEventType, defaultEventError);
    }
    
    @Override
    public Response handleToken(AutoLoginActionToken arg0, ActionTokenContext<AutoLoginActionToken> arg1) {
        return null;
    }
    
}
