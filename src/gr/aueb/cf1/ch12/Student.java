package gr.aueb.cf1.ch12;


/**
 * Data class
 * POJO (Plain Old Java Project)
 * Java Bean
 */
public class Student {
    private static int studentsCount = 0;
    private int id;
    private String firstname;
    private String lastname;

    //Default constructor
    public Student() {
        studentsCount++;
    }

    //Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        this.id -= id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}


//Default constructor
    //public Student() {
        //id = 0;
        //firstname = null;
        //lastname = null;
    //}

   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}*/


