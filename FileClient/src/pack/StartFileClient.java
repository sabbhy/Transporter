package pack;
import java.rmi.Naming;
import java.util.*;
public class StartFileClient {
	public static void main(String[] args){
		try{
			FileClient c=new FileClient("imed");
			FileServerInt server=(FileServerInt)Naming.lookup("rmi://192.168.43.242:5556/files");
			server.login(c);
			System.out.println("Transfer Completed.....You're welcome.");
			Scanner sc=new Scanner(System.in);
			while(true){
				String line=sc.nextLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
