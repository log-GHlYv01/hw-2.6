import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.*;
import java.util.*;


public class Main {
    public static final Random RANDOM = new Random();
    public static void main(String[] ages){
        doTasc1();
        doTasc2();
        doTasc3();
        doTasc4();
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
    private static void doTasc3 (){
        List<String> words = List.of("test", "test1","Test","test192834756","test","tes","test", "test1", "Test", "test192834756", "test", "tes", "Test", "tes");
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
   }
    private static void doTasc4 () {
        List<String> words = List.of("test", "test1", "Test", "test192834756", "test", "tes", "Test", "tes","test", "test1","Test","test192834756","test","tes","test", "test1", "Test", "test192834756", "test", "tes", "Test", "tes");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer>entry : result.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ "-"+entry.getValue());
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
