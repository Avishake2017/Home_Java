interface Shape{
	public double area();
	public double volume();
}

class Cube implements Shape{

	int x = 4;
	public double area(){
		return 6*x*x;
	}

	public double volume(){
		return x*x*x;
	}
}
class Circle implements Shape{

		int radius = 2;
		public double area(){
			return 3.14*radius*radius;
		}
		public double volume(){
			return 0;
		}
	}

class PolymorphismTest{
	
	public static void main(String[] args) {
		Cube c = new Cube();
		Circle cir = new Circle();

		double cubeArea = c.area();
		System.out.println(cubeArea);

		double cubeVol = c.volume();
		System.out.println(cubeVol);

		double cirArea = cir.area();
		System.out.println(cubeArea);

		double cirVol = cir.volume();
		System.out.println(cirVol);

	}
}