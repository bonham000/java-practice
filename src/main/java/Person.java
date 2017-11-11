import java.util.ArrayList;

public class Person implements PersonInterface, ClimberInterface {
    private String name;
    private Integer age;
    private ArrayList<String> skills;
    private ArrayList<String> interests;

    private String climbingLevel;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.skills = new ArrayList<>();
        this.interests = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                ", interests=" + interests +
                ", climbingLevel='" + climbingLevel + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public ArrayList<String> getInterests() {
        return this.interests;
    }

    @Override
    public ArrayList<String> getSkills() {
        return this.skills;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void addInterest(String interest) {
        this.interests.add(interest);
    }

    @Override
    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    @Override
    public void setClimbingLevel(String level) {
        this.climbingLevel = level;
    }

    @Override
    public String getClimbingLevel() {
        return null;
    }
}






