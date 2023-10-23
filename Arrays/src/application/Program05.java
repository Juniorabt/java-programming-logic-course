package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program05 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        //Add an element 
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        
        list.add(2,"Marco"); //Add a new element to an existing position

        System.out.println(list.size());  //To inform the size of the list
        
        for (String x : list) {  //To test the list:
            System.out.println(x);
        }

        System.out.println("---------REMOVE----------");
        list.removeIf(x -> x.charAt(0) == 'M');  //To remove an element from a predicate
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------FIND ELEMENT----------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));  //To find an element position
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("----------FILTER AN ELEMENT----------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //To filter an element
        for(String x : result) {
            System.out.println(x);
        }
        
        System.out.println("----------FILTER A PREDICATE----------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}