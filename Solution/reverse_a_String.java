class Reverse
{
  
    public static String reverseWord(String str)
    {
        String s="";
        int n = str.length();
        // Reverse the string str
        for(int i=n-1; i>=0; i--){
            s += str.charAt(i);
        }
        
        return s;
    }
}