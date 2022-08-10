package org.zerock.controller;

import java.sql.Connection;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class MybatisTest {
	
	@Inject
	private SqlSessionFactory sqlFactory;

	@Test
	public void testFactory() { //sqlFactory ��ü���� �׽�Ʈ
		System.out.println(sqlFactory);
	}

	@Test
	public void testSession() throws Exception{
		try{
			SqlSession session = sqlFactory.openSession();
			Connection con = session.getConnection();

			System.out.println(session);
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
