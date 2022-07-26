public class Main {
    public static void main(String[] args){
        
        ObserverMatch observerMatch_1 = new ObserverMatch("Pippo");
        ObserverMatch observerMatch_2 = new ObserverMatch("Pluto");        

        ObservableMatch observableMatch = new ObservableMatch();
        
        /* Add 2 observers and update result */
        System.out.println("Add 2 observers and update result");
        observableMatch.addObserver(observerMatch_1);
        observableMatch.addObserver(observerMatch_2);
        observableMatch.setMatchScore("1-0");

        /* Remove one observer and update result */
        System.out.println("Remove one observer and update result");
        observableMatch.removeObserver(observerMatch_2);
        observableMatch.setMatchScore("1-1");
    }
    
}
