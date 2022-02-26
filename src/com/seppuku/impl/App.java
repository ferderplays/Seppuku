package com.seppuku.impl;

import java.io.File;
import java.io.IOException;

public class App {
	
	public static String osname = System.getProperty("os.name");
	public static String user_home = System.getProperty("user.home");
	public static String appdata = System.getenv("APPDATA");
	public static String roamingappdata = appdata + "/Roaming/";
	public static String config = user_home + "/.config";
	public static String library = user_home + "/Library/";
	public static File appsource_win = new File(roamingappdata + "/q/");
	public static File storage_win = new File(roamingappdata + "/q/storage/");
	public static File fdb_win = new File(roamingappdata + "/Roaming/q/fdb/db/");
	public static File appsource_linux = new File(config + "/q/");
	public static File storage_linux = new File(config + "/q/storage/");
	public static File fdb_linux = new File(config + "/q/storage/fdb/db/");
	public static File appsource_mac = new File(library + "/q/");
	public static File storage_mac = new File(library + "/q/storage/");
	public static File fdb_mac = new File(library + "/q/storage/fdb/db");

	public static void intialize() {
		try {
			if (osname.toLowerCase().contains("win")) {
				if (!storage_win.exists()) storage_win.createNewFile();
				if (!appsource_win.exists()) appsource_win.createNewFile();
				if (!fdb_win.exists()) fdb_win.createNewFile();
			} else if (osname.toLowerCase().contains("mac")) {
				if (!storage_mac.exists()) storage_mac.createNewFile();
				if (!appsource_mac.exists()) appsource_mac.createNewFile();
				if (!fdb_mac.exists()) fdb_mac.createNewFile();
			} else if (osname.toLowerCase().contains("linux")) {
				if (!storage_linux.exists()) storage_linux.createNewFile();
				if (!appsource_linux.exists()) appsource_linux.createNewFile();
				if (!fdb_linux.exists()) fdb_linux.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
