package interfaceInstance;

public class MyClass implements myinterface {

    myinterface myinter = new myinterface() {
        @Override
        public int hashCode() {
            return super.hashCode();
        }
    };

    //OR


    public static void main(String[] args) {
        myinterface test = new MyClass();
        //myinterface test = new myinterface(); // wont compile
    }
}