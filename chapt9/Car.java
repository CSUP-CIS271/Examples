public class Car extends Vehicle{
  String TYPE;
  double salePrice;

  public Car(String make, String model, double basePrice){
    super(make, model, basePrice);
    TYPE="car";
  }

  public double setSalePrice(){
    return super.getBasePrice()*1.03;
  }

  public void setBasePrice(double d){
    super.setBasePrice(d);
  }

  public String toString(){
    return super.toString()+"\nType: "+TYPE+"\nSale Price: "+setSalePrice()+"\n***********\n";
  }
}
