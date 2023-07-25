public class RemoveSpaces {
   

        public static String removeWhiteSpaces(String str){
            String p=str.replace(" ","");
            return p;
    
        }
        
        public static void main(String args[]){
            String str = "Hello   How are you   ";
            str = removeWhiteSpaces(str);
            System.out.println(str);
        }
    }

