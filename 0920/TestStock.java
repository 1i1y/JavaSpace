//�ޤJ�F�`��package
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestStock{
    public static void main (String args[]) throws Exception {               //throws �ҥ~���p�q�q���B�z
        URL url = new URL ("https://tw.stock.yahoo.com/q/q?s=" + args[0]);   //URL �o�̥i�H������J�Ѳ��N���A�d�ߪѻ�
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();    //��Ʈ榡�i��e���^�ӡA�j��(HttpURLConnection)���榡
        BufferedReader br = new BufferedReader 
        (new InputStreamReader(conn.getInputStream(),"UTF-8"));              //�Ȥ�r�s�X���D
        
        String str = "";
        StringBuffer sb = new StringBuffer();
        while((str=br.readLine()) != null){                                  
            sb.append(str);                                                  //html����
            if(str.contains("</b></td>"))                                    //���N������L
                break;
        }    
        int x = sb.indexOf("nowrap><b>")+ "nowrap><b>".length();             //��N���AindexOf�|�q�����_�A�ҥH�A�[�W�����r������
        int y = sb.indexOf("</b></td>");
        System.out.println(sb.substring(x,y));                               //��N���Asubstring x,y ����
        br.close();
        conn.disconnect();                                                   //��openConnection();�N�n��disconnect();
    }
}


/*
BufferedReader �N�����N�@��A�@��@�檺Ū
BufferedWriter                 �@��@�檺�g

Reader Writer            -> ��r�u io4
InputStream OutputStram  -> �i�Ϥ� io3

*/