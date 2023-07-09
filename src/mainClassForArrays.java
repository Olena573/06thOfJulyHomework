import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class mainClassForArrays {
    //This is a main class for the task 2.

    public static void main (String [] args) {
        //This is a Map for  task 1.
        Map <String, Integer> map = new HashMap<>();
        map.put ("Sir Stripes the First", 12);
        map.put ("Sir Stripes The Second", 23);
        map.put ("Sir Stripes the Third", 24);
        map.put ("Barsik", 25);
        map.put ("BaltazarFefufofaltazar the Third", 56);
        map.put ("Splashie", 78);
        map.put ("Miss Tabby", 87);
        map.put ("Miss Purr", 45);
        map.put ("Rocco", 56);
        map.put ("Fluffers", 101);

        for (Map.Entry <String, Integer> mapping: map.entrySet()){
            System.out.println ("The name of the cat is (it is a key): " + mapping.getKey()+ "." + '\n' +
                    "And a quantity of mice catched by this cat is (it is a value): " + mapping.getValue());
        }


      /*  //This is the ArrayList for task 2.
        ArrayListLanguages <String> arrayLanguages = new ArrayListLanguages<>();
        arrayLanguages.add ("Java");
        arrayLanguages.add ("Python");
        arrayLanguages.add ("Perl");
        arrayLanguages.add ("C++");
        arrayLanguages.add ("Java");
        arrayLanguages.add ("C++");
        arrayLanguages.add ("C#");



        //This is an ArrayList for task 3.
        NewArrayList<Integer> array = new NewArrayList<>();

        array.add (1);
        array.add (2);
        array.add (3);
        array.add (5);
        array.add (4);
        array.add (3);
        array.add (2);
        array.add (1);
        array.add (2);
        array.add (3);
        array.add (5);

       */
    }
}
