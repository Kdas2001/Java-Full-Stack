
import java.util.Map;
import java.util.TreeMap;    
class Contact { 
	private long phoneNumber;
    private String name;
    private String email;
    private Gender gender;
  //constructor to create instances of the Contact class     
public Contact(long phoneNumber, String name, String email, Gender gender) 
{       
	this.phoneNumber = phoneNumber;
	this.name = name;    
    this.email = email;    
    this.gender = gender;      
} 
public long getPhoneNumber() {
    return phoneNumber;
}

public String getName() {
    return name;
}

public String getEmail() {
    return email;
}

public Gender getGender() {
    return gender;
}
}
enum Gender {
    MALE, FEMALE
}

public class PhoneNumber {    
public static void main(String[] args) {    
       
    TreeMap<Long,Contact> contactmap=new TreeMap<>(Map.of(12345L,new Contact(12345L, "Krittika Das","kd18@gmail.com",Gender.FEMALE), 56789L, new Contact(56789L, "Parth Pal","pp18@gmail.com",Gender.MALE), 73188L,new Contact(73188L, "Rohit Sen","rs18@gmail.com",Gender.MALE)));    
   
 
    System.out.println("All Keys:");
    for (Long key : contactmap.descendingKeySet()) {
        System.out.println(key);
    }

    
    System.out.println("\nAll Values:");
    int i=1;
    for (Contact contact : contactmap.descendingMap().values()) {
        System.out.println(i+". Name: "+ contact.getName()+", EMail: "+contact.getEmail()+", Gender: "+contact.getGender());
        i++;
    }

   
    System.out.println("\nAll Key-Value Pairs:");
    for (Map.Entry<Long, Contact> entry : contactmap.descendingMap().entrySet()) {
        Long key = entry.getKey();
        Contact contact = entry.getValue();
        System.out.println(key + ", Contact -> " +"Name: "+ contact.getName()+", EMail: "+contact.getEmail()+", Gender: "+contact.getGender());
    }
}
}
  
