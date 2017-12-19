
import java.sql.*;
public class SQLinput{                                            //�\��R�W
	static DBSource     db   ;
    static Connection   conn ;
	static Statement    stmt ;
	static int Nowconn= 0    ;
	
	public SQLinput() throws IOException,ClassNotFoundException{  //�i��Ʈw����T
        this("jdbc.properties");
    }
	
	public void CreateConnection() throws Exception{              //�W�ٳs��
		db = new SimpleDBSource();
		conn = db.getConnection();
		stmt = conn.createStatement();	
		Nowconn=1;
	}
	
	public void CreateTable (String TableName) throws Exception{
		if (Nowconn == 0) CreateConnection(); 
		stmt.executeUpdate(                                       //�o��append �PexecuteUpdate���t�O�O?
		"Create Table " + TableName +
		"(number VARCHAR(6),price VARCHAR(12),PRIMARY KEY(number)) "+
		"ENGINE=InnoDB DEFAULT CHARSET=utf8 " );
	}
	public void Insert (String TableName, String Value)throws Exception{
		if (Nowconn == 0) CreateConnection();	
		stmt.execute( 
		"Insert into "+ TableName +
		"values (" + Value + ")");
	}
	public void Search (String TableName, String Value)throws Exception{
		stmt.execute( 
		"Insert into "+ TableName +
		"values (" + Value + ")");
	}
}

/*

public     ������
�j                                     class
| public     ������                   |  V
| protected  ���~�����Y�N���Ϊ���     |
| default    �P�@��package            |  V
| private    �P�@��class              |
�p
   
interface �̤p�����O
�j  class              
|   abstract class  �����O
�p  interface 

static �R�A
void   �L��^��

*/