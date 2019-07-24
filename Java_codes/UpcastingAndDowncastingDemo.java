class Animal {
	void sound(){
	System.out.println("I m sound of animal");
	}
	
}
class Cat extends Animal {
	void sound(){	System.out.println("Mew Mew"); }
	void eat() {
		System.out.println("Cat loves milk");
	}
}
class UpcastingDowncastingDemo {
	public static void main(String[] args){

	/*In case of upcasting , child object will start behaving as the parent and we
	wont be able to access any child specific features so to access the child specific features we have to do downcasting*/
	Animal a=new Cat(); //Upcasting
	a.sound();	

	Cat c=(Cat)a;	//Downcasting
	c.eat();
	}
}