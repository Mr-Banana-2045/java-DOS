import java.net.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception
	{
		System.out.printf("Enter URL > ");
		Scanner input = new Scanner(System.in);
		String inip = input.next();
		int sum = 0;
		for(int i = 0;i <= 10;i --){
		URL url = new URL(inip);
		InetAddress address = InetAddress.getByName(url.getHost());
		String temp = address.toString();
		String IP = temp.substring(temp.indexOf("/")+1,temp.length());
		System.out.printf("IP :-"+IP+" packet :"+i+"\n");
		}
		}
}￼Enter
