/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VISTA;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class Internalfrm_SAdmin extends javax.swing.JInternalFrame {

    public JTextField getTxtPrecioServ3() {
        return txtPrecioServ3;
    }

    public void setTxtPrecioServ3(JTextField txtPrecioServ3) {
        this.txtPrecioServ3 = txtPrecioServ3;
    }
    public Internalfrm_SAdmin() {
        initComponents();
    }

    public JTextField getTxtIdEspacioServ() {
        return txtIdEspacioServ;
    }

    public void setTxtIdEspacioServ(JTextField txtIdEspacioServ) {
        this.txtIdEspacioServ = txtIdEspacioServ;
    }
    
    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JComboBox<String> getBoxHoraSerFIN() {
        return boxHoraSerFIN;
    }

    public void setBoxHoraSerFIN(JComboBox<String> boxHoraSerFIN) {
        this.boxHoraSerFIN = boxHoraSerFIN;
    }

    public JComboBox<String> getBoxHoraSerIN() {
        return boxHoraSerIN;
    }

    public void setBoxHoraSerIN(JComboBox<String> boxHoraSerIN) {
        this.boxHoraSerIN = boxHoraSerIN;
    }

    public JComboBox<String> getBoxMinutosSerFIN() {
        return boxMinutosSerFIN;
    }

    public JButton getBtnNuevoServ() {
        return btnNuevoServ;
    }

    public void setBtnNuevoServ(JButton btnNuevoServ) {
        this.btnNuevoServ = btnNuevoServ;
    }

    public void setBoxMinutosSerFIN(JComboBox<String> boxMinutosSerFIN) {
        this.boxMinutosSerFIN = boxMinutosSerFIN;
    }

    public JComboBox<String> getBoxMinutosSerIN() {
        return boxMinutosSerIN;
    }

    public void setBoxMinutosSerIN(JComboBox<String> boxMinutosSerIN) {
        this.boxMinutosSerIN = boxMinutosSerIN;
    }

    public JButton getBtnGuardar_servicio() {
        return btnGuardar_servicio;
    }

    public void setBtnGuardar_servicio(JButton btnGuardar_servicio) {
        this.btnGuardar_servicio = btnGuardar_servicio;
    }

    public JLabel getLblIdAdmin() {
        return lblIdAdmin;
    }

    public void setLblIdAdmin(JLabel lblIdAdmin) {
        this.lblIdAdmin = lblIdAdmin;
    }

    public JLabel getLblIdServicio() {
        return lblIdServicio;
    }

    public void setLblIdServicio(JLabel lblIdServicio) {
        this.lblIdServicio = lblIdServicio;
    }

    public JTextField getTxtCuposDis() {
        return txtCuposDis;
    }

    public void setTxtCuposDis(JTextField txtCuposDis) {
        this.txtCuposDis = txtCuposDis;
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

    public JTextField getTxtNomSer() {
        return txtNomSer;
    }

    public void setTxtNomSer(JTextField txtNomSer) {
        this.txtNomSer = txtNomSer;
    }

    public JTextField getTxtPrecioServ() {
        return txtPrecioServ;
    }

    public void setTxtPrecioServ(JTextField txtPrecioServ) {
        this.txtPrecioServ = txtPrecioServ;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        txtPrecioServ3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomSer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCuposDis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioServ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIdAdmin = new javax.swing.JLabel();
        lblIdServicio = new javax.swing.JLabel();
        txtEXITO = new javax.swing.JLabel();
        txtERROR = new javax.swing.JLabel();
        boxHoraSerFIN = new javax.swing.JComboBox<>();
        boxMinutosSerFIN = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        boxMinutosSerIN = new javax.swing.JComboBox<>();
        boxHoraSerIN = new javax.swing.JComboBox<>();
        btnGuardar_servicio = new javax.swing.JButton();
        btnNuevoServ = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdEspacioServ = new javax.swing.JTextField();

        jLabel13.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel13.setText("Precio :");

        txtPrecioServ3.setBackground(new java.awt.Color(235, 235, 235));
        txtPrecioServ3.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtPrecioServ3.setActionCommand("<Not Set>");
        txtPrecioServ3.setBorder(null);
        txtPrecioServ3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioServ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioServ3ActionPerformed(evt);
            }
        });

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 30, 40));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 20, -1));

        jPanel16.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 30, 20));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 70, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 40, 30));

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 30, 20));

        jPanel8.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 30, 40));

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 20, 20));

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 50));

        jPanel11.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 50, 20));

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("<");
        btnSalir.setBorder(null);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        txtNomSer.setBackground(new java.awt.Color(235, 235, 235));
        txtNomSer.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtNomSer.setActionCommand("<Not Set>");
        txtNomSer.setBorder(null);
        txtNomSer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNomSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomSerActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel4.setText("Cupos disponibles :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        txtCuposDis.setBackground(new java.awt.Color(235, 235, 235));
        txtCuposDis.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtCuposDis.setActionCommand("<Not Set>");
        txtCuposDis.setBorder(null);
        txtCuposDis.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCuposDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuposDisActionPerformed(evt);
            }
        });
        jPanel1.add(txtCuposDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, 20));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel8.setText("Precio :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        txtPrecioServ.setBackground(new java.awt.Color(235, 235, 235));
        txtPrecioServ.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtPrecioServ.setActionCommand("<Not Set>");
        txtPrecioServ.setBorder(null);
        txtPrecioServ.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioServActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, 20));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel6.setText("Id admin:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setText("Id servicio:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        lblIdAdmin.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jPanel1.add(lblIdAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 120, 20));

        lblIdServicio.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jPanel1.add(lblIdServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, 20));

        txtEXITO.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(txtEXITO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 170, 20));

        txtERROR.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(txtERROR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 210, 20));

        boxHoraSerFIN.setBackground(new java.awt.Color(235, 235, 235));
        boxHoraSerFIN.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        boxHoraSerFIN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        boxHoraSerFIN.setBorder(null);
        jPanel1.add(boxHoraSerFIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, -1));

        boxMinutosSerFIN.setBackground(new java.awt.Color(235, 235, 235));
        boxMinutosSerFIN.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        boxMinutosSerFIN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        boxMinutosSerFIN.setBorder(null);
        jPanel1.add(boxMinutosSerFIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, -1));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Hora fin");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 150, -1));

        boxMinutosSerIN.setBackground(new java.awt.Color(235, 235, 235));
        boxMinutosSerIN.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        boxMinutosSerIN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        boxMinutosSerIN.setBorder(null);
        jPanel1.add(boxMinutosSerIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 80, 20));

        boxHoraSerIN.setBackground(new java.awt.Color(235, 235, 235));
        boxHoraSerIN.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        boxHoraSerIN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        boxHoraSerIN.setBorder(null);
        jPanel1.add(boxHoraSerIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 70, 20));

        btnGuardar_servicio.setBackground(new java.awt.Color(0, 204, 102));
        btnGuardar_servicio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnGuardar_servicio.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar_servicio.setText("GUARDAR");
        btnGuardar_servicio.setBorder(null);
        jPanel1.add(btnGuardar_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 110, 30));

        btnNuevoServ.setBackground(new java.awt.Color(0, 204, 255));
        btnNuevoServ.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnNuevoServ.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoServ.setText("NUEVO");
        btnNuevoServ.setBorder(null);
        jPanel1.add(btnNuevoServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, 30));

        jPanel17.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 40, 50));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Hora inicio");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 150, 20));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel9.setText("Id espacio :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        txtIdEspacioServ.setBackground(new java.awt.Color(235, 235, 235));
        txtIdEspacioServ.setFont(new java.awt.Font("Segoe UI Symbol", 2, 12)); // NOI18N
        txtIdEspacioServ.setActionCommand("<Not Set>");
        txtIdEspacioServ.setBorder(null);
        txtIdEspacioServ.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIdEspacioServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEspacioServActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdEspacioServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, 20));

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

    private void txtNomSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomSerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomSerActionPerformed

    private void txtCuposDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuposDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuposDisActionPerformed

    private void txtPrecioServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioServActionPerformed

    private void txtPrecioServ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioServ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioServ3ActionPerformed

    private void txtIdEspacioServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEspacioServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEspacioServActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxHoraSerFIN;
    private javax.swing.JComboBox<String> boxHoraSerIN;
    private javax.swing.JComboBox<String> boxMinutosSerFIN;
    private javax.swing.JComboBox<String> boxMinutosSerIN;
    private javax.swing.JButton btnGuardar_servicio;
    private javax.swing.JButton btnNuevoServ;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblIdAdmin;
    private javax.swing.JLabel lblIdServicio;
    private javax.swing.JTextField txtCuposDis;
    private javax.swing.JLabel txtERROR;
    private javax.swing.JLabel txtEXITO;
    private javax.swing.JTextField txtIdEspacioServ;
    private javax.swing.JTextField txtNomSer;
    private javax.swing.JTextField txtPrecioServ;
    private javax.swing.JTextField txtPrecioServ3;
    // End of variables declaration//GEN-END:variables
}
