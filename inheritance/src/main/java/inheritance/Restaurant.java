package inheritance;

import java.util.ArrayList;

public class Restaurant {
  String name;
  int stars;
  int priceCategory;
  ArrayList<Review> reviews;

  public Restaurant(String name, int stars, int priceCategory){
    this.name = name;
    this.stars = stars;
    this.priceCategory = priceCategory;
    this.reviews = new ArrayList<>();
  }

  public String toString(){
    return String.format("Restaurant: %s, Price: %d", this.name, this.priceCategory);
  }

  public ArrayList<Review> getReviews(){
    return this.reviews;
  }


  public void addReview(Review review){
    if(review.restaurant != this) review.setRestaurant(this);
    this.reviews.add(review);
    int newStars = 0;
    for(Review r : reviews){
      newStars = newStars + r.getStars();
    }
    this.stars = newStars / reviews.size();
  }
}
