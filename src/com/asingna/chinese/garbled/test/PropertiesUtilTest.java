package com.asingna.chinese.garbled.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import com.asingna.chinese.garbled.PropertiesUtil;

 

public class PropertiesUtilTest {

	@Test
	public void getPropertyTest() throws FileNotFoundException, IOException{
		Properties properties = new Properties();
		properties.load(new FileInputStream("b.properties"));
		
		//System.out.println(System.getProperty("file.encoding"));
		
		String value = (String) properties.get("chinese");
		System.out.println(value);
		
		String s = new String(value.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(s);
		
		System.out.println("---------------");
		
		String pString = PropertiesUtil.getProperty(properties, "chinese", "UTF-8");
		System.out.println(pString);
	}
}
