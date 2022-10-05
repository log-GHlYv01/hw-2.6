import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;


public class Main {
    public static final Random RANDOM = new Random();
    public static void main(String[] ages){
        doTasc1();
        doTasc2();
    }
    private static void doTasc1 (){
        List<Integer> nums = genereit(20);
        for (Integer num : nums ) {
            if (num % 2==1){
                System.out.println(num);
            }
        }
    }
    private static void doTasc2 (){
        List<Integer> nums = genereit(20);
        Set<Integer> result = new TreeSet<>(nums);
        for (Integer num : nums ) {
            if (num % 2==0){
                System.out.println(num);
            }
        }
        }
    public static List<Integer> genereit (int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(0, 20));
        }
        System.out.print("Сгенерированые числа:" + list);
        return list;
    }
}
