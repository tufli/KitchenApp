package kitchen;

public class Cup {
	
	private String liquidName;
	protected Integer liquidVolume;
	
///////////CONSTRUCTOR/////////////////////////////
	Cup(){}// default constructor
	public Cup(String liquidName,Integer liquidVolume){
			setLiquidName(liquidName);
			setLiquidVolume(liquidVolume);
	}
//////////////GETTER SETTER///////////////////////////
			public String getLiquidName() {
			return liquidName;
	}
		void setLiquidName(String liquidName) {
			if (liquidName.equals("Water")||liquidName.equals("Tea")||liquidName.equals("Milk"))
				this.liquidName = liquidName;
			else { System.err.println("Wrong liquid Type, it can be obly Water, Tea, Milk");
				}
	}
		public Integer getLiquidVolume() {
			return liquidVolume;
	}
		public void setLiquidVolume(Integer liquidVolume) {
			if (liquidVolume>=0 && liquidVolume <=600) {
				this.liquidVolume = liquidVolume;}
			else {System.err.println("The volume can'not be more than 600ml and low than 0 ml");
		}
	}
////////////////INFO///////////////////////////////////
	public void info() {
		System.out.println("This is a cup with: "+ liquidVolume+" ml of "+liquidName );
	}
}
