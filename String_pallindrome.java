public class String_pallindrome {
    
        public static boolean checkPalindrome(String str){
             int i,j=str.length()-1,count=0;
     for(i=0;i<str.length()/2;i++){
     
       if(str.charAt(i)!=str.charAt(j)) { 
        count++;
       }
        j--;
     } 
    if(count==0)
    return true;
    else return false;
        }
        
        public static void main(String args[]){
            String str = "apple";
            if(checkPalindrome(str))
                System.out.println("The string is a palindrome!");
            else
                System.out.println("The string is not a palindrome!");
        }
    }

