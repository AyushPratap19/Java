public class maxOccurance {
   

        public static int findHighestOccurrence(String str){
        int i,j,count=0,count1=0;
        char a;
        
            for(i=0;i<str.length();i++)
        {
        a=str.charAt(i);
        count=0;
            for(j=0;j<str.length();j++)
        {
        if(a==str.charAt(j))
        count++;
        }
        if(count>count1)
        {
        count1=count;
        }
        }
        
        
            return count1;
        }
        
        public static void main(String args[]){
            String str = "associated";
            System.out.println(findHighestOccurrence(str));
        }
    }

