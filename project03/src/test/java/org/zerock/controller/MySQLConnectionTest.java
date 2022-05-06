package org.zerock.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String URL = "jdbc:mysql://localhost:3306/project3";	
	private static final String USER = "root";
	private static final String PW = "1111";

	@Test
	public void testConnection() throws Exception{
		//Class.forName(DRIVER);
		try{
			Connection con = DriverManager.getConnection(URL,USER,PW); //try �������� ��ü ���� 
			System.out.println(con); //��ü �ܼ� ���
			con.close(); 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
