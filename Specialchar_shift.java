class Specialchar_shift{
    
    public static String moveSpecialCharacters(String str){
		String b = " ";
        String c = " ";
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                b = b + str.charAt(i);
            } else {
                c = c + str.charAt(i);
            }
        }
        
        String z = b + c;
        z = z.replace(" ", "");
        return z;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}