/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TeamList.java
 *
 * Created on Jun 26, 2011, 9:49:04 AM
 */
package org.pagbel.statistics.ui.structure;

import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import org.pagbel.statistics.hibernate.DatabaseOperator;
import org.pagbel.statistics.structure.Team;
import org.pagbel.statistics.ui.MainWindow;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author apagano
 */
public class TeamList extends javax.swing.JInternalFrame {
  
  private Object[] teams; 
  
  @Autowired
  MainWindow mainWindow;
  
  @Autowired 
  DatabaseOperator databaseOperator;
  
  @Autowired
  PlayerList playerListIF;
  
  
  /** Creates new form TeamList */
  public TeamList() {
    initComponents();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();

    tblTeams = new javax.swing.JTable();
    btnEdit = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    btnCancel = new javax.swing.JButton();
    btnCreate = new javax.swing.JButton();
    btnPlayers = new javax.swing.JButton();

    setClosable(true);
    setForeground(java.awt.Color.white);
    setTitle("Teams");
    addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
      public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
        ifOpenend(evt);
      }
      public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
      }
    });
    addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        onShown(evt);
      }
    });

    tblTeams.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {"aa", "aaa"},
        {null, null},
        {null, null},
        {null, null}
      },
      new String [] {
        "Code", "Name"
      }
    ));
    jScrollPane1.setViewportView(tblTeams);

    btnEdit.setText("Edit");
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditActionPerformed(evt);
      }
    });

    btnDelete.setText("Delete");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });

    btnCreate.setText("Create");
    btnCreate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCreateActionPerformed(evt);
      }
    });

    btnPlayers.setText("Players");
    btnPlayers.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPlayersActionPerformed(evt);
      }
    });

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 289, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(btnCancel)
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
            .add(org.jdesktop.layout.GroupLayout.LEADING, btnEdit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.LEADING, btnDelete, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.LEADING, btnCreate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.LEADING, btnPlayers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
          .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 243, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(layout.createSequentialGroup()
            .add(btnEdit)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(btnDelete)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(btnCreate)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(btnPlayers)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(btnCancel)))
        .addContainerGap(20, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    Team team = getSelectedTeam();
    if( team != null ){
      mainWindow.editTeam((Team)team);
      this.dispose();
    }
  }//GEN-LAST:event_btnEditActionPerformed

  private void ifOpenend(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_ifOpenend
    // TODO add your handling code here:
    this.reloadTableData();
    this.fixTableColumns();
  }//GEN-LAST:event_ifOpenend

  private Team getSelectedTeam(){
    Team result = null;
    Integer index = tblTeams.getSelectedRow();
    if( index != -1){
      result = (Team)teams[ index ];
    }
    return result;
  }
  
  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    this.dispose();
  }//GEN-LAST:event_btnCancelActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    Team team = getSelectedTeam();
    if( team != null){
      try{
        databaseOperator.delete(team);
        this.reloadTableData();
        this.fixTableColumns();
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "This team cannot be deleted, it has some associated games.");
      }
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

  private void onShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_onShown
    ifOpenend(null);
  }//GEN-LAST:event_onShown

  private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    mainWindow.showCreateTeam();
  }//GEN-LAST:event_btnCreateActionPerformed

  private void btnPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayersActionPerformed
    Team team = getSelectedTeam();
    
    if( team !=  null){
      playerListIF.setSelectedTeam( team );
      mainWindow.showPlayerList();
    }else{
      //TODO: Message
    }
    
  }//GEN-LAST:event_btnPlayersActionPerformed

  public void reloadTableData(){
    teams = databaseOperator.find("from Team").toArray();
    Object[][] tableData = new Object[teams.length][2];

    for (int i = 0; i < teams.length; i++) {
      Team t = (Team) teams[i];
      tableData[i][0] = t.getCode();
      tableData[i][1] = t.getName();
    }

    tblTeams.setModel(new javax.swing.table.DefaultTableModel(tableData,new String[]{"Code", "Name"}));
    this.fixTableColumns();
  }
  
  private void fixTableColumns(){
    TableColumn col = tblTeams.getColumnModel().getColumn(0);
    col.setPreferredWidth(20);
    col = tblTeams.getColumnModel().getColumn(1);
    col.setPreferredWidth(200);
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnCreate;
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnEdit;
  private javax.swing.JButton btnPlayers;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblTeams;
  // End of variables declaration//GEN-END:variables
}