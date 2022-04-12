package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnector {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "";
		String sqlStatement = "select * from Major";
		String updateSql = "update major set Name = 'NO LONGER AVALAVLE' where Id = 4";
		String insertStatment = "insert into major(id,name) values (10, 'Astrophysics')";

		System.out.println("Connecting database...");

		// Playing around with Database connections, This will connect to a database on
		// my home computer called college,
		// This will display the table before inserting a new field and updating a new
		// and then redisplay the table
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement ps = connection.prepareStatement(sqlStatement);
				PreparedStatement ps2 = connection.prepareStatement(sqlStatement);
				PreparedStatement us = connection.prepareStatement(updateSql);
				PreparedStatement is = connection.prepareStatement(insertStatment)) {
			System.out.println("Database connected!");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "|" + rs.getString(2));

			}

			System.out.println("Inserting Field");
			is.execute();
			System.out.println("New Field Inserted");

			System.out.println("Updating Section...");
			us.executeUpdate();
			System.out.println("Update completed!");

			ResultSet rs2 = ps.executeQuery();
			while (rs2.next()) {
				System.out.println(rs2.getInt(1) + "|" + rs2.getString(2));

			}

		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}

	}

}
