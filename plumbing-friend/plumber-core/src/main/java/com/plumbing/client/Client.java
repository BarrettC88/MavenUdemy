package com.plumbing.client;

public class Client {

    public String clientName;
    public String clientEmail;


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * This method sets the clients email address. The address cannot be blank, therefore
     * there is an Illegal Argument check on that field
     *
     * @param clientEmail
     */
    public void setClientEmail(String clientEmail) {
        if ("".equals(clientEmail)){
            throw new IllegalArgumentException("The client email cannot be blank");
        }
        this.clientEmail = clientEmail;

    }
}
