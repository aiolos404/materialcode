package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Main1 {
	public static void main(String aiolos[]){
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("out.dat"));
			os.writeObject(new Entry("Save me",1));
			
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("out.dat"));
			Object o = is.readObject();
			
			Entry e = (Entry) o;
			System.out.println("Entry restored from file is: " + e.toString());
		}catch (Exception e){e.printStackTrace();}
	}
}

class Entry implements Serializable{
	private static final long serialVersionUID = 2008L;
	private String message = "";
	private int messageNumber = 0;
	
	public Entry(String message, int messageNumber){
		this.message = message;
		this.messageNumber = messageNumber;
	}
	
	public String getMessage(){
		return message;
	}
	public int getMessgaeNumber(){
		return messageNumber;
	}
	public String toString(){
		return message + "" + Integer.toString(messageNumber);
	}
}
