package BuilderPattern.DatabaseConfigurationBuilder;

@WithBuilder
public class DatabaseConfigurationBuilder {

    //@ attributes of the Database Configuration
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    public DatabaseConfigurationBuilder(Builder databaseConfigurationBuilder) {
        this.databaseUrl = databaseConfigurationBuilder.getDatabaseUrl();
        this.username = databaseConfigurationBuilder.getUsername();
        this.password = databaseConfigurationBuilder.getPassword();
        this.maxConnections = databaseConfigurationBuilder.getMaxConnections();
        this.enableCache = databaseConfigurationBuilder.isEnableCache();
        this.isReadOnly = databaseConfigurationBuilder.isReadOnly();
    }

    public static class Builder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        //@setters
        public Builder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder setEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        public Builder setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
            return this;
        }

        public DatabaseConfigurationBuilder build() {
            return new DatabaseConfigurationBuilder(this);
        }

        //@ getters
        public boolean isReadOnly() {
            return isReadOnly;
        }

        public boolean isEnableCache() {
            return enableCache;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public String getPassword() {
            return password;
        }

        public String getUsername() {
            return username;
        }

        public String getDatabaseUrl() {
            return databaseUrl;
        }
    }
}
