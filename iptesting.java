import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iptesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ip={"121.18.19.20","2001:0db8:0000:0000:0000:ff00:0042:8329"};
		 String[] validations= new String[ip.length];
	        int count=ip.length;
	        String ipv4Pat = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	        String ipv6Pat = "^([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";
	        Pattern ipv4=Pattern.compile(ipv4Pat, Pattern.CASE_INSENSITIVE);
	        Pattern ipv6=Pattern.compile(ipv6Pat, Pattern.CASE_INSENSITIVE);
	        Matcher mip4,mip6;
	        
	        for(int i=0;i<count;i++) {
	            mip4=ipv4.matcher(ip[i]);
	            mip6=ipv6.matcher(ip[i]);
	            if(mip4.matches())
	                validations[i]="IPv4";
	            else if(mip6.matches())
	                validations[i]="IPv6";
	            else
	                validations[i]="Neither";    
	        }//For loop
		
	        for(int i=0;i<count;i++) {
	        	System.out.print(validations[i]+"\n");
	        }
	        		
		
	}

}
