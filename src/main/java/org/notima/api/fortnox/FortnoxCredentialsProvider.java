package org.notima.api.fortnox;

import org.notima.api.fortnox.clients.FortnoxCredentials;

public abstract class FortnoxCredentialsProvider {
    protected String orgNo;

    public FortnoxCredentialsProvider(String orgNo) {
        this.orgNo = orgNo;
    }
    
    public String getOrgNo() {
    	return orgNo;
    }
    
    public abstract FortnoxCredentials getCredentials() throws Exception;
    public abstract void setCredentials(FortnoxCredentials credentials) throws Exception;
    public abstract void removeCredentials() throws Exception;
}
