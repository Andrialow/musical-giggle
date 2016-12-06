

public class Contestants {
   private static final int MAX_CONTESTANTS = 10;
   
   private int counter;
   private BestScorer[] bestScorers;
   private int currentContestant;
   
   public Contestants(){
	   counter = 0;
	   bestScorers = new BestScorer[MAX_CONTESTANTS];
	   currentContestant = 0;
	   
   }
   private int indexOf(String name){
	   int i = 0;
	   int result = -1;
	   
	   while((i < counter) && (result == -1)){
		   if(bestScorers[i].getName().equals(name)){
			   result = i;
			  i++; 
		   }
	   }
	   return result;
   }
   private void resize(){
	   BestScorer[] tmp = new BestScorer[2*bestScorers.length];
	   int i = 0;
	   while(i < counter){
		   tmp[i] = bestScorers[i]; i++;
	   }
	   bestScorers = tmp;
   }
   public void initializeIterator(){
	   currentContestant = 0;
   }
   public boolean hasNext(){
		 return ((currentContestant >= 0) && 
				 (currentContestant < counter));
	  }
	  public BestScorer next(){
		  return bestScorers[currentContestant++];
	  }
	public int getNumberOfContestants(){
		return counter;
	}
	  private int findPositionFor(BestScorer b){
		  int contestantPosition = 0;
		  boolean found = false;
		  while(contestantPosition < counter && !found){
			  if(b.compareTo(bestScorers[contestantPosition])>0){
				 contestantPosition++;}
				 else 
					 found = true;
			  }
			  return contestantPosition;
		  }
	  
	  public void addBestScorer(String name, int award){
		  if(counter == bestScorers.length)
			  resize();
		  BestScorer b = new BestScorer(name, award);
		  int position = findPositionFor(b);
		  addBestScorerAt(b, position);
	  }
	  private void addBestScorerAt(BestScorer c, int position){
		    counter++;
		    for(int i = counter - 1; i>=position; i--)
		    	bestScorers[i+1] = bestScorers [i];
		    
		    bestScorers[position] = c;
		    counter++;

	  }  
	  public boolean hasContestant(String name){
		  return indexOf(name) >=0;
	  }
	 
}
