class Bicyclette{

	public int gear;
	public int speed;

	public Bicyclette(int gear, int speed){

		this.gear = gear;
		this.speed = speed;
	}
	public void ApplyBrack(int decrement){

		speed -= decrement;
	}
	public void speedUp(int increment){

		speed += increment;
	}
	public String toString(){
		return("it's advised to ApplyBrack "+gear+"\n"+" and not speed up "+ speed);
	}
}

class Mountaines extends Bicyclette{

	public int seatHeight;

	public Mountaines(int gear , int speed, int startHeight){
		super(gear, speed);
		seatHeight = startHeight;
	}
	public void seatHeight(int newvalue){
		seatHeight = newvalue;
	}

	@Override
	public String toString(){
		return(super.toString()+" je suis zelmad mohamed "+seatHeight);
	}
}

public class MountTest{
	public static void main(String[] args){
		Mountaines aloumaz = new Mountaines(10, 2000, 2500);
		System.out.print(aloumaz.toString());
	}
}