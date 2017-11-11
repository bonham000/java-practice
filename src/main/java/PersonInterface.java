import java.util.ArrayList;

interface PersonInterface {
    public String getName();
    public Integer getAge();
    public ArrayList<String> getInterests();
    public ArrayList<String> getSkills();

    public void setName(String name);
    public void setAge(Integer age);
    public void addInterest(String interest);
    public void addSkill(String skill);
}
