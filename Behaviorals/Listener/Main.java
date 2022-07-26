public class Main {
    /* Refers to https://guides.codepath.com/android/Creating-Custom-Listeners */
    public static void main (String[] args){
        
        
        MyClass myClass = new MyClass();
        myClass.setMyClassListener(new MyListener() {
            @Override
            public void onSomeEvent(String title) {
                System.out.println(title);
            }
            
        });

        myClass.doSomething();
    }
}
