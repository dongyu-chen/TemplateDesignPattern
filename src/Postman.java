/**
 * features a day of a postman. children of Worker.
 * @author Dongyu Chen
 *
 */
public class Postman extends Worker{

	public Postman(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void work() {
		System.out.println(name + ": It's time to deliver the mail");
	}

}
