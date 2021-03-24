import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HiveJdbc {
	
	public static void main(String[] args) throws Exception {
		
		//①加载驱动
		Class.forName("org.apache.hive.jdbc.HiveDriver");
		
		//②创建连接
		Connection connection = DriverManager.getConnection("jdbc:hive2://192.168.244.133:10000", "atguigu", "");
		
		// ③准备SQL
		String sql="select * from default.person";
		
		// ④预编译sql
		PreparedStatement ps = connection.prepareStatement(sql);
		
		// ⑤执行sql
		ResultSet resultSet = ps.executeQuery();
		
		while(resultSet.next()) {
			
			System.out.println("name:"+resultSet.getString("name")+"---->age:"+
			resultSet.getInt("age"));
			
		}
		
		
	}

}
