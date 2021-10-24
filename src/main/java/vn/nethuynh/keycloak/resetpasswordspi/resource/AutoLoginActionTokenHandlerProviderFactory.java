package vn.nethuynh.keycloak.resetpasswordspi.resource;

import org.keycloak.Config.Scope;
import org.keycloak.authentication.actiontoken.ActionTokenHandler;
import org.keycloak.authentication.actiontoken.ActionTokenHandlerFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class AutoLoginActionTokenHandlerProviderFactory implements ActionTokenHandlerFactory<AutoLoginActionToken>{

    private static final String AUTO_LOGIN_PROVIDER_ID = AutoLoginActionToken.AUTO_LOGIN_TOKEN_TYPE;

    @Override
    public void close() {
    }

    @Override
    public ActionTokenHandler<AutoLoginActionToken> create(KeycloakSession arg0) {
        return null;
    }

    @Override
    public String getId() {
        return AUTO_LOGIN_PROVIDER_ID;
    }

    @Override
    public void init(Scope arg0) {
    }

    @Override
    public void postInit(KeycloakSessionFactory arg0) {
    }
    
}
