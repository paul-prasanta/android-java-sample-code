package com.ds.excel;


public class CalculateExcelColumn {

	static int mod = 26;
	// ASCII, A-Z, 65-90
	// DCR = D*(26*26) + C*26 + R
	/**
	 * Find out the Excel column sequence for any given number
	 * of Column index
	 * 
	 * @param columnNum
	 * @return
	 */
	public static String getSequence(int columnNum)
	{
		if(columnNum < 1)
			return "Are you kidding...";
		
		if(columnNum <= mod)
			return ""+ (char) (65 + (columnNum-1)); // ASCII 65- "A"
		
		int reminder = 0;
		String sequence = "";
		
		while(true){
			reminder = columnNum % mod;
			columnNum = columnNum / mod;
			sequence = ""+ ((char)(65+ (reminder-1))) + sequence;
			
			if(columnNum == 0)
				break;
		}
		
		return sequence;
	}
	
	public static void main(String[] args){
		System.out.println(""+ getSequence(2800));
	}
}
