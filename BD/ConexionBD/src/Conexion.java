import java.sql.Statement;
import java.sql.ResultSet;
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
		Conexion c= new Conexion();
		Connection cn=null;
		Statement stm=null;
		ResultSet rs=null;
		try{
			cn=c.conectar();
			stm=cn.createStatement();
			rs=stm.executeQuery("SELECT * FROM fixture_det");
			while(rs.next()){
				int id=rs.getInt(1);
				int a=rs.getInt(2);
				int b=rs.getInt(3);
				String d=rs.getString(4);
				System.out.println(id+" "+a+" "+b+" "+d+" ");

			}
			
		}catch(SQLException e){

		}


	}

}
