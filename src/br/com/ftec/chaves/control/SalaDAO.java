/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.control;

import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author fernando.goncalves
 */
public class SalaDAO {

    public void salvar(Sala sala) throws Exception {

        String sql = "INSERT INTO sala(sala, descricao, capacidade, tipo) "
                + "VALUES (?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
                       pstm = conn.prepareStatement(sql);
            pstm.setString(1, sala.getSala()); // cada pstm.set coloca valor em um dos ?
            pstm.setString(2, sala.getDescricao());
            pstm.setInt(3, sala.getCapacidade());
            pstm.setString(4, sala.getTipo());
            pstm.execute(); // executar comando SQL

        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public Sala buscaSalaPorSala(String sala) throws Exception {
        
        String sql = "SELECT * FROM SALA WHERE SALA = ? ";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        // Classe que vai recuperar os dados do BD
        ResultSet rset = null;
        pstm.setString(1, sala);
        Sala sl = new Sala();
        
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        rset = pstm.executeQuery();
        
        while(rset.next()){
            sl.setId(rset.getInt("id"));
            sl.setDescricao(rset.getString("descricao"));
            sl.setSala(rset.getString("sala"));
            sl.setTipo(rset.getString("tipo"));
            sl.setCapacidade(rset.getInt("capacidade"));
        }
        
        return sl;
    }
    
    public List<Sala> listaSalas() throws Exception{
        
        String sqli = "SELECT * FROM SALA";
        Connection conn = null;
        PreparedStatement pstm = null;
        // Classe que vai recuperar os dados do BD
        ResultSet rset = null;
        
        ArrayList<Sala> listaSalas = new ArrayList<Sala> ();
        
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sqli);
        rset = pstm.executeQuery();
        
        while(rset.next()){
            Sala s = new Sala();
            s.setId(rset.getInt("id"));
            s.setDescricao(rset.getString("descricao"));
            s.setSala(rset.getString("sala"));
            s.setTipo(rset.getString("tipo"));
            s.setCapacidade(rset.getInt("capacidade"));
            listaSalas.add(s);
        }
        
        return listaSalas;
    } 
    
}
