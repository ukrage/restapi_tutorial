package net.raisetech.restapi;

public class CreateResponse {
    public String getMessage() {
        return message;
    }

    private String message;

    public CreateResponse(String message) {
        this.message = message;
    }
}
