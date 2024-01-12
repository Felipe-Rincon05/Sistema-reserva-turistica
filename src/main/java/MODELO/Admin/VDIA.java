//ExtraerDatos
package MODELO.Admin;

import MODELO.Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VDIA {
	public boolean Extraer_Comparar (String contra, String user){
            
		Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                ArrayList admin_contrasenia = new ArrayList();
                ArrayList admin_usuario = new ArrayList();
                
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT contrasenia_admins,usuario_admins FROM admins");
			while(rs.next()) {
                            
				admin_contrasenia.add(rs.getString(1));
				admin_usuario.add(rs.getString(2));
			} } catch (SQLException e) {
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
                boolean flag1=false, flag2=false;
                for(int i=0;i<admin_contrasenia.size();i++){
                    if (contra.equals(admin_contrasenia.get(i))){
                        flag1 = true;
                    }}
                for(int i=0;i<admin_usuario.size();i++){
                    if (user.equals(admin_usuario.get(i))){
                        flag2 = true;
                    }}
            return flag1 == true && flag2 == true;
        }
        
        public boolean Extraer_validar (String cc){
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = true;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT cedula_admins FROM admins");
			while(rs.next()) {
                            if(cc.equals(rs.getString(1))){
                                flag =false;
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
                return flag;
        }
        
        public int encontrar_id (String user){
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                int id=0;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
                        
			rs = stm.executeQuery("SELECT id_admins FROM admins WHERE usuario_admins ='" + user+"';");
			while(rs.next()) {
                            id = (int) Integer.parseInt(rs.getString(1));
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
}