public class BestScorer {
  private int award;
  private String name;
  
  public BestScorer(String name, int award){
	  this.name = name;
	  this.award = award;
	  
  }
  public String getName(){
	  return name;
  }
  public int getAward(){
   return award;
}
  public boolean equals(BestScorer otherbestScorer){
	  return name.equals(otherbestScorer.getAward());
  }
  public int compareTo(BestScorer anotherBestScorer){
	  return this.getName().compareToIgnoreCase(anotherBestScorer.getName());
  }
}