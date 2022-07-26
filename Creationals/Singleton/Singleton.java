
/* ******************************************************************************* */
/* *****************                  Versione Base                  ************* */
/* ******************************************************************************* */
// public class Singleton
// {
//     private static Singleton instance = null;

//     /* Costruttore privato per evitare l'instanziamento della classe */
//     private Singleton(){};

//     /* Get instance of class */
//     public static Singleton getInstance()
//     {
//         if (instance == null)
//         {
//             instance = new Singleton();
//         }

//         return instance;
//     }


// }


/* ******************************************************************************* */
/* *****************              Versione Thread Safe               ************* */
/* ******************************************************************************* */
// public class Singleton
// {
//     public static Singleton instance = null;

//     private void Singleton(){}

//     public static Singleton getInstance()
//     {
//         if (instance == null)
//         {
//             synchronized(Singleton.class)
//             {
//                 instance = new Singleton();
//             }
//         }
//         return instance;
//     }
// }


/* ******************************************************************************* */
/* *****************               Versione Bill Pugh                ************* */
/* ******************************************************************************* */
public class Singleton
{
    private int var = 20;
    
    private void Singleton(){}

    private static class helper
    {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance()
    {
        return helper.instance;
    }

    public int getVar()
    {
        return var;
    }

    public void setVar(int var)
    {
        this.var = var;
    }
    

}