import java.net.*;
import java.io.*;
import java.util.Scanner;

class AdditionServerX
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port : 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrived and connected Successfully");
        DataInputStream diobj = new DataInputStream(sobj.getInputStream()); //ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());  //mouth

        int no = diobj.readInt();
        System.out.println("Data recieved from Client is:"+no);
        no++;
        diobj.writeInt(no);

    }    
}
