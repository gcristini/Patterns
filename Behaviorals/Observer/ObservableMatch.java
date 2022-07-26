import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;


public class ObservableMatch{
    private String matchScore;    
    private List<Observer> observersList = new ArrayList<>();

    public ObservableMatch(){
        this.matchScore = "0-0";
    }

    public void addObserver(Observer observer){
        this.observersList.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observersList.remove(observer);
    }

    private void notifyAllObservers(String score){
        for (Observer observer : observersList){
            observer.update(score);
        }
    }
    public void setMatchScore(String newScore){
        this.matchScore = newScore;
        notifyAllObservers(matchScore);
    }
    
}