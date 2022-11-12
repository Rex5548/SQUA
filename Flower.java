class Flower{
	private int state;
	static final int GROW = 0;
	static final int FLOURISH = 1;
	static final int EATEN = 2;
	private int size;
	
	Flower()
	{
		this(0,0);
	}
	
	Flower(int size, int state){
		this.size = size;
		this.state = state;
	}
	
	public void isGrowing(){
		if (size <=14){ 
			state = GROW;
			size++;
		}else
			isFlourishing();
	}
	
	public void isFlourishing(){
		state = FLOURISH;
	}
	
	public void wasEaten(){
		state = EATEN;
	}
	
	public int getState(){
		return state;
	}
	
	public void printStatus(){
	switch(state){
		case GROW:
			System.out.printf("is Growing");
			break;
		case FLOURISH:
			System.out.printf("is Flourishing");
			break;
		case EATEN:
			System.out.printf("was Eaten");
			break;
	}
}


public int getSize() 
{
	return size;
}

}
