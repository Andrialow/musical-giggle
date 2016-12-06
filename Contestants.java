
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

}
