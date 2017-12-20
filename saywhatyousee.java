
public class saywhatyousee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] input={"12","21"};
			String iValue; 
			String[] output=new String[input.length];
			int i=0;
			
			while (i < input.length) {
				iValue=input[i];
				
				StringBuilder sb = new StringBuilder();
				int count = 1;
				for (int j = 1; j < iValue.length(); j++) {
					if (iValue.charAt(j) == iValue.charAt(j - 1)) {
						count++;
					} else {
						sb.append(count);
						sb.append(iValue.charAt(j - 1));
						count = 1;
					}
				}
		 
				sb.append(count);
				sb.append(iValue.charAt(iValue.length() - 1));
				iValue = sb.toString();
				output[i]=iValue;
				i++;
			}//while
			for(String s:output) {
			System.out.println(s);
			}
	}

}
