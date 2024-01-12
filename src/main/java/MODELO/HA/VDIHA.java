package MODELO.HA;

import MODELO.Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class VDIHA {
    public boolean validar_id_ha (String id_con){
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = false;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT id_habitacion FROM hospedaje_admin;");
			while(rs.next()) {
                            if(id_con.equals(rs.getString(1))){
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

