//引入厲害的package
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestStock{
    public static void main (String args[]) throws Exception {               //throws 例外狀況通通不處理
        URL url = new URL ("https://tw.stock.yahoo.com/q/q?s=" + args[0]);   //URL 這裡可以直接輸入股票代號，查詢股價
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();    //資料格式可能送不回來，強制(HttpURLConnection)的格式
        BufferedReader br = new BufferedReader 
        (new InputStreamReader(conn.getInputStream(),"UTF-8"));              //怕文字編碼問題
        
        String str = "";
        StringBuffer sb = new StringBuffer();
        while((str=br.readLine()) != null){                                  
            sb.append(str);                                                  //html全抓
            if(str.contains("</b></td>"))                                    //抓到代號後跳過
                break;
        }    
        int x = sb.indexOf("nowrap><b>")+ "nowrap><b>".length();             //抓代號，indexOf會從左邊抓起，所以再加上那串文字的長度
        int y = sb.indexOf("</b></td>");
        System.out.println(sb.substring(x,y));                               //抓代號，substring x,y 之間
        br.close();
        conn.disconnect();                                                   //有openConnection();就要關disconnect();
    }
}


/*
BufferedReader 就像串串燒一般，一行一行的讀
BufferedWriter                 一行一行的寫

Reader Writer            -> 文字優 io4
InputStream OutputStram  -> 可圖片 io3

*/