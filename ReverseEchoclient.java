import java.io.*;
import java.io.PrintStream;
import java.net.*;
import java.security.MessageDigest;
public class ReverseEchoclient{
    public static void main(String[] args){
        try{
        Socket stk=new Socket("127.0.0.1",2000);
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));//resevoir
        PrintStream ps=new PrintStream(stk.getOutputStream());//send
        String msg;
        String chain1="bonjour";
        String chain2="jour";
        do
        {   
          ps.print(chain1);
          msg=br.readLine();
          System.out.println("La Réponse du serveur: "+msg);
            
        }while(!msg.equals("end"));
        stk.close();}catch(Exception pl){System.out.println(pl.getMessage());}
    }
}
