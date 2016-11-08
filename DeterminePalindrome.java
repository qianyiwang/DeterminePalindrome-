public class DeterminePalindrome {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        String str_reverse = sb.toString();
        if(str.equals(str_reverse)){
            return true;
        }
        else{
            return false;
        } 
    }

    public static void main(String args[]){
    	System.out.println(isPalindrome(12321));
    }
}