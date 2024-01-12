package CONTROL;

import MODELO.Admin.NCDA;
import MODELO.Admin.VDIA;
import MODELO.Conductor.VDICO;
import MODELO.Conexion.Conexion;
import MODELO.HA.VDIHA;
import MODELO.Servicio.VDIS;
import MODELO.TransporteAdm.VDITR;
import VISTA.InternalfrmMCEhospedaje;
import VISTA.InternalfrmMCEservicio;
import VISTA.Internalfrm_Admin;
import VISTA.Internalfrm_Cliente;
import VISTA.Internalfrm_Conductor;
import VISTA.InternalfrmMCEconductor;
import VISTA.InternalfrmMCEtransporte;
import VISTA.Internalfrm_EspacioServicio;
import VISTA.Internalfrm_HA;
import VISTA.Internalfrm_Hospedaje;
import VISTA.Internalfrm_MenuCRUDcond;
import VISTA.Internalfrm_MenuCRUDhosp;
import VISTA.Internalfrm_MenuCRUDserv;
import VISTA.Internalfrm_MenuCRUDtrans;
import VISTA.Internalfrm_MenuCliente;
import VISTA.Internalfrm_MenuServ;
import VISTA.Internalfrm_MenuTrans;
import VISTA.Internalfrm_Menu_Admin;
import VISTA.Internalfrm_Menu_Cliente;
import VISTA.Internalfrm_NCA;
import VISTA.Internalfrm_Pago;
import VISTA.Internalfrm_SAdmin;
import VISTA.Internalfrm_Servicios;
import VISTA.Internalfrm_TransAdmin;
import VISTA.Internalfrm_Transporte;
import VISTA.frm_Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import static java.lang.Math.abs;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class Controlador_Inicio implements ActionListener{
    int id_admin_def;
    int id_cliente_def;
    int id_reserva_def;
    int id_pago_def;
    float valor_total_def = 0;
    Internalfrm_MenuTrans mt;
    Internalfrm_MenuCRUDserv mCs;
    Internalfrm_MenuCRUDhosp mCh;
    Internalfrm_MenuCRUDcond mCc;
    Internalfrm_MenuCRUDtrans mCt;
    Internalfrm_Admin ad;
    frm_Inicio in;
    Internalfrm_Cliente cl;
    Internalfrm_NCA nva;
    Internalfrm_Menu_Cliente mc;
    Internalfrm_Menu_Admin ma;
    Internalfrm_Conductor co;
    Internalfrm_TransAdmin tra;
    InternalfrmMCEhospedaje MCEh;
    InternalfrmMCEservicio MCEs;
    InternalfrmMCEconductor MCEc;
    InternalfrmMCEtransporte MCEt;
    Internalfrm_HA ha;
    Internalfrm_SAdmin sa;
    Internalfrm_MenuCliente Mc;
    Internalfrm_Servicios sc;
    Internalfrm_Transporte tc;
    Internalfrm_Hospedaje hc;
    Internalfrm_Pago pc;
    Internalfrm_EspacioServicio ESa;
    Internalfrm_MenuServ ms;
    
    public Controlador_Inicio() {
        this.mt = new Internalfrm_MenuTrans();
        this.ad = new Internalfrm_Admin();
        this.in = new frm_Inicio();
        this.cl = new Internalfrm_Cliente();
        this.nva = new Internalfrm_NCA();
        this.mc = new Internalfrm_Menu_Cliente();
        this.ma = new Internalfrm_Menu_Admin();
        this.co = new Internalfrm_Conductor();
        this.tra = new Internalfrm_TransAdmin();
        this.mCs = new Internalfrm_MenuCRUDserv ();
        this.mCh = new Internalfrm_MenuCRUDhosp ();
        this.mCc = new Internalfrm_MenuCRUDcond ();
        this.mCt = new Internalfrm_MenuCRUDtrans ();
        this.MCEh = new InternalfrmMCEhospedaje ();
        this.MCEs = new InternalfrmMCEservicio ();
        this.MCEc = new InternalfrmMCEconductor ();
        this.MCEt = new InternalfrmMCEtransporte ();
        this.ha = new Internalfrm_HA ();
        this.sa = new Internalfrm_SAdmin();
        this.Mc = new Internalfrm_MenuCliente ();
        this.sc = new Internalfrm_Servicios ();
        this.tc = new Internalfrm_Transporte ();
        this.hc = new Internalfrm_Hospedaje ();
        this.pc = new Internalfrm_Pago ();
        this.ms = new Internalfrm_MenuServ ();
        this.ESa = new Internalfrm_EspacioServicio ();
    }
    
    public void iniciar(){
        in.getBtnAdmin().addActionListener(this);
        in.getBtnCliente().addActionListener(this);
        in.setVisible(true);
    }
    
    public void CentrarVentanaInterna(JInternalFrame internalFrame){
	int x = (this.in.getEscritorio().getWidth() / 2) - internalFrame.getWidth() / 2;
	int y = (this.in.getEscritorio().getHeight()/ 2) - internalFrame.getHeight() / 2; 
	if (internalFrame.isShowing()){
 	    internalFrame.setLocation(x, y);	
 	} else {
	    this.in.getEscritorio().add(internalFrame);
	    internalFrame.setLocation(x, y);
	    internalFrame.show();
	}}
    
    @Override
    public void actionPerformed(ActionEvent evn) {
        //Llamar interfaz admin
        if(evn.getSource().equals(in.getBtnAdmin())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.ad = new Internalfrm_Admin();
            this.in.getEscritorio().add(ad);
            ad.setVisible(true);
            CentrarVentanaInterna(ad); 
            ad.getBtnCuenta_Nueva_A().addActionListener(this);
            ad.getBtnIngresar_Admin().addActionListener(this);
        }
        //Llamar interfaz cliente
        if(evn.getSource().equals(in.getBtnCliente())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.cl = new Internalfrm_Cliente();
            this.in.getEscritorio().add(Mc);
            Mc.setVisible(true);
            CentrarVentanaInterna(Mc); 
            Mc.getBtnNuevaReserva().addActionListener(this);
        }
        if(evn.getSource().equals(Mc.getBtnNuevaReserva())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(cl);
            // id cliente
            NCDA ob = new NCDA();
            int id = ob.id_mayor_cliente();
            cl.getLblClienteID().setText(id+"");
            cl.setVisible(true);
            CentrarVentanaInterna(cl); 
            cl.getBtnAgregar_Cliente().addActionListener(this);
            cl.getBtnSalir().addActionListener(this);
        }

        if(evn.getSource().equals(cl.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.cl = new Internalfrm_Cliente();
            this.in.getEscritorio().add(Mc);
            Mc.setVisible(true);
            CentrarVentanaInterna(Mc);
        }
        //Interfaz nueva cuenta admin
        if (evn.getSource().equals(ad.getBtnCuenta_Nueva_A())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.nva = new Internalfrm_NCA();
            this.in.getEscritorio().add(nva);
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_admin();
            nva.getLbl_IdNvAdmin().setText(idmayor+"");
            nva.setVisible(true);
            CentrarVentanaInterna(nva); 
            nva.getBtn_NvAdmin().addActionListener(this);
            nva.getBtnSalir().addActionListener(this);
        }
        if (evn.getSource().equals(nva.getBtnSalir())){
             in.getEscritorio().removeAll();
             in.getEscritorio().repaint();
             this.in.getEscritorio().add(ad);
             ad.setVisible(true);
        }
        //Ingresar admin
        if (evn.getSource().equals(ad.getBtnIngresar_Admin())){
            VDIA ob = new VDIA();
            boolean flag=false;
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            String user = ad.getTxtUsuario_Admin().getText();
            String contra = ad.getTxtContrasena_Admin().getText();
            flag = ob.Extraer_Comparar(contra, user);
            if(flag){
               id_admin_def = ob.encontrar_id(ad.getTxtUsuario_Admin().getText());
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(ma);
               ma.setVisible(true);
               CentrarVentanaInterna(ma);
            }else{
                in.getEscritorio().removeAll();
                in.getEscritorio().repaint();
                this.in.getEscritorio().add(ad);
                ad.setVisible(true);
                ad.getTxtUsuario_Admin().setText("");
                ad.getTxtContrasena_Admin().setText("");
                ad.getTxtERROR().setText("Error de ingreso: Revise los datos");
            }
            ma.getBtnConductor_Admin().addActionListener(this);
            ma.getBtnHospedaje_Admin().addActionListener(this);
            ma.getBtnServicio_Admin().addActionListener(this);
            
        }
        
        //Guardar nuevo admin
        if(evn.getSource().equals(nva.getBtn_NvAdmin())){
           NCDA ob = new NCDA();
           boolean flag = false;
           flag = ob.validar_datos_admin(nva.getTxt_NomNvAdmin().getText(), nva.getTxt_ContraNvAdmin().getText(), nva.getTxt_UsNvAdmin().getText(),nva.getTxt_CedulaNvAdmin().getText());
           if (flag){
              int a = (int) Integer.parseInt(nva.getLbl_IdNvAdmin().getText());
               ob.insertDatos_admin(a, nva.getTxt_NomNvAdmin().getText(), nva.getTxt_ContraNvAdmin().getText(), nva.getTxt_UsNvAdmin().getText(),nva.getTxt_CedulaNvAdmin().getText());
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(ad);
               ad.setVisible(true);
           }else{
               nva.getTxtERROR().setText("Error de registro, revise los datos ingresados");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(nva);
               nva.setVisible(true);
               nva.getTxt_CedulaNvAdmin().setText("");
           }
        }
        //Guardar cliente
        if (evn.getSource().equals(cl.getBtnAgregar_Cliente())){
           NCDA ob = new NCDA();
           boolean flag = false;
           flag = ob.validar_datos_cliente(cl.getTxtNombre_Cliente().getText(), cl.getTxtCorreo_Cliente().getText(), cl.getTxtTipoId_Cliente().getSelectedItem().toString(), cl.getTxtNumeroId_Cliente().getText(), cl.getTxtTelefono_Cliente().getText(), cl.getTxtDia_nto_Cliente().getSelectedItem().toString(), cl.getTxtAnio_nto_Cliente().getSelectedItem().toString(), cl.getTxtMes_nto_Cliente().getSelectedItem().toString());
           if (flag){
               int id = (int) Integer.parseInt(cl.getLblClienteID().getText());
               id_cliente_def = id;
               int telefono = (int) Integer.parseInt(cl.getTxtTelefono_Cliente().getText());
               int cc = (int) Integer.parseInt(cl.getTxtNumeroId_Cliente().getText());
               LocalDate hoy = LocalDate.now();
               LocalDate date = LocalDate.parse(cl.getTxtAnio_nto_Cliente().getSelectedItem().toString() +"-"+ cl.getTxtMes_nto_Cliente().getSelectedItem().toString() +"-"+ cl.getTxtDia_nto_Cliente().getSelectedItem().toString());
               Period periodo =Period.between(hoy,date);
               int  edad = abs((int) periodo.getYears());
               ob.insertDatos_cliente(id, cl.getTxtTipoId_Cliente().getSelectedItem().toString(), cl.getTxtCorreo_Cliente().getText(), telefono, cc ,edad,cl.getTxtNombre_Cliente().getText());
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(mc);
               id_reserva_def = ob.id_mayor_reserva();
               mc.getLblIdReserva().setText(id_reserva_def+"");
               mc.setVisible(true);
               CentrarVentanaInterna(mc);
           }else{
               cl.getLblERROR().setText("Error de registro, revise los datos ingresados");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(cl);
               cl.setVisible(true);
               cl.getTxtNumeroId_Cliente().setText("");
           }
           mc.getBtnPago_cliente().addActionListener(this);
           mc.getBtnHospedaje_cliente().addActionListener(this);
           mc.getBtnServicio_cliente().addActionListener(this);
           mc.getBtnTrans_cliente().addActionListener(this);
           mc.getBtnReciboCliente().addActionListener(this);
        }
        if (evn.getSource().equals(mc.getBtnReciboCliente())){
            NCDA ob = new NCDA ();
            try {
                ob.factura(id_cliente_def);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador_Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (evn.getSource().equals(mc.getBtnServicio_cliente())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(sc);
            sc.setVisible(true);
            CentrarVentanaInterna(sc);
            sc.getBtnSalir().addActionListener(this);
        }
        if (evn.getSource().equals(sc.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(mc);
            mc.setVisible(true);
            CentrarVentanaInterna(mc);
        }
        if (evn.getSource().equals(mc.getBtnHospedaje_cliente())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(hc);
            hc.setVisible(true);
            CentrarVentanaInterna(hc);
            hc.getBtnSalir().addActionListener(this);
        }
        if (evn.getSource().equals(hc.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(mc);
            mc.setVisible(true);
            CentrarVentanaInterna(mc);
        }
        
        if (evn.getSource().equals(pc.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(mc);
            mc.setVisible(true);
            CentrarVentanaInterna(mc);
        }
        if (evn.getSource().equals(mc.getBtnTrans_cliente())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(tc);
            tc.setVisible(true);
            CentrarVentanaInterna(tc);
            tc.getBtnSalir().addActionListener(this);
        }
        if (evn.getSource().equals(tc.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(mc);
            mc.setVisible(true);
            CentrarVentanaInterna(mc);
        }
        // HOSPEDAJE ADMIN
        if(evn.getSource().equals(ma.getBtnHospedaje_Admin())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCh);
           mCh.setVisible(true);
           CentrarVentanaInterna(mCh);
           mCh.getBtnRegistrarHos().addActionListener(this);
           mCh.getBtnURDHosp().addActionListener(this);
           mCh.getBtnSalir().addActionListener(this);
        }
        if(evn.getSource().equals(mCh.getBtnSalir())){
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(ma);
               ma.setVisible(true);
               CentrarVentanaInterna(ma);
        }
        if(evn.getSource().equals(mCh.getBtnRegistrarHos())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(ha);
           NCDA ob = new NCDA();
           int idmayor = ob.id_mayor_hosp();
           ha.getLbl_IdHabitacion_HA().setText(idmayor+"");
           ha.getLbl_IdAdmin_HA().setText(id_admin_def+"");
           ha.setVisible(true);
           CentrarVentanaInterna(ha);
           ha.getBtnSalir().addActionListener(this);
           ha.getBtnGuardarHA().addActionListener(this);
           ha.getBtnNuevoHosp().addActionListener(this);
        }
        if(evn.getSource().equals(ha.getBtnGuardarHA())){
            NCDA ob = new NCDA();
           boolean flag = false;
           flag = ob.validar_datos_hospedajeAdm(ha.getTxtTipo_habitacion_HA().getText(),ha.getTxtPrecio_HA().getText(), ha.getTxtDisponibilidad_HA().getSelectedItem().toString());
           if (flag){
               int id_HA = (int) Integer.parseInt(ha.getLbl_IdHabitacion_HA().getText());
               float valor = (float) Float.parseFloat(ha.getTxtPrecio_HA().getText());
               int id_admin = (int) Integer.parseInt(ha.getLbl_IdAdmin_HA().getText());
               ob.insertDatos_hospedaje_adm(id_HA,ha.getTxtDisponibilidad_HA().getSelectedItem().toString(), ha.getTxtTipo_habitacion_HA().getText(), valor, id_admin);
               ha.getLblEXITO().setText("Registro exitoso");
           }else{
               ha.getLblERROR().setText("Error de registro, revise los datos ingresados");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(ha);
               ha.setVisible(true);
           }
        }
        if(evn.getSource().equals(ha.getBtnNuevoHosp())){
            NCDA ob = new NCDA();
           int idmayor = ob.id_mayor_hosp();
           ha.getLbl_IdHabitacion_HA().setText(idmayor+"");
           ha.getTxtDisponibilidad_HA().setSelectedIndex(0);
           ha.getTxtPrecio_HA().setText("");
           ha.getTxtTipo_habitacion_HA().setText("");
           ha.getLblERROR().setText("");
           ha.getLblEXITO().setText("");
        }
        if(evn.getSource().equals(ha.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCh);
           mCh.setVisible(true);
           CentrarVentanaInterna(mCh);
        }
        if(evn.getSource().equals(mCh.getBtnURDHosp())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(MCEh);
           MCEh.getLbl_IdAdm_HA_Consulta().setText(id_admin_def+"");
           MCEh.setVisible(true);
           CentrarVentanaInterna(MCEh);
           MCEh.getBtnElimCond().addActionListener(this);
           MCEh.getBtnConsultarCond().addActionListener(this);
           MCEh.getBtnModCond().addActionListener(this);
           MCEh.getBtnSalir().addActionListener(this);
           MCEh.getBtnCls().addActionListener(this);
        }
        if(evn.getSource().equals(MCEh.getBtnCls())){
            MCEh.getTxtDisponibilidad_HA_Consulta().setText("");
            MCEh.getTxtIdHabitacion_HA_Consulta().setText("");
            MCEh.getTxtPrecio_Consulta_HA().setText("");
            MCEh.getTxtTipoHabitacion_Consulta_HA().setText("");
            MCEh.getLblERROR().setText("");
            MCEh.getLblEXITO().setText("");
        }
        if(evn.getSource().equals(MCEh.getBtnConsultarCond())){
            VDIHA ob = new VDIHA();
            if(!MCEh.getTxtIdHabitacion_HA_Consulta().getText().equals("") && MCEh.getTxtPrecio_Consulta_HA().getText().equals("") && MCEh.getTxtDisponibilidad_HA_Consulta().getText().equals("")){
                if (ob.validar_id_ha(MCEh.getTxtIdHabitacion_HA_Consulta().getText())){
                    int id_ha = (int) Integer.parseInt(MCEh.getTxtIdHabitacion_HA_Consulta().getText());
                    Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = false;
                int id_hoa = 0, id_admin =0;
                String tipo=null, dispo=null;
                float valor = 0;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM hospedaje_admin WHERE id_habitacion = "+id_ha+";");
			while(rs.next()) {
                            id_hoa = rs.getInt(1);
                            dispo = rs.getString(2);
                            tipo = rs.getString(3);
                            valor = rs.getFloat(4);
                            id_admin = rs.getInt(5);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) { rs.close(); }
				if (stm != null) { stm.close(); }
				if (cn != null) { cn.close(); }
			} catch (Exception e2) { }}
                MCEh.getTxtTipoHabitacion_Consulta_HA().setText(tipo);
                MCEh.getTxtPrecio_Consulta_HA().setText(valor+"");
                MCEh.getTxtDisponibilidad_HA_Consulta().setText(dispo);
                MCEh.getTxtIdHabitacion_HA_Consulta().setText(id_hoa+"");
                MCEh.getLbl_IdAdm_HA_Consulta().setText(id_admin+"");
                MCEh.getLblERROR().setText("");
                MCEh.getLblEXITO().setText("Consulta exitosas");
                } else{
                    MCEh.getLblERROR().setText("No se encontro la habitación");
                }
            } else{
                MCEh.getLblERROR().setText("Error, revise los datos ingresados");
            }
        }
        if(evn.getSource().equals(MCEh.getBtnModCond())){
            NCDA ob = new NCDA();
             VDIHA ob1 = new VDIHA();
            boolean flag = false, flag_validar = false;
            flag = ob.validar_datos_hospedajeAdm_mod(MCEh.getTxtTipoHabitacion_Consulta_HA().getText(), MCEh.getTxtPrecio_Consulta_HA().getText(), MCEh.getTxtDisponibilidad_HA_Consulta().getText(), MCEh.getTxtDisponibilidad_HA_Consulta().getText());
            if (flag){
               int id_HA = (int) Integer.parseInt(MCEh.getTxtIdHabitacion_HA_Consulta().getText());
               int id_admin = (int) Integer.parseInt(MCEh.getLbl_IdAdm_HA_Consulta().getText());
               float valor = (float) Float.parseFloat(MCEh.getTxtPrecio_Consulta_HA().getText());
               flag_validar = ob1.validar_id_ha(MCEh.getTxtIdHabitacion_HA_Consulta().getText());
               if(flag_validar){
                ob.modificarDatos_hospedaje_adm(id_HA, MCEh.getTxtDisponibilidad_HA_Consulta().getText(),MCEh.getTxtTipoHabitacion_Consulta_HA().getText(), valor, id_admin);
                MCEh.getLblEXITO().setText("Registro exitoso");
                MCEh.getLblERROR().setText("");
               } else{
                    MCEh.getLblERROR().setText("Error: Revisar el registro de datos, el id habitación ingresado no existe");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEh);
                    MCEh.setVisible(true);
                    MCEh.getTxtIdHabitacion_HA_Consulta().setText("");
               }
            }else{
               MCEh.getLblERROR().setText("Error: Revisar el registro de datos");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(MCEh);
               MCEh.setVisible(true);
           }
        }
        if(evn.getSource().equals(MCEh.getBtnElimCond())){
            VDIHA ob = new VDIHA();
            NCDA ob1 = new NCDA();
            if(!MCEh.getTxtIdHabitacion_HA_Consulta().getText().equals("")){
                if(ob.validar_id_ha(MCEh.getTxtIdHabitacion_HA_Consulta().getText())){
                    int id = (int) Integer.parseInt(MCEh.getTxtIdHabitacion_HA_Consulta().getText());
                    ob1.eliminartDatos_hospedajeAdm(id);
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEh);
                    MCEh.setVisible(true);
                    MCEh.getTxtTipoHabitacion_Consulta_HA().setText("");
                    MCEh.getTxtPrecio_Consulta_HA().setText("");
                    MCEh.getTxtDisponibilidad_HA_Consulta().setText("");
                    MCEh.getTxtTipoHabitacion_Consulta_HA().setText("");
                    MCEh.getLblEXITO().setText("");
                    MCEh.getLbl_IdAdm_HA_Consulta().setText("");
                    MCEh.getTxtIdHabitacion_HA_Consulta().setText("");
                    MCEh.getLblERROR().setText("Se eliminaron los datos con exito");
                } else{
                    MCEh.getLblERROR().setText("Error: Revisar el registro de datos, el id habitacion ingresado no existe");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEh);
                    MCEh.setVisible(true);
                    MCEh.getTxtIdHabitacion_HA_Consulta().setText("");
                }
            }
        }
        if(evn.getSource().equals(MCEh.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCh);
           mCh.setVisible(true);
           CentrarVentanaInterna(mCh);
        }
        // SERVICIO ADMIN
        
        if(evn.getSource().equals(ma.getBtnServicio_Admin())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(ms);
            ms.setVisible(true);
            CentrarVentanaInterna(ms);
            ms.getBtnEspacioServicio().addActionListener(this);
            ms.getBtnSalir().addActionListener(this);
            ms.getBtnServicio().addActionListener(this);
        }
        if(evn.getSource().equals(ms.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(ma);
            ma.setVisible(true);
            CentrarVentanaInterna(ma);
        }
        if(evn.getSource().equals(ms.getBtnEspacioServicio())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(ESa);
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_EspacioServ();
            ESa.getLblIdEspacio().setText(idmayor+"");
            ESa.getLblIdAdmin().setText(id_admin_def+"");
            ESa.setVisible(true);
            CentrarVentanaInterna(ESa);
            ESa.getBtnSalir().addActionListener(this);
            ESa.getBtnGuardar_EspacioServ().addActionListener(this);
            ESa.getBtnNuevoEspacioServ().addActionListener(this);
        }
        if(evn.getSource().equals(ESa.getBtnGuardar_EspacioServ())){
            NCDA ob = new NCDA();
            boolean flag = false;
            flag = ob.validar_datos_espacio(ESa.getTxtPrecioEspacio().getText(),ESa.getTxtDireccion_espacio().getText(),ESa.getTxtPropietario_espacio().getText());
            if (flag){
                int id = (int) Integer.parseInt(ESa.getLblIdEspacio().getText());
                int id_admin = (int) Integer.parseInt(ESa.getLblIdAdmin().getText());
               float precio = (float) Float.parseFloat(ESa.getTxtPrecioEspacio().getText());
                ob.insertDatos_espacio(id ,precio ,ESa.getTxtPropietario_espacio().getText() , ESa.getTxtDireccion_espacio().getText(),id_admin);
                ESa.getTxtEXITO().setText("Registro exitoso");
                ESa.getTxtERROR().setText("");
            }else{
               ESa.getTxtERROR().setText("Error: Revisar el registro de datos");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(ESa);
               ESa.setVisible(true);
           }
        }
        if(evn.getSource().equals(ESa.getBtnNuevoEspacioServ())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(ESa);
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_EspacioServ();
            ESa.getLblIdEspacio().setText(idmayor+"");
            ESa.getLblIdAdmin().setText(id_admin_def+"");
            ESa.setVisible(true);
            CentrarVentanaInterna(ESa);
            ESa.getTxtERROR().setText("");
            ESa.getTxtEXITO().setText("");
            ESa.getTxtPrecioEspacio().setText("");
            ESa.getTxtPropietario_espacio().setText("");
            ESa.getTxtDireccion_espacio().setText("");
        }
        if(evn.getSource().equals(ESa.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(ms);
            ms.setVisible(true);
            CentrarVentanaInterna(ms);
        }
        if(evn.getSource().equals(ms.getBtnServicio())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(ma);
            ma.setVisible(true);
            CentrarVentanaInterna(ma);
        }
        if(evn.getSource().equals(ms.getBtnServicio())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(mCs);
            mCs.setVisible(true);
            CentrarVentanaInterna(mCs);
            mCs.getBtnRegistrarServ().addActionListener(this);
            mCs.getBtnSalir().addActionListener(this);
            mCs.getBtnURDServ().addActionListener(this);
        }
        
        if(evn.getSource().equals(mCs.getBtnSalir())){
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(ms);
               ms.setVisible(true);
               CentrarVentanaInterna(ms);
        }

        if(evn.getSource().equals(mCs.getBtnRegistrarServ())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(sa);
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_servadmin();
            sa.getLblIdServicio().setText(idmayor+"");
            sa.getLblIdAdmin().setText(id_admin_def+"");
            sa.setVisible(true);
            CentrarVentanaInterna(sa);
            sa.getBtnGuardar_servicio().addActionListener(this);
            sa.getBtnSalir().addActionListener(this);
            sa.getBtnNuevoServ().addActionListener(this);
        }
        if (evn.getSource().equals(sa.getBtnNuevoServ())){
            in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(sa);
           sa.setVisible(true);
           CentrarVentanaInterna(sa);
           sa.getTxtNomSer().setText("");
           sa.getTxtCuposDis().setText("");
           sa.getTxtPrecioServ().setText("");
           sa.getTxtERROR().setText("");
           sa.getTxtEXITO().setText("");
           sa.getBoxHoraSerIN().setSelectedIndex(0);
           sa.getBoxMinutosSerIN().setSelectedIndex(0);
           sa.getBoxMinutosSerFIN().setSelectedIndex(0);
           sa.getBoxHoraSerFIN().setSelectedIndex(0);
           sa.getTxtIdEspacioServ().setText("");
           NCDA ob = new NCDA();
           int idmayor = ob.id_mayor_servadmin();
           sa.getLblIdServicio().setText(idmayor+"");
        }
        
       if(evn.getSource().equals(sa.getBtnGuardar_servicio())){
            NCDA ob = new NCDA();
            VDIS ob1 = new VDIS();
            boolean flag = false, flag2 = false;
            flag = ob.validar_datos_servicio(sa.getLblIdServicio().getText(), sa.getTxtNomSer().getText(), sa.getTxtCuposDis().getText(), sa.getBoxHoraSerIN().getSelectedItem().toString(), sa.getBoxMinutosSerIN().getSelectedItem().toString(), sa.getBoxHoraSerFIN().getSelectedItem().toString(), sa.getBoxMinutosSerFIN().getSelectedItem().toString(), sa.getLblIdAdmin().getText(), sa.getTxtPrecioServ().getText(), sa.getTxtIdEspacioServ().getText());
            if (flag){
               int id = (int) Integer.parseInt(sa.getLblIdServicio().getText());
               int cuposDis = (int) Integer.parseInt(sa.getTxtCuposDis().getText());
               int HoraInicio = (int) Integer.parseInt(sa.getBoxHoraSerIN().getSelectedItem().toString());
               int MinInicio = (int) Integer.parseInt(sa.getBoxMinutosSerIN().getSelectedItem().toString());
               int HoraFin = (int) Integer.parseInt(sa.getBoxHoraSerFIN().getSelectedItem().toString());
               int MinFin = (int) Integer.parseInt(sa.getBoxMinutosSerFIN().getSelectedItem().toString());
               int id_admin = (int) Integer.parseInt(sa.getLblIdAdmin().getText());
               float precio = (float) Float.parseFloat(sa.getTxtPrecioServ().getText());
               int id_esp = (int) Integer.parseInt(sa.getTxtIdEspacioServ().getText());
               flag2 = ob1.validar_idEspacio(sa.getTxtIdEspacioServ().getText());
               if(flag2){
                ob.insertDatos_servicio_admin(id,sa.getTxtNomSer().getText(),cuposDis,HoraInicio,MinInicio,HoraFin,MinFin,id_admin, id_esp, precio);
                sa.getTxtEXITO().setText("Registro exitoso");
                sa.getTxtERROR().setText("");
               }else {
                sa.getTxtERROR().setText("Error: Revisar el id espacio");
                sa.getTxtEXITO().setText("");
                sa.getTxtIdEspacioServ().setText("");
                in.getEscritorio().removeAll();
                in.getEscritorio().repaint();
                this.in.getEscritorio().add(sa);
                
                sa.setVisible(true);
               }
            }else{
               sa.getTxtERROR().setText("Error: Revisar el registro de datos");
               sa.getTxtEXITO().setText("");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(sa);
               sa.setVisible(true);
           }
        }
        if(evn.getSource().equals(sa.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(mCs);
            mCs.setVisible(true);
            CentrarVentanaInterna(mCs);
        }
        if(evn.getSource().equals(mCs.getBtnURDServ())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(MCEs);
            MCEs.getLbl_IdAdm().setText(id_admin_def+"");
            MCEs.setVisible(true);
            CentrarVentanaInterna(MCEs);
            MCEs.getBtnSalir().addActionListener(this);
            MCEs.getBtnConsultarSer_Adm().addActionListener(this);
            MCEs.getBtnModificar_SerAdm().addActionListener(this);
            MCEs.getBtnEliminarSer_Adm().addActionListener(this);
            MCEs.getBtnCls().addActionListener(this);
        }
        if(evn.getSource().equals(MCEs.getBtnCls())){
            MCEs.getTxtCuposDisConsultar().setText("");
            MCEs.getTxtCuposUsoConsultar().setText("");
            MCEs.getTxtHoraFINSer_Consulta().setText("");
            MCEs.getTxtHoraINSer_Consulta().setText("");
            MCEs.getTxtIdSer_Consulta().setText("");
            MCEs.getTxtMinutosFINSer_Consulta().setText("");
            MCEs.getTxtMinutosINSer_Consulta().setText("");
            MCEs.getTxtNomSerConsulta().setText("");
            MCEs.getTxtPrecioServConsulta().setText("");
            MCEs.getLblERROR().setText("");
            MCEs.getLblEXITO().setText("");
            MCEs.getLbl_IdEspacio().setText("");
        }
        if(evn.getSource().equals(MCEs.getBtnConsultarSer_Adm())){
            VDIS ob = new VDIS();
            if (!MCEs.getTxtIdSer_Consulta().getText().equals("") && MCEs.getTxtNomSerConsulta().getText().equals("") && MCEs.getTxtCuposDisConsultar().getText().equals("") && MCEs.getTxtCuposUsoConsultar().getText().equals("") && MCEs.getTxtPrecioServConsulta().getText().equals("") && MCEs.getTxtHoraINSer_Consulta().getText().equals("") && MCEs.getTxtMinutosINSer_Consulta().getText().equals("")){
                if (ob.validar_id_ser(MCEs.getTxtIdSer_Consulta().getText())){
                    int id_ser = (int) Integer.parseInt(MCEs.getTxtIdSer_Consulta().getText());
                    Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = false;
                int id_s =0, cuposD=0,cuposU=0,horaI=0,minI=0,horaF=0,minF=0, id_admin_fk=0, id_esp=0;
                String nombre=null;
                float precio = 0;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM servicio_admin WHERE id_servicio_admin = "+id_ser+";");
			while(rs.next()) {
                            id_s = rs.getInt(1);
                            nombre = rs.getString(2);
                            cuposD = rs.getInt(3);
                            cuposU = rs.getInt(4);
                            horaI = rs.getInt(5);
                            minI = rs.getInt(6);
                            horaF = rs.getInt(7);
                            minF = rs.getInt(8);
                            id_admin_fk = rs.getInt(9);
                            id_esp = rs.getInt(10);
                            precio = rs.getFloat(11);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) { rs.close(); }
				if (stm != null) { stm.close(); }
				if (cn != null) { cn.close(); }
			} catch (Exception e2) { }}
                MCEs.getTxtNomSerConsulta().setText(nombre);
                MCEs.getTxtCuposDisConsultar().setText(cuposD+"");
                MCEs.getTxtCuposUsoConsultar().setText(cuposU+"");
                MCEs.getTxtPrecioServConsulta().setText(precio+"");
                MCEs.getTxtIdSer_Consulta().setText(id_s+"");
                MCEs.getLbl_IdEspacio().setText(id_esp+"");
                MCEs.getLbl_IdAdm().setText(id_admin_fk+"");
                MCEs.getTxtHoraINSer_Consulta().setText(horaI+"");
                MCEs.getTxtMinutosINSer_Consulta().setText(minI+"");
                MCEs.getTxtHoraFINSer_Consulta().setText(horaF+"");
                MCEs.getTxtMinutosFINSer_Consulta().setText(minF+"");
                MCEs.getLblEXITO().setText("Consulta exitosa");
                MCEs.getLblERROR().setText("");
                }else{
                    MCEc.getLblEXITOConsulta_Conductor().setText("");
                    MCEc.getLblERRORConsulta_conductor().setText("No se encontro el servicio");
                }
            }
        }
        if(evn.getSource().equals(MCEs.getBtnModificar_SerAdm())){
            NCDA ob = new NCDA();
             VDIS ob1 = new VDIS();
            boolean flag = false, flag_validar = false;
            flag = ob.validar_datos_servicio(MCEs.getTxtIdSer_Consulta().getText(), MCEs.getTxtNomSerConsulta().getText(), MCEs.getTxtCuposDisConsultar().getText(), MCEs.getTxtHoraINSer_Consulta().getText(), MCEs.getTxtMinutosINSer_Consulta().getText(), MCEs.getTxtHoraFINSer_Consulta().getText(), MCEs.getTxtMinutosINSer_Consulta().getText(),MCEs.getLbl_IdAdm().getText(),MCEs.getTxtPrecioServConsulta().getText(),MCEs.getLbl_IdEspacio().getText());
            if (flag){
               int id = (int) Integer.parseInt(MCEs.getTxtIdSer_Consulta().getText());
               int cuposD = (int) Integer.parseInt(MCEs.getTxtCuposDisConsultar().getText());
               int cuposU = (int) Integer.parseInt(MCEs.getTxtCuposUsoConsultar().getText());
               int horaI = (int) Integer.parseInt(MCEs.getTxtHoraINSer_Consulta().getText());
               int minI = (int) Integer.parseInt(MCEs.getTxtMinutosINSer_Consulta().getText());
               int horaF = (int) Integer.parseInt(MCEs.getTxtHoraFINSer_Consulta().getText());
               int minF = (int) Integer.parseInt(MCEs.getTxtMinutosFINSer_Consulta().getText());
               int id_admin_fk = (int) Integer.parseInt(MCEs.getLbl_IdAdm().getText());
               float precio = (float) Float.parseFloat(MCEs.getTxtPrecioServConsulta().getText());
               flag_validar = ob1.validar_id_ser(MCEs.getTxtIdSer_Consulta().getText());
               if(flag_validar){
                ob.modificarDatos_servicio_admin(id, MCEs.getTxtNomSerConsulta().getText(), cuposD, cuposU ,horaI,minI, horaF, minF,id_admin_fk,precio);
                MCEs.getLblEXITO().setText("Registro exitoso");
                MCEs.getLblERROR().setText("");
               } else{
                    MCEs.getLblERROR().setText("Error: Revisar el registro de datos, el id transporte ingresado no existe");
                    MCEs.getLblEXITO().setText("");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEs);
                    MCEs.setVisible(true);
                    MCEs.getTxtIdSer_Consulta().setText("");
               }
            }else{
               MCEs.getLblERROR().setText("Error: Revisar el registro de datos");
               MCEs.getLblEXITO().setText("");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(MCEs);
               MCEs.setVisible(true);
           }
        }
        if (evn.getSource().equals(MCEs.getBtnEliminarSer_Adm())){
            VDIS ob = new VDIS();
            NCDA ob1 = new NCDA();
            if(!MCEs.getTxtIdSer_Consulta().getText().equals("")){
                if(ob.validar_id_ser(MCEs.getTxtIdSer_Consulta().getText())){
                    int id = (int) Integer.parseInt(MCEs.getTxtIdSer_Consulta().getText());
                    ob1.eliminartDatos_servicio(id);
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEs);
                    MCEs.setVisible(true);
                    MCEs.getTxtNomSerConsulta().setText("");
                    MCEs.getTxtCuposDisConsultar().setText("");
                    MCEs.getTxtCuposUsoConsultar().setText("");
                    MCEs.getTxtPrecioServConsulta().setText("");
                    MCEs.getTxtIdSer_Consulta().setText("");
                    MCEs.getTxtHoraINSer_Consulta().setText("");
                    MCEs.getTxtMinutosINSer_Consulta().setText("");
                    MCEs.getTxtHoraFINSer_Consulta().setText("");
                    MCEs.getTxtMinutosFINSer_Consulta().setText("");
                    MCEs.getLblERROR().setText("Se eliminaron los datos con exito");
                    MCEs.getLblEXITO().setText("");
                } else{
                    MCEs.getLblERROR().setText("Error: Revisar el registro de datos, el id transporte ingresado no existe");
                    MCEs.getLblEXITO().setText("");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEs);
                    MCEs.setVisible(true);
                    MCEs.getTxtIdSer_Consulta().setText("");
                }
            }
        }
        if(evn.getSource().equals(MCEs.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(mCs);
            mCs.setVisible(true);
            CentrarVentanaInterna(mCs);
        }
        // TRANSPORTE - CONDUCTOR ADMIN
        if(evn.getSource().equals(ma.getBtnConductor_Admin())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mt);
           mt.setVisible(true);
           CentrarVentanaInterna(mt);
           mt.getBtnConductor().addActionListener(this);
           mt.getBtnTransporte().addActionListener(this);
           mt.getBtnSalir().addActionListener(this);
        }
        if(evn.getSource().equals(mt.getBtnSalir())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(ma);
            ma.setVisible(true);
            CentrarVentanaInterna(ma);
        }
        if(evn.getSource().equals(mt.getBtnConductor())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCc);
           mCc.setVisible(true);
           CentrarVentanaInterna(mCc);
           mCc.getBtnRegistrarCond().addActionListener(this);
           mCc.getBtnURDCond().addActionListener(this);
           mCc.getBtnSalir().addActionListener(this);
        }
        if(evn.getSource().equals(mCc.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mt);
           mt.setVisible(true);
           CentrarVentanaInterna(mt);
        }
        if(evn.getSource().equals(mCc.getBtnURDCond())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           MCEc.getLbl_IdAdmConsulta_Conductor().setText(id_admin_def+"");
           this.in.getEscritorio().add(MCEc);
           MCEc.setVisible(true);
           CentrarVentanaInterna(MCEc);
           MCEc.getBtnConsultarConductor().addActionListener(this);
           MCEc.getBtnEliminarCond().addActionListener(this);
           MCEc.getBtnModificarCond().addActionListener(this);
           MCEc.getBtnSalir().addActionListener(this);
           MCEc.getBtnCls().addActionListener(this);
        }
        if(evn.getSource().equals(MCEc.getBtnCls())){
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(MCEc);
               MCEc.setVisible(true);
               MCEc.getTxtCedulaConsultar_conductor().setText("");
               MCEc.getTxtIAnioConsultar_Conductor().setText("");
               MCEc.getTxtIDiaConsultar_Conductor().setText("");
               MCEc.getTxtIMesConsultar_Conductor().setText("");
               MCEc.getTxtId_Conductor_Consulta().setText("");
               MCEc.getTxtId_transCpnsulta_con().setText("");
               MCEc.getTxtNombreConsulta_conductor().setText("");
               MCEc.getTxtTelefonoConsultar_conductor().setText("");
               MCEc.getLblERRORConsulta_conductor().setText("");
               MCEc.getLblEXITOConsulta_Conductor().setText("");
        }
        if(evn.getSource().equals(MCEc.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCc);
           mCc.setVisible(true);
           CentrarVentanaInterna(mCc);
        }
        if(evn.getSource().equals(MCEc.getBtnConsultarConductor())){
            VDICO ob2 = new VDICO();
            if (!MCEc.getTxtId_Conductor_Consulta().getText().equals("") && MCEc.getTxtCedulaConsultar_conductor().getText().equals("") && MCEc.getTxtIAnioConsultar_Conductor().getText().equals("") && MCEc.getTxtIDiaConsultar_Conductor().getText().equals("") && MCEc.getTxtIMesConsultar_Conductor().getText().equals("") && MCEc.getTxtId_transCpnsulta_con().getText().equals("") && MCEc.getTxtNombreConsulta_conductor().getText().equals("") && MCEc.getTxtTelefonoConsultar_conductor().getText().equals("")){
                if (ob2.validar_id_cond(MCEc.getTxtId_Conductor_Consulta().getText())){
                    int id_cond = (int) Integer.parseInt(MCEc.getTxtId_Conductor_Consulta().getText());
                    Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = false;
                int id_con=0, tel=0, dia=0, mes=0, anio=0, id_trans=0;
                String nombre=null;
                long cc=0;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM conductor WHERE id_conductor = "+id_cond+";");
			while(rs.next()) {
                            id_con = rs.getInt(1);
                            nombre = rs.getString(2);
                            tel = rs.getInt(3);
                            dia = rs.getInt(4);
                            mes = rs.getInt(5);
                            anio = rs.getInt(6);
                            id_trans = rs.getInt(7);
                            cc = rs.getLong(8);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) { rs.close(); }
				if (stm != null) { stm.close(); }
				if (cn != null) { cn.close(); }
			} catch (Exception e2) { }}
                MCEc.getTxtId_Conductor_Consulta().setText(id_con+"");
                MCEc.getTxtNombreConsulta_conductor().setText(nombre);
                MCEc.getTxtTelefonoConsultar_conductor().setText(tel+"");
                MCEc.getTxtIDiaConsultar_Conductor().setText(dia+"");
                MCEc.getTxtIMesConsultar_Conductor().setText(mes+"");
                MCEc.getTxtIAnioConsultar_Conductor().setText(anio+"");
                MCEc.getTxtId_transCpnsulta_con().setText(id_trans+"");
                MCEc.getTxtCedulaConsultar_conductor().setText(cc+"");
                MCEc.getLbl_IdAdmConsulta_Conductor().setText(id_admin_def+"");
                MCEc.getLblEXITOConsulta_Conductor().setText("Consulta exitosa");
                MCEc.getLblERRORConsulta_conductor().setText("");
                }else{
                    MCEc.getLblEXITOConsulta_Conductor().setText("");
                    MCEc.getLblERRORConsulta_conductor().setText("No se encontro el conductor");
                }
            }
        }
        
        if(evn.getSource().equals(MCEc.getBtnModificarCond())){
            NCDA ob2 = new NCDA();
             VDICO ob3 = new VDICO();
            boolean flag = false, flag_validar = false;
            flag = ob2.validar_datos_conductor(MCEc.getTxtNombreConsulta_conductor().getText(), MCEc.getTxtCedulaConsultar_conductor().getText(), MCEc.getTxtTelefonoConsultar_conductor().getText(), MCEc.getTxtIDiaConsultar_Conductor().getText(), MCEc.getTxtIMesConsultar_Conductor().getText(), MCEc.getTxtIAnioConsultar_Conductor().getText());
            if (flag){
               int id = (int) Integer.parseInt(MCEc.getTxtId_Conductor_Consulta().getText());
               int telefono = (int) Integer.parseInt(MCEc.getTxtTelefonoConsultar_conductor().getText());
               int dia = (int) Integer.parseInt(MCEc.getTxtIDiaConsultar_Conductor().getText());
               int mes = (int) Integer.parseInt(MCEc.getTxtIMesConsultar_Conductor().getText());
               int anio = (int) Integer.parseInt(MCEc.getTxtIAnioConsultar_Conductor().getText());
               int id_transporte = (int) Integer.parseInt(MCEc.getTxtId_transCpnsulta_con().getText());
               int cc = (int) Integer.parseInt(MCEc.getTxtCedulaConsultar_conductor().getText());
               flag_validar = ob3.validar_id_trans(MCEc.getTxtId_transCpnsulta_con().getText());
               if(flag_validar){
                ob2.modificartDatos_conductor(MCEc.getTxtNombreConsulta_conductor().getText(), telefono, dia, mes ,anio,id_transporte, cc, id);
                MCEc.getLblEXITOConsulta_Conductor().setText("Registro exitoso");
                MCEc.getLblERRORConsulta_conductor().setText("");
               } else{
                    MCEc.getLblERRORConsulta_conductor().setText("Error: Revisar el registro de datos, el id transporte ingresado no existe");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEc);
                    MCEc.setVisible(true);
                    MCEc.getTxtId_transCpnsulta_con().setText("");
               }
            }else{
               MCEc.getLblERRORConsulta_conductor().setText("Error: Revisar el registro de datos");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(MCEc);
               MCEc.setVisible(true);
               MCEc.getTxtCedulaConsultar_conductor().setText("");
           }
        }
        
        if(evn.getSource().equals(MCEc.getBtnEliminarCond())){
            VDICO ob4 = new VDICO();
            NCDA obj = new NCDA();
            if(!MCEc.getTxtId_Conductor_Consulta().getText().equals("")){
                if(ob4.validar_id_cond(MCEc.getTxtId_Conductor_Consulta().getText())){
                    int id = (int) Integer.parseInt(MCEc.getTxtId_Conductor_Consulta().getText());
                    obj.eliminartDatos_conductor(id);
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEc);
                    MCEc.setVisible(true);
                    MCEc.getTxtCedulaConsultar_conductor().setText("");
                    MCEc.getTxtIAnioConsultar_Conductor().setText("");
                    MCEc.getTxtIDiaConsultar_Conductor().setText("");
                    MCEc.getTxtIMesConsultar_Conductor().setText("");
                    MCEc.getTxtId_Conductor_Consulta().setText("");
                    MCEc.getTxtId_transCpnsulta_con().setText("");
                    MCEc.getTxtNombreConsulta_conductor().setText("");
                    MCEc.getTxtTelefonoConsultar_conductor().setText("");
                    MCEc.getLblERRORConsulta_conductor().setText("");
                    MCEc.getLblEXITOConsulta_Conductor().setText("Se eliminaron los datos con exito");
                } else{
                    MCEc.getLblERRORConsulta_conductor().setText("Error: Revisar el registro de datos, el id transporte ingresado no existe");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEc);
                    MCEc.setVisible(true);
                    MCEc.getTxtId_Conductor_Consulta().setText("");
                }
            }
        }
        
        if(evn.getSource().equals(mCc.getBtnRegistrarCond())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(co);
           co.setVisible(true);
           CentrarVentanaInterna(co);
           NCDA ob = new NCDA();
           int idmayor = ob.id_mayor_cond();
           co.getLbl_IdConductor().setText(idmayor+"");
           co.getLbl_IdAdm().setText(id_admin_def+"");
           co.getBtnGuardarConductor().addActionListener(this);
           co.getBtnNuevoCond().addActionListener(this);
           co.getBtnSalir().addActionListener(this);
        }
        if(evn.getSource().equals(co.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCc);
           mCc.setVisible(true);
           CentrarVentanaInterna(mCc);
        }
        if(evn.getSource().equals(mt.getBtnTransporte())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCt);
           mCt.setVisible(true);
           CentrarVentanaInterna(mCt);
           mCt.getBtnRegistrarTrans().addActionListener(this);
           mCt.getBtnURDTrans().addActionListener(this);
           mCt.getBtnSalir().addActionListener(this);
        }
        if (evn.getSource().equals(mCt.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mt);
           mt.setVisible(true);
           CentrarVentanaInterna(mt);
        }
        if (evn.getSource().equals(mCt.getBtnRegistrarTrans())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(tra);
           NCDA ob = new NCDA();
           int idmayor = ob.id_mayor_trans();
           tra.getLbl_IdTransAdm().setText(idmayor+"");
           tra.getLbl_IdAdm().setText(id_admin_def+"");
           tra.setVisible(true);
           CentrarVentanaInterna(tra);
           tra.getBtnGuardarTrans().addActionListener(this);
           tra.getBtnNuevoTrans().addActionListener(this);
           tra.getBtnSalir().addActionListener(this);
           
        }
        if (evn.getSource().equals(tra.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCt);
           mCt.setVisible(true);
           CentrarVentanaInterna(mCt);
        }
        if (evn.getSource().equals(mCt.getBtnURDTrans())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(MCEt);
           MCEt.getLbl_IdAdm_transConsulta().setText(id_admin_def+"");
           MCEt.setVisible(true);
           CentrarVentanaInterna(MCEt);
           MCEt.getBtnSalir().addActionListener(this);
           MCEt.getBtnConsultar_Transporte().addActionListener(this);
           MCEt.getBtnEliminar_Transporte().addActionListener(this);
           MCEt.getBtnModificar_Transporte().addActionListener(this);
           MCEt.getBtnCls().addActionListener(this);
        }
        if (evn.getSource().equals(MCEt.getBtnCls())){
           MCEt.getTxtAnioConsulta_trans_adm().setText("");
           MCEt.getTxtCapacidad_trans_adm().setText("");
           MCEt.getTxtDestinoConsulta_trans_adm().setText("");
           MCEt.getTxtDiaConsulta_trans_adm().setText("");
           MCEt.getTxtHoraConsulta_trans_adm().setText("");
           MCEt.getTxtId_trans_adm_Consulta().setText("");
           MCEt.getTxtMesConsulta_trans_adm().setText("");
           MCEt.getTxtMinutosConsulta_trans_adm().setText("");
           MCEt.getTxtOrigenConsulta_trans_adm().setText("");
           MCEt.getTxtPlacaConsultar_trans_adm().setText("");
           MCEt.getTxtValorConsultar_trans_adm().setText("");
           MCEt.getTxt_CuposUsados_transAdm().setText("");
           MCEt.getLblERROR().setText("");
           MCEt.getLblERROR_transAdm_Consulta().setText("");
           MCEt.getLblEXITO().setText("");
           MCEt.getLblEXITO_transAdm_Consulta().setText("");
        }
        if(evn.getSource().equals(MCEt.getBtnEliminar_Transporte())){
           VDITR obj = new VDITR();
            NCDA ob9 = new NCDA();
            if(!MCEt.getTxtId_trans_adm_Consulta().getText().equals("")){
                if(obj.validar_id_transAdm(MCEt.getTxtId_trans_adm_Consulta().getText())){
                    int id = (int) Integer.parseInt(MCEt.getTxtId_trans_adm_Consulta().getText());
                    ob9.eliminartDatos_transporte(id);
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEt);
                    MCEt.setVisible(true);
                    MCEt.getTxtCapacidad_trans_adm().setText("");
                    MCEt.getTxtAnioConsulta_trans_adm().setText("");
                    MCEt.getTxtDestinoConsulta_trans_adm().setText("");
                    MCEt.getTxtDiaConsulta_trans_adm().setText("");
                    MCEt.getTxtHoraConsulta_trans_adm().setText("");
                    MCEt.getTxtId_trans_adm_Consulta().setText("");
                    MCEt.getTxtMesConsulta_trans_adm().setText("");
                    MCEt.getTxtMinutosConsulta_trans_adm().setText("");
                    MCEt.getTxtOrigenConsulta_trans_adm().setText("");
                    MCEt.getTxtPlacaConsultar_trans_adm().setText("");
                    MCEt.getTxtValorConsultar_trans_adm().setText("");
                    MCEt.getLblERROR_transAdm_Consulta().setText("");
                    MCEt.getLblEXITO_transAdm_Consulta().setText("Los datos se eliminaron con exito");
                } else{
                    MCEt.getLblERROR_transAdm_Consulta().setText("Error: Revisar el registro de datos, el id transporte ingresado no existe");
                    MCEt.getLblEXITO_transAdm_Consulta().setText("");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEt);
                    MCEt.setVisible(true);
                    MCEt.getTxtId_trans_adm_Consulta().setText("");
                }
            }
        }
        if(evn.getSource().equals(MCEt.getBtnCls())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(MCEt);
           MCEt.setVisible(true);
           CentrarVentanaInterna(MCEt);
           MCEt.getTxtCapacidad_trans_adm().setText("");
           MCEt.getTxtAnioConsulta_trans_adm().setText("");
           MCEt.getTxtDestinoConsulta_trans_adm().setText("");
           MCEt.getTxtDiaConsulta_trans_adm().setText("");
           MCEt.getTxtHoraConsulta_trans_adm().setText("");
           MCEt.getTxtId_trans_adm_Consulta().setText("");
           MCEt.getTxtMesConsulta_trans_adm().setText("");
           MCEt.getTxtMinutosConsulta_trans_adm().setText("");
           MCEt.getTxtOrigenConsulta_trans_adm().setText("");
           MCEt.getTxtPlacaConsultar_trans_adm().setText("");
           MCEt.getTxtValorConsultar_trans_adm().setText("");
           MCEt.getLblERROR_transAdm_Consulta().setText("");
           MCEt.getLblEXITO_transAdm_Consulta().setText("");
        }
        if(evn.getSource().equals(MCEt.getBtnConsultar_Transporte())){
            VDITR ob4 = new VDITR();
            if (!MCEt.getTxtId_trans_adm_Consulta().getText().equals("") && MCEt.getTxtDestinoConsulta_trans_adm().getText().equals("") && MCEt.getTxtOrigenConsulta_trans_adm().getText().equals("") && MCEt.getTxtDiaConsulta_trans_adm().getText().equals("") && MCEt.getTxtMesConsulta_trans_adm().getText().equals("") && MCEt.getTxtAnioConsulta_trans_adm().getText().equals("") && MCEt.getTxtHoraConsulta_trans_adm().getText().equals("") && MCEt.getTxtMinutosConsulta_trans_adm().getText().equals("") && MCEt.getTxtValorConsultar_trans_adm().getText().equals("") && MCEt.getTxtCapacidad_trans_adm().getText().equals("")){
                if (ob4.validar_id_transAdm(MCEt.getTxtId_trans_adm_Consulta().getText())){
                    int id_trans = (int) Integer.parseInt(MCEt.getTxtId_trans_adm_Consulta().getText());
                    Conexion obc = new Conexion ();
                    Connection cn = null;
                    Statement stm = null;
                    ResultSet rs = null;
                    boolean flag = false;
                    int id_transp=0, dia=0, anio=0, id_admin_trans_fk=0, hora=0, minutos=0, capacidad=0, cuposU=0;
                    String origen=null, destino =null, placa =null, mes=null;
                    float valor=0;
                    try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM transporte_admin WHERE idTransporte_admin = "+id_trans+";");
			while(rs.next()) {
                            id_transp = rs.getInt(1);
                            origen = rs.getString(2);
                            destino = rs.getString(3);
                            dia = rs.getInt(4);
                            mes = rs.getString(5);
                            anio = rs.getInt(6);
                            hora = rs.getInt(7);
                            minutos = rs.getInt(8);
                            placa = rs.getString(9);
                            valor = rs.getFloat(10);
                            capacidad = rs.getInt(11);
                            cuposU = rs.getInt(12);
                            id_admin_trans_fk = rs.getInt(13);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) { rs.close(); }
				if (stm != null) { stm.close(); }
				if (cn != null) { cn.close(); }
			} catch (Exception e2) { }}
                MCEt.getTxtOrigenConsulta_trans_adm().setText(origen);
                MCEt.getTxtDestinoConsulta_trans_adm().setText(destino);
                MCEt.getTxtDiaConsulta_trans_adm().setText(dia+"");
                MCEt.getTxtMesConsulta_trans_adm().setText(mes);
                MCEt.getTxtAnioConsulta_trans_adm().setText(anio+"");
                MCEt.getTxtHoraConsulta_trans_adm().setText(hora+"");
                MCEt.getTxtMinutosConsulta_trans_adm().setText(minutos+"");
                MCEt.getTxtPlacaConsultar_trans_adm().setText(placa);
                MCEt.getTxtValorConsultar_trans_adm().setText(valor+"");
                MCEt.getTxtCapacidad_trans_adm().setText(capacidad+"");
                MCEt.getTxtId_trans_adm_Consulta().setText(id_transp+"");
                MCEt.getTxt_CuposUsados_transAdm().setText(cuposU+"");
                MCEt.getLbl_IdAdm_transConsulta().setText(id_admin_trans_fk+"");
                MCEt.getLblEXITO_transAdm_Consulta().setText("Consulta exitosa");
                MCEt.getLblERROR_transAdm_Consulta().setText("");
                }else{
                    MCEt.getLblEXITO_transAdm_Consulta().setText("");
                    MCEt.getLblERROR_transAdm_Consulta().setText("No se encontro el transporte");
                }
            }
        }
        
        if (evn.getSource().equals(MCEt.getBtnSalir())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(mCt);
           mCt.setVisible(true);
           CentrarVentanaInterna(mCt);
        }
        
        if(evn.getSource().equals(MCEt.getBtnModificar_Transporte())){
             NCDA obj = new NCDA();
             VDITR ob4 = new VDITR();
            boolean flag = false, flag_validar = false;
            //String Idtrans_adm, String origen_tradm, String destino_tradm, String dia_tradm, String mes_tradm, String anio_tradm, String hora_tradm, String minutos_tradm, String placa_tradm, String valor_tradm, String CapacidadPasa_tradm, String Id_adm
            flag = obj.validar_datos_transporteAdm_mod( MCEt.getTxtId_trans_adm_Consulta().getText(), MCEt.getTxtOrigenConsulta_trans_adm().getText(),MCEt.getTxtDestinoConsulta_trans_adm().getText(),MCEt.getTxtDiaConsulta_trans_adm().getText(),MCEt.getTxtMesConsulta_trans_adm().getText(),MCEt.getTxtAnioConsulta_trans_adm().getText(),MCEt.getTxtHoraConsulta_trans_adm().getText(), MCEt.getTxtMinutosConsulta_trans_adm().getText(), MCEt.getTxtPlacaConsultar_trans_adm().getText(), MCEt.getTxtValorConsultar_trans_adm().getText(), MCEt.getTxtCapacidad_trans_adm().getText(), MCEt.getTxt_CuposUsados_transAdm().getText(), MCEt.getLbl_IdAdm_transConsulta().getText());
            if (flag){
               int id = (int) Integer.parseInt(MCEt.getTxtId_trans_adm_Consulta().getText());
               int dia = (int) Integer.parseInt(MCEt.getTxtDiaConsulta_trans_adm().getText());
               int anio = (int) Integer.parseInt(MCEt.getTxtAnioConsulta_trans_adm().getText());
               int hora = (int) Integer.parseInt(MCEt.getTxtHoraConsulta_trans_adm().getText());
               int minutos = (int) Integer.parseInt(MCEt.getTxtMinutosConsulta_trans_adm().getText());
               int capacidad = (int) Integer.parseInt(MCEt.getTxtCapacidad_trans_adm().getText());
               float valor = (float) Float.parseFloat(MCEt.getTxtValorConsultar_trans_adm().getText());
               int cuposU = (int) Integer.parseInt(MCEt.getTxt_CuposUsados_transAdm().getText());
               int admin = (int) Integer.parseInt(MCEt.getLbl_IdAdm_transConsulta().getText());
               flag_validar = ob4.validar_id_transAdm(MCEt.getTxtId_trans_adm_Consulta().getText());
               if(flag_validar){
                obj.modificartDatos_transporteAdm (id,MCEt.getTxtOrigenConsulta_trans_adm().getText(), MCEt.getTxtDestinoConsulta_trans_adm().getText(), dia,MCEt.getTxtMesConsulta_trans_adm().getText(), anio, hora, minutos, MCEt.getTxtPlacaConsultar_trans_adm().getText(), valor , capacidad , cuposU, admin);     
                MCEt.getLblEXITO_transAdm_Consulta().setText("Registro exitoso");
                MCEt.getLblERROR_transAdm_Consulta().setText("");
               } else{
                    MCEt.getLblERROR_transAdm_Consulta().setText("Error: Revisar el registro de datos, el id transporte ingresado no existe");
                     MCEt.getLblEXITO_transAdm_Consulta().setText("");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(MCEt);
                    MCEt.setVisible(true);
                    MCEt.getTxtId_trans_adm_Consulta().setText("");
               }
            }else{
               MCEt.getLblERROR_transAdm_Consulta().setText("Error: Revisar el registro de datos");
                MCEt.getLblEXITO_transAdm_Consulta().setText("");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(MCEt);
               MCEt.setVisible(true);
           }
        }

        if(evn.getSource().equals(co.getBtnNuevoCond())){
           in.getEscritorio().removeAll();
           in.getEscritorio().repaint();
           this.in.getEscritorio().add(co);
           co.setVisible(true);
           CentrarVentanaInterna(co);
           co.getTxtNombre_conductor().setText("");
           co.getTxtCedula_conductor().setText("");
           co.getTxtId_trans_con().setText("");
           co.getTxtTelefono_conductor().setText("");
           NCDA ob = new NCDA();
           int idmayor = ob.id_mayor_cond();
           co.getLbl_IdConductor().setText(idmayor+"");
           co.getTxtERROR().setText("");
           co.getTxtEXITO().setText("");
           co.getBoxAnio_conductor().setSelectedIndex(0);
           co.getBoxDia_conductor().setSelectedIndex(0);
           co.getBoxMes_conductor().setSelectedIndex(0);
        }
       
        if(evn.getSource().equals(co.getBtnGuardarConductor())){
             NCDA ob5 = new NCDA();
             VDICO ob9 = new VDICO();
            boolean flag = false, flag_validar = false;
            flag = ob5.validar_datos_conductor(co.getTxtNombre_conductor().getText(), co.getTxtCedula_conductor().getText(), co.getTxtTelefono_conductor().getText(), co.getBoxDia_conductor().getSelectedItem().toString(), co.getBoxMes_conductor().getSelectedItem().toString(), co.getBoxAnio_conductor().getSelectedItem().toString());
            if (flag){
               int id = (int) Integer.parseInt(co.getLbl_IdConductor().getText());
               String telefono = co.getTxtTelefono_conductor().getText();
               int dia = (int) Integer.parseInt(co.getBoxDia_conductor().getSelectedItem().toString());
               int mes = (int) Integer.parseInt(co.getBoxMes_conductor().getSelectedItem().toString());
               int anio = (int) Integer.parseInt(co.getBoxAnio_conductor().getSelectedItem().toString());
               int id_transporte = (int) Integer.parseInt(co.getTxtId_trans_con().getText());
               long cc = (long) Integer.parseInt(co.getTxtCedula_conductor().getText());
               flag_validar = ob9.validar_id_trans(co.getTxtId_trans_con().getText());
               if(flag_validar){
                ob5.insertDatos_conductor(id, co.getTxtNombre_conductor().getText(), telefono, dia, mes ,anio,id_transporte, cc);
                co.getTxtEXITO().setText("Registro exitoso");
                co.getTxtERROR().setText("");
               } else{
                    co.getTxtERROR().setText("Error: Revisar el registro de datos, el id transporte ingresado no existe");
                    co.getTxtEXITO().setText("");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(co);
                    co.setVisible(true);
                    co.getTxtId_trans_con().setText("");
               }
            }else{
               co.getTxtERROR().setText("Error: Revisar el registro de datos");
               co.getTxtEXITO().setText("");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(co);
               co.setVisible(true);
               co.getTxtCedula_conductor().setText("");
           }
        }
        
        if (evn.getSource().equals(tra.getBtnGuardarTrans())){
            NCDA obj = new NCDA();
            boolean flag = false, flag_validar = false, flag_placa = true, flag_3 = false;
            flag = obj.validar_datos_transporteAdm(tra.getLbl_IdTransAdm().getText(),tra.getTxtOrigen_trans_adm().getText(), tra.getTxtDestino_trans_adm().getText(), tra.getBoxDia_trans().getSelectedItem().toString(), tra.getBoxMes_trans().getSelectedItem().toString(), tra.getBoxAnio_trans().getSelectedItem().toString(), tra.getBoxHora_trans().getSelectedItem().toString(), tra.getBoxMin_trans().getSelectedItem().toString(), tra.getTxtPlaca_trans_adm().getText(), tra.getTxtValor_trans_adm().getText(), tra.getTxtCapacidad_trans_adm().getText(), tra.getLbl_IdAdm().getText());
            if (flag){
               int id = (int) Integer.parseInt(tra.getLbl_IdTransAdm().getText());
               int dia = (int) Integer.parseInt(tra.getBoxDia_trans().getSelectedItem().toString());
               int anio = (int) Integer.parseInt(tra.getBoxAnio_trans().getSelectedItem().toString());
               int hora = (int) Integer.parseInt(tra.getBoxHora_trans().getSelectedItem().toString());
               int minutos = (int) Integer.parseInt(tra.getBoxMin_trans().getSelectedItem().toString());
               float valor = (float) Float.parseFloat(tra.getTxtValor_trans_adm().getText());
               int capacidad = (int) Integer.parseInt(tra.getTxtCapacidad_trans_adm().getText());
               int id_adm = (int) Integer.parseInt(tra.getLbl_IdAdm().getText());
               VDITR ob2 = new VDITR();
               flag_validar = !ob2.validar_id_transAdm(tra.getLbl_IdAdm().getText());
               flag_placa = ob2.validar_placa(tra.getTxtPlaca_trans_adm().getText());
               if (flag_validar && flag_placa){
                        obj.insertDatos_trans_adm(id, tra.getTxtOrigen_trans_adm().getText(), tra.getTxtDestino_trans_adm().getText(), dia, tra.getBoxMes_trans().getSelectedItem().toString(), anio, hora, minutos, tra.getTxtPlaca_trans_adm().getText(), valor, capacidad, id_adm);
                        tra.getLblEXITO().setText("Registro exitoso");
                        tra.getLblERROR().setText("");
               } else {
                    tra.getLblEXITO().setText("");
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(tra);
                    tra.setVisible(true);
               }
            }else{
               tra.getLblERROR().setText("Error de registro, revise los datos ingresados");
               tra.getLblEXITO().setText("");
               in.getEscritorio().removeAll();
               in.getEscritorio().repaint();
               this.in.getEscritorio().add(tra);
               tra.setVisible(true);
               tra.getTxtPlaca_trans_adm().setText("");
            }
        }
        
        if (evn.getSource().equals(tra.getBtnNuevoTrans())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(tra);
            tra.setVisible(true);
            CentrarVentanaInterna(tra);
            tra.getTxtCapacidad_trans_adm().setText("");
            tra.getTxtDestino_trans_adm().setText("");
            tra.getTxtOrigen_trans_adm().setText("");
            tra.getTxtPlaca_trans_adm().setText("");
            tra.getTxtValor_trans_adm().setText("");
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_trans();
            tra.getLbl_IdTransAdm().setText(idmayor+"");
            tra.getLbl_IdAdm().setText(id_admin_def+"");
            tra.getBoxAnio_trans().setSelectedIndex(0);
            tra.getBoxDia_trans().setSelectedIndex(0);
            tra.getBoxHora_trans().setSelectedIndex(0);
            tra.getBoxMes_trans().setSelectedIndex(0);
            tra.getBoxMin_trans().setSelectedIndex(0);
            tra.getLblERROR().setText("");
            tra.getLblEXITO().setText("");
        }
        
        if(evn.getSource().equals(mc.getBtnTrans_cliente())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(tc);
            tc.getTxtOrigen_transCliente().removeAllItems();
            tc.getTxtDestino_transCliente().removeAllItems();
            tc.getTxtOrigen_transCliente().addItem(" ");
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT DISTINCT Origen_trAdmin FROM transporte_admin;");
			while(rs.next()) {
                                String origen = rs.getString(1);
                                tc.getTxtOrigen_transCliente().addItem(origen);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_transCliente();
            tc.getLblIdTransporte().setText(idmayor+"");
            tc.setVisible(true);
            CentrarVentanaInterna(tc);
            tc.getTxtOrigen_transCliente().addActionListener(this);
            tc.getBtnGuardar_TransCliente().addActionListener(this);
        }
        
        if(evn.getSource().equals(tc.getTxtOrigen_transCliente())){
            tc.getTxtDestino_transCliente().removeAllItems();
            tc.getTxtDestino_transCliente().addItem(" ");
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
            try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT Destino_trAdmin FROM transporte_admin WHERE Origen_trAdmin = '"+tc.getTxtOrigen_transCliente().getSelectedItem().toString() +"';");
                        while(rs.next()) {
                                String destino = rs.getString(1);
                                tc.getTxtDestino_transCliente().addItem(destino);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
            tc.getTxtDestino_transCliente().addActionListener(this);
        }
        
        if(evn.getSource().equals(tc.getTxtDestino_transCliente())){
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id=0, dia = 0, anio=0,hora=0,min=0;
                String mes=null, placa=null;
                float valor=0;
            try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT idTransporte_admin, Dia_trAdmin, Mes_trAdmin, Anio_trAdmin, Hora_trAdmin, Minutos_trAdmin, Placa_trAdmin, Valor_trAdmin FROM transporte_admin WHERE Origen_trAdmin = '"+tc.getTxtOrigen_transCliente().getSelectedItem().toString() +"' AND Destino_trAdmin = '"+ tc.getTxtDestino_transCliente().getSelectedItem().toString()+"';");
			while(rs.next()) {
                                id = rs.getInt(1);
                                dia = rs.getInt(2);
                                mes = rs.getString(3);
                                anio = rs.getInt(4);
                                hora = rs.getInt(5);
                                min = rs.getInt(6);
                                placa = rs.getString(7);
                                valor = rs.getFloat(8);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
            tc.getLblIdTransporte_Adm().setText(id +"");
            tc.getLblDia().setText(dia + "");
            tc.getLblMes().setText(mes);
            tc.getLblAnio().setText(anio+"");
            tc.getLblHora().setText(hora + "");
            tc.getLblMinutos().setText(min +"");
            tc.getLblPlaca().setText(placa);
            tc.getLblPrecio_transCliente().setText(valor +"");
        }
        
        if(evn.getSource().equals(tc.getBtnGuardar_TransCliente())){
            NCDA ob = new NCDA();
            if(!tc.getTxtDestino_transCliente().getSelectedItem().toString().equals("") && !tc.getTxtOrigen_transCliente().getSelectedItem().toString().equals("")){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = (int) Integer.parseInt(tc.getLblIdTransporte_Adm().getText());
                int cantidadU = 0, capacidadT = 0;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT Cantidad_pasajeros_Uso, CapacidadPasajeron_trAdmin FROM transporte_admin WHERE idTransporte_admin = "+id+";");
			while(rs.next()) {
                                cantidadU = rs.getInt(1);
                                capacidadT = rs.getInt(2);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
                if(cantidadU < capacidadT){
                    //int id_trans, String destino, int hora, int min, int dia, int mes, int anio, String origen, float valor, String placa, int id_trAdm
                    int id_trans = (int) Integer.parseInt(tc.getLblIdTransporte().getText());
                    int hora = (int) Integer.parseInt(tc.getLblHora().getText());
                    int min = (int) Integer.parseInt(tc.getLblMinutos().getText());
                    int dia = (int) Integer.parseInt(tc.getLblDia().getText());
                    int anio = (int) Integer.parseInt(tc.getLblAnio().getText());
                    float valor = (float) Float.parseFloat(tc.getLblPrecio_transCliente().getText());
                    int id_trAdm = (int) Integer.parseInt(tc.getLblIdTransporte_Adm().getText());
                    String destino = tc.getTxtDestino_transCliente().getSelectedItem().toString();
                    String origen = tc.getTxtOrigen_transCliente().getSelectedItem().toString();
                    ob.insertDatos_trans(id_trans, destino, hora, min, dia, tc.getLblMes().getText(), anio, origen,valor, tc.getLblPlaca().getText(), id_trAdm);
                    cantidadU = cantidadU + 1;
                    ob.actualizarUso_trAdm(id_trAdm, cantidadU);
                    valor_total_def = valor_total_def + valor;
                    tc.getLblERROR().setText("");
                    tc.getLblEXITO().setText("Registro exitoso");
                    mc.getBtnTrans_cliente().setEnabled(false);
                    mc.getBtnServicio_cliente().setEnabled(true);
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(mc);
                    mc.setVisible(true);
                    CentrarVentanaInterna(mc);
                    id_pago_def = ob.id_mayor_pago();
                    ob.Ingresar_pago_id(id_pago_def);
                    java.util.Date fechaAct = new java.util.Date();
                    Calendar calendario = Calendar.getInstance();
                    calendario.setTime(fechaAct);
                    int anio_reserva = calendario.get(Calendar.YEAR);
                    int mes_reserva = calendario.get(Calendar.MONTH)+1;
                    int dia_reserva = calendario.get(Calendar.DAY_OF_MONTH);
                    int hora_reserva = calendario.get(Calendar.HOUR_OF_DAY);
                    int min_reserva = calendario.get(Calendar.MINUTE);
                    ob.Ingresar_Reserva_id(id_reserva_def, hora_reserva, min_reserva, dia_reserva, mes_reserva, anio_reserva, id_cliente_def,id_trans,id_pago_def);
                } else{
                    in.getEscritorio().removeAll();
                    in.getEscritorio().repaint();
                    this.in.getEscritorio().add(tc);
                    tc.setVisible(true);
                    CentrarVentanaInterna(tc);
                    tc.getLblERROR().setText("El transporte no tiene cupos disponibles");
                }
            } else{
                in.getEscritorio().removeAll();
                in.getEscritorio().repaint();
                this.in.getEscritorio().add(tc);
                tc.setVisible(true);
                CentrarVentanaInterna(tc);
                tc.getLblERROR().setText("Error, revise los datos ingresados");
            }
            
        }
        if(evn.getSource().equals(mc.getBtnServicio_cliente())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(sc);
            sc.getBoxNombreSer().removeAllItems();
            sc.getBoxNombreSer().addItem(" ");
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT DISTINCT Nombre_servicio_admin FROM servicio_admin;");
			while(rs.next()) {
                                String nombre = rs.getString(1);
                                sc.getBoxNombreSer().addItem(nombre);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_servCliente();
            sc.getLblIdServicio().setText(idmayor+"");
            sc.getLblIdCliente().setText(id_cliente_def+"");
            sc.setVisible(true);
            CentrarVentanaInterna(sc);
            sc.getBoxNombreSer().addActionListener(this);
            sc.getBtnGuardarServicio().addActionListener(this);
            sc.getBtnConsultar().addActionListener(this);
        }
        
        if(evn.getSource().equals(sc.getBoxNombreSer())){
           sc.getBoxHoraSerIN().removeAllItems();
           sc.getBoxMinutosSerIN().removeAllItems();
           sc.getBoxHoraSerFIN().removeAllItems();
           sc.getBoxMinutosSerFIN().removeAllItems();
           sc.getBoxHoraSerIN().addItem(" ");
           sc.getBoxMinutosSerIN().addItem(" ");
           sc.getBoxHoraSerFIN().addItem(" ");
           sc.getBoxMinutosSerFIN().addItem(" ");
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT DISTINCT Hora_Inicio_Servicio_Admin, Minutos_inicio_servicio_admin, Hora_fin_servicio_admin, Minutos_fin_servicio_admin FROM servicio_admin WHERE Nombre_servicio_admin = '"+sc.getBoxNombreSer().getSelectedItem().toString()+"';");
			while(rs.next()) {
                                int horaI = rs.getInt(1);
                                int minI = rs.getInt(2);
                                int horaF = rs.getInt(3);
                                int minF = rs.getInt(4);
                                sc.getBoxHoraSerIN().addItem(horaI+"");
                                sc.getBoxMinutosSerIN().addItem(minI+"");
                                sc.getBoxHoraSerFIN().addItem(horaF+"");
                                sc.getBoxMinutosSerFIN().addItem(minF+"");
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}} 
        }
        
        if(evn.getSource().equals(sc.getBtnConsultar())){
            if(!sc.getBoxHoraSerIN().getSelectedItem().toString().equals(" ") && !sc.getBoxMinutosSerIN().getSelectedItem().toString().equals(" ") && !sc.getBoxHoraSerFIN().getSelectedItem().toString().equals(" ") && !sc.getBoxMinutosSerFIN().getSelectedItem().toString().equals(" ")){
                Conexion obc = new Conexion ();
                    Connection cn = null;
                    Statement stm = null;
                    ResultSet rs = null;
                    int id_SA=0;
                    float valor=0;
                    try {
                            cn = obc.conectar();
                            stm = cn.createStatement();
                            rs = stm.executeQuery("SELECT id_servicio_admin , Precio_servicio_admin FROM servicio_admin WHERE Nombre_servicio_admin = '"+sc.getBoxNombreSer().getSelectedItem().toString()+"' AND  Hora_inicio_Servicio_admin = "+sc.getBoxHoraSerIN().getSelectedItem().toString()+" AND Hora_fin_servicio_admin = "+sc.getBoxHoraSerFIN().getSelectedItem().toString()+";");
                            while(rs.next()) {
                                    id_SA = rs.getInt(1);
                                    valor = rs.getFloat(2);
                            }
                    } catch (SQLException e) {
                    }finally {
                            try {
                                    if (rs != null) {
                                            rs.close();
                                    }
                                    if (stm != null) {
                                            stm.close();
                                    }
                                    if (cn != null) {
                                            cn.close();
                                    }
                            } catch (Exception e2) {

                    }}
                    sc.getLblIdServicio_Adm().setText(id_SA+"");
                    sc.getLblPrecioServicio().setText(valor+"");
            } else {
                sc.getTxtERROR().setText("Error, revise los datos registrados");
                sc.getTxtEXITO().setText("");
            }
        }
        
        if(evn.getSource().equals(sc.getBtnGuardarServicio())){
            NCDA ob = new NCDA();
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id_SA_C = (int) Integer.parseInt(sc.getLblIdServicio_Adm().getText());
                int cantidadU = 0, capacidadT = 0;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT Cupos_EnUso_Servicio_admin, Cupos_disponibles_Servicio_admin FROM servicio_admin WHERE id_servicio_admin = "+id_SA_C+";");
			while(rs.next()) {
                                cantidadU = rs.getInt(1);
                                capacidadT = rs.getInt(2);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
            if(cantidadU < capacidadT){
                if(!sc.getBoxHoraSerIN().getSelectedItem().toString().equals(" ") && !sc.getBoxMinutosSerIN().getSelectedItem().toString().equals(" ") && !sc.getBoxHoraSerFIN().getSelectedItem().toString().equals(" ") && !sc.getBoxMinutosSerFIN().getSelectedItem().toString().equals(" ") && !sc.getBoxNombreSer().getSelectedItem().toString().equals(" ")){
                int id = (int) Integer.parseInt(sc.getLblIdServicio().getText());
                float precio = (float) Float.parseFloat(sc.getLblPrecioServicio().getText());
                int horaI = (int) Integer.parseInt(sc.getBoxHoraSerIN().getSelectedItem().toString());
                int minI = (int) Integer.parseInt(sc.getBoxMinutosSerIN().getSelectedItem().toString());
                int horaF = (int) Integer.parseInt(sc.getBoxHoraSerFIN().getSelectedItem().toString());
                int minF = (int) Integer.parseInt(sc.getBoxMinutosSerFIN().getSelectedItem().toString());
                int id_SA = (int) Integer.parseInt(sc.getLblIdServicio_Adm().getText());
                ob.insertDatos_servicio_cliente(id, sc.getBoxNombreSer().getSelectedItem().toString(), precio, horaI, minI, horaF, minF, id_SA, id_reserva_def);
                cantidadU = cantidadU + 1;
                ob.actualizarUso_SerAdm(id_SA, cantidadU);
                valor_total_def = valor_total_def + precio;
                sc.getTxtERROR().setText("");
                sc.getTxtEXITO().setText("Registro exitoso");
                mc.getBtnHospedaje_cliente().setEnabled(true);
                mc.getBtnServicio_cliente().setEnabled(false);
                in.getEscritorio().removeAll();
                in.getEscritorio().repaint();
                this.in.getEscritorio().add(mc);
                mc.setVisible(true);
                CentrarVentanaInterna(mc);
                } else {
                    sc.getTxtERROR().setText("Error, revise los datos registrados");
                    sc.getTxtEXITO().setText("");
                }
            }else{
                sc.getTxtERROR().setText("Error, cupos del servicio no disponibles");
                sc.getTxtEXITO().setText("");
            }
            
        }
        
        if(evn.getSource().equals(mc.getBtnHospedaje_cliente())){
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(hc);
            NCDA ob = new NCDA();
            int idmayor = ob.id_mayor_hospCliente();
            hc.getLblIdHosp().setText(idmayor+"");
            hc.getLblIdReserva().setText(id_reserva_def+"");
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id_SA_C = (int) Integer.parseInt(sc.getLblIdServicio_Adm().getText());
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT tipo_habitacion FROM hospedaje_admin WHERE disponibilidad_habitacion = 'SI';");
			while(rs.next()) {
                                String tipo = rs.getString(1);
                                hc.getBoxTipoHab().addItem(tipo);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
            hc.setVisible(true);
            CentrarVentanaInterna(hc);
            hc.getBtnGuardarHos().addActionListener(this);
            hc.getBtnConsultar().addActionListener(this);
        }
        
        if(evn.getSource().equals(hc.getBtnConsultar())){
            if(!hc.getBoxDiaIng().getSelectedItem().toString().equals("Dia") && !hc.getBoxMesIng().getSelectedItem().toString().equals("Mes") && !hc.getBoxAnioIng().getSelectedItem().toString().equals("Año") && !hc.getBoxDiaSal().getSelectedItem().toString().equals("Dia") && !hc.getBoxMesSal().getSelectedItem().toString().equals("Mes") && !hc.getBoxAnioSal().getSelectedItem().toString().equals("Año") && !hc.getBoxHoraIng().getSelectedItem().toString().equals("Hora") && !hc.getBoxMinIng().getSelectedItem().toString().equals("Minutos") && !hc.getBoxHoraSal().getSelectedItem().toString().equals("Hora") && !hc.getBoxMinSal().getSelectedItem().toString().equals("Minutos")){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id_habitacion = 0;
                float valor=0;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT valor_habitacion, id_habitacion  FROM hospedaje_admin WHERE tipo_habitacion = '"+hc.getBoxTipoHab().getSelectedItem().toString()+"';");
			while(rs.next()) {
                                valor = rs.getFloat(1);
                                id_habitacion = rs.getInt(2);
			}
		} catch (SQLException e) {
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				
		}}
                hc.getLblIdHabitacion().setText(id_habitacion+"");
                hc.getLblPrecio().setText(valor+"");
                valor_total_def = valor_total_def + valor;
                hc.getLblEXITO().setText("Consulta exitosa");
                hc.getLblERROR().setText("");
            } else {
               hc.getLblEXITO().setText("");
                hc.getLblERROR().setText("Error, revise los datos registrados"); 
            }
        }
        
        if (evn.getSource().equals(hc.getBtnGuardarHos())){
           if(!hc.getBoxDiaIng().getSelectedItem().toString().equals("Dia") && !hc.getBoxMesIng().getSelectedItem().toString().equals("Mes") && !hc.getBoxAnioIng().getSelectedItem().toString().equals("Año") && !hc.getBoxDiaSal().getSelectedItem().toString().equals("Dia") && !hc.getBoxMesSal().getSelectedItem().toString().equals("Mes") && !hc.getBoxAnioSal().getSelectedItem().toString().equals("Año") && !hc.getBoxHoraIng().getSelectedItem().toString().equals("Hora") && !hc.getBoxMinIng().getSelectedItem().toString().equals("Minutos") && !hc.getBoxHoraSal().getSelectedItem().toString().equals("Hora") && !hc.getBoxMinSal().getSelectedItem().toString().equals("Minutos")){

               
               int anio_box = (int) Integer.parseInt(hc.getBoxAnioIng().getSelectedItem().toString());
               int mes_box = (int) (Integer.parseInt(hc.getBoxMesIng().getSelectedItem().toString())) - 1;
               int dia_box = (int) Integer.parseInt(hc.getBoxDiaIng().getSelectedItem().toString());
               int hora_box = (int) Integer.parseInt(hc.getBoxHoraIng().getSelectedItem().toString());
               int min_box = (int) Integer.parseInt(hc.getBoxMinIng().getSelectedItem().toString());
               Calendar calendario1 = Calendar.getInstance();
               Calendar calendario2 = Calendar.getInstance();
               calendario2.set(anio_box, mes_box,dia_box , hora_box, min_box);
               java.util.Date fecha = (java.util.Date) calendario2.getTime();
               long difMilisegundos = Math.abs(calendario1.getTimeInMillis()- fecha.getTime());
               long horas = TimeUnit.MILLISECONDS.toHours(difMilisegundos);
               if(horas <= 12){
                  int id_hos = (int) Integer.parseInt(hc.getLblIdHosp().getText());
                  int anioI = (int) Integer.parseInt(hc.getBoxAnioIng().getSelectedItem().toString());
                  int mesI = (int) Integer.parseInt(hc.getBoxMesIng().getSelectedItem().toString());
                  int diaI = (int) Integer.parseInt(hc.getBoxDiaIng().getSelectedItem().toString());
                  int anioF = (int) Integer.parseInt(hc.getBoxAnioSal().getSelectedItem().toString());
                  int mesF = (int) Integer.parseInt(hc.getBoxMesSal().getSelectedItem().toString());
                  int diaF = (int) Integer.parseInt(hc.getBoxDiaSal().getSelectedItem().toString());
                  int horaF = (int) Integer.parseInt(hc.getBoxHoraIng().getSelectedItem().toString());
                  int minF = (int) Integer.parseInt(hc.getBoxMinIng().getSelectedItem().toString());
                  int horaI = (int) Integer.parseInt(hc.getBoxHoraSal().getSelectedItem().toString());
                  int minI = (int) Integer.parseInt(hc.getBoxMinSal().getSelectedItem().toString());
                  int id_reserva = (int) Integer.parseInt(hc.getLblIdReserva().getText());
                  int id_HA = (int) Integer.parseInt(hc.getLblIdHabitacion().getText());
                  NCDA ob = new NCDA();
                  ob.insertDatos_hospedaje_cliente(id_hos, anioI, mesI, diaI, anioF, mesF, diaF, horaF, minF, minI, horaI, id_reserva, id_HA);
                  hc.getLblERROR().setText("");
                  hc.getLblEXITO().setText("Registro exitoso");
                  ob.actualizarEstado_HC(id_HA);
                  mc.getBtnHospedaje_cliente().setEnabled(false);
                  mc.getBtnPago_cliente().setEnabled(true);
                  in.getEscritorio().removeAll();
                  in.getEscritorio().repaint();
                  this.in.getEscritorio().add(mc);
                  mc.setVisible(true);
                  CentrarVentanaInterna(mc);
               } else {
                  hc.getLblERROR().setText("Error, las reservas solo se pueden hacer 12 horas antes");
                  hc.getLblEXITO().setText("");
               }
           } else {
                  hc.getLblERROR().setText("Error, revise los datos registrados");
                  hc.getLblEXITO().setText("");
           }
        }
        
        if (evn.getSource().equals(mc.getBtnPago_cliente())){
            NCDA ob = new NCDA();
            in.getEscritorio().removeAll();
            in.getEscritorio().repaint();
            this.in.getEscritorio().add(pc);
            java.util.Date fechaAct = new java.util.Date();
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fechaAct);
            int anio_pago = calendario.get(Calendar.YEAR);
            int mes_pago = calendario.get(Calendar.MONTH)+1;
            int dia_pago = calendario.get(Calendar.DAY_OF_MONTH);
            int hora_pago = calendario.get(Calendar.HOUR_OF_DAY);
            int min_pago = calendario.get(Calendar.MINUTE);
            pc.getLblFecha_pago().setText(dia_pago+"/"+mes_pago+"/"+anio_pago);
            pc.getLblHora_pago().setText(hora_pago+":"+min_pago);
            ob.Ingresar_pago_fecha_hora(id_pago_def, hora_pago, min_pago, dia_pago, mes_pago, anio_pago);
            pc.getLblId_Pago().setText(id_pago_def+"");
            pc.getLblPrecio().setText(valor_total_def+"");
            pc.setVisible(true);
            CentrarVentanaInterna(pc);
            pc.getBtnSalir().addActionListener(this);
            pc.getBtnPagar().addActionListener(this);
        }
        
        if(evn.getSource().equals(pc.getBtnPagar())){
            if(!pc.getBoxTipo_pago().getSelectedItem().toString().equals(" ")){
                NCDA ob = new NCDA();
                float valor = (float) Float.parseFloat(pc.getLblPrecio().getText());
                ob.Ingresar_pago_completo(id_pago_def, valor, pc.getBoxTipo_pago().getSelectedItem().toString());
                pc.getTxtERROR().setText("");
                pc.getTxtEXITO().setText("Pago exitoso");
                mc.getBtnPago_cliente().setEnabled(false);
                mc.getBtnReciboCliente().setEnabled(true);
                in.getEscritorio().removeAll();
                in.getEscritorio().repaint();
                this.in.getEscritorio().add(mc);
                mc.setVisible(true);
                CentrarVentanaInterna(mc);
            } else {
                pc.getTxtERROR().setText("Error, revise los datos registrados");
                pc.getTxtEXITO().setText("");
            }
        }
    }
}
    
