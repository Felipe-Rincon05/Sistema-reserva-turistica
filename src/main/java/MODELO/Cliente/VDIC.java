package MODELO.Cliente;
//VALIDAR DATOS INGRESO CLIENTE

import MODELO.Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author danie
 */
public class VDIC {
        public boolean Extraer_validar (String cc){
            Conexion obc = new Conexion ();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
                boolean flag = true;
		try {
			cn = obc.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT identificacion_cliente FROM cliente;");
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
}
