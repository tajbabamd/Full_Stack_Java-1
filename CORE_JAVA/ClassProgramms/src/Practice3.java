class Rectangle{
	private int width, height, area, parameter;

	

	public int getArea() {
		return area;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getParameter() {
		return parameter;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//calculation method
	public void calculateArea() {
		area = width * height;
	}
	
	public void calculateParameter() {
		parameter = (width * height) * 2;
	}
}

public class Practice3 {

	public static void main(String[] args) {


		Rectangle r = new Rectangle();
		
		r.setWidth(4);
		r.setHeight(8);
		
		r.calculateArea();
		r.calculateParameter();
		
		System.out.println("Area : " + r.getArea() + ", Parameter : " + r.getParameter());

	}

}
