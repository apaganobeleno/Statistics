/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditAction.java
 *
 * Created on Jul 12, 2011, 9:28:53 PM
 */
package org.pagbel.statistics.ui.action;

import javax.swing.JOptionPane;
import org.pagbel.statistics.action.GameAction;
import org.pagbel.statistics.engine.GameHolder;
import org.pagbel.statistics.hibernate.DatabaseOperator;

import org.springframework.beans.factory.annotation.Autowired;
import org.pagbel.statistics.ui.MainWindow;

/**
 *
 * @author apagano
 */
public class EditAction extends javax.swing.JInternalFrame {

  private GameAction selectedAction;
  
  @Autowired
  private GameHolder gameHolder;
  
  @Autowired
  private DatabaseOperator databaseOperator;
  
  //UI
  @Autowired
  private ActionList actionList;
  
  @Autowired
  private MainWindow mainWindow;
  
  /** Creates new form EditAction */
  public EditAction() {
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
    java.awt.GridBagConstraints gridBagConstraints;

    btnDone = new javax.swing.JButton();
    btnCancel = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    cboTeam = new javax.swing.JComboBox();
    txtPlayerNumber = new javax.swing.JTextField();
    txtZones = new javax.swing.JTextField();
    cboFundamental = new javax.swing.JComboBox();
    cboEvaluation = new javax.swing.JComboBox();

    setClosable(true);
    setTitle("Edit Action");

    btnDone.setText("Done");
    btnDone.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDoneActionPerformed(evt);
      }
    });

    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });

    jPanel1.setLayout(new java.awt.GridBagLayout());

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("E");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    jPanel1.add(jLabel1, gridBagConstraints);

    jLabel5.setBackground(new java.awt.Color(255, 255, 255));
    jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("#");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    jPanel1.add(jLabel5, gridBagConstraints);

    jLabel4.setBackground(new java.awt.Color(255, 255, 255));
    jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("ZZ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    jPanel1.add(jLabel4, gridBagConstraints);

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("T");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    jPanel1.add(jLabel3, gridBagConstraints);

    jLabel2.setBackground(new java.awt.Color(255, 255, 255));
    jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Team");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    jPanel1.add(jLabel2, gridBagConstraints);

    cboTeam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "*", "a" }));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 10.0;
    jPanel1.add(cboTeam, gridBagConstraints);

    txtPlayerNumber.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPlayerNumberActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 10.0;
    jPanel1.add(txtPlayerNumber, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 10.0;
    jPanel1.add(txtZones, gridBagConstraints);

    cboFundamental.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S", "R", "P", "A", "B", "D" }));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 6.0;
    jPanel1.add(cboFundamental, gridBagConstraints);

    cboEvaluation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=", "-", "!", "¡", "+", "#" }));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 6.0;
    jPanel1.add(cboEvaluation, gridBagConstraints);

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(157, 157, 157)
            .add(btnCancel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(btnDone, 0, 0, Short.MAX_VALUE))
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(18, 18, 18)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(btnCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(btnDone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public void setAction(GameAction selectedAction){
    this.selectedAction = selectedAction;
    this.txtPlayerNumber.setText( selectedAction.getPlayerNumber() );
    this.txtZones.setText(selectedAction.getZones() );
    

    this.cboTeam.setSelectedItem( selectedAction.getTeam() );
    this.cboEvaluation.setSelectedItem( selectedAction.getEvaluation() );
    this.cboFundamental.setSelectedItem( selectedAction.getFundamental() );
  }
  
  private void txtPlayerNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayerNumberActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPlayerNumberActionPerformed

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    this.setVisible(false);
  }//GEN-LAST:event_btnCancelActionPerformed

  private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
    selectedAction.setTeam( this.cboTeam.getSelectedItem().toString() );
    selectedAction.setFundamental( this.cboFundamental.getSelectedItem().toString());
    selectedAction.setEvaluation( this.cboEvaluation.getSelectedItem().toString() );
    selectedAction.setPlayerNumber( this.txtPlayerNumber.getText() );
    selectedAction.setZones( this.txtZones.getText() );
    selectedAction.setCompleteCode(selectedAction.getCodeByActionParts());
    
    // TODO: Evaluate the action again and set it to correct or incorrect.
    
    databaseOperator.saveOrUpdate( selectedAction );
    actionList.reloadActionList();
    this.setVisible( false );
    
    JOptionPane.showInternalMessageDialog(mainWindow.getDesktopPane(), "Action Updated");
  }//GEN-LAST:event_btnDoneActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnDone;
  private javax.swing.JComboBox cboEvaluation;
  private javax.swing.JComboBox cboFundamental;
  private javax.swing.JComboBox cboTeam;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtPlayerNumber;
  private javax.swing.JTextField txtZones;
  // End of variables declaration//GEN-END:variables
}
