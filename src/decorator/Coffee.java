package decorator;
/*缓冲层*/
public class Coffee  extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}

	
}
