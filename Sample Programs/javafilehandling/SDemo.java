package javafilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Task implements Serializable{
	int num;
	String name;
	public Task(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	
}

public class SDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task tobj = new Task(101, "Alex");
		String filename = "my_file";
		try {
		FileOutputStream f = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(tobj);
		out.close();
		System.out.println("Object has been Serialized");
	}catch(IOException ex) {
		ex.printStackTrace();
	}
		Task tobj1 = null;
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fis);
			tobj1 = (Task) in.readObject();
			fis.close();
			in.close();
			System.out.println("Object has been De-Serialized");
			System.out.println("num= "+tobj1.num);
			System.out.println("name= "+tobj1.name);
		}catch(IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
}
}