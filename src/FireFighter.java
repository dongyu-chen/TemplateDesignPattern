/**
 * features a day of a fire fighter. children of Worker.
 * @author Dongyu Chen
 *
 */
public class FireFighter extends Worker {

	public FireFighter(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void work() {
		System.out.println(name + ": It's time to water down the fires");
	}

}
