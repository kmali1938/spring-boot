package com.org.alltech;

import org.springframework.stereotype.Component;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Component
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		
		return " Practice fast bowling";
}
}
