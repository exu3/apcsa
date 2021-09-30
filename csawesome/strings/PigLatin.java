public class PigLatin
{
   public static void main(String[] args)
   {

       String word = "potato";

       // Use word.substring to construct word in pig latin
       String pigLatin = word.substring(1) + word.substring(0,1) + "ay";

       System.out.println(word + " in Pig Latin is " + pigLatin);
   }
}