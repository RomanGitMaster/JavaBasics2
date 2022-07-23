package Replit;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class Replit205 {
    /*
    Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
Expected Output:
265
22180
PATRICK ST
UNITED STATE
VIENNA
     */
    public static void main(String[] args) {

        HashMap<String,String> address=new HashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");
        Set<Map.Entry<String, String>> entries = address.entrySet();
        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry.getValue().toUpperCase());
        }


    }
}
