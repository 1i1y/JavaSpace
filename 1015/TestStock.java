//�ޤJ�F�`��package
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
    public static void main (String args[]) throws Exception {               //throws �ҥ~���p�q�q���B�z
		Map<String,String>  map = new HashMap<String,String>();              //.��Map����ơA�j��A
		String[] stocks = {"2314","2316","2317","1101","1102","1103","2321","2359","2323","2324",};
		String[] price = new String[10];
		
		for(String sN :stocks) {
			URL url = new URL ("https://tw.stock.yahoo.com/q/q?s=" + sN );       //URL �d�ߤW�z10���ѻ�
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();    //��Ʈ榡�i��e���^�ӡA�j��(HttpURLConnection)���榡
			BufferedReader br = new BufferedReader
			(new InputStreamReader(conn.getInputStream(),"UTF-8"));              //UTF-8�Ȥ�r�s�X���D
			
			String str = "";
			StringBuffer sb = new StringBuffer();
			while((str=br.readLine()) != null){                                  
				sb.append(str);                                                  //html����
				if(str.contains("</b></td>"))                                    //���N������L
					break;
			}    
		}
		
        int x = sb.indexOf("nowrap><b>")+ "nowrap><b>".length();             //��N���AindexOf�|�q�����_�A�ҥH�A�[�W�����r������
        int y = sb.indexOf("</b></td>");
		
		//System.out.println(stockNumber+":"+sb.substring(x,y));             //���լݧ쪺���p
		map.put(sN, sb.substring(x,y));                                      //��N���� Map�Asubstring x,y ����
        br.close();
        conn.disconnect();                                                   //��openConnection();�N�n��disconnect();
		
		price[i]= stockNumber+","+sb.substring(x,y);
		i++;
    }
	return price;
}


/*
BufferedReader �N�����N�@��A�@��@�檺Ū
BufferedWriter                 �@��@�檺�g

Reader Writer            -> ��r�u
InputStream OutputStram  -> �i�Ϥ�
*/