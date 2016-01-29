public class Truck extends Vehicle{
  String TYPE;
  double salePrice;

  public Truck(String make, String model, double basePrice){
    super(make, model, basePrice);
    TYPE="truck";
  }

  public double setSalePrice(){
    return super.getBasePrice()*1.06;
  }

  public void setBasePrice(double d){
    super.setBasePrice(d);
  }

  public String toString(){
    return super.toString()+"\nType: "+TYPE+"\nSale Price: "+setSalePrice()+"\n***********\n";
  }
}
