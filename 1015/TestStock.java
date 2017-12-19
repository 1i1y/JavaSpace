//引入厲害的package
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
    public static void main (String args[]) throws Exception {               //throws 例外狀況通通不處理
		Map<String,String>  map = new HashMap<String,String>();              //.用Map收資料，強制型態
		String[] stocks = {"2314","2316","2317","1101","1102","1103","2321","2359","2323","2324",};
		String[] price = new String[10];
		
		for(String sN :stocks) {
			URL url = new URL ("https://tw.stock.yahoo.com/q/q?s=" + sN );       //URL 查詢上述10隻股價
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();    //資料格式可能送不回來，強制(HttpURLConnection)的格式
			BufferedReader br = new BufferedReader
			(new InputStreamReader(conn.getInputStream(),"UTF-8"));              //UTF-8怕文字編碼問題
			
			String str = "";
			StringBuffer sb = new StringBuffer();
			while((str=br.readLine()) != null){                                  
				sb.append(str);                                                  //html全抓
				if(str.contains("</b></td>"))                                    //抓到代號後跳過
					break;
			}    
		}
		
        int x = sb.indexOf("nowrap><b>")+ "nowrap><b>".length();             //抓代號，indexOf會從左邊抓起，所以再加上那串文字的長度
        int y = sb.indexOf("</b></td>");
		
		//System.out.println(stockNumber+":"+sb.substring(x,y));             //測試看抓的狀況
		map.put(sN, sb.substring(x,y));                                      //抓代號放 Map，substring x,y 之間
        br.close();
        conn.disconnect();                                                   //有openConnection();就要關disconnect();
		
		price[i]= stockNumber+","+sb.substring(x,y);
		i++;
    }
	return price;
}


/*
BufferedReader 就像串串燒一般，一行一行的讀
BufferedWriter                 一行一行的寫

Reader Writer            -> 文字優
InputStream OutputStram  -> 可圖片
*/