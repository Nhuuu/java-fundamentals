package inheritance;

public class Shop extends Business {
  String description;
  int price;

  public Shop(String name, int price, int stars, String description){
    super(name, stars);
    this.price = price;
    this.description = description;
  }

  public String toString(){
    return String.format("Shop: %s \n Description: %s \n Price: %d \n Stars: %d", this.name, this.description,
        this.price, this.stars);
  }

}
