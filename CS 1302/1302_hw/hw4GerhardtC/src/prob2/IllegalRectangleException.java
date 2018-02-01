package prob2;

@SuppressWarnings("serial")
public class IllegalRectangleException extends RuntimeException {
	
	private double height;
	private double width;
	private double area;

	public IllegalRectangleException(String msg, double height, double width , double area){
		super(msg);
		this.height = height;
		this.width = width;
		this.area = area;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return area;
	}
	
	public String toString(){
		String result = String.format("Illegal Rectangle: Width = %.2f, Height = %.2f, Area = %.2f", getHeight(), getWidth(), getArea());
		return result;
	}

}