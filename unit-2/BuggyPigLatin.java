public class BuggyPigLatin {

	public static void main(String[] args){
		System.out.println(toPigLatin("stove"));
    }

     public static Boolean isVowel(char c)
        {
            char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
            String s = String.valueOf(c);
            String vs = new String(vowels);
            return s == vs;
        }

        public static String toPigLatin(String word)
        {
            char[] specialChars = { '@', '.', '-', '$', '^', '&' };
            word = word.toLowerCase();
            for(char c : specialChars)
            {
                for(char w : word.toCharArray())
                {
                    if (w == c)
                    {
                        System.out.println("That word has special characters, we will return it as is");
                        return word;
                    }
                }
                
            }

            Boolean noVowels = true;
            for(char letter : word.toCharArray())
            {
                if (isVowel(letter))
                {
                    noVowels = false;
                }
            }

            if (noVowels)
            {
                return word; 
            }

            char firstLetter = word.toCharArray()[0];
            String output = "placeholder";
            if (isVowel(firstLetter) == true)
            {
                output = word + "ay";
            }
            else
            {
                int vowelIndex = -1;
                //Handle going through all the consonants
                for (int i = 0; i <= word.length(); i++)
                {
                    if (isVowel(word.toCharArray()[i]) == true)
                    {
                        vowelIndex = i;
                        break;
                    }
                }

                String sub = word.substring(vowelIndex + 1);
                String postFix = word.substring(0, vowelIndex -1);

                output = sub + postFix + "ay";
            }

            return output;
        }
    }
