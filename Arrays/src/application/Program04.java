package application;

//Comparison between the "for" loop and the "for-each" loop 

public class Program04 {
    public static void main(String[] args) {
        
        String[] vect = new String [] {"Maria", "Bob", "Alex"};

        //for loop:
        for (int i=0; i<vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("-------------------------");
        //for-each loop:
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}