package inheritance;

public class Review {
  String body;
  String author;
  int stars;
  Business business;

  public Review (String body, String author, int stars, Business business){
    this.body = body;
    this.author = author;
    this.stars = stars;
    this.business = business;
    if(this.business != null) business.addReview(this);
  }

  public void setBusiness(Business business){
    this.business = business;
  }

  public Business getBusiness(){
    return business;
  }

  public int getStars(){
    return stars;
  }

  public String toString(){
    return String.format("%s, Stars: %d \n" +
        "Author: %s, Body: %s", this.getBusiness(), this.getStars(), this.author, this.body);
  }

}
