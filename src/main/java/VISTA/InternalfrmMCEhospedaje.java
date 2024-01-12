/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VISTA;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class InternalfrmMCEhospedaje extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalfrmMCEhospedaje
     */
    public InternalfrmMCEhospedaje() {
        initComponents();
    }

    public JButton getBtnCls() {
        return btnCls;
    }

    public void setBtnCls(JButton btnCls) {
        this.btnCls = btnCls;
    }

    public JButton getBtnConsultarCond() {
        return btnConsultarCond;
    }

    public void setBtnConsultarCond(JButton btnConsultarCond) {
        this.btnConsultarCond = btnConsultarCond;
    }

    public JButton getBtnElimCond() {
        return btnElimCond;
    }

    public void setBtnElimCond(JButton btnElimCond) {
        this.btnElimCond = btnElimCond;
    }

    public JButton getBtnModCond() {
        return btnModCond;
    }

    public void setBtnModCond(JButton btnModCond) {
        this.btnModCond = btnModCond;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JLabel getLblERROR() {
        return lblERROR;
    }

    public void setLblERROR(JLabel lblERROR) {
        this.lblERROR = lblERROR;
    }

    public JLabel getLblEXITO() {
        return lblEXITO;
    }

    public void setLblEXITO(JLabel lblEXITO) {
        this.lblEXITO = lblEXITO;
    }

    public JLabel getLbl_IdAdm_HA_Consulta() {
        return lbl_IdAdm_HA_Consulta;
    }

    public void setLbl_IdAdm_HA_Consulta(JLabel lbl_IdAdm_HA_Consulta) {
        this.lbl_IdAdm_HA_Consulta = lbl_IdAdm_HA_Consulta;
    }

    public JTextField getTxtDisponibilidad_HA_Consulta() {
        return txtDisponibilidad_HA_Consulta;
    }

    public void setTxtDisponibilidad_HA_Consulta(JTextField txtDisponibilidad_HA_Consulta) {
        this.txtDisponibilidad_HA_Consulta = txtDisponibilidad_HA_Consulta;
    }

    public JTextField getTxtIdHabitacion_HA_Consulta() {
        return txtIdHabitacion_HA_Consulta;
    }

    public void setTxtIdHabitacion_HA_Consulta(JTextField txtIdHabitacion_HA_Consulta) {
        this.txtIdHabitacion_HA_Consulta = txtIdHabitacion_HA_Consulta;
    }

    public JTextField getTxtPrecio_Consulta_HA() {
        return txtPrecio_Consulta_HA;
    }

    public void setTxtPrecio_Consulta_HA(JTextField txtPrecio_Consulta_HA) {
        this.txtPrecio_Consulta_HA = txtPrecio_Consulta_HA;
    }

    public JTextField getTxtTipoHabitacion_Consulta_HA() {
        return txtTipoHabitacion_Consulta_HA;
    }

    public void setTxtTipoHabitacion_Consulta_HA(JTextField txtTipoHabitacion_Consulta_HA) {
        this.txtTipoHabitacion_Consulta_HA = txtTipoHabitacion_Consulta_HA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTipoHabitacion_Consulta_HA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDisponibilidad_HA_Consulta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio_Consulta_HA = new javax.swing.JTextField();
        btnModCond = new javax.swing.JButton();
        btnElimCond = new javax.swing.JButton();
        btnConsultarCond = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdHabitacion_HA_Consulta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lbl_IdAdm_HA_Consulta = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblERROR = new javax.swing.JLabel();
        lblEXITO = new javax.swing.JLabel();
        btnCls = new javax.swing.JButton();
        lblERRORConsulta_conductor1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel3.setText("Tipo habitación :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtTipoHabitacion_Consulta_HA.setEditable(false);
        txtTipoHabitacion_Consulta_HA.setBackground(new java.awt.Color(235, 235, 235));
        txtTipoHabitacion_Consulta_HA.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtTipoHabitacion_Consulta_HA.setBorder(null);
        jPanel1.add(txtTipoHabitacion_Consulta_HA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, 20));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel4.setText("Precio :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtDisponibilidad_HA_Consulta.setBackground(new java.awt.Color(235, 235, 235));
        txtDisponibilidad_HA_Consulta.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtDisponibilidad_HA_Consulta.setBorder(null);
        jPanel1.add(txtDisponibilidad_HA_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, 20));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel5.setText("Disponibilidad :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtPrecio_Consulta_HA.setBackground(new java.awt.Color(235, 235, 235));
        txtPrecio_Consulta_HA.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtPrecio_Consulta_HA.setBorder(null);
        jPanel1.add(txtPrecio_Consulta_HA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, 20));

        btnModCond.setBackground(new java.awt.Color(0, 204, 255));
        btnModCond.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnModCond.setForeground(new java.awt.Color(255, 255, 255));
        btnModCond.setText("MODIFICAR");
        btnModCond.setBorder(null);
        jPanel1.add(btnModCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 90, 30));

        btnElimCond.setBackground(new java.awt.Color(255, 0, 0));
        btnElimCond.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnElimCond.setForeground(new java.awt.Color(255, 255, 255));
        btnElimCond.setText("ELIMINAR");
        btnElimCond.setBorder(null);
        jPanel1.add(btnElimCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 90, 30));

        btnConsultarCond.setBackground(new java.awt.Color(0, 204, 102));
        btnConsultarCond.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnConsultarCond.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarCond.setText("CONSULTAR");
        btnConsultarCond.setBorder(null);
        jPanel1.add(btnConsultarCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 90, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel6.setText("Id habitaciön:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtIdHabitacion_HA_Consulta.setBackground(new java.awt.Color(235, 235, 235));
        txtIdHabitacion_HA_Consulta.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtIdHabitacion_HA_Consulta.setBorder(null);
        jPanel1.add(txtIdHabitacion_HA_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 20));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel11.setText("Id admin:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 60, -1));

        lbl_IdAdm_HA_Consulta.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jPanel1.add(lbl_IdAdm_HA_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 110, 20));

        jPanel15.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, 20));

        jPanel46.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

        jPanel24.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 50));

        jPanel41.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 40));

        jPanel42.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 50, 50));

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 50, 70));

        jPanel47.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel48.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jPanel34.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 40, 50));

        jPanel31.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 50, 40));

        jPanel29.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        jPanel30.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, -1));

        jPanel36.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 50));

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, 30));

        jPanel32.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("<");
        btnSalir.setBorder(null);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 20, 20));

        lblERROR.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblERROR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, 20));

        lblEXITO.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(lblEXITO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 260, 20));

        btnCls.setBackground(new java.awt.Color(204, 204, 255));
        btnCls.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnCls.setForeground(new java.awt.Color(255, 255, 255));
        btnCls.setText("CLS");
        btnCls.setBorder(null);
        jPanel1.add(btnCls, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 30, 20));

        lblERRORConsulta_conductor1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblERRORConsulta_conductor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCls;
    private javax.swing.JButton btnConsultarCond;
    private javax.swing.JButton btnElimCond;
    private javax.swing.JButton btnModCond;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JLabel lblERROR;
    private javax.swing.JLabel lblERRORConsulta_conductor1;
    private javax.swing.JLabel lblEXITO;
    private javax.swing.JLabel lbl_IdAdm_HA_Consulta;
    private javax.swing.JTextField txtDisponibilidad_HA_Consulta;
    private javax.swing.JTextField txtIdHabitacion_HA_Consulta;
    private javax.swing.JTextField txtPrecio_Consulta_HA;
    private javax.swing.JTextField txtTipoHabitacion_Consulta_HA;
    // End of variables declaration//GEN-END:variables
}
