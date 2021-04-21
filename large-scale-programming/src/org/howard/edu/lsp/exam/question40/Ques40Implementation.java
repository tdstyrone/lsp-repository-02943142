package org.howard.edu.lsp.exam.question40;

public class Ques40Implementation {
	
	public static void main(String[] args) {
		Animal bengalTiger = new Tiger();
		Animal uglyGoose = new Goose();
		
		Flying flyingGoose = new Goose();
		Flying unitedAirline = new Airplane();
		
		
		bengalTiger.speak();
		bengalTiger.move();
		
		uglyGoose.speak();
		uglyGoose.move();
				
		flyingGoose.fly();
		unitedAirline.fly();
	};
};
