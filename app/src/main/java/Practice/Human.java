package Practice;

public class Human {

    String name;
    int age;
    float height;
    float weight;
    String race;

    public Human(String name, int age, float height, float weight, String race) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.race = race;
    }

    void bodyLanguage() {
        System.out.println("*Sit, Stand, Walk, Run*");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public static void main(String[] args) {
        Human roman = new Human ("Roman", 15, 69, 137, "Native American/Mexican");
        roman.bodyLanguage();
        System.out.println("Hiii:" + roman.getName());
        System.out.println("Roman's age is 15" + roman.getAge());
        System.out.println("Roman's height is 69 inches" + roman.getHeight());
    }

}
