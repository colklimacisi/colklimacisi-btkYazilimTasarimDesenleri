
public class WithMilk extends CoffeeDecorator{

	Coffee coffee;
	public WithMilk(Coffee coffee)
	{
		this.coffee=coffee;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost()+.50;
	}

}
