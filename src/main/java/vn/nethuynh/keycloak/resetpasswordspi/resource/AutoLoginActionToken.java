package vn.nethuynh.keycloak.resetpasswordspi.resource;

import org.keycloak.authentication.actiontoken.DefaultActionToken;

public class AutoLoginActionToken extends DefaultActionToken{

    public static final String AUTO_LOGIN_TOKEN_TYPE = "auto-login";

    private AutoLoginActionToken() {
    }
}
