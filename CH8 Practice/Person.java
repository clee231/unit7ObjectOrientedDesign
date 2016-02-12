import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Person implements Comparable<Person>
{

    String name;
    public Person (String name)
    {
        this.name= name;
    }
    
    public int compareTo(Person otherPerson)
    {
        return (this.name.compareTo(otherPerson.name));  
    }
    
    public static void main(String[] args)
    {
       ArrayList<Person> list = new ArrayList<Person>();
       Scanner scan= new Scanner(System.in);
       for( int i=0; i<10; i++)
       {
           System.out.println(" Print the name: ");
           list.add(new Person(scan.next()));
       }
       Collections.sort(list);
    }
}
