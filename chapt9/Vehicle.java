public class Vehicle{

  private String make;
  private String model;
  private double basePrice;

  public Vehicle(){
  }

  public Vehicle(String ma, String mo, double bp){
      this.make=ma;
      this.model=mo;
      this.basePrice=bp;
  }

  public void setMake(String ma){
    this.make=ma;
  }

  public void setModel(String mo){
    this.model=mo;
  }

  public void setBasePrice(double bp){
    this.basePrice=bp;
  }

  public String getMake(){
    return make;
  }

  public String getModel(){
    return model;
  }

  public double getBasePrice(){
    return basePrice;
  }

  public String toString(){
    return "Make: "+make+"\nModel: "+model+"\nBase Price: "+basePrice;
  }
}
