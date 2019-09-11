/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.controll;

import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADM
 */
public class ColaborarDAO {

    /* Isso é uma sql comum, os ? são os 
         * parâmetros que nós vamos adicionar
         * na base de dados
     */
    public void salvar(Colaborador colaborador) {

        //criação do SQL para salvar valores da sala no banco
        //cada ? representa os valores que serão colocados para cada campo
        //em ordem.
        String sql = "INSERT INTO COLABORADOR(nome, cpf, senha, telefone, email) "
                + "VALUES (?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {// o try é oque acontece se existir sucesso na conexão
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, colaborador.getNome()); //cada pstm.set coloca valor em uma das? na ordem
            pstm.setString(2, colaborador.getCpf());
            pstm.setString(3, colaborador.getSenha());
            pstm.setString(4, colaborador.getTelefone());
            pstm.setString(4, colaborador.getEmail());

            pstm.execute(); // executa o sql

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ColaborarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ColaborarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
