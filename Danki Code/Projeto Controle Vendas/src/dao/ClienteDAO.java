/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import models.Cliente;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import java.sql.ResultSet;


/**
 *
 * @author Cauan
 */
public class ClienteDAO {   // metodos SQL
   
    private Connection con;
    
    public ClienteDAO(){ /// construtor -> permite q nn precise abrir em todo metodo a conexao com o bd
    
        this.con = new ConnectionFactory().getConnection();
    }
    
    
    public void CadastrarCliente(Cliente obj)   // cadastrar cliente
    {
        try 
        {   // comando sql
            String sql = "insert into tb_clientes (nome, rg, cpf, email, telefone, celular, cep, endereco, "
                    + "numero, complemento, bairro, cidade, estado) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
            // executar comando
            PreparedStatement stmt = con.prepareStatement(sql);
            
            // preenchendo as informacoes nas interrogacoes
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com SUCESSO");

        }

        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }
    
    public List<Cliente> ListarClientes()    // listar todos os clientes
    {
        try 
        {
            String sql = "select * from tb_clientes";   /// comando sql
            
            List<Cliente> lista = new ArrayList<>();    /// pegando conteudo e salvando na variavel lista
        
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())    /// enquanto conseguir ir para a proxima linha -> arquiva as infos
            {
                Cliente obj = new Cliente();
                
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));


                
                lista.add(obj);     /// joga o conteudo na lista
            }
            return lista;
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
        
        
    }
    
    
    public void AlterarCliente(Cliente obj)             // alterar cliente (semelhante ao cadastrar)
    {
        try 
        {   // comando sql
            String sql = "update tb_clientes set nome = ?, rg = ?, cpf = ?, email = ?, telefone = ?, celular = ?, "
                    + "cep = ?, endereco = ?, numero = ?, "
                    + "complemento = ?, bairro = ?, cidade = ?, estado = ? where id = ?";
                    
        
            // executar comando
            PreparedStatement stmt = con.prepareStatement(sql);
            
            // preenchendo as informacoes nas interrogacoes
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            
            
            stmt.setInt(14, obj.getId());
            
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cliente alterado com SUCESSO");

        }

        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }
    
    public void ExcluirCliente(int id)             // excluir cliente
    {
          try 
        {   // comando sql
            String sql = "delete from tb_clientes where id = ?";
                    
        
            // executar comando
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cliente excluído com SUCESSO");

        }

        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }  
    }
    
}
