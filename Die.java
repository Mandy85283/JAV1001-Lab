import java.util.Random; 
public class Die
{
	//Creating data field
	protected String type;
	protected int sides;
	protected int upside;
	//Creating 0 argument constructor
	public Die()
	{
		type = "D6";
		sides = 6;
		Random random = new Random();
        upside = random.nextInt(1, sides+1);
	}
	//Creating 1 argument constructor
	public Die(int sides)
	{
		this.type = "D" + sides;
		this.sides = sides;
		Random random = new Random();       
		this.upside = random.nextInt(1, sides+1);
	}
	//Creating 2 argument constructor
	public Die(String type, int sides)
	{
		this.type = type;
		this.sides = sides;
		Random random = new Random();       
		this.upside = random.nextInt(1, sides+1);
	}
	//Creating Roll method
	public int Roll()
	{
		    Random random = new Random();
            upside = random.nextInt(1, sides+1);	
			return upside;
	}
}