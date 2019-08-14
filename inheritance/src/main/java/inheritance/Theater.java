package inheritance;

import java.util.ArrayList;

public class Theater extends Business {
  ArrayList<String> movies;

  public Theater(String name, int stars){
    super(name, stars);
    this.movies = new ArrayList<>();
  }

  public void addMovie(String movie){
    for(String m : this.movies){
      if(movie != m){
        this.movies.add(movie);
      }
    }
  }

  public void removeMovie(String movie){
    this.movies.remove(movie);
  }

  public String getMovies(){
    return movies.toString();
  }

  @Override
  public String toString(){
    return String.format("Theater: %s, Stars: %d", this.name, this.stars);
  }
}
