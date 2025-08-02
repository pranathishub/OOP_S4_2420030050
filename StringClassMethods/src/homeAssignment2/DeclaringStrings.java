package homeAssignment2;

public class DeclaringStrings {

	public static void main(String[] args) {
		// Methods of declaring strings
		
		// ordinary variable
		String str = "Hello";
		System.out.println(str);
		
		// Object reference variable
		String str1 = new String("Hi");
		System.out.println(str1);
		
		//Character string
        char ch[]= {'H','e','l','l','o'};
        String str2 = new String(ch,2,3);
        System.out.println(str2);
	}

}
