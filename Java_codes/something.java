abstract class Shape{
		String color;
		void setColor(String color){
				this.color = color;
		}
		void getColor(){
			return color;
		}

		abstract double Area();
}

class Rectangle extends Shape{
	int Length,Width;

	Rectangle(int Length,int Width){
		this.Length = Length;
		this.Width = Width;
		setColor(String Color);
	}
	double Area(int Length,int Width){
		return Length*Width;
	}
	void displayArea(){
		int area = Area(Length,Width);
		Syystem.out.println(area);
	}
}

class TestDemo{
	public static void main(String[] args){
		Rectangle R = new Rectangle();
		System.out.println(R.Length,R.Width);
	}
}