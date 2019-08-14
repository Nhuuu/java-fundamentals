package inheritance;

import java.util.ArrayList;

public class Business implements BusinessReview {
  String name;
  int stars;
  ArrayList<Review> reviews;

  public Business(String name, int stars){
    this.name = name;
    this.stars = stars;
    this.reviews = new ArrayList<>();
  }

  public void addReview(Review review){
    if(review.business != this) review.setBusiness(this);
    this.reviews.add(review);
    int newStars = 0;
    for(Review r : this.reviews){
      newStars = newStars + r.getStars();
    }
    this.stars = newStars / this.reviews.size() ;
  }

}
