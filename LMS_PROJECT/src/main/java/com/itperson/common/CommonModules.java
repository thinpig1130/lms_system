package com.itperson.common;

import com.itperson.dao.Dao;

public class CommonModules {
	public static String nextCode(String code, Dao dao) {
		String maxCode = dao.maxCode(code);
		String returnCode;
		
		int len;
		if (code.length() < 7) {
			len = 2; 
		}else {
			len = 3;
		}
		
		if(maxCode==null) {
			String[] strCode = code.split("C");
			returnCode = strCode[0] + strCode[1] + (len==2?"C01":"C001");
		}else {
			String[] strArr = maxCode.split("C");
			int nextNum = Integer.parseInt(strArr[1])+1;
			String strNextNum = nextNum+"";	
			
			while(len > strNextNum.length()) {
				strNextNum = "0" + strNextNum; 
			}
			returnCode = strArr[0] + "C" + strNextNum;	
		}
//		System.out.println(returnCode + " returnCode");
		return returnCode;
	};

}
