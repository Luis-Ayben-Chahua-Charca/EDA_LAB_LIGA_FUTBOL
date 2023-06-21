import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class eliminar {
  	public static void main(String[] args) {
		Conexion c1= new Conexion();
		Connection cn=null;
		PreparedStatement stm=null;
		ResultSet rs=null;
		try{
			cn=c1.conectar();
			stm=cn.prepareStatement("DELETE FROM arbitros WHERE ArbCod=?");
			stm.setInt(1, 7);
			stm.executeUpdate();
			System.out.println("se a elimnado nuevo arbitro un  arbitro los datos");
			
		}catch(SQLException e){
			System.out.println("error");
		}


	}
}
