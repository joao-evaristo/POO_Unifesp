package dao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author joaoe
 */
public class DataSource {
    private String hostname;
    private int port;
    private String database;
    private String username;
    private String password;
    
    private Connection connection;
    
    public DataSource(){
        try {
            hostname = "localhost";
            port = 3306;
            database = "nome_bd";
            password = "senha";
            
            String url = "jbdc:mysql://"+hostname+":"+port+"/"+database;
            
            DriverManager.registerDriver(new com.mysql.jbdc.Driver());
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão estabelecida");
            
        }catch (SQLException e) {
            System.err.println("Erro na conexão" + e.getMessage());
        }
        catch(Exception e) {
            System.err.println("Erro geral "+ e.getMessage());
        }
    }
    public Connection getConnection(){
        return this.connection;
    }
    public void closeDataSource(){
        try {
            connection.close();
        } catch (Exception e) {
            System.err.println("Erro ao desconectar "+e.getMessage());
        }
    }
}
