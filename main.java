
import java.util. *;
public class main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("tell me your name!");
String name= scanner.nextLine().toLowerCase();
// checks if its a valid name
if(name.length() == 0) {
    System.out.println("Please give me your real name!");
    return;
}
if("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0,1)) == -1)  {
     System.out.println("Please give me your real name!");
    return;
}
// checks if color is valid
System.out.println("Enter your favorite color (red, blue, green):");
        String color = scanner.nextLine().toLowerCase();
    if (!color.equals("red") && !color.equals("blue") && !color.equals("green")) {
        System.out.println("Invalid color! Please enter red, blue, or green.");
        return;
    }
        
System.out.println("Enter your favourite season(Fall, winter, spring summer):");
String season = scanner.nextLine().toLowerCase();
 if (!season.equals("fall") && !season.equals("winter") &&
            !season.equals("spring") && !season.equals("summer")) {
            System.out.println("Invalid season! Please enter a real season.");
            return;
            }
boolean vowel = "aeiou".indexOf(name.substring(0,1)) >=0;
boolean constonant = !vowel;
String pet = "Rock";
 // Rule 1: Blue and fall = Alligator
        if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
        }

        // Rule 2: Blue and spring = Ostrich
        else if (color.equals("blue") && season.equals("spring")) {
            pet = "Ostrich";
        }

        // Rule 3: Green, consonant, winter = Giraffe
        else if (color.equals("green") && constonant && season.equals("winter")) {
            pet = "Giraffe";
        }

        // Rule 4: Green and not fall = Dog (unless giraffe)
        else if (color.equals("green") && !season.equals("fall")) {
            pet = "Dog";
        }

        // Rule 5: Red and vowel = Porcupine
        else if (color.equals("red") && vowel) {
            pet = "Porcupine";
        }

        // Rule 5: Red and consonant = Panda
        else if (color.equals("red")) {
            pet = "Panda";
        }

        // Rule 6: Summer = Pony (unless dog, panda, porcupine)
        else if (season.equals("summer")) {
            pet = "Pony";
        }
        else if (color.equals("blue") && constonant && !season.equals("summer") && !season.equals("fall"))  {
            pet = "Axolotl";
        }
        System.out.println("Your perfect pet is: " + pet);
        scanner.close();

        


}
}