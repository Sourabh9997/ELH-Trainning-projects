package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int createEmployee(Employee employee) {
		int result=0;
        Connection connection = JdbcConnection.getConnection(); // got my connection -- mysql = ELh Schema / DB
        String sql = "INSERT INTO employee_table(name,designation,age,salary) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Vishal");
            preparedStatement.setString(2, "BDA");
            preparedStatement.setInt(3, 50);
            preparedStatement.setFloat(4, 1000.11f);;
             result = preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
		
		

	}

	@Override
	public Employee readEmployeeById(int empId) {
	   
	        Employee employee = null;
	        Connection connection = JdbcConnection.getConnection(); // got my connection -- mysql = ELh Schema / DB
	        String sql = "select * from employee_table where id = ?";
	        PreparedStatement preparedStatement;
	        try {
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, empId);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            employee =  new Employee();
	            while(resultSet.next())
	            {
	                employee.setEmpId(resultSet.getInt("id"));
	                employee.setEmpName(resultSet.getString("name"));
	                employee.setDesignation(resultSet.getString("designation"));
	                employee.setAge(resultSet.getInt("age"));
	                employee.setSalary(resultSet.getFloat("salary"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return employee;
	    }
	
		
	

	@Override
	public Employee readEmployeeByName(String empName) {
		Employee employee = null;
        Connection connection = JdbcConnection.getConnection(); // got my connection -- mysql = ELh Schema / DB
        String sql = "select * from employee_table where name = ?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, empName);
            ResultSet resultSet = preparedStatement.executeQuery();
            employee =  new Employee();
            while(resultSet.next())
            {
                employee.setEmpId(resultSet.getInt("id"));
               
                employee.setDesignation(resultSet.getString("designation"));
                employee.setAge(resultSet.getInt("age"));
                employee.setSalary(resultSet.getFloat("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return employee;
    }

		
	

	@Override
	public Employee updateEmployee(String empName) {
		Employee empl = null;
        Connection connection = JdbcConnection.getConnection(); // got my connection -- mysql = ELh Schema / DB
        String sql = "UPDATE employee_table SET designation = ? where name= ?";
        PreparedStatement preparedStatement;
        
            try {
				preparedStatement = connection.prepareStatement(sql);
				 preparedStatement.setString(1, "Tester");
				 preparedStatement.setString(2, empName);
		            int resultSet = preparedStatement.executeUpdate();
		            empl=new Employee();
		           empl=readEmployeeByName(empName);
		           
		            
		            
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
        return empl;
		
	}

	@Override
	public int deleteEmployeeByEmployeeId(int empId) {
	
		int del=0;
		Connection connection = JdbcConnection.getConnection(); // got my connection -- mysql = ELh Schema / DB
        String sql = "DELETE FROM employee_table where id=?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
           
            preparedStatement.setInt(1, empId);
           
             del= preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return del;
		
	}

}
