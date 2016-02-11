
public class PersonTester
{
  public static Person firstPerson(Person [] people)
  {
      Person first= people[0];
      for (int i=0; i<people.length; i++)
      {
          if (people[i].compareTo(first)<0)
          {first=people[i];
            }
        }
      return first;
    }
}
