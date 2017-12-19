/*
用到
DBSource           : 設定連線資料庫的功能 建構子
jdbc.properties    : 連線資料庫，內寫MySQL的 位址、庫名、帳號密碼

*/

import java.io.*;                                //引 相關的
import java.sql.*;
import java.util.*;

public class SimpleDBSource implements DBSource{ //用 DBSource的規則
    Properties props;                            //叫 等回會用的
    String url;
    String user;
    String passwd;
    
    public SimpleDBSource() throws IOException,ClassNotFoundException{
        this("jdbc.properties");                 //叫 jdbc.properties，丟例外
    }



///////////////////////////////////////////////////////////////////////////////////////
    

    
    
    
    public SimpleDBSource(String config) throws IOException,ClassNotFoundException{ 
        props = new Properties();
        props.load(new FileInputStream(config));  //config : Properties的類別來讀取設定檔
        url = props.getProperty("db.url");
        user = props.getProperty("db.user");
        passwd = props.getProperty("db.passwd");
        
        Class.forName(props.getProperty("db.driver"));
    }
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,passwd);
    }
    public void closeConnection(Connection conn) throws SQLException{
        conn.close();
    }
    
}