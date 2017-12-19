//給SimpleDBSource 、TestDBConn 用
//設定連線資料庫的功能 建構子

import java.sql.Connection;             //引 資料庫連線
import java.sql.SQLException;           //引 throws 會用到的 錯誤

public interface DBSource{              //用 interface
    public Connection getConnection() throws SQLException;             //連線誰，丟例外
    public void closeConnection(Connection conn) throws SQLException;  //關連線誰，丟例外
}
