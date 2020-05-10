package com.schedular;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Vinod.nagulkar
 *
 */
public class CronJobExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Timer timer=new Timer();
		TimerTask task=new MyTask();
		timer.schedule(task, 0, 1000);
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates!");
				System.exit(0);
			}
		}
	}

}
