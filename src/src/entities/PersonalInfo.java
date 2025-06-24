package entities;

public class PersonalInfo {
    private String name;
    private int currencyGlucose;
    private String time;
    private int age;
    private int insulinUnit;

    public PersonalInfo(String name, int age, int insulinUnit){
        this.name = name;
        this.age = age;
        this.insulinUnit = insulinUnit;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInsulinUnit(int insulinUnit) {
        this.insulinUnit = insulinUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public int getInsulinUnit(){
        return insulinUnit;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", currencyGlucose=" + currencyGlucose +
                ", time='" + time + '\'' +
                ", age=" + age +
                ", insulinUnit=" + insulinUnit +
                '}';
    }
}
