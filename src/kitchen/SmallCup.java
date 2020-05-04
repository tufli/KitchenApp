package kitchen;

public class SmallCup extends Cup {
	public SmallCup(){}// default constructor
	public SmallCup(String liquidName,Integer liquidVolume){
	super(liquidName,liquidVolume);
	if (liquidVolume>= 0 && liquidVolume<=250)
		{this.liquidVolume=liquidVolume;
	} else {System.err.println("Wrong Volume, Min size 0ml, Max size 250ml");
	}
	
	}
}
