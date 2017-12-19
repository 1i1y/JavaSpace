/*
使用 add 與 del 放入、刪除4個格子的資料
離開 需兩次　quit


.add     增加
.remove  刪減

wait 搭 notify

*/

import java.util.*;
public class Test implements Runnable
{
	public static void main(String args[]) throws Exception
	{
		Test r = new Test();

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
	Scanner scan = new Scanner(System.in);          //取螢幕資料，準備格子
	ArrayList stack = new ArrayList();              
	public synchronized void run()                  //synchronized : 同步物件資料
	{
		while(true)
		{
			notify();                               //喚醒
			System.out.print(Thread.currentThread().getName()+" Input : ");
			String cmd = scan.nextLine();           //執行緒的input存入cmd
			//System.out.println(Thread.currentThread().getName()+" Value : " + cmd);
			
			if(cmd.contains("add") && stack.size() < 4 && stack.size() >= 0)
			{
				stack.add(cmd.substring(4));        //寫"add",cmd可以放值，格子只有4個
				System.out.println(stack);
			}
			else if(cmd.contains("del") && stack.size() <= 4 && stack.size() > 0)
			{
				stack.remove(cmd.substring(4));     //寫"del",cmd可以刪值，格子只有4個
				System.out.println(stack);
			}
			
			if(stack.size() >= 4 || stack.size() <= 0)
			{
				try{wait();}                        //有wait休息才有辦法讓另一隻執行緒從notify 那裡開始執行
				catch(Exception e){}
			}
			
			if(cmd.equals("quit"))                  //quit 兩次是因為有兩隻執行緒
			{
				notify();
				break;
			}
			
		}
	}
}