package com.sun;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class CoderUtil {
	
	public static byte[] serialize(Object obj) {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		byte[] bytes = null;
		bos = new ByteArrayOutputStream();
		try {
			oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);
			bytes=bos.toByteArray();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			close(oos);
			close(bos);
		}
		return bytes;
	}
	
	public static Object deserialize(byte[] bytes) {
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		bis = new ByteArrayInputStream(bytes);
		try {
			ois = new ObjectInputStream(bis);
			obj = ois.readObject();		
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			close(ois);
			close(bis);
		}
		return obj;
	}
	
	private static void close(Closeable closeable) {
		if(null != closeable) {
			try {
				closeable.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
