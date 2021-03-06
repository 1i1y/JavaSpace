/*
java -cp .;C:\JavaSpace\* TestDBConn
java -cp .;* TestDBConn
*/

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.SQLException;
//import java.sql.*;
//import java.io.*;

public class TestDBConn2{
    public static void main(String args[]) throws IOException, SQLException,ClassNotFoundException{
        
        DBSource db = new SimpleDBSource();
        Connection conn = db.getConnection();
        Statement stmt = conn.createStatement();
        
        //******************************************************
        //************** 異動資料 ******************************
        //******************************************************
        
        //stmt.executeUpdate("Insert into 員工資料表 values(18,'王小明','男','新竹市清華大學',20000,2)");
        //stmt.executeUpdate("Delete From 員工資料表 Where 員工編號=18");
        
        //******************************************************
        
        
        //******************************************************
        //************** 查詢資料 ******************************
        //******************************************************
        
        //叫mysql
        ResultSet rs = stmt.executeQuery("Select * From 員工資料表");
        System.out.println("員工編號\t姓名\t地址");
        
        //跑員工資料表資料
        while(rs.next()){
            System.out.print(rs.getInt("員工編號")+"\t\t");
            System.out.print(rs.getString("姓名")+"\t");
            System.out.println(rs.getString("地址"));
        }   
        //******************************************************

        db.closeConnection(conn);
    }
}
