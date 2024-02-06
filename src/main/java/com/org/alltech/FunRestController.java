package com.org.alltech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FunRestController {
private Coach myCoach;

	

	@Autowired
	public FunRestController(Coach theCoach)
	{
		myCoach=theCoach;
	}

	public void setMyCoach(Coach myCoach) {
		this.myCoach = myCoach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}

	@GetMapping("/Hello")
	public String sayHello() {
		return "Alltech";
	}
}