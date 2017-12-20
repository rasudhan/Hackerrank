
public class hacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String encrypted_message="Bjj rwkcs dwpyp fwz ovors wxjs vje tcez fqg";
		String decrypted_message="";
        char c;int ascii;
        String key="8251220";
        char[] keys=key.toCharArray();
        char rotate; int rValue,j=0;
        
        for(int i=0;i<encrypted_message.length();i++) {
            c=encrypted_message.charAt(i);
            ascii=(int)c;
            if(ascii>=65 && ascii<=90) {
                rotate=keys[j];
                rValue=Integer.parseInt(String.valueOf(rotate));
                ascii-=rValue;
                if(ascii<65) {
                    ascii+=26;
                }
                j++;
                decrypted_message+=(char)ascii;
            }//if for A-Z
            else if(ascii>=97 && ascii<=122) {
                rotate=keys[j];
                rValue=Integer.parseInt(String.valueOf(rotate));
                ascii-=rValue;
                if(ascii<97) {
                    ascii+=26;
                }
                j++;
                decrypted_message+=(char)ascii;
            }// if for a-z
            else {
                decrypted_message+=(char)ascii;
            }//for non-alphabetical characters
            if(j==key.length()) {
                j=0; //reset index from beginning
            }
            
        }//End For loop
        
      
		System.out.println(decrypted_message);
		
		
	}

}
