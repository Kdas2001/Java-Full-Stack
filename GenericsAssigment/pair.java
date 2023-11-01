import java.util.*;
class pairValue<K extends String, V> {
	
	private K key;
	private V value;
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	 public V getValue() {
		 return value;
	 }
	 
	 @Override
	 public String toString() {
		 return (getKey() + ":" +getValue());
	 }

}


public class pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		pairValue<String,String> object1 = new pairValue<>();
		String key = sc.nextLine();
		object1.setKey(key);
		String value = sc.nextLine();
		object1.setValue(value);
		System.out.println(object1.toString());
		
		
		pairValue<String, java.util.Date> object2 = new pairValue<>();
		String key2 = sc.nextLine();
		object2.setKey(key2);
		object2.setValue(new java.util.Date());
		System.out.println(object2.toString());
		}
}