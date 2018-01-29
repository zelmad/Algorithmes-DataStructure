class CarCar {

    int no;
    String model;
    public CarCar(int no, String model){ this.no = no; this.model = model; }
    void print(){
        System.out.println("nbr of car is "+ this.no + " the model is "+this.model);

    }
}

class car{
    CarCar c;
    car(CarCar c){
        this.c = c;
    }
}

public class Car{
    public static void main(String[] args){
        CarCar renault = new CarCar(1, "zelmad");
        CarCar mercidice = new CarCar(2, "mohamed");
        car  et = new car(renault);
        car  er = new car(mercidice);
        swap(et, er);
        
        et.c.print();
        er.c.print();
    }

    public static void swap(car a,car b){
        CarCar temp = a.c;
        a.c = b.c;
        b.c = temp;
    }
}