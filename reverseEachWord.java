public class reverseEachWord 
{

        public static String reverseEach(String str) 
        {
        int i;
           String p="";
           for(i=str.length()-1;i>=0;i--)
           {
           p=p+str.charAt(i);
           }
                String[] words = p.split(" ");
                StringBuilder rev = new StringBuilder();
        
                for (i = words.length - 1; i >= 0; i--) 
                {//length of words is here 5
                    rev.append(words[i]);
        
                    if (i > 0) {
                        rev.append(" ");
                    }
                }
        
                return rev.toString();
            }
        
        public static void main(String args[])
        {
            String str = "sun rises in the east";
            
            System.out.println(reverseEach(str));
        }
    }

