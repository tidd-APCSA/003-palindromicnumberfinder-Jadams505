public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      num++;
      while(!testPalindromicNum(num))
        num++;
      return num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      Integer number = num;
      if(number.toString().equals(reverseNum(num)))
        return true;
      return false;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      Integer number = num;
      String backwards = "";
      int length = number.toString().length();
        for (int i = 0; i < length; i++)
          backwards += number.toString().substring(length - i - 1,length - i);
      return backwards;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + (searchForPalindromicNum(this.num) - this.num) + " miles";
    }
}
