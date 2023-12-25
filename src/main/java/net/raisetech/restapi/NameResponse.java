package net.raisetech.restapi;

public class NameResponse {
    private String givenName;
    private String familyName;

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public NameResponse(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }
}
