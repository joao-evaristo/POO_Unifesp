package dao;

import java.util.ArrayList;
import model.Cliente;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author joaoe
 */
public class ClienteDAO {
    private DataSource dataSource;
    
    public ClienteDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public ArrayList<Cliente> readAll(){
        try {
            String Sql = "consulta";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(Sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Cliente> lista = new ArrayList<Cliente>();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                lista.add(c);
            }
            ps.close();
            return lista;
        } catch (SQLException e) {
            System.err.println("Erro ao recuperar" +e.getMessage());
        }
        catch (Exception e){
            System.err.println("Erro geral "+e.getMessage());
        }
        return null;
    }
}
