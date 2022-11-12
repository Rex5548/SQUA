class Simulation{
	public static void main(String[] args){
		Winter winter = new Winter();
		while (winter.day <= winter.getMaxDays()){
			if (winter.vole.getState() == Vole.states.FED_UP){
				winter.vole.isSleeping();
			}
				if (winter.vole.getState() == Vole.states.HUNGRY){
					if (winter.flower1.getState() != Flower.EATEN){
						winter.flower1.wasEaten();
						winter.vole.isFedUp();
				}
				if (winter.vole.getState() == Vole.states.HUNGRY)
					if (winter.flower2.getState() != Flower.EATEN){
						winter.flower2.wasEaten();
						winter.vole.isFedUp();
				}
				if (winter.vole.getState() == Vole.states.HUNGRY)
					if (winter.flower3.getState() != Flower.EATEN){
						winter.flower3.wasEaten();
						winter.vole.isFedUp();
				}
				if (winter.vole.getState() == Vole.states.HUNGRY)
					if (winter.flower4.getState() != Flower.EATEN){
						winter.flower4.wasEaten();
						winter.vole.isFedUp();
				}
				if (winter.vole.getState() == Vole.states.HUNGRY)
					if (winter.flower5.getState() != Flower.EATEN){
						winter.flower5.wasEaten();
						winter.vole.isFedUp();
				}
				if (winter.vole.getState() == Vole.states.HUNGRY)
					winter.vole.HasStarved();
			}
			if (winter.flower1.getState() == Flower.GROW)
				winter.flower1.isGrowing();
			if (winter.flower2.getState() == Flower.GROW)
				winter.flower2.isGrowing();
			if (winter.flower3.getState() == Flower.GROW)
				winter.flower3.isGrowing();
			if (winter.flower4.getState() == Flower.GROW)
				winter.flower4.isGrowing();
			if (winter.flower5.getState() == Flower.GROW)
				winter.flower5.isGrowing();
			if (winter.vole.hungerChance() && winter.vole.getState() == Vole.states.SLEEP){
				winter.vole.isHungry();
			}
			System.out.printf("This is Day: ");
			System.out.println(winter.day);
			System.out.printf("Flower 1 ");
			winter.flower1.printStatus();
			System.out.printf(", size: ");
			System.out.println(winter.flower1.getSize());
			System.out.printf("Flower 2 ");
			winter.flower2.printStatus();
			System.out.printf(", size: ");
			System.out.println(winter.flower2.getSize());
			System.out.printf("Flower 3 ");
			winter.flower3.printStatus();
			System.out.printf(", size: ");
			System.out.println(winter.flower3.getSize());
			System.out.printf("Flower 4 ");
			winter.flower4.printStatus();
			System.out.printf(", size: ");
			System.out.println(winter.flower4.getSize());
			System.out.printf("Flower 5 ");
			winter.flower5.printStatus();
			System.out.printf(", size: ");
			System.out.println(winter.flower5.getSize());
			System.out.printf("Vole ");
			winter.vole.printStatus();
			
			System.out.println("----------------------------");
			winter.oneDayPasses();
		}
	}
}
