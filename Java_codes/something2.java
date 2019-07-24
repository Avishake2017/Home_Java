import Math;
interface Shape{
	double area();
	double volume();
}

class Cube implements Shape{

	int x = 10;
	double area(){
		return 6*x*x;
	}

	double volume(){
		return x*x*x;
	}
}
class Circle implements Shape{

		int radius = 10;
		double area(){
			return 3.14*radius*radius;
		}
		double volume(){
			return 0;
		}
	}

class PolymorphismTest{
	
	public static void main(String[] args) {
		Cube c = new Cube();
		Circle cir = new Circle();

		double cubeArea = c.area();
		System.out.println(cubeArea);
	}
}