
public class Strings
{
    public static void main(String[] args)
    {

//        ** To Create A String **

        //1. By Using The new Keyword

//        String s1 = new String("Naveen");
//        System.out.println(s1);

        //2. By Using The String Literals

//        String s2 = "M S Naveen Kumar";
//        System.out.println(s2);

        //3. To Iterate A String

        //-> s2 = "M S Naveen Kumar"
//        for(int i=0;i<s2.length();i++)
//        {
//            System.out.println(s2.charAt(i));
//        }

        //4. To Iterate A String In Reverse Order

        //-> s2 = "M S Naveen Kumar"
        // -> rev = "ramuk neevaN S M";
//        System.out.print("Rev : ");
//        for(int i=s2.length()-1;i>=0;i--)
//        {
//            System.out.print(s2.charAt(i));
//        }

        //5. To Print Only Vowel Characters In A String

//        String s = "Java Is very easy";
//        for (int i = 0; i<s.length();i++)
//        {
//            char c = s.charAt(i);
//            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
//            {
//                System.out.println(c);
//            }
//        }

        //6. To Count The Lower Case , Upper Case , Number & Special Characters In A String

//        String s = "MSNave@2683_*";
//        int LC = 0;
//        int UC = 0;
//        int Num = 0;
//        int SC = 0;
//        for (int i=0;i<s.length();i++)
//        {
//            char c = s.charAt(i);
//            if(c >= 'a' && c <= 'z')
//            {
//                LC++;
//            }
//            else if (c >= 'A' && c <= 'Z')
//            {
//                UC++;
//            }
//            else if (c >= '1' && c <= '9')
//            {
//                Num++;
//            }
//            else
//            {
//                SC++;
//            }
//        }
//        System.out.println("Lower Count Is : "+LC);
//        System.out.println("Upper Count Is : "+UC);
//        System.out.println("Number Count Is : "+Num);
//        System.out.println("Special Char Count Is : "+SC);

        //7. To Arrange the Characters Of A String in Particular Order(Num + SC + LC + UC)

//        String s = "MSNave@2683_*";
//        String LC_Res = "";
//        String UC_Res = "";
//        String Num_Res = "";
//        String SP_Res = "";
//        for (int i = 0 ; i<s.length();i++)
//        {
//            char c = s.charAt(i);
//            if(c >= 'a' && c <= 'z')
//            {
//                LC_Res = LC_Res+c;
//            }
//            else if (c >= 'A' && c <= 'Z')
//            {
//                UC_Res = UC_Res+c;
//            }
//            else if (c >= '1' && c <= '9')
//            {
//                Num_Res = Num_Res+c;
//            }
//            else
//            {
//                SP_Res = SP_Res+c;
//            }
//        }
//        System.out.println("The Order Is : "+Num_Res+SP_Res+LC_Res+

        //8. To Sum The Numbers Present In The Given String

//        String s = "MSNave@2683_*";
//        int sum = 0;
//        for (int i=0;i<s.length();i++)
//        {
//            char c = s.charAt(i);
//            if(c >= '1' && c <= '9')
//            {
//                sum = sum + (int)(c-'0');
//            }
//        }
//        System.out.println("The Sum Is : "+sum);

        //9. To Count The Alphabets In The Given String

//        String s = "MSNave@2567*#";
//        int alpha_count = 0;
//        for (int i = 0 ; i<s.length();i++)
//        {
//            char c = s.charAt(i);
//            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
//            {
//                 alpha_count++;
//            }
//        }
//        System.out.println("Alphabets Count Is : "+alpha_count);

        //10. To Palindrome Check In Java

//        String s = "Malayalam";
//        s = s.toLowerCase();
//        boolean flag = true;
//        int i = 0;
//        int j = s.length()-1;
//        while(i<j)
//        {
//            if(s.charAt(i) != s.charAt(j))
//            {
//                flag = false;
//            }
//            i++;
//            j--;
//        }
//        if(flag)
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not A Palindrome");

        //11. Palindrome Check Using Methods

//        String str = "Malayalam";
//        if(isPalindrome(str))
//        {
//            System.out.println("Palindrome");
//        }
//        else
//        {
//            System.out.println("Not A Palindrome");
//        }
//    }
//
//    public static boolean isPalindrome(String s)

//    {
//        s = s.toLowerCase();
//        int i = 0;
//        int j = s.length()-1;
//        while(i<j)
//        {
//            if(s.charAt(i) != s.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//        return true;

//        //12. Replace The Vowel Characters with underscore In A Given String
//
//        String str = "palindrome";
//        char[] char_array = str.toCharArray();
//        for (int i=0;i<str.length();i++)
//        {
//            char c = str.charAt(i);
//            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//            {
//                char_array[i] = '_';
//            }
//        }//        System.out.println(char_array);

        //12. Replace The Vowel Characters with underscore In A Given String ,
        // If Vowel Count Is Greater Than Or Equal To 3

//        String str = "palindrome"; // amma
//        int count = 0;
//        char[] char_array = str.toCharArray();
//        for (int i=0;i<str.length();i++)
//        {
//            char c = str.charAt(i);
//            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//            {
//                count++;
//            }
//        }
//        if(count>=3)
//        {
//            for (int i = 0 ;i<str.length();i++) {
//                char c = str.charAt(i);
//                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//                {
//                    char_array[i] = '_';
//                }
//            }
//        }
//        System.out.println(char_array);

        //13. Write A Java Program To Print Consecutive Character As Dollar

//        String str = "Bossssaa";
//        char[] chars = str.toCharArray();
//        for (int i=0; i<str.length();i++)
//        {
//            if(str.charAt(i)==str.charAt(++i))
//            {
//                chars[i] = '$';
//            }
//        }
//        System.out.println(chars);

        //15. To Replace The Key With The Given Special Character

//        String str = "Java Is a Very Easy Language";
//        char key = 'a';
//        char special = '@';
//        char[] chars = str.toCharArray();
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==key)
//            {
//                chars[i] = special;
//            }
//        }
//        System.out.println(chars);

        //16. To Print The Key Occurence In A Given String

//        String str = "Java Is Very Easy Language";
//        char key = 'a';
//        int count = 0;
//        for(int i=0;i<str.length();i++)
//        {
//            char c = str.charAt(i);
//            if(c==key)
//            {
//                count++;
//            }
//        }
//        System.out.println("Count Is : "+count);

        //17. To Make The 1st Letter As Capital Of Each Word In A Given String

//        String str = "Java is very easy";
//        char[] chars = str.toCharArray();
//        for(int i=0;i<str.length();i++)
//        {
//            char c = str.charAt(i);
//            if(i==0 || chars[i-1] == ' ')
//            {
//                if(c >= 'a' && c<='z')
//                {
//                    chars[i] = (char) (str.charAt(i) - 32);
//                }
//            }
//        }
//        System.out.println(chars);

        //18. To Reverse the String

//        String str = "Java Is Very Easy";
//        String rev = "";
//        for (int i=str.length()-1;i>=0;i--)
//        {
//            char c = str.charAt(i);
//            rev = rev+c;
//        }
//        System.out.println(rev);
//        //ysaE yreV sI avaJ

        //19. To Reverse Each Word Present In A Given String
        //(By Using The Built-in Split Method)

//        String str = "Java Is Very Easy";
//        String rev = "";
//        String[] s = str.split(" ");
//        for (int i=s.length-1;i>=0;i--)
//        {
//            rev = rev + s[i] +" ";
//        }
//        System.out.print(rev);
//       // Easy Very Is Java

        //20. To Reverse Each Word In A Sentence

//        String str = "Java Is Very Easy";
//        String res = "";
//        int i = 0;
//        while(i<str.length())
//        {
//            int j = i;
//            while (j<str.length()&&str.charAt(j)!=' ')
//            {
//                j++;
//            }
//            int k = j-1;
//            while (k>=i)
//                res = res + str.charAt(k--);
//            if(j<str.length())
//                res = res + ' ';
//            i = j+1;
//        }
//        System.out.println(res);
        // avaJ sI yreV ysaE

        //21. To Reverse The Sentence

//        String str = "Java Is Very Easy";
//        String res = "";
//        int i = str.length()-1;
//        int j = str.length()-1;
//        while (i>0)
//        {
//            while(i>=0 && str.charAt(i)!=' ')
//            {
//                i--;
//            }
//            int k = i+1;
//            while(k<=j)
//                res = res + str.charAt(k++);
//            if(i>=0)
//                res = res + " ";
//            j = i - 1;
//            i = j;
//        }
//        System.out.println(res);
        // Easy Very Is Java

        //22. To Count The No.of Words Present In An Given String

//        String str = "Java Is Very Easy";
//        int count = 0;
//        int i = 0;
//        while(i<str.length())
//        {
//            int j = i;
//            while(i<str.length()&&str.charAt(i)!=' ')
//            {
//                j++;
//                count++;
//            }
//        }
//        System.out.println(count);

        //23. To Remove The Extra Spaces In The Given String

//        String str = "Java Is  Very    easy";
//        String res = "";
//        char[] chars = str.toCharArray();
//        for (int i = 0 ; i < str.length() ; i++)
//        {
//            if(chars[i]==' '&&chars[i+1]==' ')
//            {
//                chars[i] = '\u0000';
//            }
//        }
//        for (int i = 0 ; i < chars.length ; i++)
//        {
//            if(chars[i]!= '\u0000')
//            {
//                res = res + chars[i];
//            }
//        }
//        System.out.println(res);

        //24. To Count The No.Of Words In A Sentence

//        String str = "Java Is Very Easy";
//        str = str.trim();
//        int count = 0;
//        for (int i = 0 ; i < str.length() ; i ++)
//        {
//            char c = str.charAt(i);
//            if(i==0 || c==' ')
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        //25. To Remove The Duplicate Characters From A String

//        String s = "Javadev";
//        String res = "";
//        char[] chars = s.toCharArray();
//
//        for (int i = 0 ; i < s.length() ; i++)
//        {
//            if(chars[i] == '\u0000')
//                continue;
//            for (int j = i+1 ; j < s.length() ; j++)
//            {
//                if(chars[i] == chars[j])
//                {
//                    chars[j] = '\u0000';
//                }
//            }
//            res = res + chars[i];
//        }
//        System.out.println(res);
//        //Javdev

        //26. To Count The Occurance Of Each Character In A Given String

//        String str = "Programming";
//        char[] chars = str.toCharArray();
//        for (int i = 0 ; i < str.length() ; i ++)
//        {
//            int count = 1;
//            if(chars[i]=='\u0000')
//                continue;
//            for (int j = i+1 ; j < str.length() ; j++)
//            {
//                if (chars[i]==chars[j])
//                {
//                    count++;
//                    chars[j] = '\u0000';
//                }
//            }
//            System.out.println(chars[i]+" : "+count);
//        }

        //27. To Add Numbers In a String

//        String str = "Ga123@gan4";
//        int num = 0;
//        int sum = 0;
//        for (int i = 0 ; i < str.length() ; i++)
//        {
//            char c = str.charAt(i);
//            if (Character.isDigit(c))
//            {
//                num = num * 10 + (c - '0');
//            }
//            else
//            {
//                sum = sum + num;
//                num = 0;
//            }
//        }
//        sum = sum + num;
//        System.out.println("sum = "+sum);
//        //127

        //28. To Print Only The Unique Characters In The Given String

//        String str = "Javadev";
//        char[] chars = str.toCharArray();
//        for (int i = 0 ; i< str.length() ; i++)
//        {
//            if(chars[i]=='\u0000')
//                continue;
//            int count = 1 ;
//            for (int j = i+1 ; j < str.length() ; j++)
//            {
//                if(chars[i]==chars[j])
//                {
//                    count++;
//                    chars[j]='\u0000';
//                }
//            }
//            if(count==1)
//                System.out.print(chars[i]);
//        }

        //29. To Print Repeated Characters In A String
        
//        String str = "Javadev";
//        String res = "";
//        char[] chars = str.toCharArray();
//        for (int i = 0 ; i < str.length() ; i++)
//        {
//            for (int j = i+1 ; j < str.length() ; j++)
//            {
//                if (chars[i]==chars[j])
//                {
//                    res = res + chars[i];
//                    res = res + chars[j];
//                }
//
//            }
//        }
//        System.out.println(res);

        //30. To Print The Substrings Of A Given String

//        String str = "Ramana";
//        for (int i = 0 ; i < str.length() ; i++)
//        {
//            for (int j = i+3 ; j< str.length() ; j++)
//            {
//                System.out.println(str.substring(i,j));
//            }
//        }

        //31. To Print The Substring Palindromes in A Given String

//        String str = "Malayalam";
//        str  = str.toLowerCase();
//
//        for (int i = 0 ; i < str.length() ; i++)
//        {
//            for (int j = i+3 ; j < str.length() ; j++)
//            {
//                String res = str.substring(i,j);
//                if(isPalindrome(res))
//                    System.out.println(res);
//            }
//        }

        //32. To Print The Biggest SubString Palindrome In A Given String

//        String s = "Malayalam";
//        String bigPalindrome = "";
//        for (int i = 0 ; i < s.length();i++)
//        {
//           for (int j = i+3;j<s.length() ; j++)
//           {
//               String str = s.substring(i,j);
//               if (isPalindrome(str))
//               {
//                   if (str.length()>bigPalindrome.length())
//                       bigPalindrome = str;
//               }
//           }
//        }
//        System.out.println(bigPalindrome);

        //33. To Print The Smallest Palindrome SubString In A Given Word

//        String s = "Malayalam";
//        String smallPalindrome = s;
//        for (int i = 0 ; i < s.length();i++)
//        {
//            for (int j = i+3;j<s.length() ; j++)
//            {
//                String str = s.substring(i,j);
//                if (isPalindrome(str))
//                {
//                    if (str.length() < smallPalindrome.length())
//                        smallPalindrome= str;
//                }
//            }
//        }
//        System.out.println(smallPalindrome);

        //34. To Print The Occurence Of Each Character In A Given String
        // By Using The "replace()" Method

//        String s1 = "Javadev";
//        String s2 = "";
//        while(s1.length()>0)
//        {
//            char c = s1.charAt(0);
//            s2 = s1.replace(c+"" ,"");
//            int count = s1.length() - s2.length();
//            System.out.println(c+" : "+count);
//            s1 = s2;
//        }

        //35. To Find The Max Occured Character in A Given String

//        String s1 = "aaabbc";
//        char maxChar = ' ';
//        int maxCount = 0 ;
//        while(s1.length()>0)
//        {
//            char c = s1.charAt(0);
//            String s2 = s1.replace(c + "", "");
//            int count = s1.length() - s2.length();
//            if(count>maxCount)
//            {
//                maxCount = count;
//                maxChar = c;
//            }
//            System.out.println(c+" : "+count);
//            s1 = s2;
//        }
//        System.out.println("Max Occured Character "+ maxChar + " = "+maxCount);

        //36. To Find The Min Character in A Given String

//        String s1 = "aaabbc";
//        int minCount = s1.length()-1;
//        char minChar = ' ';
//        while (s1.length()>0)
//        {
//            char c = s1.charAt(0);
//            String s2 = s1.replace(c + "", "");
//            int count = s1.length() - s2.length();
//            if(count<minCount)
//            {
//                minCount = count;
//                minChar = c;
//            }
//            System.out.println(c+" : "+count);
//            s1 = s2;
//        }
//        System.out.println("Min Occured Character " + minChar + " = "+minCount);

        //37. To Find The 2nd Max Element In The String

//        String s1 = "aaaabbbccd";
//        char maxChar1 = ' ';
//        char maxChar2 = ' ';
//        int maxCount1 = 0;
//        int maxCount2 = 0;
//        while(s1.length()>0)
//        {
//            char c = s1.charAt(0);
//            String s2 = s1.replace(c + "", "");
//            int count = s1.length()-s2.length();
//            if(count>maxCount1)
//            {
//                maxCount2 = maxCount1;
//                maxCount1 = count;
//                maxChar2 = maxChar1;
//                maxChar1 = c;
//            }
//            else if (count>maxCount2 && count!=maxCount1)
//            {
//                maxCount2 = count;
//                maxChar2 = c;
//            }
//            s1 = s2;
//        }
//        System.out.println(maxChar2 + " = "+maxCount2);

        //37. To Find The 2nd Min Character in A Given String

//        String s1 = "aaaabbbccd";
//        char minChar1 = ' ';
//        char minChar2 = ' ';
//        int minCount1 = s1.length();
//        int minCount2 = s1.length();
//
//        while(s1.length() > 0)
//        {
//            char c = s1.charAt(0);
//            String s2 = s1.replace(c + "", "");
//            int count = s1.length() - s2.length();
//
//            if(count < minCount1)
//            {
//                minCount2 = minCount1;
//                minChar2 = minChar1;
//                minCount1 = count;
//                minChar1 = c;
//            }
//            else if(count < minCount2 && count != minCount1)
//            {
//                minCount2 = count;
//                minChar2 = c;
//            }
//            s1 = s2;
//        }
//        System.out.println(minChar2 + " = " + minCount2);

        //38. Check Whether The Two Strings Are Anagram OR Not

//        String s1 = "Keep";
//        String s2 = "Peek";
//        if(isAnagram(s1,s2))
//            System.out.println("Anagram");
//        else
//            System.out.println("Not An Anagram");

        //39. To Remove The Duplicate Characters In A Given String
        // By Using Contains() Method

//        String s1 = "Javadev";
//        String s2 = "";
//        for (int i = 0 ; i < s1.length() ; i++)
//        {
//            char c = s1.charAt(i);
//            if(!s2.contains(c+""))
//            {
//                s2 = s2 + c;
//            }
//        }
//        System.out.println(s2);

        //40. To Print The Missing Vowels In A Given String

//        String s1 = "AEIOUaeiou";
//        String s2 = "I Love India";
//        String s3 = "";
//        for (int i = 0 ; i < s1.length() ; i++)
//        {
//            char c = s1.charAt(i);
//            if(!s2.contains(c+""))
//            {
//                s3 = s3 + c;
//            }
//        }
//        System.out.println(s3);

        //41. To Check Whether The String Is Panagram Or Not

//        String s1 = "The Quick Brown Fox Jumps Over An Lazy Dog";
//        if(isPanagram(s1))
//            System.out.println("Panagram");
//        else
//            System.out.println("Not An Panagram");

        //42. i/p : Hello World
        //    o/p : He121 W2r3d

//        String s = "Hello World";
//        String res = "";
//        for (int i = 0 ; i < s.length() ; i++)
//        {
//            char c = s.charAt(i);
//            int occ = 0;
//            int total = 0;
//            for (int j = 0 ; j < s.length() ; j++)
//            {
//                if(s.charAt(j)==c)
//                {
//                    total++;
//                    if(j<=i)
//                    {
//                        occ++;
//                    }
//                }
//            }
//            if(total>1)
//            {
//                res = res + occ;
//            }
//            else res = res + c;
//        }
//        System.out.println(res);

        //43. To Print The Palindrome Words In A Given String

//        String s = "Madam Sir Madam Malayalam";
//        s = s.toLowerCase();
//        String[] str = s.split(" ");
//        for (int i = 0 ; i < str.length ; i++)
//        {
//            if (isPalindrome(str[i]))
//                System.out.println(str[i]);
//        }

        //44. To Print The Occurence Of Each Word In A Given String
        
//        String str = "Java Is Very Very Easy java";
//        str = str.toLowerCase();
//        String[] s = str.split(" ");
//        for (int i = 0 ; i < s.length ; i++)
//        {
//            if(s[i]==" ")
//                continue;
//            int count = 1;
//            for (int j = i + 1 ; j < s.length ; j++)
//            {
//                if (s[i].equals(s[j]))
//                {
//                    count++;
//                    s[j] = " ";
//                }
//            }
//            System.out.println(s[i]+" : "+count);
//        }

        //45. To Remove The Duplicate Words In A Given String

//        String str = "Java Is Very Very Easy Java";
//        String res = "";
//        String[] s = str.split(" ");
//        for (int i = 0 ; i < s.length ; i++)
//        {
//            if(s[i].equals(" "))
//                continue;
//            for (int j = i+1 ; j < s.length ; j++) {
//                if (s[i].equals(s[j])) {
//                    s[j] = " ";
//                }
//            }
//            res = res + s[i] + " ";
//        }
//        System.out.println(res);

        //46. To Swap The 2 String Without Using 3rd Variable

//        String s1 = "Ram";
//        String s2 = "Sita";
//        System.out.println("Before Swapping : ");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println("==== After Swapping ====");
//        s1 = s1 + s2;
//        s2 = s1.substring(0,s1.length()-s2.length());
//        s1 = s1.substring(s2.length());
//        System.out.println(s1);
//        System.out.println(s2);

        //47. To Print The Non - Repeated Character in A Given String
        
//        String str = "aabbcdd";
//        for (int i = 0 ; i < str.length() ; i++)
//        {
//            char c = str.charAt(i);
//            if(str.indexOf(c) == str.lastIndexOf(c))
//            {
//                System.out.println(c);
//                break;
//            }
//        }

        //48. 1st Repeating Character In A Given String

//        String str = "Programming";
//        for (int i = 0 ; i < str.length() ; i++)
//        {
//            char c = str.charAt(i);
//            if(str.indexOf(c) != str.lastIndexOf(c))
//            {
//                System.out.println(c);
//                break;
//            }
//        }

        //49. Last Repeating Character In A Given String

//        String str = "Programming";
//        for (int i = str.length() - 1 ; i >= 0 ; i--)
//        {
//            char c = str.charAt(i);
//            if(str.indexOf(c) != str.lastIndexOf(c))
//            {
//                System.out.println(c);
//                break;
//            }
//        }
        
        //50. To Find The Biggest Word In A Given String

//         String s = "Java Is A Programming Language";
//         String[] str = s.split(" ");
//         String bigWord = "";
//         for (int i = 0 ; i < str.length ; i++)
//         {
//              if(bigWord.length()<str[i].length())
//              {
//                  bigWord = str[i];
//              }
//         }
//        System.out.println(bigWord);

         //51. Smallest Word in A Given String

//        String s = "Java Is A Programming Language";
//        String[] str = s.split(" ");
//        String smallWord = str[0];
//        for(int i = 0 ; i < str.length ; i++)
//        {
//             if(smallWord.length()>str[i].length())
//             {
//                 smallWord = str[i];
//             }
//        }
//        System.out.println(smallWord);

        //52. To Sorting A String

//        String s = "india";
//        char[] ch = s.toCharArray();
//        for (int i = 0 ; i < s.length() ; i++)
//        {
//            for (int j = 0 ; j < s.length()-1-i;j++)
//            {
//                if(ch[j]>ch[j+1])
//                {
//                    char temp = ch[j];
//                    ch[j] = ch[j+1];
//                    ch[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(ch);

        //53. String Compressor
        // I/p : aaabbcdddd
        // O/p : a3b2c1d4

        //1.
//        String str = "aaabbcdddd";
//        int count = 1;
//        for (int i = 0 ; i<str.length()-1; i++)
//        {
//            if(str.charAt(i)==str.charAt(i+1))
//            {
//                count++;
//            }
//            else
//            {
//                System.out.print(str.charAt(i)+""+count);
//                count=1;
//            }
//        }
//        System.out.println(str.charAt(str.length()-1)+""+count);

        //2. By Storing It Into An Another String

//                String str = "aaabbcdddd";
//                String result = "";
//
//                int count = 1;
//
//                for (int i = 0; i < str.length(); i++) {
//
//                    if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1))
//                    {
//                        count++;
//                    }
//                    else
//                    {
//                        result = result + str.charAt(i) + count;
//                        count = 1;
//                    }
//                }
//                System.out.println(result);

        //54. String Permutations

        String str = "abc";
        permutation(str,0,str.length()-1);

    }

//    public static boolean isPalindrome(String str)
//    {
//        int i = 0 ;
//        int j = str.length()-1;
//        while(i<j)
//        {
//            if(str.charAt(i)!=str.charAt(j))
//            {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }

//    public static boolean isAnagram(String s1,String s2)
//    {
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//        if(s1.length()!=s2.length())
//            return false;
//        while(s1.length()>0)
//        {
//            char c = s1.charAt(0);
//            String temp1 =  s1.replace(c+"","");
//            String temp2 =  s2.replace(c+"","");
//            if(temp1.length()!=temp2.length())
//            {
//                return false;
//            }
//            s1 = temp1;
//            s2 = temp2;
//        }
//        return true;
//    }

//    public static boolean isAnagram(String s1 , String s2)
//    {
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//        while(true)
//        {
//            if(s1.length()!=s2.length())
//                return false;
//            if(s1.length()==0 && s2.length() == 0 )
//                return true;
//            char c = s1.charAt(0);
//            s1 = s1.replace(c+"","");
//            s2 = s2.replace(c+"","");
//        }

//    public static boolean isPanagram(String str)
//    {
//        str = str.toLowerCase();
//        if(str.length()<26)
//            return false;
//        for (char c = 'a' ; c <= 'z' ; c++)
//        {
//            if(!str.contains(c+""))
//                return false;
//        }
//        return true;
//    }

    public static void permutation(String s , int start , int end)
    {
        if(start == end)
        {
            System.out.println(s);
            return;
        }
        for (int i = start ; i <= end ; i++)
        {
            String s1 = swap(s,start,i);
            permutation(s1,start+1,end);
        }
    }
    public static String swap(String s , int i , int j)
    {
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

}
