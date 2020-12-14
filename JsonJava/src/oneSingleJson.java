import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class oneSingleJson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		
		ArrayList<CustomerDetails> a = new ArrayList<CustomerDetails>();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "9327");
		// object of statement class will help us to execute queries
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia'");
		while (rs.next()) {
			CustomerDetails c = new CustomerDetails();
			c.setCourseName(rs.getString(1));
			c.setPurchaseDate(rs.getString(2));
			c.setAmount(rs.getInt(3));
			c.setLocation(rs.getString(4));
			System.out.println(c.getCourseName());
			System.out.println(c.getPurchaseDate());
			System.out.println(c.getAmount());
			System.out.println(c.getLocation());
			a.add(c);
		}
		for(int i=0;i<a.size();i++ ) {
			ObjectMapper o = new ObjectMapper();
			o.writeValue(new File("C:\\Java-Traning\\JsonJava\\customerInfo"+i+".json"), a.get(i));
			}
		conn.close();
	}

}
