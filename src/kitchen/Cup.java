package kitchen;

public class Cup {
	
	private String liquidName;
	private Integer liquidVolume;
	
///////////CONSTRUCTOR/////////////////////////////
	Cup(){}// default constructor
	public Cup( String liquidName,Integer liquidVolume){
			setLiquidName(liquidName);
			setLiquidVolume(liquidVolume);
	}
	
//////////////GETTER SETTER///////////////////////////
			public String getLiquidName() {
			return liquidName;
	}
			public void setLiquidName(String liquidName) {
				if (liquidName.equals("Water") || liquidName.equals("Tea") || liquidName.equals("Milk"))
				this.liquidName = liquidName;
				else { System.err.println("Wrong liquid Type");
				}
	}

			public Integer getLiquidVolume() {
		return liquidVolume;
	}

			public void setLiquidVolume(Integer liquidVolume) {
		if (liquidVolume>=0 && liquidVolume <=600)
			this.liquidVolume = liquidVolume;
		else {System.err.println("Wrong Volume");
		}
	}
	
////////////////INFO///////////////////////////////////
	public void info() {
		System.out.println("This is a cup with: "+ liquidVolume+" ml of "+liquidName );
	}

	
}
