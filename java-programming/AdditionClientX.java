import java.net.*;
import java.io.*;
import java.util.Scanner;

class AdditionClientX
{
    public static void main(String[] args) throws Exception
    {
       
      
        Socket sobj = new Socket("localhost",2100);

        DataInputStream diobj = new DataInputStream(sobj.getInputStream()); //ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());  //mouth

        doobj.writeInt(11);


        int ret = diobj.readInt();
        System.out.println("data from server is : "+ret);

    }    
}
