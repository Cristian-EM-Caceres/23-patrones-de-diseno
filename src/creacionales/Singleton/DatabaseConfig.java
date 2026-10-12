package creacionales.Singleton;

public class DatabaseConfig {
    private static DatabaseConfig instance;
    private String connectionUrl;

    private DatabaseConfig() {
        this.connectionUrl = "jdbc:mysql://localhost:3306/production_db";
        System.out.println("Instancia de DatabaseConfig creada.");
    }

    public static synchronized DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public String getConnectionString() {
        return connectionUrl;
    }
}
