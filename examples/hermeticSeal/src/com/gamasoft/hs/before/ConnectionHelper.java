package com.gamasoft.hs.before;

public class ConnectionHelper {

    public Connection connect(String clientId, ConnectionPool connections) {

        connections.authUser(clientId);
        return connections.borrowConnection();
    }

}
