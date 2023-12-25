package net.raisetech.restapi;

public class nameCreateRequest {
    private String givenName;
    private String familyName;

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public nameCreateRequest(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }
}
