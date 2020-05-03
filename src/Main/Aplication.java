package Main;

import kitchen.Cup;

public class Aplication {
	public static void main(String[] args) {
//Variable
		Cup cupA= new Cup("Milk",300);
		Cup cupB= new Cup("Water",500);
		
		cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
		cupB.setLiquidVolume(cupB.getLiquidVolume()+50);
		
		cupA.info();
		cupB.info();
	}
}

