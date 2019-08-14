package inheritance;

public class Restaurant extends Business {
  int price;

  public Restaurant(String name, int price, int stars){
    super(name, stars);
    this.price = price;
  }

  @Override
  public String toString(){
    return String.format("Restaurant: %s, Price: %d, Stars: %d", this.name, this.price, this.stars);
  }

}
