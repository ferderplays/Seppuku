package com.seppuku.impl.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.seppuku.impl.App;

public class StorageUtil {
	public static void write(File file, char c) {
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(c);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
