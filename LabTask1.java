class student{
    int id;
    String name;
    int age;

    public void displayName(){
        System.out.println("Name: " + name);
    }

    public void displayAge(){
        System.out.println("Age: " + age);
    }
    public void displayId(){
        System.out.println("Id: " + id);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name="Jack";
        s1.age=10;
        s1.id = 99;

        s1.displayName();
        s1.displayAge();
        s1.displayId();
    }
}