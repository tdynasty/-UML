package cn.itcast.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.domain.Customer;
import cn.itcast.exception.DaoException;
import cn.itcast.utils.JdbcUtils;

public class CustomerDaoImpl {
	
	public void add(Customer customer){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			//获取连接对象
			conn=JdbcUtils.getConnection();
			//执行的sql语句
			String sql="insert into Customer(id,name,gender,birthday,cellphone,email,preference,type,description) values(?,?,?,?,?,?,?,?,?)";
			//获得预编译对象
			st=conn.prepareStatement(sql);
			st.setString(1, customer.getId());
			st.setString(2, customer.getName());
			st.setString(3, customer.getGender());
			st.setDate(4, new java.sql.Date(customer.getBirthday().getTime()));
			st.setString(5, customer.getCellphone());
			st.setString(6, customer.getEmail());
			st.setString(7, customer.getPreference());
			st.setString(8, customer.getType());
			st.setString(9, customer.getDescription());
			
			//提交给数据库执行
			st.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
		
	}
	public void update(Customer customer){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			//获取连接对象
			conn=JdbcUtils.getConnection();
			String sql="update Customer set(?,?,?,?,?,?,?,?) where id=?";
			st=conn.prepareStatement(sql);
			st.setString(1, customer.getName());
			st.setString(2, customer.getGender());
			st.setDate(3, new java.sql.Date(customer.getBirthday().getTime()));
			st.setString(4, customer.getCellphone());
			st.setString(5, customer.getEmail());
			st.setString(6, customer.getPreference());
			st.setString(7, customer.getType());
			st.setString(8, customer.getDescription());
			st.setString(9, customer.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
		
	}
	public void delete(String id){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			//获取连接对象
			conn=JdbcUtils.getConnection();
			String sql="delete from Customer where id=?";
			st=conn.prepareStatement(sql);
			st.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
		
	}
	public void find(String id){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			//获取连接对象
			conn=JdbcUtils.getConnection();
			String sql="select * from Customer where id=?";
			st=conn.prepareStatement(sql);
			st.setString(1, id);
			rs=st.executeQuery();
			while(rs.next()){
				Customer c=new Customer();
				c.setId(rs.getString("id"));
				c.setName(rs.getString("name"));
				c.setGender(rs.getString("gender"));
				c.setBirthday(rs.getDate("birthday"));
				c.setCellphone(rs.getString("cellphone"));
				c.setEmail(rs.getString("email"));
				c.setPreference(rs.getString("preference"));
				c.setType(rs.getString("type"));
				c.setDescription(rs.getString("description"));
			}
			
		} catch (SQLException e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
		
		
	}
	public List<Customer> findAll(){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			//获取连接对象
			conn=JdbcUtils.getConnection();
			String sql="select * from Customer";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			List list=new ArrayList();
			while(rs.next()){
				Customer c=new Customer();
				c.setId(rs.getString("id"));
				c.setName(rs.getString("name"));
				c.setGender(rs.getString("gender"));
				c.setBirthday(rs.getDate("birthday"));
				c.setCellphone(rs.getString("cellphone"));
				c.setEmail(rs.getString("email"));
				c.setPreference(rs.getString("preference"));
				c.setType(rs.getString("type"));
				c.setDescription(rs.getString("description"));
				list.add(c);
			}
			return list.size()>0?list:null;
		} catch (SQLException e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
		
	}

}
