package com.asingna.chinese.garbled;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class PropertiesUtil {
    /**
     * util class
     */
    private PropertiesUtil() {}
    
    /**
     * ָ�������ȡproperties�ļ��е�����ֵ����������������⣩
     * Ĭ��ԭ���ı�����ISO8859-1 ת���ɴ���ı����ʽ
     * @param properties   java.util.Properties
     * @param key              ����key
    * @return
     */
    public static String getProperty(Properties properties, String key, String encoding) throws UnsupportedEncodingException {
        //param check
        if (properties == null)
            return null;
        
        //�����ʱvalue�����ģ���Ӧ��������
        String value = properties.getProperty(key);
        if (value == null)
            return null;
        
        //����ת������ISO8859-1ת��ָ������
        value = new String(value.getBytes("ISO-8859-1"), encoding);
        return value;
    }
}