import java.io.*;
import java.util.*;
import javax.swing.*;

class CaesarCipher
{
	public  static String displayMessageBox()
	{
		String response = JOptionPane.showInputDialog(null, 
                "Enter the string to be encoded", "Enter String", 3);
        return response;
	}
	public static void displayEncryptedString(String output)
	{
		JOptionPane.showMessageDialog(null,output);
	}
	public static void main(String [] args)
	{
	     String input=displayMessageBox();
		 Random rndm_method = new Random();
		 int shift=rndm_method.nextInt(26);
		 char[] myNameChars = input.toCharArray();
		 for(int i=0;i<input.length();i++)
		 {
		 	myNameChars[i] = (char)((myNameChars[i] + shift - (int)'a') % 26 + (int)'a');
		 }
		 String output = String.valueOf(myNameChars);
		 displayEncryptedString(output);
		 	     
	}
}

