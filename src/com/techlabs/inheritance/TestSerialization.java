package com.techlabs.inheritance;
import java.io.*;

public class TestSerialization {

	public static void main(String[] args) {
		SerializationClass serializationObj[] = new SerializationClass[3];
		for(int i = 0; i<3; i++ ) {
			serializationObj[i] = new SerializationClass("Object", i);
		}
		try {
			FileOutputStream fileOut = new FileOutputStream("objArr.txt");
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOut);
			outputStream.writeObject(serializationObj);
			outputStream.close();
            fileOut.close();
            System.out.println("Array of objects serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fileIn = new FileInputStream("objArr.ser");
            ObjectInputStream fileInput = new ObjectInputStream(fileIn);
            SerializationClass[] deserializedObjects = (SerializationClass[]) fileInput.readObject();
            fileInput.close();
            fileIn.close();
            System.out.println("Array of objects deserialized successfully.");

            for (SerializationClass obj : deserializedObjects) {
                System.out.println(obj);
            }
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
