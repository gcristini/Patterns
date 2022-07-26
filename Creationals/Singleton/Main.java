

class Main
 {
    public static void main(String[] args)
    {
        
        Singleton singletone = Singleton.getInstance();
        Singleton singletone_1 = Singleton.getInstance();

        singletone.setVar(100);
        
        System.out.println("Var_1=" + singletone_1.getVar());

        singletone_1.setVar(200);
        System.out.println("Var=" + singletone.getVar());                

    }
}