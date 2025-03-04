public class StringExtract{
    public static void main(String[] args){
        String input = "t5hj3ui";
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++){
    if (Character.isDigit(input.charAt(i))){
     int repeat = Character.getNumericValue(input.charAt(i));
     
      char previousChar = input.charAt(i - 1);
      for (int j = 1; j < repeat; j++){
                 output.append(previousChar);
                }
            } 
    else if (i == 0 || !Character.isDigit(input.charAt(i))){
                output.append(input.charAt(i));
            }
        }
        System.out.println("Output: " + output);
    }
}

