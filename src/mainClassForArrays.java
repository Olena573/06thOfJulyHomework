import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class mainClassForArrays {
    //This is a main class for the task 2.

    public static void main (String [] args) {
        //This is a Map for  task 1.
        Map <String, Integer> map = new HashMap<>();
        map.put ("Sir Stripes the First", 12);
        map.put ("Sir Stripes The Second", 23);
        map.put ("Sir Stripes the Third", 24);
        map.put ("Barsik", 25);
        map.put ("BaltazarFefufofaltazar the Third", 0);
        map.put ("Splashie", 78);
        map.put ("Miss Tabby", 87);
        map.put ("Miss Purr", 45);
        map.put ("Rocco", 1);
        map.put ("Fluffers", 101);

        for (Map.Entry <String, Integer> mapping: map.entrySet()){
            System.out.println ("The name of the cat is (it is a key): " + mapping.getKey()+ "." + '\n' +
                    "And a quantity of mice catched by this cat is (it is a value): " + mapping.getValue());
        }


   //This is the ArrayList for task 2.
        ArrayListLanguages <String> arrayLanguages = new ArrayListLanguages<>();
        arrayLanguages.add ("Java");
        arrayLanguages.add ("PHP");
        arrayLanguages.add ("Perl");
        arrayLanguages.add ("C++");
        arrayLanguages.add ("Java");
        arrayLanguages.add ("C++");
        arrayLanguages.add ("C#");

        //Here we print out the "arrayLanguages".
        for (int i=0; i<arrayLanguages.size(); i++){
            System.out.print(arrayLanguages.get(i) + " ");
        }
        System.out.println();

// Поки що маю певну проблему: ось я створила 2 колекціії.
// Знаю, що в першій треба якось порівняти внутрішні значення одне з одним, щоб визначити ті, які повторювались,
// і ті, що не повторювались. Потім видалити за допомогою методу delete ті, що повторювались.
// потім за допомогою clone створити колекцію-клон, в якій будуть всі унікальні значення.
// В третьому завданні також змогла тільки створити ArrayList із заданими значеннями.
// Перепрошую, що не змогла виконати домашку в більшому обсязі - вже не встигала її зробити повністю, і застрягла із
// методами clone () або retainAll(), і порівняннями. Не хочеться робити купу домашок, що просто накопичились би незданими,
// тому просто здаю що є. І якщо встигну, - то перероблю і дороблю, і перездам.
// Можливо, щоб отримати унікальні значення, треба насправді просто видалити зайві, методом видалення або remove.
// Просто мені це чомусь не вдалось.



        // Here we create new collection
      //  ArrayListLanguages <String> arrayUniqueLanguages = new ArrayListLanguages<>();
     //   arrayUniqueLanguages = (ArrayListLanguages)NewArrayList.clone();



     //   ArrayList <String> arrayUniqueLang = (ArrayList <String>)ArrayListLanguages.clone();

        //Here we deleted 2  non-unique values:
    //    arrayUniqueLang.delete (4);
   //     arrayUniqueLang.delete (5);


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

        //Here we print out the "array".
        for (int i=0; i<array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();

    }
}
