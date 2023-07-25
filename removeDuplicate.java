class removeDuplicate{
    public static String removeDuplicatesandSpaces(String str){
     String str1= str.replace(" ","");
      StringBuilder sb = new StringBuilder(str1);
     
     int i,j;
       for(i=0;i<sb.length();i++)
       {
         for(j=i+1;j<sb.length();j++)
         {
           if(sb.charAt(i)==sb.charAt(j))
           {
            sb.deleteCharAt(j);
            j--;
           }
         }
       }
     
        return sb.toString();
	}
	
	public static void main(String args[]){
	    String str = "sun rises sn the east";
	    System.out.println(removeDuplicatesandSpaces(str));
	}
}