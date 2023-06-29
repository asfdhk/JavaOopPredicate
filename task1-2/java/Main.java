import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        char a[] ={'f','l','s'};
        Demo demo  =new Demo();
        ArrayList<String> list = new ArrayList<>();
        list.add("FJKL");
        list.add("kjnjl");
        list.add("Foopk");
        list.add("ljljk");
        list.add("sd");
        System.out.println(list);
        demo.arr(list,a);
        demo.searchBeginF(list);
        System.out.println(list);
    }
}
