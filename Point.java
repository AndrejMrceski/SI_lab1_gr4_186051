class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;
	//TODO constructor
	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	//TODO setters and getters
	public void setID(String id) { this.id = id; }
	public void setCoordinates(double x, double y) { this.x = x; this.y = y; }
	public void setID(String color) { this.color = color; }
	
	public String getID() { return this.id; }
	public double getX() { return this.x; }
	public double getY() { return this.y; }
	public String getColor() { return this.color; }
	
	public void move (char xDirection, char yDirection) {
		//TODO
		if (xDirection == 'L')
			this.x -= 1;
		else if(xDirection == 'R')
			this.x += 1;
		if (yDirection == 'U')
			this.y += 1;
		else if(yDirection == 'D')
			this.y -= 1;
	}

	public void draw () {
		//TODO
	}



}
