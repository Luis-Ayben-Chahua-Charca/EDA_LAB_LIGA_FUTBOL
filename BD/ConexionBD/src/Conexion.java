import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
	private static final String CONTROLADOR="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/liga_futbol";
	private static final String USUARIO="root";
	private static final String CLAVE="973298303";
	
	public Connection conectar() {
		Connection conexion=null;
		try {
			Class.forName(CONTROLADOR);
			conexion=DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("conexion ok");
		}catch (ClassNotFoundException e) {
			System.out.println("error al cargar el controlador");
		}catch(SQLException e) {
			System.out.println("error conexion");
		}
		return conexion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion c= new Conexion();
		c.conectar();
	}

}
