/**
 * 
 */

/**
 * 
 */
class StringBuilderClass1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1=new StringBuilder("StringBuffer");
		StringBuilder sb2=new StringBuilder(" is a peer class of String");
        StringBuilder sb3=new StringBuilder(" that provides much of");
        StringBuilder sb4=new StringBuilder(" the functionality of strings");
        sb1.append(sb2);
        sb1.append(sb3);
        sb1.append(sb4);
        System.out.println(sb1);

	}

}
