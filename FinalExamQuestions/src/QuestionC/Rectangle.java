package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) throws IllegalRectangleException{
		super(newx, newy);
		if(newx <= 0 | newy <= 0){
			throw new IllegalRectangleException(newy, newx);    
		}
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		
		
		return this.getX() * this.getY();
	}

}
