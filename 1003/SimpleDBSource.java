/*
�Ψ�
DBSource           : �]�w�s�u��Ʈw���\�� �غc�l
jdbc.properties    : �s�u��Ʈw�A���gMySQL�� ��}�B�w�W�B�b���K�X

*/

import java.io.*;                                //�� ������
import java.sql.*;
import java.util.*;

public class SimpleDBSource implements DBSource{ //�� DBSource���W�h
    Properties props;                            //�s ���^�|�Ϊ�
    String url;
    String user;
    String passwd;
    
    public SimpleDBSource() throws IOException,ClassNotFoundException{
        this("jdbc.properties");                 //�s jdbc.properties�A��ҥ~
    }



///////////////////////////////////////////////////////////////////////////////////////
    

    
    
    
    public SimpleDBSource(String config) throws IOException,ClassNotFoundException{ 
        props = new Properties();
        props.load(new FileInputStream(config));  //config : Properties�����O��Ū���]�w��
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