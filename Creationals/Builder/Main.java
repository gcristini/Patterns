public class Main {
    
    public static void main (String[] args){
        /* Instanzia la classe animale tramite il suo costruttore */        
        Animal pluto = new Animal(  "pluto", "123", "PlutoSecondo",
                                    "labrador","Marco Rossi","Via x",true, false,
                                    null, Animal.Sex.MALE,40.5,30.0);

        /* Intanziare tramite il builder dedicato */
        Animal pluto2 = new AnimalBuilder()
        .name("pluto")
        .pedigreeName("123")
        .id("PlutoSecondo")
        .owner("labrador")
        .race("Marco Rossi")
        .residence("Via x")
        .isVaccinated(true)
        .isChampion(false)
        .sons(null)
        .sex(Animal.Sex.MALE)
        .weight(40.5)
        .height(30.0)
        .build();

    }      
}
