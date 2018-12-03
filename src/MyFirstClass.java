public class MyFirstClass {
    private String name;
    private int age = 0;
    private String school = "Unknown";

    MyFirstClass(String Name){ this.name = Name; }
    MyFirstClass(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }
    MyFirstClass(String Name, int Age, String School){
        this.name = Name;
        this.age = Age;
        this.school = School;
    }

    public void printInformation(){
        System.out.println("Name: " + name +" Age: " + age + " School: " + school);
    }

    public String getName(){ return name; }

    public int getAge(){ return age; }

    public String getSchool(){ return school; }
}
