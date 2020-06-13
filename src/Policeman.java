/**
 * features a day of a policeman. children of Worker.
 * @author Dongyu
 *
 */
public class Policeman extends Worker{

	public Policeman(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void work() {
		System.out.println(name + ": It's time to get the bad guys!");
	}
	
	

}
