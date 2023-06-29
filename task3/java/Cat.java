import java.util.List;
import java.util.function.Predicate;

public class Cat {
    private String name;
    private int age;
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    static public List<Cat> sort(List<Cat> list,int age,char letter){
        Predicate<Cat> pr1 = a -> a.getAge() < age;
        Predicate<Cat> pr2 = b -> b.getName().charAt(0) < letter;
        list.removeIf(pr1);
        list.removeIf(pr2);
        return list;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
