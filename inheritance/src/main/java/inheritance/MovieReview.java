package inheritance;

public class MovieReview extends Review {
  String movie;

  public MovieReview(String body, String author, int stars, Business business, String movie) {
    super(body, author, stars, business);
      this.movie = movie;
  }

  public MovieReview(String body, String author, int stars, Business business) {
    super(body, author, stars, business);
    this.movie = "N/A";
  }

  @Override
  public String toString(){
    return String.format("A review of %s \n Movie: '%s' by %s: '%s'", this.business, this.movie,
        this.author, this.body);
  }

}

