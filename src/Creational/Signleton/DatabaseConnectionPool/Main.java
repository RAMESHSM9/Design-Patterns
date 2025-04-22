package Signleton.DatabaseConnectionPool;

public class Main {
    public static void main(String[] args) {
        //# 5 connections
        ConnectionPool obj = ConnectionPoolImpl.getInstance(5);

        obj.initializePool();
        System.out.println(obj.getTotalConnectionsCount() + " Available connection "+ obj.getAvailableConnectionsCount());
        DatabaseConnection con1 = obj.getConnection();

        System.out.println(obj.getTotalConnectionsCount() + " Available connection "+ obj.getAvailableConnectionsCount());
        DatabaseConnection con2 = obj.getConnection();
        DatabaseConnection con3 = obj.getConnection();
        System.out.println(obj.getTotalConnectionsCount() + " Available connection "+ obj.getAvailableConnectionsCount());
        obj.releaseConnection(con1);
        System.out.println(obj.getTotalConnectionsCount() + " Available connection "+ obj.getAvailableConnectionsCount());
        DatabaseConnection con4 = obj.getConnection();
        DatabaseConnection con5 = obj.getConnection();
        System.out.println(obj.getTotalConnectionsCount() + " Available connection "+ obj.getAvailableConnectionsCount());
        DatabaseConnection con6 = obj.getConnection();
        System.out.println(obj.getTotalConnectionsCount() + " Available connection "+ obj.getAvailableConnectionsCount());

        DatabaseConnection con7 = obj.getConnection();
        System.out.println(obj.getTotalConnectionsCount() + " Available connection "+ obj.getAvailableConnectionsCount());
    }
}
