package com.liqi.bdqn.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.sound.sampled.LineListener;

public class BaseDao {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	Connection connection = null;
	PreparedStatement prepareStatement = null;
	ResultSet resultSet = null;
	
	static {
		init();
	}
	
	public static void init() {
		//������ȡ�����ļ��Ķ���
		Properties properties=new Properties();
		String configFile="db.properties";
		InputStream inputStream = BaseDao.class.getClassLoader().getResourceAsStream(configFile);
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver=properties.getProperty("driver");
		url=properties.getProperty("url");
		user=properties.getProperty("username");
		password=properties.getProperty("password");
	}
	/**
	 * ��ȡ����
	 * 
	 * @return
	 */
	public Connection getConnection() {

		if (connection == null) {
			try {
				Class.forName(driver);
				// ��ȡ�������ݿ�Ķ���
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return connection;

	}

	/**
	 * �ر����ӷ���
	 * 
	 * @param resultSet
	 * @param preparedStatement
	 * @param connection
	 */
	public void closeAll(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (resultSet != null) {

			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * ��ɾ��ͨ�÷���
	 * 
	 * @return
	 */
	public int executeUpdate(String sql, Object[] prams) {
		connection = getConnection();
		int result = -1;
		try {
			prepareStatement = connection.prepareStatement(sql);

			if (prams != null) {
				for (int i = 0; i < prams.length; i++) {
					prepareStatement.setObject(i + 1, prams[i]);
				}
			}

			result = prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(null, prepareStatement, connection);
		}

		return result;
	}

	// ��ѯ
	public ResultSet executeQuery(String sql,Object[] prams) {
		try {
			connection = getConnection();
			// ͨ�����Ӷ����ȡִ��sql���Ķ���
			prepareStatement = connection.prepareStatement(sql);
			if(prams!=null) {
				for (int i = 0; i < prams.length; i++) {
					prepareStatement.setObject(i+1, prams[i]);
				}
			}
			System.out.println(prepareStatement);
			// ִ��sql
			resultSet = prepareStatement.executeQuery();		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return resultSet;

	}

}
