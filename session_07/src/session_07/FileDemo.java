package session_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
	
	public static void main(String[] args) {
		
		try(
			FileInputStream fis =
					new FileInputStream("d://mno.txt");)
		{
			int i = 0;
			while((i=fis.read()) != -1)
			{
				System.out.print((char)i);
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
