abstract class Shape{
		String color;
		void setColor(String color){
				this.color = color;
		}
		void getColor(){
			//return color;
			System.out.println(color);
		}

		abstract double Area();
}

class Rectangle extends Shape{
	int Length,Width;

	Rectangle(String color,int Length,int Width){
		super.setColor(color);
		this.Length = Length;
		this.Width = Width;
		//super.setColor(String color);
	}
	double Area(){
		return Length*Width;
	}
	void displayArea(){
		//double area = Area(Length,Width);
		System.out.println(Area());
	}
}

class TestDemo{
	public static void main(String[] args){
		Rectangle R = new Rectangle("Red",10,20);
		R.displayArea();
		R.getColor();
	}
}