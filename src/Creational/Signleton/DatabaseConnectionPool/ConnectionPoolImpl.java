package Signleton.DatabaseConnectionPool;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPoolImpl implements ConnectionPool{

    private static ConnectionPoolImpl instance;
    private static int _maxConnections;
    private Queue<DatabaseConnection> availableConnections;
    private HashSet<DatabaseConnection> inUseConnections;

    private ConnectionPoolImpl() {
        availableConnections = new LinkedList<DatabaseConnection>();
        inUseConnections = new HashSet<>();
        initializePool();
    }

    public static ConnectionPoolImpl getInstance() {
        if (instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (instance == null) {
                    instance = new ConnectionPoolImpl();
                }
            }
        }
        return instance;
    }

    public static ConnectionPoolImpl getInstance(int maxConnections) {
        _maxConnections = maxConnections;
        return getInstance();
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void initializePool() {
        for(int i=0;i<_maxConnections;i++) {
            availableConnections.add(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        if(!availableConnections.isEmpty()) {
            DatabaseConnection connection = availableConnections.poll();
            inUseConnections.add(connection);
            return connection;
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if(inUseConnections.contains(connection)) {
            inUseConnections.remove(connection);
            availableConnections.add(connection);
        }
    }

    @Override
    public int getAvailableConnectionsCount() {
        return (_maxConnections - inUseConnections.size());
    }

    @Override
    public int getTotalConnectionsCount() {
        return _maxConnections;
    }
}
