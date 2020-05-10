package com.schedular;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author Vinod.nagulkar
 *
 */
public class MyTask extends TimerTask
{

	@Override
	public void run() {
		System.out.println(new Date());	
		System.out.println("Task is completed successfully!");
	}

}
