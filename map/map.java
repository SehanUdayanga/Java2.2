import java.util.HashMap;
public  class map{
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        //insert a value we use put

        map.put("apple",25.5);
        map.put("banana",15.5);
        map.put("orage",5.32);
        map.put("grapes",50.5);
        map.put("coconut",100.20);

        //remove a value use remove()
        map.remove("apple");

        //
        System.out.println(map.get("banana"));

        System.out.println(map.containsKey("orage"));
        System.out.println(map.containsValue(100.2));
        System.out.println(map.size());
        
        for(String key : map.keySet()){
            System.out.println(key +" :  " +map.get(key));
        }


    }
}