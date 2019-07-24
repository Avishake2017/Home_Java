class Box{
	int length;
	int width;
	int height;

	void display(){
		System.out.println(length+"  "+width+" "+height);
	}
}
class BoxMain{
	public static void main(String[] args) {
		Box b = new Box();
		Box b1 = new Box();
		b.length = 1;
		b.width = 2;
		b.height = 1;
		b1 = b;
		b1.display();
	}
}