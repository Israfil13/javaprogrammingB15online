package day16;

public class Practice  {
        public static void main(String[] args) {

            String  word1= "apple";
            String word2="";
            word2=""+  word1.charAt(4)+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0) ;
            word2=word2+  word1.charAt(4)+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0) ;
            word2+=""+word1.charAt(4)+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0) ;

            System.out.println(word1);
            System.out.println(word2);

            String a="Hello";
            a+=" World";
            System.out.println(a);


        }
    }

