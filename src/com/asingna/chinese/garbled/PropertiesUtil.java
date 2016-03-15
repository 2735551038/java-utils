package com.asingna.chinese.garbled;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class PropertiesUtil {
    /**
     * util class
     */
    private PropertiesUtil() {}
    
    /**
     * 指定编码获取properties文件中的属性值（解决中文乱码问题）
     * 默认原来的编码是ISO8859-1 转换成传入的编码格式
     * @param properties   java.util.Properties
     * @param key              属性key
    * @return
     */
    public static String getProperty(Properties properties, String key, String encoding) throws UnsupportedEncodingException {
        //param check
        if (properties == null)
            return null;
        
        //如果此时value是中文，则应该是乱码
        String value = properties.getProperty(key);
        if (value == null)
            return null;
        
        //编码转换，从ISO8859-1转向指定编码
        value = new String(value.getBytes("ISO-8859-1"), encoding);
        return value;
    }
}