public class Student extends Person{
    //instance variable
    private int classYear;

    //constructor
    public Student(String a, String b, int c){
        super(a,b);
        this.classYear = c;
    }

    //default constructor
    public Student(){
        super("Jerry","Seinfeld");
        this.classYear = 2024;
    }

    //toString
    public String toString(){
        return this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
    }

    //getter
    public int getClassYear(){
        return this.classYear;
    }

    //setter
    public void setClassYear(int x){
        if (classYear > 2020 && classYear <= 2025){
            this.classYear = x;
        }
    }

}