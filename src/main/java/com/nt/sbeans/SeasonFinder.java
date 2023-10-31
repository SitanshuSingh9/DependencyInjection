package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasonFinder {
	
	
@Autowired
private	LocalDate ld;

public String SeasonFinder() {
	 int month= ld.getMonthValue();
	 
	 if (month>=3 && month<=6)
	 return "summer season";
	 
	 else if(month>=7 && month<=10)
		 
		 return "Reani Season";
	 
	 else 
		 return"Winter Season";


}


}
