class Vole{
public enum states
{
	SLEEP,
	HUNGRY,
	FED_UP,
	STARVED;
}
private int random;
private states state;
Vole()
{
	this(Vole.states.SLEEP,10);
}
Vole(states state, int randomChance)
{
	this.state=state;
	this.random=randomChance;
}
public void isSleeping(){
	state = Vole.states.SLEEP;
}

public void isHungry(){
	state = Vole.states.HUNGRY;
}

public void isFedUp(){
	state = Vole.states.FED_UP;
}

public void HasStarved(){
	state = Vole.states.STARVED;
}

public states getState(){
	return state;
}

public void printStatus(){
	switch(state){
		case SLEEP:
			System.out.println("Sleeps");
			break;
		case HUNGRY:
			System.out.println("is Hungry");
			break;
		case FED_UP:
			System.out.println("is Fed up");
			break;
		case STARVED:
			System.out.println("is Starved to Death");
			break;
	}
}
public boolean hungerChance() {
	return ((int)(Math.random() * random) + 1)==1;
}

}
