import java.util.ArrayList;
public class Demo {
    public void searchBeginF(ArrayList<String> list){
        list.removeIf(a-> a.startsWith("F"));
    }
    public void arr(ArrayList<String> list, char[] a){
        for (int i = 0;i<a.length;i++){
            int num = i;
            String m= ""+a[i];
            list.removeIf(n-> n.startsWith(m));
        }
    }
}
