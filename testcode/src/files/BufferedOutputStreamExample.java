package files;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to javaTpoint.";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");

		  try{    
	            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }
		  }
	            catch (Exception e) {
			System.out.println(e);
		}
	}

}
