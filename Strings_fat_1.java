// You are using Java
import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        String words[] = input.split(" ");
        String min = words[0];
        String max = words[0];
          for (String word : words) {
            if (word.length() < min.length()) {
                min = word;
            }
            if (word.length() > max.length()) {
                max = word;
            }
        }

        System.out.println("Smallest word: " + min);
        System.out.println("Largest word: " + max);
    }
}