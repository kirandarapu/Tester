package com.Fundraiser.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	 public ReadConfig(){

		File src=new File("./Configuration/config.properties");

		try{
			//opening the file in input mode
			FileInputStream fis=new FileInputStream(src);
			//initializing the pro object
			pro=new Properties();
			//which will load  the entire file by using the load method
			pro.load(fis);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public String getApplicationURL(){
		String url=pro.getProperty("baseURL");
		return url;
	}

	public String getusermail(){
		String umail=pro.getProperty("usermail");
		return umail;
	}
	public String getPassword(){
		String upassword=pro.getProperty("password");
		return upassword;
	}
	public String getChromePath(){
		String cpath=pro.getProperty("chromepath");
		return cpath;
	}
	
	public String getFirefoxPath(){
		String fpath=pro.getProperty("firefoxpath");
		return fpath;
	}
}
