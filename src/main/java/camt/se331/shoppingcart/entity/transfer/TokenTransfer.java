package camt.se331.shoppingcart.entity.transfer;

/**
 * Created by SKY on 4/20/2016.
 */
public class TokenTransfer {
    private final String token;
    public TokenTransfer(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
