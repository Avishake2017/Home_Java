import java.util.Scanner;

class InvalidDivisor extends Exception{
	public String toString(){
		return "Can`t divide as the divisor is 0";
	}
}
class Division{
	double x,y;

	Division(){

	}
	double divide(double x,double y) throws InvalidDivisor{
		this.x = x;
		this.y = y;
			if(this.y == 0){

				throw new InvalidDivisor();
			}
}
}
class DivisionMain{
	public static void main(String[] args) {
		double x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers:");
			x=s.nextDouble();
			y=s.nextDouble();
			try{
				Division d = new Division(x,y);
			}
			catch(InvalidDivisor e){
				System.out.println(e);
				}
		//d.divide(x,y);
	}
	}