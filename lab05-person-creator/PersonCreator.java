
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    //Field Variables 

    private String Name;
    private int age;
    private String Sex;
    private int height;
    private int weight;
    private String socialSecurityNumber;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;

    ///////////////////////////////////////////////////
    //Constructor to construct the objects within the class PersonCreator and initialize them with certain values

    public PersonCreator (String firstName, String lastName)
    {
        Name = firstName + lastName;
    }
    
    public void age()
    {
        age = 0;
    }

    public void sex()
    {
        Sex = "male/female";
    }

    public void height()
    {
        height = 0;
    }

    public void weight()
    {
        weight = 0;
    }

    public void socialSecurityNumber()
    {
        socialSecurityNumber = "100-10-1000";
    }

    //*Not sure about adress*//

    public void phoneNumber()
    {
        phoneNumber = "100-100-1000";
    }

    public void dateOfBirth()
    {
        dateOfBirth = "1-1-1000";
    }

    ///////////////////////////////////////////////////////////
    //Methods  

    public void changeName (String firstName, String lastName)
    {
        String Name = firstName + lastName;
    }

    public void changeAge (int a)
    {
        if (a > 120 || a <1){
            System.err.println("please enter a valid age");
        } else{
            age = a;
        }
    }

    public void changeSex (String s)
    {
        if (s == "male" || s == "female"){
            Sex = s;
        } else {
            System.err.println("please enter a valid sex");
        }
    }
}

