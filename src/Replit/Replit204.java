package Replit;


import java.util.Iterator;
import java.util.LinkedHashMap;

public class Replit204 {
    /*
    Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
Expected output:
Patrick ST
265
Vienna
22180
United State
     */
    public static void main(String[] args) {

        LinkedHashMap<String,String> address=new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        Iterator<String> iterator=address.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
