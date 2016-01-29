public class Suv extends Vehicle{
  String TYPE;
  double salePrice;

  public Suv(String make, String model, double basePrice){
    super(make, model, basePrice);
    TYPE="suv";
  }

  public double setSalePrice(){
    return super.getBasePrice()*1.05;
  }

  public void setBasePrice(double d){
    super.setBasePrice(d);
  }


  public String toString(){
    return super.toString()+"\nType: "+TYPE+"\nSale Price: "+setSalePrice()+"\n***********\n";
  }
}
