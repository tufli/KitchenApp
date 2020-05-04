package Main;

import kitchen.BigCup;
import kitchen.Cup;
import kitchen.SmallCup;

public class Aplication {
	public static void main(String[] args) {
//Variable
		Cup cupA= new Cup("Milk",300);
		Cup cupB= new Cup("Water",500);
		SmallCup smallCupC= new SmallCup("Tea",200);
		BigCup bigCupD= new BigCup("Water",200);
		
		cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
		cupB.setLiquidVolume(cupB.getLiquidVolume()+50);
		bigCupD.setLiquidVolume(cupB.getLiquidVolume()+bigCupD.getLiquidVolume());
		cupB.setLiquidVolume(0);
		
		cupA.info();
		cupB.info();
		smallCupC.info();
		bigCupD.info();
	}
}

