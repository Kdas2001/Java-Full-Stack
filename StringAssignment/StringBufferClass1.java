/**
 * 
 */

/**
 * 
 */
class StringBufferClass1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuffer sb1=new StringBuffer("StringBuffer");
         StringBuffer sb2=new StringBuffer(" is a peer class of String");
         StringBuffer sb3=new StringBuffer(" that provides much of");
         StringBuffer sb4=new StringBuffer(" the functionality of strings");
         sb1.append(sb2);
         sb1.append(sb3);
         sb1.append(sb4);
         System.out.println(sb1);
	}

}
