package vn.nethuynh.keycloak.resetpasswordspi.resource;

import org.keycloak.authentication.actiontoken.DefaultActionToken;

public class ResetPasswordActionToken extends DefaultActionToken{

    public static final String RESET_PASSWORD_TOKEN_TYPE = "reset-password";

    private ResetPasswordActionToken() {
    }
}
