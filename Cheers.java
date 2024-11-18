// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String article = "an", upperCase = "AEFHILMNORSX";
                String cheerName = args [0];
                int exclamation = Integer.parseInt(args[1]);
                int length = cheerName.length();
                //make all letters capital
                cheerName = cheerName.toUpperCase();
                //print word line by line with proper article:
                for(int i = 0; i < length; i++){
                        if (upperCase.indexOf(cheerName.charAt(i)) != -1){
                                article = "an";
                                System.out.println("Give me " + article + "  " + cheerName.charAt(i)
                                 + ": " + cheerName.charAt(i) + "!");
                        }else{
                                article = "a";
                                System.out.println("Give me " + article + "  " + cheerName.charAt(i)
                                 + ": " + cheerName.charAt(i) + "!");
                        }
                }
                System.out.println("What does that spell?");
                //print exclamation lines:
                for(int i = 0; i < exclamation; i++){
                        System.out.println(cheerName + "!!!");
                }        
        }
}
