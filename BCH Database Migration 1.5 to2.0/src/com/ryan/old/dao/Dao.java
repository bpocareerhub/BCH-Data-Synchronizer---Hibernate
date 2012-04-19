package com.ryan.old.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bch.bom.Database;

abstract class Dao {
	private Database database;
	private Connection connection;
	
	public Dao() {
		this.database = Database.getInstance();
		this.connection = this.database.getConnection();
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public ResultSet getResultSet(String sql) {
		Statement statement = null;
		try {
			statement = this.getConnection().createStatement();
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Dao [database=" + database + ", connection=" + connection + "]";
	}
	
	
}
