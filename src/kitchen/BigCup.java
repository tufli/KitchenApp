package kitchen;

public class BigCup extends Cup {
	public BigCup(){}// default constructor
	public BigCup(String liquidName,Integer liquidVolume){
	super(liquidName,liquidVolume);
	if (liquidVolume>= 0 && liquidVolume<=1000) {
		this.liquidVolume=liquidVolume;}
	 else {System.err.println("Wrong Volume, Min size 0ml, Max size 1000ml");
	}
	
	}

} 
