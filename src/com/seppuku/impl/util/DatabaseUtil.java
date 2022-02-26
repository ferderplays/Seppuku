package com.seppuku.impl.util;

import java.io.File;
import java.util.Random;
import com.seppuku.impl.App;

public class DatabaseUtil {
	
	public static File tokenfile_win = new File(App.fdb_win + "01.fdb");
	public static File tokenfile_linux = new File(App.fdb_linux + "010.fdb");
	public static File tokenfile_mac = new File(App.fdb_mac + "0100.fdb");
	
	public static void unitialize() {
		
		if (!App.osname.toLowerCase().contains("win")) {
			Random rand = new Random();
			Integer unencrypted = rand.nextInt(1000000000);
			char[] tokens = unencrypted.toString().toCharArray();
			
			for (char c : tokens) {
				c += rand.nextInt(100);
				StorageUtil.write(tokenfile_win, c);
			}
		} else if (!App.osname.toLowerCase().contains("linux")) {
			Random rand = new Random();
			Integer unencrypted = rand.nextInt(1000000000);
			char[] tokens = unencrypted.toString().toCharArray();
			
			for (char c : tokens) {
				c += rand.nextInt(100);
				StorageUtil.write(tokenfile_linux, c);
			}
		} else if (!App.osname.contains("mac")) {
			Random rand = new Random();
			Integer unencrypted = rand.nextInt(1000000000);
			char[] tokens = unencrypted.toString().toCharArray();
			
			for (char c : tokens) {
				c += rand.nextInt(100);
				StorageUtil.write(tokenfile_mac, c);
			}
		}
	}
}
