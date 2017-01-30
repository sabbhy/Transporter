package pack;
import java.rmi.Naming;
public class StartFileServer {
	public static void main(String args[]){
		try{
			System.setProperty("java.rmi.server.hostname","192.168.43.242");
			java.rmi.registry.LocateRegistry.createRegistry(5556);
			FileServer fs=new FileServer();
			fs.setFile("C:\\Users\\sabbh\\workspace\\FileServer\\song1.mp3");
			Naming.bind("rmi://192.168.43.242:5556/files", fs);
			System.out.println("File Server is ready!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
