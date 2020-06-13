/**
 * the template class for FireFighter, Policeman, Postman, and Handyman
 * it prints out various actions to be performed during a day of the workers
 * @author Dongyu Chen
 * 
 */

public abstract class Worker {
	protected String name;
	public Worker(String name) {
		this.name = name;
	}
	
	/**
	 * calls the methods printing out the daily actions
	 */
	public void dailyRoutine() {
		wakeUp();
		eatBreakfast();
		goToWork();
		work();
		comeHome();
		eat();
		sleep();
		
	}
	
	/**
	 * prints out each daily function
	 */
	public void wakeUp() {
		System.out.println(name + ": It's time to get out of bed sleepyhead");	
	}
	
	public void eatBreakfast() {
		System.out.println(name + ": It's time to eat, yum yum yum");	
	}
	
	public void goToWork() {
		System.out.println(name + ": It's time to drive to work");	
	}

	public void comeHome() {
		System.out.println(name + ": It's time to drive home, YAY");
	}
	
	public void eat() {
		System.out.println(name + ": It's time to eat, yum yum yum");
	}
	
	public void sleep() {
		System.out.println(name + ": It's time to go back to bed...zzzzz");
	}
	
	/**
	 * an abstract method for the work to be performed
	 */
	public abstract void work();

	}
