import java.net.http.WebSocket.Listener;

public class MyClass {
    // Add a private listener variable
    private MyListener mListener = null;    

    // Method for add listener from another class
    public void setMyClassListener(MyListener myListener){
        this.mListener = myListener;
    }

    public void doSomething(){
        if (mListener != null){
            mListener.onSomeEvent("Hello");
        }
    }
}
