package MODELO.Admin;

import CONTROL.Controlador_Inicio;
import MODELO.Cliente.VDIC;
import MODELO.Conductor.VDICO;
import MODELO.Conexion.Conexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NCDA {
	private java.sql.PreparedStatement PS;
	private Conexion CN;
	
	public NCDA () {
		PS = null;
		CN = new Conexion();
	}
	
	public boolean validar_datos_admin(String nombre,String contra,String usuario,String cc) {
		boolean flag = false;
                VDIA ob = new VDIA();
                if(!nombre.equals("") && !contra.equals("") && !usuario.equals("")){
                    if(ob.Extraer_validar(cc)){
                        flag =true;
                    }}
                return flag;
	}
        
	public int insertDatos_admin (int id, String nombre, String contra, String user , String cc) {
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO admins VALUES (?,?,?,?,?)");
			PS.setInt(1, id);
			PS.setString(2, nombre);
                        PS.setString(3, contra);
			PS.setString(4, user);
			PS.setString(5, cc);
			int res = PS.executeUpdate();
		}catch(Exception e){
			
		}finally {
			PS = null;
		}
		return 0;
	}
        
        public boolean validar_datos_cliente(String nombre,String correo,String Tipoid, String Nid, String telefono, String dia, String anio, String mes) {
		boolean flag = false;
                VDIC ob = new VDIC();
                if(!nombre.equals("") && !correo.equals("") && !Tipoid.equals(" ") && !Nid.equals("") && !telefono.equals("") && !dia.equals(" ") && !anio.equals(" ") && !mes.equals(" ")){
                    if(ob.Extraer_validar(Nid)){
                        flag =true;
                    } }
                return flag;
	}
        
        public int insertDatos_cliente (int id, String Tipoid,String correo,int telefono, int Nid,int edad, String nombre) {
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO cliente VALUES (?,?,?,?,?,?,?)");
			PS.setInt(1, id);
			PS.setString(2, Tipoid);
                        PS.setString(3, correo);
			PS.setInt(4, telefono);
			PS.setInt(5, Nid);
                        PS.setInt(6, edad);
                        PS.setString(7, nombre);
			int res = PS.executeUpdate();
		}catch(Exception e){ }finally { PS = null; }
                
		return 0;
	}
        
        public boolean validar_datos_conductor (String nombre,String cc, String telefono ,String dia, String mes, String anio) {
		boolean flag = false;
                VDICO ob = new VDICO();
                if(!nombre.equals("") && !telefono.equals("") && !dia.equals(" ") && !mes.equals("") && !anio.equals("")){
                        flag =true;
                     }
                return flag;
	}
        public boolean validar_datos_servicio (String id_serv, String Nombre_serv, String Cupos_dis_Serv , String Hora_inicio_Serv , String Minutos_inicio_serv , String Hora_fin_serv , String Minutos_fin_serv , String id_Admin_serv, String precio, String id_espacio) {
		boolean flag = false;
                VDICO ob = new VDICO();
                if(!id_serv.equals("") && !Nombre_serv.equals("") && !Cupos_dis_Serv.equals("") && !Hora_inicio_Serv.equals("Hora") && !Minutos_inicio_serv.equals("Minutos") && !Hora_fin_serv.equals("Hora") && !Minutos_fin_serv.equals("Minutos") && !id_Admin_serv.equals("") && !precio.equals("") && !id_espacio.equals("")){
                        flag =true;
                }
                return flag;
	}
        
        public boolean validar_datos_espacio (String precio, String direccion, String propietario) {
		boolean flag = false;
                VDICO ob = new VDICO();
                if(!precio.equals("") && !direccion.equals("") && !propietario.equals("")){
                        flag =true;
                }
                return flag;
	}
        
        public int insertDatos_conductor (int id, String nombre, String telefono, int dia, int mes, int anio, int id_transporte, long cc) {
           
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO conductor VALUES (?,?,?,?,?,?,?,?);");
			PS.setInt(1, id);
                        PS.setString(2, nombre);
			PS.setString(3, telefono);
			PS.setInt(4, dia);
                        PS.setInt(5, mes);
                        PS.setInt(6, anio);
                        PS.setInt(7,id_transporte);
                        PS.setLong(8, cc);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
		return 0;
	}
        
        
        public int insertDatos_servicio_admin (int id , String nombre , int cuposdis ,int horain ,int minin ,int horafin ,int minfin , int idadmin, int id_espacio, float precio){
            try {
			PS = CN.conectar().prepareStatement("INSERT INTO servicio_admin VALUES (?,?,?,?,?,?,?,?,?,?,?);");
			PS.setInt(1, id);
                        PS.setString(2, nombre);
			PS.setInt(3, cuposdis);
			PS.setInt(4, 0);
                        PS.setInt(5, horain);
                        PS.setInt(6, minin);
                        PS.setInt(7,horafin);
                        PS.setInt(8, minfin);
                        PS.setInt(9, idadmin);
                        PS.setInt(10, id_espacio);
                        PS.setFloat(11, precio);
			int res = PS.executeUpdate();
	}catch(SQLException e){ }finally { PS = null; }
            
            return 0;
        }
        public int insertDatos_servicio_cliente (int id , String nombre , float precio, int horaI, int minI, int horaF, int minF, int id_SA, int id_reserva){
            try {
			PS = CN.conectar().prepareStatement("INSERT INTO servicios VALUES (?,?,?,?,?,?,?,?,?);");
			PS.setInt(1, id);
                        PS.setString(2, nombre);
			PS.setFloat(3, precio);
			PS.setInt(4, horaI);
                        PS.setInt(5, minF);
                        PS.setInt(6, horaF);
                        PS.setInt(7,minI);
                        PS.setInt(8, id_SA);
                        PS.setInt(9, id_reserva);
			int res = PS.executeUpdate();
	}catch(SQLException e){ }finally { PS = null; }
            
            return 0;
        }
        public int insertDatos_espacio (int id , float precio, String propietario, String direccion, int id_admin){
            try {
			PS = CN.conectar().prepareStatement("INSERT INTO espacio_servicio VALUES (?,?,?,?,?);");
			PS.setInt(1, id);
                        PS.setFloat(2, precio);
                        PS.setString(3, propietario);
                        PS.setString(4, direccion);
			PS.setInt(5, id_admin);
			int res = PS.executeUpdate();
                        
	}catch(SQLException e){ }finally { PS = null; }
            
            return 0;
        }
         public int modificarDatos_servicio_admin (int id , String nombre , int cuposdis , int cuposuso ,int horain ,int minin ,int horafin ,int minfin , int idadmin, float precio){
            
            try {
			PS = CN.conectar().prepareStatement("UPDATE servicio_admin SET Nombre_servicio_admin =?, Cupos_disponibles_Servicio_admin =?, Cupos_EnUso_Servicio_admin=?, Hora_inicio_Servicio_admin =?, Minutos_inicio_servicio_admin =?, Hora_fin_servicio_admin =?, Minutos_fin_servicio_admin =?, id_Admin_servicio =?, Precio_servicio_admin =? WHERE id_servicio_admin ="+ id+";");
                        PS.setString(1, nombre);
			PS.setInt(2, cuposdis);
			PS.setInt(3, cuposuso);
                        PS.setInt(4, horain);
                        PS.setInt(5, minin);
                        PS.setInt(6,horafin);
                        PS.setInt(7, minfin);
                        PS.setInt(8, idadmin);
                        PS.setFloat(9, precio);
			int res = PS.executeUpdate();
                        
	}catch(SQLException e){ }finally { PS = null; }
            
            return 0;
        }
         public int eliminartDatos_servicio (int id) {
           
		try {
			PS = CN.conectar().prepareStatement("DELETE FROM servicio_admin WHERE id_servicio_admin = " + id +";");
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
		return 0;
	}
        public int modificartDatos_conductor (String nombre, int telefono, int dia, int mes, int anio, int id_transporte, int cc, int id) {
           
		try {
			PS = CN.conectar().prepareStatement("UPDATE conductor SET nombre_conductor =?, telefono_conductor =?, dia_nto_conductor =?, mes_nto_conductor =?, anio_nto_conductor =?, id_transporte =?, identificacion_conductor =? WHERE id_conductor =?;");
                        PS.setString(1, nombre);
			PS.setInt(2, telefono);
			PS.setInt(3, dia);
                        PS.setInt(4, mes);
                        PS.setInt(5, anio);
                        PS.setInt(6,id_transporte);
                        PS.setInt(7, cc);
                        PS.setInt(8, id);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
		return 0;
	}
        
        public int eliminartDatos_conductor (int id) {
           
		try {
			PS = CN.conectar().prepareStatement("DELETE FROM conductor WHERE id_conductor = " + id +";");
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
		return 0;
	}
        public int eliminartDatos_transporte (int id) {
           
		try {
			PS = CN.conectar().prepareStatement("DELETE FROM transporte_admin WHERE idTransporte_admin = " + id +";");
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
		return 0;
	}
        public boolean validar_datos_transporteAdm (String Idtrans_adm, String origen_tradm, String destino_tradm, String dia_tradm, String mes_tradm, String anio_tradm, String hora_tradm, String minutos_tradm, String placa_tradm, String valor_tradm, String CapacidadPasa_tradm, String Id_adm) {
		boolean flag = false;
                VDICO ob = new VDICO();
                if(!Idtrans_adm.equals("") && !origen_tradm.equals("") && !destino_tradm.equals("") && !dia_tradm.equals("Dia") && !mes_tradm.equals("Mes") && !anio_tradm.equals("Año") && !hora_tradm.equals("Hora") && !minutos_tradm.equals("Minutos") && !placa_tradm.equals("") && !valor_tradm.equals("") && !CapacidadPasa_tradm.equals("") && !Id_adm.equals("")){
                    if(ob.Extraer_validar(Idtrans_adm)){ flag =true; } }
                return flag;
	}
        public boolean validar_datos_transporteAdm_mod (String Idtrans_adm, String origen_tradm, String destino_tradm, String dia_tradm, String mes_tradm, String anio_tradm, String hora_tradm, String minutos_tradm, String placa_tradm, String valor_tradm, String CapacidadPasa_tradm, String cuposU, String Id_adm) {
		boolean flag = false;
                VDICO ob = new VDICO();
                if(!Idtrans_adm.equals("") && !origen_tradm.equals("") && !destino_tradm.equals("") && !dia_tradm.equals("") && !mes_tradm.equals("") && !anio_tradm.equals("") && !hora_tradm.equals("") && !minutos_tradm.equals("") && !placa_tradm.equals("") && !valor_tradm.equals("") && !CapacidadPasa_tradm.equals("") && !cuposU.equals("") && !Id_adm.equals("")){
                    flag =true; 
                }
                return flag;
	}
        public int modificartDatos_transporteAdm (int id, String origen, String destino, int dia, String mes, int anio, int hora, int minutos, String placa, float valor, int capacidad,int cuposU, int admins_fk) {
           
		try {
			PS = CN.conectar().prepareStatement("UPDATE transporte_admin SET Origen_trAdmin = ?, Destino_trAdmin = ? , Dia_trAdmin = ? , Mes_trAdmin = ?, Anio_trAdmin = ? , Hora_trAdmin = ? , Minutos_trAdmin = ? , Placa_trAdmin = ? ,Valor_trAdmin = ? , CapacidadPasajeron_trAdmin = ? , Cantidad_pasajeros_Uso =? , Admin_fk = ?  WHERE idTransporte_admin =" +id+";");
			PS.setString(1, origen);
                        PS.setString(2, destino);
			PS.setInt(3, dia);
                        PS.setString(4, mes);
                        PS.setInt(5, anio);
                        PS.setInt(6,hora);
                        PS.setInt(7, minutos);
                        PS.setString(8, placa);
                        PS.setFloat(9, valor);
                        PS.setInt(10, capacidad);
                        PS.setInt(11, cuposU);
                        PS.setInt(12, admins_fk);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
		return 0;
	}
        
        public void insertDatos_trans_adm (int Idtrans_adm, String origen_tradm, String destino_tradm, int dia_tradm, String mes_tradm, int anio_tradm, int hora_tradm, int minutos_tradm, String placa_tradm, float valor_tradm, int CapacidadPasa_tradm, int Id_adm) {
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO transporte_admin VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PS.setInt(1, Idtrans_adm);
                        PS.setString(2, origen_tradm);
			PS.setString(3, destino_tradm);
			PS.setInt(4, dia_tradm);
                        PS.setString(5, mes_tradm);
                        PS.setInt(6, anio_tradm);
                        PS.setInt(7, hora_tradm);
                        PS.setInt(8, minutos_tradm);
                        PS.setString(9, placa_tradm);
                        PS.setFloat(10,valor_tradm);
                        PS.setInt(11, CapacidadPasa_tradm);
                        PS.setInt(12, 0);
                        PS.setInt(13, Id_adm);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
	}
        
        public boolean validar_datos_hospedajeAdm (String tipo_habitacion, String precio, String dispo) {
		boolean flag = false;
                VDICO ob = new VDICO();
                if(!tipo_habitacion.equals("") && !precio.equals("") && !dispo.equals("")){
                    flag =true; 
                }
                return flag;
	}
        
        public boolean insertDatos_hospedaje_adm (int id_HA,  String dispo, String tipo_habitacion, float valor, int id_admin) {
            boolean flag=false;
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO hospedaje_admin VALUES (?,?,?,?,?)");
			PS.setInt(1, id_HA);
                        PS.setString(2, dispo);
			PS.setString(3, tipo_habitacion);
			PS.setFloat(4, valor);
                        PS.setInt(5, id_admin);
			int res = PS.executeUpdate();
			if (res>0) { flag = true; }
		}catch(SQLException e){ }finally { PS = null; }
		return flag;
	}
        public boolean insertDatos_hospedaje_cliente (int id_Hos, int anioI, int mesI, int diaI, int anioF, int mesF, int diaF, int horaF, int minF, int minI, int horaI, int id_reserva, int id_HA) {
            boolean flag=false;
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO hospedaje_cliente VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PS.setInt(1, id_Hos);
                        PS.setInt(2, anioI);
                        PS.setInt(3, mesI);
                        PS.setInt(4, diaI);
                        PS.setInt(5, anioF);
                        PS.setInt(6, mesF);
                        PS.setInt(7, diaF);
                        PS.setInt(8, horaF);
                        PS.setInt(9, minF);
                        PS.setInt(10, minI);
                        PS.setInt(11, horaI);
                        PS.setInt(12, id_reserva);
                        PS.setInt(13, id_HA);
			int res = PS.executeUpdate();
			if (res>0) { flag = true; }
		}catch(SQLException e){ }finally { PS = null; }
		return flag;
	}
        public boolean validar_datos_hospedajeAdm_mod (String tipo_habitacion, String precio, String dispo, String id_HA) {
		boolean flag = false;
                VDICO ob = new VDICO();
                if(!tipo_habitacion.equals("") && !precio.equals("") && !dispo.equals("") && !id_HA.equals("")){
                    flag =true; 
                }
                return flag;
	}
        
        public boolean modificarDatos_hospedaje_adm (int id_HA,  String dispo, String tipo_habitacion, float valor, int id_admin) {
            boolean flag=false;
		try {
			PS = CN.conectar().prepareStatement("UPDATE hospedaje_admin SET disponibilidad_habitacion =?, tipo_habitacion =?, valor_habitacion =?, Id_admin =? WHERE Id_habitacion = "+id_HA+";");
                        PS.setString(1, dispo);
			PS.setString(2, tipo_habitacion);
			PS.setFloat(3, valor);
                        PS.setInt(4, id_admin);
			int res = PS.executeUpdate();
			if (res>0) { flag = true; }
		}catch(SQLException e){ }finally { PS = null; }
		return flag;
	}
        
        public int eliminartDatos_hospedajeAdm (int id) {
           
		try {
			PS = CN.conectar().prepareStatement("DELETE FROM hospedaje_admin WHERE id_habitacion = " + id +";");
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
		return 0;
	}
        
        public void insertDatos_trans (int id_trans, String destino, int hora, int min, int dia, String mes, int anio, String origen, float valor, String placa, int id_trAdm) {
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO transporte VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			PS.setInt(1, id_trans);
                        PS.setString(2, destino);
			PS.setInt(3, hora);
                        PS.setInt(4, min);
                        PS.setInt(5, dia);
                        PS.setString(6, mes);
                        PS.setInt(7, anio);
                        PS.setString(8, origen);
                        PS.setFloat(9,valor);
                        PS.setString(10, placa);
                        PS.setInt(11, id_trAdm);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
	}
        
        public boolean actualizarUso_trAdm (int id_trAdm, int cantidadU) {
            boolean flag=false;
		try {
			PS = CN.conectar().prepareStatement("UPDATE transporte_admin SET Cantidad_pasajeros_Uso=? WHERE idTransporte_admin  = "+id_trAdm+";");
                        PS.setInt(1, cantidadU);
			int res = PS.executeUpdate();
			if (res>0) { flag = true; }
		}catch(SQLException e){ }finally { PS = null; }
		return flag;
	}
        public boolean actualizarUso_SerAdm (int id_SerAdm, int cantidadU) {
            boolean flag=false;
		try {
			PS = CN.conectar().prepareStatement("UPDATE servicio_admin SET Cupos_EnUso_Servicio_admin=? WHERE id_servicio_admin   = "+id_SerAdm+";");
                        PS.setInt(1, cantidadU);
			int res = PS.executeUpdate();
			if (res>0) { flag = true; }
		}catch(SQLException e){ }finally { PS = null; }
		return flag;
	}
        public boolean actualizarEstado_HC (int id_HA) {
            boolean flag=false;
		try {
			PS = CN.conectar().prepareStatement("UPDATE hospedaje_admin SET disponibilidad_habitacion=? WHERE id_habitacion    = "+id_HA+";");
                        PS.setString(1, "NO");
			int res = PS.executeUpdate();
			if (res>0) { flag = true; }
		}catch(SQLException e){ }finally { PS = null; }
		return flag;
	}
        
        public void Ingresar_Reserva_id (int id, int hora, int min, int dia, int mes, int anio, int id_cliente, int id_trans, int id_pago){
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO reserva VALUES (?,?,?,?,?,?,?,?,?,?);");
                        PS.setInt(1, id);
                        PS.setInt(2, hora);
			PS.setInt(3, min);
                        PS.setInt(4, dia);
                        PS.setInt(5, mes);
                        PS.setInt(6, anio);
                        PS.setFloat(7, 0);
                        PS.setInt(8, id_trans);
                        PS.setInt(9,id_cliente);
                        PS.setInt(10, id_pago);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
        }
        public void Ingresar_pago_id (int id){
		try {
			PS = CN.conectar().prepareStatement("INSERT INTO pago VALUES (?,?,?,?,?,?,?,?);");
                        PS.setInt(1, id);
                        PS.setFloat(2, 0);
			PS.setInt(3, 0);
                        PS.setInt(4, 0);
                        PS.setString(5, " ");
                        PS.setInt(6, 0);
                        PS.setInt(7, 0);
                        PS.setInt(8, 0);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
        }
        public void Ingresar_pago_completo (int id_pago, float valor,String forma_p){
		try {
			PS = CN.conectar().prepareStatement("UPDATE pago SET valor_pago=?,forma_pago=? WHERE id_pago = "+id_pago+";");
                        PS.setFloat(1, valor);
                        PS.setString(2, forma_p);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
        }
        public void Ingresar_pago_fecha_hora (int id_pago, int hora, int min, int dia, int mes, int anio){
		try {
			PS = CN.conectar().prepareStatement("UPDATE pago SET hora_pago=?, minutos_pago=?,dia_pago=?, mes_pago=?, anio_pago=?  WHERE id_pago = "+id_pago+";");
                        PS.setInt(1, hora);
			PS.setInt(2, min);
                        PS.setInt(3, dia);
                        PS.setInt(4, mes);
                        PS.setInt(5, anio);
			int res = PS.executeUpdate();
		}catch(SQLException e){ }finally { PS = null; }
        }
        
        //IDS
        public int id_mayor_cliente (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 789100000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_cliente) FROM cliente;");
			while(rs.next()) {
                            if(rs.getInt(1) == 0){
                               id = 789100000;  
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
         public int id_mayor_admin (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 678900000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_admins) FROM admins;");
			while(rs.next()) {
                            if(rs.getInt(1) == 0){
                                id = 678900000;
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
        public int id_mayor_hosp (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 345600000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_habitacion) FROM hospedaje_admin;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                               id = 345600000;
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
        public int id_mayor_hospCliente (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 234500000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_hospedaje) FROM hospedaje_cliente;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                               id = 234500000;
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }     
        public int id_mayor_EspacioServ (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 891200000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_espacio) FROM espacio_servicio;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                               id = 891200000; 
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
        public int id_mayor_reserva (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 891200000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_reserva) FROM reserva;");
			while(rs.next()) {
                            if(rs.getInt(1) == 0){
                               id = 891200000;
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
        public int id_mayor_servadmin (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 567800000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_servicio_admin) FROM servicio_admin;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                              id = 567800000; 
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }       
        public int id_mayor_cond (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 123400000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_conductor) FROM conductor;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                              id = 123400000; 
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
                public int id_mayor_trans (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 876500000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(idTransporte_admin) FROM transporte_admin;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                              id = 876500000; 
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        } 
                
        public int id_mayor_servCliente (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 456700000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_conductor) FROM conductor;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                              id = 456700000; 
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
        
        public int id_mayor_transCliente (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 987600000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_conductor) FROM conductor;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                              id = 987600000; 
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }
        public int id_mayor_pago (){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id = 765400000; 
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT MAX(id_pago) FROM pago;");
			while(rs.next()) {
                           if(rs.getInt(1) == 0){
                              id = 765400000; 
                            } else {
                                id = (int) Integer.parseInt(rs.getString(1))+1;
                            }
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
                return id;
        }

        public void factura (int id_cliente) throws FileNotFoundException {
                
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int cc_cliente =0,id_reserva=0,hora_reserva=0,minutos_reserva=0,dia_reserva=0,mes_reserva=0,anio_reserva=0,id_pago = 0;
                float valor_pago = 0;
                String nombre_cliente=null,forma_pago=null,destino = null,origen=null,placa = null,tipo_habitacion =null,nombre_servicio = null;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT nombre_cliente,identificacion_cliente, id_reserva, hora_reserva, minutos_reserva, dia_reserva, mes_reserva, anio_reserva FROM cliente NATURAL JOIN reserva WHERE id_cliente ="+id_cliente);
			while(rs.next()) {
                               nombre_cliente = rs.getString(1);
                               cc_cliente = rs.getInt(2);
                               id_reserva = rs.getInt(3);
                               hora_reserva = rs.getInt(4);
                               minutos_reserva = rs.getInt(5);
                               dia_reserva = rs.getInt(6);
                               mes_reserva = rs.getInt(7);
                               anio_reserva = rs.getInt(8);
                                     
			}
                        rs = stm.executeQuery("SELECT valor_pago, forma_pago, id_pago from pago NATURAL JOIN reserva WHERE id_reserva ="+id_reserva);
			while(rs.next()) {
                               valor_pago = rs.getFloat(1);
                               forma_pago = rs.getString(2);
                               id_pago = rs.getInt(3);
                                     
			}
                        rs = stm.executeQuery("SELECT destino, origen, placa FROM transporte NATURAL JOIN reserva WHERE id_reserva ="+id_reserva);
			while(rs.next()) {
                               destino = rs.getString(1);
                               origen = rs.getString(2);
                               placa = rs.getString(3);
                                     
			}
                        rs = stm.executeQuery("SELECT tipo_habitacion FROM hospedaje_admin NATURAL JOIN hospedaje_cliente WHERE idreservas ="+id_reserva);
			while(rs.next()) {
                               tipo_habitacion = rs.getString(1);
			}
                        rs = stm.executeQuery("SELECT nombre_servicio FROM reserva NATURAL JOIN servicios WHERE id_reserva ="+id_reserva);
			while(rs.next()) {
                               nombre_servicio = rs.getString(1);
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
				
		}
                }
            FileOutputStream archivo = new FileOutputStream (id_reserva+".pdf");
            Document documento = new Document ();
            try{
                PdfWriter.getInstance(documento,archivo);
                documento.open();
                documento.addAuthor("Turism Company");
                documento.addCreationDate();
                documento.addTitle("RESERVA EN TURISM COMPANY");
                documento.add(new Paragraph("RECIBO: (RESERVA EN TURISM COMPANY)\n"));
                documento.add(new Paragraph("El cliente con id "+id_cliente+" y nombre "+nombre_cliente+" y cedula "+cc_cliente+" realizo la reserva "+id_reserva+" a las "+hora_reserva+":"+minutos_reserva+" de la fecha "+dia_reserva+"/"+mes_reserva+"/"+anio_reserva+", se registro un transporte con placas "+placa+" de origen "+origen+" con destino a "+destino+", una habitacion "+tipo_habitacion+", se reservo el servicio "+nombre_servicio+", referente al pago tenemos un valor total de "+valor_pago+", que fue pagado por medio de "+forma_pago+", y el pago se registro con el id "+id_pago+".\n"+"Muchas gracias por agendar su reserva, que lo disfrute. <3"));
                documento.close();
                JOptionPane.showMessageDialog(null, "Recibo generado, y guardado en la carpeta del programa");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error al generar recibo");
        }
        }
}
