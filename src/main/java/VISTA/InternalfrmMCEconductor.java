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
public class InternalfrmMCEconductor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Internalfrm_MCconductor
     */
    public InternalfrmMCEconductor() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreConsulta_conductor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCedulaConsultar_conductor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefonoConsultar_conductor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIAnioConsultar_Conductor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificarCond = new javax.swing.JButton();
        btnEliminarCond = new javax.swing.JButton();
        btnConsultarConductor = new javax.swing.JButton();
        txtId_Conductor_Consulta = new javax.swing.JTextField();
        txtIDiaConsultar_Conductor = new javax.swing.JTextField();
        txtIMesConsultar_Conductor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtId_transCpnsulta_con = new javax.swing.JTextField();
        lblEXITOConsulta_Conductor = new javax.swing.JLabel();
        lblERRORConsulta_conductor = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbl_IdAdmConsulta_Conductor = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnCls = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        txtNombreConsulta_conductor.setBackground(new java.awt.Color(235, 235, 235));
        txtNombreConsulta_conductor.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtNombreConsulta_conductor.setBorder(null);
        jPanel1.add(txtNombreConsulta_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 430, 20));

        jLabel5.setText("Cedula :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, -1));

        txtCedulaConsultar_conductor.setEditable(false);
        txtCedulaConsultar_conductor.setBackground(new java.awt.Color(235, 235, 235));
        txtCedulaConsultar_conductor.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtCedulaConsultar_conductor.setBorder(null);
        jPanel1.add(txtCedulaConsultar_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 430, 20));

        jLabel4.setText("Telefono :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        txtTelefonoConsultar_conductor.setBackground(new java.awt.Color(235, 235, 235));
        txtTelefonoConsultar_conductor.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtTelefonoConsultar_conductor.setBorder(null);
        jPanel1.add(txtTelefonoConsultar_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 430, 20));

        jLabel10.setText("Id conductor :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 82, 20));

        txtIAnioConsultar_Conductor.setEditable(false);
        txtIAnioConsultar_Conductor.setBackground(new java.awt.Color(235, 235, 235));
        txtIAnioConsultar_Conductor.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtIAnioConsultar_Conductor.setBorder(null);
        jPanel1.add(txtIAnioConsultar_Conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 130, 20));

        jLabel6.setText("Fecha nacimiento :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel7.setText("Dia :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel8.setText("Mes :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel9.setText("Año :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        btnModificarCond.setBackground(new java.awt.Color(0, 204, 255));
        btnModificarCond.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnModificarCond.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCond.setText("MODIFICAR");
        btnModificarCond.setBorder(null);
        jPanel1.add(btnModificarCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 80, 30));

        btnEliminarCond.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarCond.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnEliminarCond.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCond.setText("ELIMINAR");
        btnEliminarCond.setBorder(null);
        jPanel1.add(btnEliminarCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 80, 30));

        btnConsultarConductor.setBackground(new java.awt.Color(0, 204, 102));
        btnConsultarConductor.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnConsultarConductor.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarConductor.setText("CONSULTAR");
        btnConsultarConductor.setBorder(null);
        jPanel1.add(btnConsultarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 80, 30));

        txtId_Conductor_Consulta.setBackground(new java.awt.Color(235, 235, 235));
        txtId_Conductor_Consulta.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtId_Conductor_Consulta.setBorder(null);
        jPanel1.add(txtId_Conductor_Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 430, 20));

        txtIDiaConsultar_Conductor.setEditable(false);
        txtIDiaConsultar_Conductor.setBackground(new java.awt.Color(235, 235, 235));
        txtIDiaConsultar_Conductor.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtIDiaConsultar_Conductor.setBorder(null);
        jPanel1.add(txtIDiaConsultar_Conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 60, 20));

        txtIMesConsultar_Conductor.setEditable(false);
        txtIMesConsultar_Conductor.setBackground(new java.awt.Color(235, 235, 235));
        txtIMesConsultar_Conductor.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtIMesConsultar_Conductor.setBorder(null);
        jPanel1.add(txtIMesConsultar_Conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, 20));

        jLabel12.setText("Id transporte :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 82, 20));

        txtId_transCpnsulta_con.setBackground(new java.awt.Color(235, 235, 235));
        txtId_transCpnsulta_con.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtId_transCpnsulta_con.setBorder(null);
        jPanel1.add(txtId_transCpnsulta_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 430, 20));

        lblEXITOConsulta_Conductor.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(lblEXITOConsulta_Conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 280, 20));

        lblERRORConsulta_conductor.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblERRORConsulta_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 280, 20));

        jPanel34.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 40, -1));

        jPanel31.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 50, 60));

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

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, 30));

        jPanel30.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 40, 50));

        jPanel29.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 40));

        jPanel26.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jPanel15.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 20));

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

        jPanel1.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jPanel24.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jPanel42.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jPanel43.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jPanel44.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jPanel45.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jPanel33.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 30, 30));

        jPanel36.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 60));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel11.setText("Id admin:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, -1));

        lbl_IdAdmConsulta_Conductor.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jPanel1.add(lbl_IdAdmConsulta_Conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 20));

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, 50));

        jPanel35.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("<");
        btnSalir.setBorder(null);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 20, 20));

        btnCls.setBackground(new java.awt.Color(204, 204, 255));
        btnCls.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnCls.setForeground(new java.awt.Color(255, 255, 255));
        btnCls.setText("CLS");
        btnCls.setBorder(null);
        jPanel1.add(btnCls, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnConsultarConductor() {
        return btnConsultarConductor;
    }

    public JButton getBtnCls() {
        return btnCls;
    }

    public void setBtnCls(JButton btnCls) {
        this.btnCls = btnCls;
    }

    public void setBtnConsultarConductor(JButton btnConsultarConductor) {
        this.btnConsultarConductor = btnConsultarConductor;
    }

    public JButton getBtnEliminarCond() {
        return btnEliminarCond;
    }

    public void setBtnEliminarCond(JButton btnEliminarCond) {
        this.btnEliminarCond = btnEliminarCond;
    }

    public JButton getBtnModificarCond() {
        return btnModificarCond;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public void setBtnModificarCond(JButton btnModificarCond) {
        this.btnModificarCond = btnModificarCond;
    }

    public JLabel getLblERRORConsulta_conductor() {
        return lblERRORConsulta_conductor;
    }

    public void setLblERRORConsulta_conductor(JLabel lblERRORConsulta_conductor) {
        this.lblERRORConsulta_conductor = lblERRORConsulta_conductor;
    }

    public JLabel getLblEXITOConsulta_Conductor() {
        return lblEXITOConsulta_Conductor;
    }

    public void setLblEXITOConsulta_Conductor(JLabel lblEXITOConsulta_Conductor) {
        this.lblEXITOConsulta_Conductor = lblEXITOConsulta_Conductor;
    }

    public JLabel getLbl_IdAdmConsulta_Conductor() {
        return lbl_IdAdmConsulta_Conductor;
    }

    public void setLbl_IdAdmConsulta_Conductor(JLabel lbl_IdAdmConsulta_Conductor) {
        this.lbl_IdAdmConsulta_Conductor = lbl_IdAdmConsulta_Conductor;
    }

    public JTextField getTxtCedulaConsultar_conductor() {
        return txtCedulaConsultar_conductor;
    }

    public void setTxtCedulaConsultar_conductor(JTextField txtCedulaConsultar_conductor) {
        this.txtCedulaConsultar_conductor = txtCedulaConsultar_conductor;
    }

    public JTextField getTxtIAnioConsultar_Conductor() {
        return txtIAnioConsultar_Conductor;
    }

    public void setTxtIAnioConsultar_Conductor(JTextField txtIAnioConsultar_Conductor) {
        this.txtIAnioConsultar_Conductor = txtIAnioConsultar_Conductor;
    }

    public JTextField getTxtIDiaConsultar_Conductor() {
        return txtIDiaConsultar_Conductor;
    }

    public void setTxtIDiaConsultar_Conductor(JTextField txtIDiaConsultar_Conductor) {
        this.txtIDiaConsultar_Conductor = txtIDiaConsultar_Conductor;
    }

    public JTextField getTxtIMesConsultar_Conductor() {
        return txtIMesConsultar_Conductor;
    }

    public void setTxtIMesConsultar_Conductor(JTextField txtIMesConsultar_Conductor) {
        this.txtIMesConsultar_Conductor = txtIMesConsultar_Conductor;
    }

    public JTextField getTxtId_Conductor_Consulta() {
        return txtId_Conductor_Consulta;
    }

    public void setTxtId_Conductor_Consulta(JTextField txtId_Conductor_Consulta) {
        this.txtId_Conductor_Consulta = txtId_Conductor_Consulta;
    }

    public JTextField getTxtId_transCpnsulta_con() {
        return txtId_transCpnsulta_con;
    }

    public void setTxtId_transCpnsulta_con(JTextField txtId_transCpnsulta_con) {
        this.txtId_transCpnsulta_con = txtId_transCpnsulta_con;
    }

    public JTextField getTxtNombreConsulta_conductor() {
        return txtNombreConsulta_conductor;
    }

    public void setTxtNombreConsulta_conductor(JTextField txtNombreConsulta_conductor) {
        this.txtNombreConsulta_conductor = txtNombreConsulta_conductor;
    }

    public JTextField getTxtTelefonoConsultar_conductor() {
        return txtTelefonoConsultar_conductor;
    }

    public void setTxtTelefonoConsultar_conductor(JTextField txtTelefonoConsultar_conductor) {
        this.txtTelefonoConsultar_conductor = txtTelefonoConsultar_conductor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCls;
    private javax.swing.JButton btnConsultarConductor;
    private javax.swing.JButton btnEliminarCond;
    private javax.swing.JButton btnModificarCond;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JLabel lblERRORConsulta_conductor;
    private javax.swing.JLabel lblEXITOConsulta_Conductor;
    private javax.swing.JLabel lbl_IdAdmConsulta_Conductor;
    private javax.swing.JTextField txtCedulaConsultar_conductor;
    private javax.swing.JTextField txtIAnioConsultar_Conductor;
    private javax.swing.JTextField txtIDiaConsultar_Conductor;
    private javax.swing.JTextField txtIMesConsultar_Conductor;
    private javax.swing.JTextField txtId_Conductor_Consulta;
    private javax.swing.JTextField txtId_transCpnsulta_con;
    private javax.swing.JTextField txtNombreConsulta_conductor;
    private javax.swing.JTextField txtTelefonoConsultar_conductor;
    // End of variables declaration//GEN-END:variables
}
