public class ReverseLine{
    public static void main(String []args){
            
    String s ="I love Java programming";
    String r="";
    int k=0;
    
  for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
      if(ch==' '){
          String sub1=s.substring(k,i);
          r=' '+sub1 +r;
          k=i+1;
              
          }
      }
  
          String sub2=s.substring(k,s.length());
          r=' '+sub2+r;
        System.out.print(r);
    
    }
}
