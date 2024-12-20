/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.exemplocreate;

import static com.mycompany.exemplocreate.TelaInsert.conecta;
import static com.mycompany.exemplocreate.TelaSelectAtividade.total;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 0022216
 */
public class TelaJoin extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaJoin
     */
    public TelaJoin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCria2Tabelas = new javax.swing.JButton();
        btnInserirDados = new javax.swing.JButton();
        btnApagaTabelas = new javax.swing.JButton();
        btnSelectSemJOIN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSelectComJOIN = new javax.swing.JButton();
        btnLEFT = new javax.swing.JButton();
        btnRIGHT = new javax.swing.JButton();
        btnUNION = new javax.swing.JButton();
        btnUNION1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btnCria2Tabelas.setText("Cria duas tabelas");
        btnCria2Tabelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCria2TabelasActionPerformed(evt);
            }
        });

        btnInserirDados.setText("inserir dados");
        btnInserirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirDadosActionPerformed(evt);
            }
        });

        btnApagaTabelas.setText("Apaga Tabela Estudantes e Cidades");
        btnApagaTabelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagaTabelasActionPerformed(evt);
            }
        });

        btnSelectSemJOIN.setText("Select sem JOIN");
        btnSelectSemJOIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectSemJOINActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSelectComJOIN.setText("Select com JOIN");
        btnSelectComJOIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectComJOINActionPerformed(evt);
            }
        });

        btnLEFT.setText("LEFT JOIN");
        btnLEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLEFTActionPerformed(evt);
            }
        });

        btnRIGHT.setText("RIGHT JOIN");
        btnRIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRIGHTActionPerformed(evt);
            }
        });

        btnUNION.setText("UNION");
        btnUNION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUNIONActionPerformed(evt);
            }
        });

        btnUNION1.setText("FULL");
        btnUNION1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUNION1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCria2Tabelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInserirDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagaTabelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelectSemJOIN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSelectComJOIN)
                        .addGap(18, 18, 18)
                        .addComponent(btnLEFT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRIGHT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUNION))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUNION1)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCria2Tabelas)
                .addGap(32, 32, 32)
                .addComponent(btnInserirDados)
                .addGap(49, 49, 49)
                .addComponent(btnApagaTabelas)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectSemJOIN)
                    .addComponent(btnSelectComJOIN)
                    .addComponent(btnLEFT)
                    .addComponent(btnRIGHT)
                    .addComponent(btnUNION)
                    .addComponent(btnUNION1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCria2TabelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCria2TabelasActionPerformed
         try {
            Connection c;
            c = conecta();
            JOptionPane.showMessageDialog(
                    null,
                    "Tabela criada");
            String comando;
            comando = "CREATE TABLE if not exists cidades (\r\n"
                + "idcidade serial PRIMARY KEY,\r\n"
                + "cidade varchar(30) )";
            Statement stmt = c.createStatement();
            stmt.execute(comando);
            
            comando = "CREATE TABLE if not exists estudantes (\r\n"
                + "id serial PRIMARY KEY,\r\n"
                + "nome varchar(30),"
                + "id_cidade integer )";
            stmt = c.createStatement();
            stmt.execute(comando);
            
            c.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCria2TabelasActionPerformed

    private void btnInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosActionPerformed
        // TODO add your handling code here:
        try {
            Connection c = conecta();
            String comando;
            comando="INSERT INTO cidades (cidade) VALUES (?) ";
            PreparedStatement stmt;
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Dois Irmãos");
            stmt.executeUpdate();

            comando="INSERT INTO cidades (cidade) VALUES (?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Novo Hamburgo");
            stmt.executeUpdate();
            
            comando="INSERT INTO cidades (cidade) VALUES (?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Estância Velha");
            stmt.executeUpdate();
            
            comando="INSERT INTO cidades (cidade) VALUES (?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Porto Alegre");
            stmt.executeUpdate();
            
            comando="INSERT INTO cidades (cidade) VALUES (?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Sapucaia");
            stmt.executeUpdate();
            
            //estudantes
            comando="INSERT INTO estudantes (nome,id_cidade) VALUES (?,?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Matheus");            
            stmt.setInt(2,2);
            stmt.executeUpdate();
            
            comando="INSERT INTO estudantes (nome,id_cidade) VALUES (?,?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Francisco");            
            stmt.setInt(2,1);
            stmt.executeUpdate();
            
            comando="INSERT INTO estudantes (nome,id_cidade) VALUES (?,?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Heloisa");            
            stmt.setInt(2,3);
            stmt.executeUpdate();
            
            comando="INSERT INTO estudantes (nome) VALUES (?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Pedro");            
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
    }//GEN-LAST:event_btnInserirDadosActionPerformed

    private void btnApagaTabelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaTabelasActionPerformed
        // TODO add your handling code here:
         try {
            Connection c;
            c = conecta();
            JOptionPane.showMessageDialog(
                    null,
                    "Tabela apagada");
            String comando;
            comando = "DROP table cidades";
            Statement stmt = c.createStatement();
            stmt.execute(comando);
            
            comando = "DROP table estudantes";
            stmt = c.createStatement();
            stmt.execute(comando);
            c.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnApagaTabelasActionPerformed

    private void btnSelectSemJOINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectSemJOINActionPerformed
        int total = 10;
        Object[] col = new Object[2];
        col[0]="Estudante";
        col[1]="Cidade";
        
        Object[][] lin = new Object[total][2];
        String sql = "SELECT "
                + "estudantes.nome, "
                + "cidades.cidade "
                + "FROM "
                + "estudantes,cidades "
                + "WHERE "
                + "estudantes.id_cidade=cidades.idcidade";
        Connection c = TelaInsert.conecta();
        int cont=0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                lin[cont][0]=rs.getString("nome");
                lin[cont][1]=rs.getString("cidade");
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        DefaultTableModel t;
        t = new DefaultTableModel(lin, col);
        jTable1.setModel(t);
    }//GEN-LAST:event_btnSelectSemJOINActionPerformed

    private void btnSelectComJOINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectComJOINActionPerformed
        // TODO add your handling code here:
        int total = 10;
        Object[] col = new Object[2];
        col[0]="Estudante";
        col[1]="Cidade";
        
        Object[][] lin = new Object[total][2];
        String sql = "SELECT "
                + "estudantes.nome, "
                + "cidades.cidade "
                + "FROM "
                + "estudantes INNER JOIN cidades "
                + "ON "
                + "estudantes.id_cidade=cidades.idcidade";
        Connection c = TelaInsert.conecta();
        int cont=0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                lin[cont][0]=rs.getString("nome");
                lin[cont][1]=rs.getString("cidade");
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        DefaultTableModel t;
        t = new DefaultTableModel(lin, col);
        jTable1.setModel(t);
    }//GEN-LAST:event_btnSelectComJOINActionPerformed

    private void btnLEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLEFTActionPerformed
        int total = 10;
        Object[] col = new Object[2];
        col[0]="Estudante";
        col[1]="Cidade";
        Object[][] lin = new Object[total][2];
        String sql = "SELECT "
                + "estudantes.nome, "
                + "cidades.cidade "
                + "FROM "
                + "estudantes LEFT JOIN cidades "
                + "ON "
                + "estudantes.id_cidade=cidades.idcidade";
        Connection c = TelaInsert.conecta();
        int cont=0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                lin[cont][0]=rs.getString("nome");
                lin[cont][1]=rs.getString("cidade");
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        DefaultTableModel t;
        t = new DefaultTableModel(lin, col);
        jTable1.setModel(t);
    }//GEN-LAST:event_btnLEFTActionPerformed

    private void btnRIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRIGHTActionPerformed
        int total = 10;
        Object[] col = new Object[2];
        col[0]="Estudante";
        col[1]="Cidade";
        Object[][] lin = new Object[total][2];
        String sql = "SELECT "
                + "estudantes.nome, "
                + "cidades.cidade "
                + "FROM "
                + "estudantes RIGHT JOIN cidades "
                + "ON "
                + "estudantes.id_cidade=cidades.idcidade";
        Connection c = TelaInsert.conecta();
        int cont=0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                lin[cont][0]=rs.getString("nome");
                lin[cont][1]=rs.getString("cidade");
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        DefaultTableModel t;
        t = new DefaultTableModel(lin, col);
        jTable1.setModel(t);
    }//GEN-LAST:event_btnRIGHTActionPerformed

    private void btnUNIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUNIONActionPerformed
        // TODO add your handling code here:
        int total = 10;
        Object[] col = new Object[2];
        col[0]="Estudante";
        col[1]="Cidade";
        
        Object[][] lin = new Object[total][2];
        String sql = "(SELECT "
                + "estudantes.nome, "
                + "cidades.cidade "
                + "FROM "
                + "estudantes LEFT JOIN cidades "
                + "ON "
                + "estudantes.id_cidade=cidades.idcidade)"
                + "UNION "
                + "(SELECT "
                + "estudantes.nome, "
                + "cidades.cidade "
                + "FROM "
                + "estudantes RIGHT JOIN cidades "
                + "ON "
                + "estudantes.id_cidade=cidades.idcidade)";
        Connection c = TelaInsert.conecta();
        int cont=0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                lin[cont][0]=rs.getString("nome");
                lin[cont][1]=rs.getString("cidade");
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        DefaultTableModel t;
        t = new DefaultTableModel(lin, col);
        jTable1.setModel(t);
    }//GEN-LAST:event_btnUNIONActionPerformed

    private void btnUNION1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUNION1ActionPerformed
        // TODO add your handling code here:
        int total = 10;
        Object[] col = new Object[2];
        col[0]="Estudante";
        col[1]="Cidade";
        
        Object[][] lin = new Object[total][2];
        String sql = "(SELECT "
                + "estudantes.nome, "
                + "cidades.cidade "
                + "FROM "
                + "estudantes FULL JOIN cidades "
                + "ON "
                + "estudantes.id_cidade=cidades.idcidade)";
        Connection c = TelaInsert.conecta();
        int cont=0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                lin[cont][0]=rs.getString("nome");
                lin[cont][1]=rs.getString("cidade");
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        DefaultTableModel t;
        t = new DefaultTableModel(lin, col);
        jTable1.setModel(t);
    }//GEN-LAST:event_btnUNION1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagaTabelas;
    private javax.swing.JButton btnCria2Tabelas;
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnLEFT;
    private javax.swing.JButton btnRIGHT;
    private javax.swing.JButton btnSelectComJOIN;
    private javax.swing.JButton btnSelectSemJOIN;
    private javax.swing.JButton btnUNION;
    private javax.swing.JButton btnUNION1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
