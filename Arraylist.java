import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        
        //create an object 
        ArrayList<String> names = new ArrayList<>();//empty list
        List<String> lastname = new ArrayList<>();//wrapper classs
        //add
        names.add("Sudha");
        lastname.add("raji");
        
        //access
        System.out.println("Firstname: "+names.get(0));
        System.out.println("Lastname: "+lastname.get(0));
        
        //update
        lastname.set(0,"raja");
        System.out.println("Lastname: "+lastname.get(0));
        
        //remove
        lastname.add("raji");
        //.set(1,"raji") out of bound 
        System.out.println("Lastname2: "+ lastname.get(1));
        lastname.remove("raja");// remove by value
        lastname.remove(0);//remove by index
        //remove(1) throw index out of bound
        System.out.println(lastname.size());
        
        //check exist its case sensitive
        System.out.println(names.contains("Sudha"));
        
        names.add("Vegeta");
        names.add("goku");
        //for loop
        for(int i =0; i <names.size();i++){
            System.out.println(names.get(i));
        }
        
        //enhanced for loop
        for(String s : names){
            System.out.println(s);
        }
        
        //for each lamba
        names.forEach(f -> System.out.println(f));
        
        //iterator
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //
        
        //collection
        names.add("Goku");
        //All uppercase letters (A–Z) come before lowercase letters (a–z) in Unicode/ASCII
        Collections.sort(names);
        System.out.println("After sorting");
        names.forEach(f ->System.out.println(f));
        
        //descending order
        
        Collections.sort(names, Collections.reverseOrder());
        names.forEach(f -> System.out.println(f));
        
        //convert array to arraylist
        //ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        //covnert arraylist to array
        //String[] arr = list.toArray(new String[0]);
        
        //sublist
        System.out.println(names.subList(0,2));
        //Remove all A-B
        //list1.removeAll(list2)
        //intersection 
        //list1.retainAll(list2)
    }
}
