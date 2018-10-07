import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.Runtime;
public class Webserver {
     private static ServerSocket ss;
     public static void main(String[] args) throws IOException {
        int port =  Integer.parseInt(args[0]);
        ss=new ServerSocket(port);
        while(true) {
            Socket client = ss.accept();
            SocketInputStream sis = client.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(sis));
            String request = br.readLine();
            String[] requestParam = request.split(" ");
            String path = requestParam[1];
            PrintWriter out = new PrintWriter(client.getOutputStream(), true); 
            File file = new File(path);
            if( !file.exist()){
              out.write("HTTP 404");
            }
            FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while((line = bfr.readLine()) != null){
              out.write(line);
            }
            bfr.close();
            br.close();
            out.close();   
        }
     }
}
