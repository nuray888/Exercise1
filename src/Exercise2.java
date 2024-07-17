import java.util.LinkedList;
public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<Character> lowercaseLetters = generateLowercases();
        LinkedList<Character> uppercaseLetters = generateUppercases();

        LinkedList<String> mergedLetters = mergeLists(lowercaseLetters, uppercaseLetters);

        System.out.println("Merged List of English Letters:");
        for (String letter : mergedLetters) {
            System.out.print(letter + ", ");
        }

    }
    public static LinkedList<Character> generateLowercases(){
        LinkedList<Character> lowercaseLetters=new LinkedList<>();
        for(char i='a';i<='z';i++){
           lowercaseLetters.add(i);

        } return lowercaseLetters;

    }
    public static LinkedList<Character> generateUppercases(){
        LinkedList<Character> uppercaseLetters=new LinkedList<>();
        for(char i='A';i<='Z';i++){
            uppercaseLetters.add(i);

        } return uppercaseLetters;

    }
    public static LinkedList<String> mergeLists(LinkedList<Character> lowercase,LinkedList<Character> uppercase){
        LinkedList<String> mergedList=new LinkedList<>();
        for (int i = 0; i <26 ; i++) {
            mergedList.add(String.valueOf(lowercase.get(i))+String.valueOf(uppercase.get(i)));
        }
        return mergedList;
    }
}
