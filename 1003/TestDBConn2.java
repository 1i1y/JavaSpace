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
        //************** ���ʸ�� ******************************
        //******************************************************
        
        //stmt.executeUpdate("Insert into ���u��ƪ� values(18,'���p��','�k','�s�˥��M�ؤj��',20000,2)");
        //stmt.executeUpdate("Delete From ���u��ƪ� Where ���u�s��=18");
        
        //******************************************************
        
        
        //******************************************************
        //************** �d�߸�� ******************************
        //******************************************************
        
        //�smysql
        ResultSet rs = stmt.executeQuery("Select * From ���u��ƪ�");
        System.out.println("���u�s��\t�m�W\t�a�}");
        
        //�]���u��ƪ����
        while(rs.next()){
            System.out.print(rs.getInt("���u�s��")+"\t\t");
            System.out.print(rs.getString("�m�W")+"\t");
            System.out.println(rs.getString("�a�}"));
        }   
        //******************************************************

        db.closeConnection(conn);
    }
}