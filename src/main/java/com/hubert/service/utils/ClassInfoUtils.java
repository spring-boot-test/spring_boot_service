package com.hubert.service.utils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取类对象 属性类型、属性名、属性值
 * @author Zhengxiaobin
 *
 */
public class ClassInfoUtils {
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(ClassInfoUtils.class);
	   /** 
	    * 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list 
	    * */  
//	   public static List getFiledsInfo(Object o){  
//	    Field[] fields=o.getClass().getDeclaredFields();  
//	        String[] fieldNames=new String[fields.length];  
//	        List list = new ArrayList();  
//	        Map<String,Object> infoMap=null;  
//	    for(int i=0;i<fields.length;i++){  
//	        infoMap = new HashMap();  
//	        infoMap.put("type", fields[i].getType());  
//	        infoMap.put("name", fields[i].getName());  
//	        infoMap.put("value", getFieldValueByName(fields[i].getName(), o));  
//	        list.add(infoMap);  
//	    }  
//	    return list;  
//	   } 
	   
	   /** 
	    * 根据属性名获取属性值 
	    * */  
	      private static Object getFieldValueByName(String fieldName, Object o) {  
	          try {    
	              String firstLetter = fieldName.substring(0, 1).toUpperCase();    
	              String getter = "get" + firstLetter + fieldName.substring(1);    
	              Method method = o.getClass().getMethod(getter, new Class[] {});    
	              Object value = method.invoke(o, new Object[] {});    
	              return value;    
	          } catch (Exception e) {    
	        	  //LOGGER.error(e.getMessage(),e);    
	              return null;    
	          }    
	      }   
	   
}
