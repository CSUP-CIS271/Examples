public class Demo{

  public static void main(String[] args){
    Vehicle c = new Car("Toyota", "Yaris", 1000.);
    Vehicle t = new Truck("GMC", "Sierra", 1000.);
    Vehicle s = new Suv("Ford", "Explorer", 1000.);

    print(c,t,s);

    c.setBasePrice(2000.);
    t.setBasePrice(2000.);
    s.setBasePrice(2000.);

    print(c,t,s);
  }

  public static void print(Vehicle c, Vehicle t, Vehicle s){
    System.out.println(c.toString());
    System.out.println(t.toString());
    System.out.println(s.toString());
  }
}
