package com.xworkz.collectionexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cName1="TCS";
		String cName2="Apple";
		String cName3="Microsoft";
		String cName4="Alphabet_Inc";
		String cName5="Amazon_Web_Services";
		String cName6="Meta";
		String cName7="Tencent";
		String cName8="Broadcom";
		String cName9="HP";
		String cName10="Dell";
		String cName11="Oracle";
		String cName12="IBM";
		String cName13="DXC_Technology";
		String cName14="Asaus";
		String cName15="Amazon";
		String cName16="Wipro";
		String cName17="TDM";
		String cName18="Accenture";
		String cName19="Cisco ";
		String cName20="Salesforce ";
				
		
		Collection <String> cNames = new ArrayList<String>();
		cNames.add(cName20);
		cNames.add(cName19);
		cNames.add(cName18);
		cNames.add(cName18);
		cNames.add(cName17);
		cNames.add(cName16);
		cNames.add(cName15);
		cNames.add(cName14);
		cNames.add(cName13);
		cNames.add(cName12);
		cNames.add(cName11);
		cNames.add(cName10);
		cNames.add(cName9);
		cNames.add(cName8);
		cNames.add(cName7);
		cNames.add(cName6);
		cNames.add(cName5);
		cNames.add(cName4);
		cNames.add(cName3);
		cNames.add(cName2);
		cNames.add(cName1);
		
		for(String cName: cNames) {
			System.out.println(cName);
		}
		
		Iterator<String> element = cNames.iterator();
		
		while(element.hasNext()) {
			String ref = element.next();
			System.out.println(ref);
		}
				
	}

}
