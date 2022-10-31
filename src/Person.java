public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean isAdult(){
        return this.getAge() > 18;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age + increment;
    }

    public String toString(){
        return "Name " + this.name + " Age " + this.age;
    }





}
