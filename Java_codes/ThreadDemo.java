class ThreadDemo{
	int n;
	boolean flag = false;

	synchronized void produce(){
		if(flag==true){
			try{
				wait();
			}
			catch(Exception e){
				System.out.println(e.printStackTrace());
				}
		}
		//code to produce
		this.n = n;
		System.out.println("Producer Produces :"+n);
		flag = true;
		notify();
	}

	synchronized int consume(int n){
		if(flag==false){
			try{
				wait();
			}
			catch(Exception e){
				System.out.println(e.printStackTrace());
			}
		}

		flag = false
		System.out.println("Consumer consumes :"+n);
		notify();
	}

	class ProducerThread extends Thread{
		ThreadDemo T;
		ProducerThread(T t){
			
		}
	}
}