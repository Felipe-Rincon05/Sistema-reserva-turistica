//Nueva Cuenta Admin
package VISTA;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class Internalfrm_NCA extends javax.swing.JInternalFrame {

    /**
     * Creates new form Internalfrm_Nueva_Cuenta_A
     */
    public Internalfrm_NCA() {
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

        jLabel1 = new javax.swing.JLabel();
        txtUsuario_Admin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_UsNvAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ContraNvAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_NomNvAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbl_IdNvAdmin = new javax.swing.JLabel();
        btn_NvAdmin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_CedulaNvAdmin = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        txtERROR = new javax.swing.JLabel();
        txtEXITO = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO");

        txtUsuario_Admin.setBackground(new java.awt.Color(235, 235, 235));
        txtUsuario_Admin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario_Admin.setActionCommand("<Not Set>");
        txtUsuario_Admin.setBorder(null);
        txtUsuario_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setText("Nombre :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 71, 25));

        txt_UsNvAdmin.setBackground(new java.awt.Color(235, 235, 235));
        txt_UsNvAdmin.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txt_UsNvAdmin.setActionCommand("<Not Set>");
        txt_UsNvAdmin.setBorder(null);
        txt_UsNvAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_UsNvAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsNvAdminActionPerformed(evt);
            }
        });
        jPanel1.add(txt_UsNvAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 390, 20));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 71, 25));

        txt_ContraNvAdmin.setBackground(new java.awt.Color(235, 235, 235));
        txt_ContraNvAdmin.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txt_ContraNvAdmin.setActionCommand("<Not Set>");
        txt_ContraNvAdmin.setBorder(null);
        txt_ContraNvAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ContraNvAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraNvAdminActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ContraNvAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 390, 20));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel4.setText("Usuario :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 71, 25));

        txt_NomNvAdmin.setBackground(new java.awt.Color(235, 235, 235));
        txt_NomNvAdmin.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txt_NomNvAdmin.setActionCommand("<Not Set>");
        txt_NomNvAdmin.setBorder(null);
        txt_NomNvAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NomNvAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomNvAdminActionPerformed(evt);
            }
        });
        jPanel1.add(txt_NomNvAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 390, 20));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Id admin:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        lbl_IdNvAdmin.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jPanel1.add(lbl_IdNvAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, 20));

        btn_NvAdmin.setBackground(new java.awt.Color(0, 204, 102));
        btn_NvAdmin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btn_NvAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btn_NvAdmin.setText("GUARDAR");
        btn_NvAdmin.setBorder(null);
        btn_NvAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NvAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btn_NvAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 110, 30));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 60, -1));

        jPanel7.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 20));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 40));

        jPanel27.setBackground(new java.awt.Color(0, 102, 204));

        jPanel29.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 30, 30));

        jPanel28.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 40, -1));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 40, 40));

        jPanel9.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jPanel10.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 40, 40));

        jPanel11.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 10));

        jPanel30.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 20, -1));

        jPanel31.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 30, 40));

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel6.setText("Cedula :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 71, 25));

        txt_CedulaNvAdmin.setBackground(new java.awt.Color(235, 235, 235));
        txt_CedulaNvAdmin.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txt_CedulaNvAdmin.setActionCommand("<Not Set>");
        txt_CedulaNvAdmin.setBorder(null);
        txt_CedulaNvAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_CedulaNvAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CedulaNvAdminActionPerformed(evt);
            }
        });
        jPanel1.add(txt_CedulaNvAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 390, 20));

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("<");
        btnSalir.setBorder(null);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        txtERROR.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(txtERROR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 260, 20));

        txtEXITO.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(txtEXITO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 220, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuario_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario_AdminActionPerformed

    private void txt_UsNvAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsNvAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsNvAdminActionPerformed

    private void txt_ContraNvAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraNvAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraNvAdminActionPerformed

    private void txt_NomNvAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomNvAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomNvAdminActionPerformed

    private void btn_NvAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NvAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NvAdminActionPerformed

    private void txt_CedulaNvAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CedulaNvAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CedulaNvAdminActionPerformed

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtn_NvAdmin() {
        return btn_NvAdmin;
    }

    public void setBtn_NvAdmin(JButton btn_NvAdmin) {
        this.btn_NvAdmin = btn_NvAdmin;
    }

    public JLabel getLbl_IdNvAdmin() {
        return lbl_IdNvAdmin;
    }

    public void setLbl_IdNvAdmin(JLabel lbl_IdNvAdmin) {
        this.lbl_IdNvAdmin = lbl_IdNvAdmin;
    }

    public JLabel getTxtERROR() {
        return txtERROR;
    }

    public void setTxtERROR(JLabel txtERROR) {
        this.txtERROR = txtERROR;
    }

    public JLabel getTxtEXITO() {
        return txtEXITO;
    }

    public void setTxtEXITO(JLabel txtEXITO) {
        this.txtEXITO = txtEXITO;
    }

    public JTextField getTxtUsuario_Admin() {
        return txtUsuario_Admin;
    }

    public void setTxtUsuario_Admin(JTextField txtUsuario_Admin) {
        this.txtUsuario_Admin = txtUsuario_Admin;
    }

    public JTextField getTxt_CedulaNvAdmin() {
        return txt_CedulaNvAdmin;
    }

    public void setTxt_CedulaNvAdmin(JTextField txt_CedulaNvAdmin) {
        this.txt_CedulaNvAdmin = txt_CedulaNvAdmin;
    }

    public JTextField getTxt_ContraNvAdmin() {
        return txt_ContraNvAdmin;
    }

    public void setTxt_ContraNvAdmin(JTextField txt_ContraNvAdmin) {
        this.txt_ContraNvAdmin = txt_ContraNvAdmin;
    }

    public JTextField getTxt_NomNvAdmin() {
        return txt_NomNvAdmin;
    }

    public void setTxt_NomNvAdmin(JTextField txt_NomNvAdmin) {
        this.txt_NomNvAdmin = txt_NomNvAdmin;
    }

    public JTextField getTxt_UsNvAdmin() {
        return txt_UsNvAdmin;
    }

    public void setTxt_UsNvAdmin(JTextField txt_UsNvAdmin) {
        this.txt_UsNvAdmin = txt_UsNvAdmin;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_NvAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_IdNvAdmin;
    private javax.swing.JLabel txtERROR;
    private javax.swing.JLabel txtEXITO;
    private javax.swing.JTextField txtUsuario_Admin;
    private javax.swing.JTextField txt_CedulaNvAdmin;
    private javax.swing.JTextField txt_ContraNvAdmin;
    private javax.swing.JTextField txt_NomNvAdmin;
    private javax.swing.JTextField txt_UsNvAdmin;
    // End of variables declaration//GEN-END:variables

    public void setLbl_IdNvAdmin(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
