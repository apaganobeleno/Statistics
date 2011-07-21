package org.pagbel.statistics.ui.reports;

import java.util.ArrayList;
import java.util.List;
import org.pagbel.statistics.engine.GameHolder;
import org.pagbel.statistics.game.Game;
import org.pagbel.statistics.reports.BasicReportsService;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GameReport.java
 *
 * Created on Jul 20, 2011, 9:20:40 PM
 */
/**
 *
 * @author apagano
 */
public class GameReport extends javax.swing.JInternalFrame {

  @Autowired
  GameHolder gameHolder;
  
  @Autowired
  BasicReportsService basicReportsService;
  
  /** Creates new form GameReport */
  public GameReport() {
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

    pnlReportHeader = new javax.swing.JPanel();
    lblSelfTeam = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    RECEPTION = new javax.swing.JLabel();
    RECEPTION1 = new javax.swing.JLabel();
    RECEPTION2 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    pnlResults = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblSelfData = new javax.swing.JTable();

    addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        onShown(evt);
      }
    });

    pnlReportHeader.setBackground(new java.awt.Color(50, 71, 112));
    pnlReportHeader.setForeground(new java.awt.Color(255, 255, 255));
    pnlReportHeader.setLayout(new java.awt.GridBagLayout());

    lblSelfTeam.setBackground(new java.awt.Color(0, 51, 204));
    lblSelfTeam.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    lblSelfTeam.setForeground(new java.awt.Color(255, 255, 255));
    lblSelfTeam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblSelfTeam.setText("jLabel1");
    lblSelfTeam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 10;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 98;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlReportHeader.add(lblSelfTeam, gridBagConstraints);

    jLabel2.setBackground(new java.awt.Color(0, 51, 204));
    jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 12));
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("SET");
    jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 66;
    gridBagConstraints.ipady = 7;
    pnlReportHeader.add(jLabel2, gridBagConstraints);

    jLabel3.setBackground(new java.awt.Color(0, 51, 204));
    jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 12));
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("POINTS");
    jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 15;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 42;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlReportHeader.add(jLabel3, gridBagConstraints);

    jLabel4.setBackground(new java.awt.Color(0, 51, 204));
    jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 12));
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("SERVE");
    jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 18;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 32;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlReportHeader.add(jLabel4, gridBagConstraints);

    RECEPTION.setBackground(new java.awt.Color(0, 51, 204));
    RECEPTION.setFont(new java.awt.Font("Lucida Grande", 1, 12));
    RECEPTION.setForeground(new java.awt.Color(255, 255, 255));
    RECEPTION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    RECEPTION.setText("RECEPTION");
    RECEPTION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 21;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 61;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlReportHeader.add(RECEPTION, gridBagConstraints);

    RECEPTION1.setBackground(new java.awt.Color(0, 51, 204));
    RECEPTION1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    RECEPTION1.setForeground(new java.awt.Color(255, 255, 255));
    RECEPTION1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    RECEPTION1.setText("ATTACK");
    RECEPTION1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 25;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 96;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlReportHeader.add(RECEPTION1, gridBagConstraints);

    RECEPTION2.setBackground(new java.awt.Color(0, 51, 204));
    RECEPTION2.setFont(new java.awt.Font("Lucida Grande", 1, 12));
    RECEPTION2.setForeground(new java.awt.Color(255, 255, 255));
    RECEPTION2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    RECEPTION2.setText("BLOCK");
    RECEPTION2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 29;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 8;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlReportHeader.add(RECEPTION2, gridBagConstraints);

    jLabel5.setBackground(new java.awt.Color(0, 51, 204));
    jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("1");
    jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel5, gridBagConstraints);

    jLabel6.setBackground(new java.awt.Color(0, 51, 204));
    jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("2");
    jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 11;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel6, gridBagConstraints);

    jLabel7.setBackground(new java.awt.Color(0, 51, 204));
    jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setText("3");
    jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 12;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel7, gridBagConstraints);

    jLabel8.setBackground(new java.awt.Color(0, 51, 204));
    jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("4");
    jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 13;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel8, gridBagConstraints);

    jLabel9.setBackground(new java.awt.Color(0, 51, 204));
    jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9.setText("Pts");
    jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 27;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel9, gridBagConstraints);

    jLabel10.setBackground(new java.awt.Color(0, 51, 204));
    jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setText("5");
    jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 14;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel10, gridBagConstraints);

    jLabel11.setBackground(new java.awt.Color(0, 51, 204));
    jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel11.setText("BP");
    jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 16;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel11, gridBagConstraints);

    jLabel12.setBackground(new java.awt.Color(0, 51, 204));
    jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel12.setText("W-L");
    jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 17;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel12, gridBagConstraints);

    jLabel13.setBackground(new java.awt.Color(0, 51, 204));
    jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel13.setText("Tot");
    jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 18;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel13, gridBagConstraints);

    jLabel14.setBackground(new java.awt.Color(0, 51, 204));
    jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel14.setForeground(new java.awt.Color(255, 255, 255));
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel14.setText("Pos%");
    jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 23;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel14, gridBagConstraints);

    jLabel15.setBackground(new java.awt.Color(0, 51, 204));
    jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel15.setText("Tot");
    jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 21;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel15, gridBagConstraints);

    jLabel16.setBackground(new java.awt.Color(0, 51, 204));
    jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel16.setText("Err");
    jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 19;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel16, gridBagConstraints);

    jLabel17.setBackground(new java.awt.Color(0, 51, 204));
    jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel17.setText("Pts");
    jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 20;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel17, gridBagConstraints);

    jLabel18.setBackground(new java.awt.Color(0, 51, 204));
    jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel18.setForeground(new java.awt.Color(255, 255, 255));
    jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel18.setText("Err");
    jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 22;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel18, gridBagConstraints);

    jLabel19.setBackground(new java.awt.Color(0, 51, 204));
    jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel19.setForeground(new java.awt.Color(255, 255, 255));
    jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel19.setText("Exc%");
    jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 24;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel19, gridBagConstraints);

    jLabel21.setBackground(new java.awt.Color(0, 51, 204));
    jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel21.setForeground(new java.awt.Color(255, 255, 255));
    jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel21.setText("Tot");
    jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 25;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel21, gridBagConstraints);

    jLabel22.setBackground(new java.awt.Color(0, 51, 204));
    jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel22.setForeground(new java.awt.Color(255, 255, 255));
    jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel22.setText("Err");
    jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 26;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel22, gridBagConstraints);

    jLabel23.setBackground(new java.awt.Color(0, 51, 204));
    jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel23.setForeground(new java.awt.Color(255, 255, 255));
    jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel23.setText("Pts%");
    jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 28;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel23, gridBagConstraints);

    jLabel24.setBackground(new java.awt.Color(0, 51, 204));
    jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel24.setForeground(new java.awt.Color(255, 255, 255));
    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel24.setText("Pts");
    jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 29;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel24, gridBagConstraints);

    jLabel25.setBackground(new java.awt.Color(0, 51, 204));
    jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 12));
    jLabel25.setForeground(new java.awt.Color(255, 255, 255));
    jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel25.setText("Tot");
    jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 15;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 2.0;
    pnlReportHeader.add(jLabel25, gridBagConstraints);

    jScrollPane1.setColumnHeaderView(null);

    tblSelfData.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane1.setViewportView(tblSelfData);

    org.jdesktop.layout.GroupLayout pnlResultsLayout = new org.jdesktop.layout.GroupLayout(pnlResults);
    pnlResults.setLayout(pnlResultsLayout);
    pnlResultsLayout.setHorizontalGroup(
      pnlResultsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
    );
    pnlResultsLayout.setVerticalGroup(
      pnlResultsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 261, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
    );

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(pnlReportHeader, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
      .add(pnlResults, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(pnlReportHeader, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(pnlResults, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_onShown
    Game currentGame = gameHolder.getCurrentGame();
    List data = basicReportsService.gameReportData(currentGame);
    
    Object[][] tableData = new Object[data.size()][24];
    
    for(int i = 0; i< data.size() ; i++ ){
      List playerData = (ArrayList) data.get(i);
      
      for(int j = 0; j< playerData.size() ; j++ ){
        tableData[i][j] = playerData.get(j);
      }
       
    }
    
    tblSelfData.setModel(new javax.swing.table.DefaultTableModel(tableData,new String[24]));
  }//GEN-LAST:event_onShown

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel RECEPTION;
  private javax.swing.JLabel RECEPTION1;
  private javax.swing.JLabel RECEPTION2;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblSelfTeam;
  private javax.swing.JPanel pnlReportHeader;
  private javax.swing.JPanel pnlResults;
  private javax.swing.JTable tblSelfData;
  // End of variables declaration//GEN-END:variables
}
