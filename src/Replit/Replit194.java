package Replit;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class Replit194 {
    /*
    For you to do:
Create a method that will remove an element based on the specified condition from given List and return new List;
Expected Output:
[USA, Kazakhstan, Pakistan, Russia]
     */
    public static List<String> countryFilter(List<String>countries){
        Iterator<String>itr=countries.iterator();
        while(itr.hasNext()){
            if(itr.next().startsWith("A")){
                itr.remove();
            }
        }
        return countries;
    }
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        System.out.println(Replit194.countryFilter(countries));

    }
}
