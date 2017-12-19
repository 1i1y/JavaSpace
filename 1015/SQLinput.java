
import java.sql.*;
public class SQLinput{                                            //功能命名
	static DBSource     db   ;
    static Connection   conn ;
	static Statement    stmt ;
	static int Nowconn= 0    ;
	
	public SQLinput() throws IOException,ClassNotFoundException{  //進資料庫的資訊
        this("jdbc.properties");
    }
	
	public void CreateConnection() throws Exception{              //名稱連結
		db = new SimpleDBSource();
		conn = db.getConnection();
		stmt = conn.createStatement();	
		Nowconn=1;
	}
	
	public void CreateTable (String TableName) throws Exception{
		if (Nowconn == 0) CreateConnection(); 
		stmt.executeUpdate(                                       //這裡append 與executeUpdate的差別是?
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

public     不限制
大                                     class
| public     不限制                   |  V
| protected  有繼承關係就取用的到     |
| default    同一個package            |  V
| private    同一個class              |
小
   
interface 最小的類別
大  class              
|   abstract class  副類別
小  interface 

static 靜態
void   無返回值

*/