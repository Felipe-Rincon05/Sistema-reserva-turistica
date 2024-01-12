
package MODELO.Servicio;

import MODELO.Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VDIS {
    public boolean validar_id_ser (String id){
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = false;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT id_servicio_admin FROM servicio_admin;");
			while(rs.next()) {
                            if(id.equals(rs.getString(1))){
                                flag =true;
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
    public boolean validar_idEspacio (String id){
                Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = false;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT id_espacio FROM espacio_servicio;");
			while(rs.next()) {
                            if(id.equals(rs.getString(1))){
                                flag =true;
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
}
