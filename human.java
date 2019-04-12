public class Main {

    public static void main(String[] args) {

        Human thisHuman = new Human();

        System.out.println(thisHuman.getAge());
        System.out.println(thisHuman.getWeight());
        System.out.println(thisHuman.getGrowth());
        System.out.println(thisHuman.getName());
    }


}
class Human {

    String age;
    String weight;
    String growth;
    String name;
    String gender;


    Human(String age,String weight,String growth,String name,String sex) {
        this.age = age;
        this.weight = weight;
        this.growth = growth;
        this.name = name;
        this.gender = sex;

    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }

    public String getGrowth(){
        return growth;
    }

    public String getName () {
        return name;
    }





}
