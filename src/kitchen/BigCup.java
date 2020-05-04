package kitchen;

public class BigCup extends Cup {
	public BigCup(){}// default constructor
	public BigCup(String liquidName,Integer liquidVolume){
		super(liquidName,liquidVolume);
		}
		
	public void setLiquidVolume(int liquidVolume) {
		final int MIN_VOLUME= 0;
		int maxVolume= 1000;
			
			if (liquidVolume > maxVolume)
					System.err.printf("The Max volume of the cup is %dml%n", maxVolume);
				this.liquidVolume = maxVolume;

			if (liquidVolume < MIN_VOLUME)
				this.liquidVolume = MIN_VOLUME;

			else
				this.liquidVolume = liquidVolume;
		}
	}