public class ObserverMatch implements Observer {

    private String id;
    private String score;

    public ObserverMatch(String id){
        this.id = id;
    }

    @Override
    public void update(Object score) {
        this.score = (String) score;
        System.out.println("[observer-"+id+"] Risultato: "+ (String) score);        
    }
    
}
