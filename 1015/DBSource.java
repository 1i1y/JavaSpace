//��SimpleDBSource �BTestDBConn ��
//�]�w�s�u��Ʈw���\�� �غc�l

import java.sql.Connection;             //�� ��Ʈw�s�u
import java.sql.SQLException;           //�� throws �|�Ψ쪺 ���~

public interface DBSource{              //�� interface
    public Connection getConnection() throws SQLException;             //�s�u�֡A��ҥ~
    public void closeConnection(Connection conn) throws SQLException;  //���s�u�֡A��ҥ~
}
