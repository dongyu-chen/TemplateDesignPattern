/**
 * features a day of a handyman. children of Worker.
 * @author Dongyu Chen
 *
 */
public class Handyman extends Worker{

	public Handyman(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void work() {
		System.out.println(name + ": It's time to fix stuff");
	}
}
