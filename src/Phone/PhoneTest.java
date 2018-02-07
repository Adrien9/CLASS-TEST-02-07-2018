package Phone;

public class PhoneTest {

	public static void main(String[]args){
		
		Phone phone=new Phone("iPhone", "X", 2017, 999.99);
		
		System.out.println(phone.Brand);
		System.out.println(phone.Name);
		System.out.println(phone.Year);
		System.out.println(phone.Price);
	}

}
