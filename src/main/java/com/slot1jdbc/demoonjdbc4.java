package com.slot1jdbc;
import java.io.FileInputStream;
import java.sql.*;
public class demoonjdbc4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudipdeeptech","root","905906");
		
		String query="insert into empimg values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		FileInputStream fis=new FileInputStream("C:/Users/chitt/Desktop/msd.jpg");
		
		pst.setInt(1, 102);
		pst.setBinaryStream(2, fis);
		
		int count=pst.executeUpdate();
		System.out.println(count+"row(s) affected");
		
		
	}

}
