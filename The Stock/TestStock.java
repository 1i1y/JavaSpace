import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStock{
    public static void main(String args[]) throws Exception{
    	Map<String,String>  map = new HashMap<String,String>();
    	String[] stocks = {"2314","2316","2317","1101","1102","1103","2321","2359","2323","2324",};
    	for(String stockNumber:stocks) {
	        URL url = new URL("https://tw.stock.yahoo.com/q/q?s="+stockNumber);
	        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	        BufferedReader br = new BufferedReader(new InputStreamReader
	                                    (conn.getInputStream(),"UTF-8"));
	        StringBuffer sb = new StringBuffer();
	        String str="";
	        while( (str=br.readLine()) != null){
	            sb.append(str);
	            if(str.contains("</b></td>"))
	                break;
	        }
	        int x = sb.indexOf("nowrap><b>")+ "nowrap><b>".length();
	        int y = sb.indexOf("</b></td>");
	        System.out.println(stockNumber+":"+sb.substring(x,y));
	        map.put(stockNumber, sb.substring(x,y));
	        br.close();
	        conn.disconnect();   
    	}
    	DBSource db = new DBSourceImplement();
        Connection conn = db.getConnection();
        String table = "stocks";
        db.creatTable(conn,table);
        db.modifyTable(conn, table, map);
        db.closeConnection(conn);
    }   
    
}