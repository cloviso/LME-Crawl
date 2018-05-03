package com.maikegroup.delight.data.repository.data.user.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.maikegroup.delight.data.repository.data.cuPrice.model.CuPrice;
import com.maikegroup.delight.dlservice.common.util.IdGenerator;

public class CuPriceDao {

	private Connection conn = null;
	private Statement stmt = null;

	public CuPriceDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/webmagic?user=root&password=root";
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int add(List<CuPrice> cuPriceModelList) {
		try {
			String sql = "INSERT INTO `tb_cu_price` (`t_id`, `title`, `dateStr`, `priceRange`, `avgPrice`, `rollPrice`, `unit`) VALUES (?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i = 1;i<cuPriceModelList.size();i++){
			ps.setString(1, cuPriceModelList.get(i).gettId());	
			ps.setString(2, cuPriceModelList.get(i).getTitle());
			ps.setString(3, cuPriceModelList.get(i).getDatestr());
			ps.setString(4, cuPriceModelList.get(i).getPricerange());
			ps.setString(5, cuPriceModelList.get(i).getAvgprice());
			ps.setString(6, cuPriceModelList.get(i).getRollprice());
			ps.setString(7, cuPriceModelList.get(i).getUnit());
			ps.executeUpdate();
			}
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return -1;
	}
public static void closeConn(ResultSet rs,PreparedStatement pstmt,Connection conn){

        

        try {

            if (rs!=null) {//如果返回的结果集对象不能为空,就关闭连接

                rs.close();

            }

        } catch (Exception e) {

            

            e.printStackTrace();

        }

        

        try {

            if (pstmt!=null) {

                pstmt.close();//关闭预编译对象

            }

        } catch (Exception e) {

            

            e.printStackTrace();

        }

        

        try {

            

            if (conn!=null) {

                conn.close();//关闭结果集对象

            }

            

        } catch (Exception e) {

            

            e.printStackTrace();

        }

    }


}
