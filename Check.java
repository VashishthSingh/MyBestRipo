package com.cshttprequest;

public class Check {
	public static void main(String []args) {
		Readings r=new Readings(); 
		r.setRamUsed(12.4f);
		r.setDiskUsed(12.9f);
		r.setCpuUtilization(23.4d);
		r.setReadDateTime("2020-02-07 18:04:30");
		String s=JsonUtility.convertToJSON(r);
		Readings rea=JsonUtility.convertToJavaObject(s);
		
		System.out.println(s);
		System.out.println(rea);
	}
}
