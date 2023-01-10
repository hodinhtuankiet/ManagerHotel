package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.thiSinh;

public class DAO {
	private Connection conn;
	public  DAO() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String url = "jdbc:sqlserver://localhost:1433;database=Doan;encrypt=true;trustServerCertificate=true;";
			String user = "sa";
			String password = "123456";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Get a connection");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public boolean addStudent(thiSinh s) {
		String sql = "INSERT INTO Table_1(maThiSinh,tenThiSinh,queQuan,ngaySinh,gioiTinh,diemMon1,diemMon2,diemMon3)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getMaThiSinh()+"");
			ps.setString(2, s.getTenThiSinh());
			ps.setString(3, s.getQueQuan()+"");
			ps.setDate(4, new Date(s.getNgaySinh().getTime()));
			ps.setString(5, s.isGioiTinh()+"");
			ps.setString(6, s.getDiemMon1()+"");
			ps.setString(7, s.getDiemMon2()+"");
			ps.setString(8, s.getDiemMon3()+"");
			
			return ps.executeUpdate()>0; 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public ArrayList<thiSinh> getListStudent(){
		ArrayList<thiSinh> list = new ArrayList<thiSinh>();
		String sql = "SELECT * FROM Table_1";
		try {
			PreparedStatement ps2 = conn.prepareStatement(sql);
			ResultSet rs = ps2.executeQuery();
			while(rs.next()) {
				thiSinh ts = new thiSinh();
				ts.setMaThiSinh(rs.getInt("maThiSinh"));
				ts.setTenThiSinh(rs.getString("tenThiSinh"));
//				ts.setQueQuan( rs.getString("queQuan"));
				ts.setNgaySinh(rs.getDate("ngaySinh"));
				ts.setGioiTinh(rs.getBoolean("gioiTinh"));
				ts.setDiemMon1(rs.getFloat("diemMon1"));
				ts.setDiemMon2(rs.getFloat("diemMon2"));
				ts.setDiemMon3(rs.getFloat("diemMon3"));
				
				list.add(ts);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		DAO connect = new DAO();
		System.out.println(connect.toString());
	}
}

