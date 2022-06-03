import java.util.HashMap;

public class HashMapDemo {
    //To allocate index numbers for the states
 public void stateandindex(){
     HashMap<String,Integer> stateindexnumber=new HashMap<>();
     stateindexnumber.put("Kerala",1);
     stateindexnumber.put("Tamilnadu",2);
     stateindexnumber.put("Karnataka",3);
     stateindexnumber.put("Andrapradesh",4);
     System.out.println("State and its corresponding index numbers:");
     System.out.println(stateindexnumber);                                           //To print state and its corresponding index
     System.out.println("After removing Karnataka remaining states are:");
     Integer state= (Integer) stateindexnumber.remove("Karnataka");             //To remove a state
     System.out.println(state);
     stateindexnumber.put("Andrapradesh",5);                                        //To update the index of a state
     System.out.println("After updating index of Andrapradesh");
     System.out.println(stateindexnumber);
 }

    public static void main(String[] args) {
        HashMapDemo dem=new HashMapDemo();
        dem.stateandindex();
    }

}
