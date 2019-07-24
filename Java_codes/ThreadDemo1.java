class ThreadDemo1 extends Thread{
	public static void main(String[] args) {

		Thread t1 = new Thread();
		Thread t2 = new Thread();

		t1.setName("First Thread");
		t2.setName("Second Thread");

		System.out.println(t1.getName());
		System.out.println(t2.getName());

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
			
	}
}