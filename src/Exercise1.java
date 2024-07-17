
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNumbers(15,1,10);

        System.out.println("Random Numbers:");
        System.out.println(numbers);

        Set<Integer> uniqueNumbers = getUniqueNumbers(numbers);

        System.out.println("\nUnique Numbers:");
        System.out.println(uniqueNumbers);
    }

    public static ArrayList<Integer> generateRandomNumbers(int count,int min,int max){
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<count;i++){
            int num=min+ (int)(Math.random()*((max-min)+1));
            numbers.add(num);
        }
        return numbers;
    }

    public static Set<Integer> getUniqueNumbers(ArrayList<Integer> numbers){
        HashSet<Integer> uniqueNumbers=new HashSet<>(numbers);
        return uniqueNumbers;

    }
}
