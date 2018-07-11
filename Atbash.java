//Atbash Cipher


import java.io.*;
import java.util.*;
import javax.swing.*;

class Atbash
{
	private  static String displayMessageBox()
	{
		String response = JOptionPane.showInputDialog(null, 
                "Enter a string", "Atbash Cipher", 3);
        return response;
	}
	private static void displayResultMessage(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	
	private static String Encrypt(String inputString)
	{
		String ans="";
		for(int i=0;i<inputString.length();i++)
		{
			char charAtIndex=inputString.charAt(i);
			int diff=charAtIndex-(int) ('a');
			int newdiffer =25-diff;
			char toBeInserted= (char)('a'+newdiffer);
			ans+=toBeInserted;
			
		}
		return ans;
	} 
	public static void main(String [] args)
	{
		String inputString=displayMessageBox();
		String encryptedString=Encrypt(inputString);
		displayResultMessage(encryptedString);
		
	}
}