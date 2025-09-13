import java.util.ArrayList;
import java.util.List;

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
        
        
        
    }
}
