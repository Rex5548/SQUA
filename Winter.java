class Winter {
	public int day = 0;
	Flower flower1 = new Flower();
	Flower flower2 = new Flower();
	Flower flower3 = new Flower();
	Flower flower4 = new Flower();
	Flower flower5 = new Flower();
	Vole vole = new Vole();
	private int maxDays;
	
	Winter()
	{
		this(20);
	}
	
	Winter(int maxDays)
	{
		this.maxDays=maxDays;
	}
	
	int getMaxDays()
	{
		return maxDays;
	}
	
	void simulate (Winter w, int d)
	{
		w.setDay(d);
	}
	
	void oneDayPasses()
	{
		day++;
	}
	
	int getday()
	{
		return day;
	}
	
	void setDay(int d)
	{
		day = d;
	}
	
}
