package vn.nethuynh.keycloak.resetpasswordspi.resource;

import org.keycloak.Config.Scope;
import org.keycloak.authentication.actiontoken.ActionTokenHandler;
import org.keycloak.authentication.actiontoken.ActionTokenHandlerFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class ResetPasswordActionTokenHandlerProviderFactory implements ActionTokenHandlerFactory<ResetPasswordActionToken>{

    private static final String RESET_PASSWORD_PROVIDER_ID = ResetPasswordActionToken.RESET_PASSWORD_TOKEN_TYPE;

    @Override
    public void close() {
    }

    @Override
    public ActionTokenHandler<ResetPasswordActionToken> create(KeycloakSession arg0) {
        return null;
    }

    @Override
    public String getId() {
        return RESET_PASSWORD_PROVIDER_ID;
    }

    @Override
    public void init(Scope arg0) {
    }

    @Override
    public void postInit(KeycloakSessionFactory arg0) {
    }
    
}
