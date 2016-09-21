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
    private String sex;
    private int height;
    private int weight;
    private String ssn;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;

    ///////////////////////////////////////////////////
    //Constructor to construct the objects within the class PersonCreator and initialize them with certain values

    public PersonCreator (String firstName, String lastName)
    {
        Name = firstName + " " + lastName;
        age = 0;
        sex = "male/female";
        height = 0;
        weight = 0;
        ssn = "100-10-1000";
        phoneNumber = "100-100-1000";
        dateOfBirth = "1-1-1000";
    }

    public int getAge()
    {
        return age;
    }

    public String getSex()
    {
        return sex;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getSSN()
    {
        return ssn;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    ///////////////////////////////////////////////////////////
    //Methods  

    /*
     * Description: This method will set the age of the person.
     * Input: It takes in one parameter of a of type int that will be used to set the age. (This value must also be between 0 and 120)
     * Output: It has a return value of void, beacuse it does not need to return anything, it is simply assigning a field variable to a value that the user inputs.
     * Example: age = 10
     */
    public void setAge (int a)
    {
        if (a > 120 || a <0){
            System.err.println("please enter a valid age");
        } else{
            age = a;
        }
    }

    /*
     * Description: This method will assign a sex to the person. 
     * Input: It takes in one parameter of s of type String that will be used to set the sex of the person. (This value must either be male or female)
     * Output: It has a return value of void, because it does not need to return anything, as it is simply assigning a field variable to a value that the user must input.
     * Example: sex = male
     */
    public void setSex (String s)
    {
        if (s == "male" || s == "female"){
            sex = s;
        } else {
            System.err.println("please enter a valid sex");
        }
    }

    /*
     * Description: This method will assign a height (in inches) to the person.
     * Input: It takes in one parameter of h of type int that will be used to determine how tall the person would be.
     * Output: It has a return value of void, because it does not need to return anything, since its only assigning a field variable to a value that the user must input.
     * Example: height = 72
     */
    public void setheight (int h)
    {
        if (h <= 0) {
            System.err.println("please enter a valid height");
        } else {
            height = h;
        }
    }

    /*
     * Description: This method will assign a weight (in pounds) to the person.
     * Input: It takes in one parameter of w of type int that will be used to determine how much the person weighs.
     * Output: It has a return value of void, because it doesn't need to return anything because it is only assigning a field variable to a value that the user has to input.
     * Example: weight = 150 
     */
    public void setweight (int w)
    {
        if (w <= 0) {
            System.err.println("please enter a valid weight");
        } else {
            weight = w;
        }
    }

    /*
     * Description: This method will assign a Social Security Number to the person.
     * Input: It takes in 3 parameters of ssn1, ssn2, and ssn3. They are all of type int, however the Social Security Number is of type String. This is all used to determine the overall Social Security Number.
     * Output: It has a return value of void, because it does not need to return anything since it is only assigning a field variable to certain values that a user must input.
     * Example: socialsecuritynumber = 123-45-6789
     */

    public void setsocialSecurityNumber (int ssn1, int ssn2, int ssn3)
    {
        boolean invalid = false;
        if (ssn1 < 100 || ssn1 > 999)
        {invalid = true;}
        else if (ssn2 <10 || ssn2 > 99)
        {invalid = true;}
        else if (ssn3 > 9999 || ssn3 < 1000)
        {invalid = true;}

        if (invalid)
        {
            System.err.println ("please enter a valid Social Security Number");
        }
        else { ssn = ssn1 + "-" + ssn2 + "-" + ssn3;}
    }

    /*
     * Description: This method will assign an address to the person.
     * Input: It takes in one parameter of ad of type String, and uses it to assign the address to the person that was created.
     * Output: It has a return value of void, because it does not need to return anything becayse it is only assigning a field variable to a value that the user has to input.
     * Example: address = 3123 45th st
     */
    public void setAddress (String ad)
    {
        address = ad; 
    }

    /*
     * Description: This method will assign a phone number to the person.
     * Input: It takes in three parameters of pn1, pn2, and pn3. They are all of type int, however the phone number as a whole is of type String. This is all used to determine the phone number for the person.
     * Output: It has a return value of void, because it doesn't need to return anything since it is only assigning a field variable to a value that the user inputs.
     * Example: phoneNumber = 123-456-7890
     */
    public void setPhonenumber (int pn1, int pn2, int pn3)
    {
        boolean invalid = false;
        if (pn1 < 100 || pn1 > 999)
        {invalid = true;}
        else if (pn2 <100 || pn2 > 999)
        {invalid = true;}
        else if (pn3 > 9999 || pn3 < 1000)
        {invalid = true;}

        if (invalid)
        {
            System.err.println ("please enter a valid Phone Number");
        }
        else 
        {
            phoneNumber = pn1 + "-" + pn2 + "-" + pn3;
        }
    }

    /*
     * Description: This method will assign a birthday to the person.
     * Input: It takes in three parameters of dob1, dob2, and dob3. They are all of type int, but the date of birth as a whole is of type String.
     * Output: It has a return value of void, because it does not have to return anything since it is only assigning a field variable to a value that the user inputs.
     * Example: Dateofbirth = 10-10-1980
     */
    
    public void setDateofbirth (int dob1, int dob2, int dob3)
    {
        boolean invalid = false;
        if (dob1 < 1 || dob1 > 12)
        {invalid = true;}
        else if (dob2 <1 || dob2 > 31)
        {invalid = true;}
        else if (dob3 > 2016 || dob3 < 1000)
        {invalid = true;}

        if (invalid)
        {
            System.err.println ("please enter a valid Date of Birth");
        }
        else 
        {
            dateOfBirth = dob1 + "-" + dob2 + "-" + dob3; 
        }

    }

    /*
     * Description: This method will print out the class PersonCreator with all of the variables that we assigned to it.
     * Input: It takes in one parameter of Name of type String.
     * Output: It has a return value of void because it does not have to return anything since it is only printing out the information of the Person 
     */
    public void printPersonCreator()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Social Security Number: " + ssn);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Date of birth: " + dateOfBirth);

    }
}