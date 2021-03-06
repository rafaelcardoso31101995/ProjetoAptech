/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Clientes;
import model.Livros;

/**
 *
 * @author Rafael
 */
public class ClientesDao {
    private final String SHEMA = "biblioteca";
    private final String CAMINHO = "jdbc:mysql://localhost/"+SHEMA;
    private final String USUARIO_BD= "root";
    private final String SENHA_BD = "123456789";
    
    //QUerys
    private final String CADASTRAR_CLIENTE = "INSERT INTO clientes(nome, cpf, rg, horarioRetirada, diaRetirada, dataEntrega, endResid, numeroResid, telContato, email, nomeUsuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String DELETAR_CLIENTE_PELO_ID = "DELETE FROM clientes WHERE id = ?";
    private final String CONSULTAR_CLIENTE_PELO_NOME = "SELECT * FROM clientes WHERE nome = (?)";
    private final String CONSULTAR_CLIENTE_PELO_ID = "SELECT * FROM clientes WHERE id = ?";
    
    //arrumar
    private final String ATUALIZAR_CLIENTE_PELO_ID = "UPDATE clientes SET nome = ?, cpf = ?, rg = ?,endResid = ?,"
            + "                                         numeroResid = ?, telContato = ?,email = ?, nomeUsuario = ? WHERE id = ?";
    
    private final String ATUALIZAR_CLIENTE_PELO_ID2 = "UPDATE clientes SET horarioRetirada = ?, diaRetirada = ?, dataEntrega = ?, nomeDoLivro = ? WHERE id = ?";
    
    //conexão com  o bd
    private static Connection conexao = null;
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;

    public ClientesDao() throws ClassNotFoundException {
        //registrar o drive JDBC 
        Class.forName ("com.mysql.jdbc.Driver");
    }
    public void cadastrarCliente(Clientes cli) throws ClassNotFoundException, SQLException {
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou ao banco!!!!");

        String query = CADASTRAR_CLIENTE;
        stmt = conexao.prepareStatement(query);

        //4 - Configurar a query
        stmt = (PreparedStatement) conexao.prepareStatement(query);
        stmt.setString(1, cli.nome);
        stmt.setString(2, cli.cpf);
        stmt.setString(3, cli.rg);
        stmt.setString(4, cli.horaRetirada);
        stmt.setString(5, cli.dataEntrega);
        stmt.setString(6, cli.diaRetirada);
        stmt.setString(7, cli.endResid);
        stmt.setString(8, cli.numeroResid);
        stmt.setString(9, cli.telContato);
        stmt.setString(10, cli.email);
        stmt.setString(11, cli.nomeUsuario);

        //5 - Executar a query
        stmt.execute();
        System.out.println("Cadastrou o aluno com sucesso!!!");

        //6 - Fechar o Banco de Dados
        stmt.close();
        conexao.close();
        System.out.println("Fechou o banco de dados.");
    }
    
    public void deletarClientePeloid(Clientes cli) throws SQLException
    {
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou ao banco!!!!");
        
        // Preparar a Query
        String query = DELETAR_CLIENTE_PELO_ID;
        stmt = conexao.prepareStatement(query);
        stmt.setInt(1, cli.idCliente);
        
        // executa a query
        stmt.execute();
        System.out.println("Deletado com sucesso!!!");
        
        // fechar a conexao
        stmt.close();
        conexao.close();
        System.out.println("Fechou Conexão");
        
    }
    
    public Clientes consultarClientePeloID(int id) throws SQLException {
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou ao banco!!!!");

        String query = CONSULTAR_CLIENTE_PELO_ID;
        stmt = conexao.prepareStatement(query);

        stmt.setInt(1, id);

        rs = stmt.executeQuery();

        // criar objeto
        Clientes cli = new Clientes();
        
        while (rs.next()) {
            
            //carregar o objeto
            cli.idCliente = rs.getInt("id");
            cli.nome = rs.getString("nome");
            cli.cpf = rs.getString("cpf");
            cli.rg = rs.getString("rg");
            cli.horaRetirada = rs.getString("horarioRetirada");
            cli.diaRetirada = rs.getString("diaRetirada");
            cli.dataEntrega = rs.getString("dataEntrega");
            cli.endResid = rs.getString("endResid");
            cli.numeroResid = rs.getString("numeroResid");
            cli.telContato = rs.getString("telContato");
            cli.email = rs.getString("email");
            cli.nomeUsuario = rs.getString("nomeUsuario");
            cli.nomeDoLivro = rs.getString("nomeDoLivro");

        }
            System.out.println("Nome: " + cli.nome);
       
        //7 - Fechar banco de dados
        stmt.close();
        rs.close();
        conexao.close();

        return cli;
    }
    
    public Clientes consultarClientePeloNome(String nome) throws SQLException {
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou ao banco!!!!");

        String query = CONSULTAR_CLIENTE_PELO_NOME;
        stmt = conexao.prepareStatement(query);

        stmt.setString(1, nome);

        rs = stmt.executeQuery();

        // criar objeto
       Clientes cli = new Clientes();
        
        while (rs.next()) {
            
            //carregar o objeto
            cli.idCliente = rs.getInt("id");
            cli.nome = rs.getString("nome");
            cli.cpf = rs.getString("cpf");
            cli.rg = rs.getString("rg");
            cli.horaRetirada = rs.getString("horarioRetirada");
            cli.diaRetirada = rs.getString("diaRetirada");
            cli.dataEntrega = rs.getString("dataEntrega");
            cli.endResid = rs.getString("endResid");
            cli.numeroResid = rs.getString("numeroResid");
            cli.telContato = rs.getString("telContato");
            cli.email = rs.getString("email");
            cli.nomeUsuario = rs.getString("nomeUsuario");
            cli.nomeDoLivro = rs.getString("nomeDoLivro");

        }
            System.out.println("Nome: " + cli.nome);
       
        //7 - Fechar banco de dados
        stmt.close();
        rs.close();
        conexao.close();

        return cli;
    }
    
    public void atualizarDadosCliente(Clientes cli) throws SQLException {
        
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou ao banco!!!!");
        
        // Preparar a Query
        String query = ATUALIZAR_CLIENTE_PELO_ID;

        stmt = conexao.prepareStatement(query);
        
        stmt.setString(1, cli.nome);
        stmt.setString(2, cli.cpf);
        stmt.setString(3, cli.rg);
       // stmt.setString(4, cli.horaRetirada);
        //stmt.setString(5, cli.diaRetirada);
        //stmt.setString(6, cli.dataEntrega);
        stmt.setString(4, cli.endResid);
        stmt.setString(5, cli.numeroResid);
        stmt.setString(6, cli.telContato);
        stmt.setString(7, cli.email);
        stmt.setString(10, cli.nomeUsuario); /// dado raiz
        
        stmt.setInt(11, cli.idCliente);

        //4 - executar a query
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Dados Atualizados");
        
        //5 - Finalizar conexão
        stmt.close();
        conexao.close();
    }
    
    public void efetivarRetiradaDeLivro(Clientes cli) throws SQLException, ClassNotFoundException {
        
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou ao banco!!!!");
        
        // Preparar a Query
        String query = ATUALIZAR_CLIENTE_PELO_ID2;

        stmt = conexao.prepareStatement(query);
        
        stmt.setString(1, cli.horaRetirada);
        stmt.setString(2, cli.diaRetirada);
        stmt.setString(3, cli.dataEntrega);
        stmt.setString(4, cli.nomeDoLivro);
        
        stmt.setInt(5, cli.idCliente);

        //4 - executar a query
        stmt.executeUpdate();
        //JOptionPane.showMessageDialog(null, "Retirada de livro efetivada no sistema");
        
        LivrosDao dao = new LivrosDao();
        
        //5 - Finalizar conexão
        stmt.close();
        conexao.close();
    }
}
