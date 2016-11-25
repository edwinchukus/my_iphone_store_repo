package string.function;

public class String_Functions {

	public static void main(String[] args) {
		
		String name = "This is the way";
		String name1 = "This is the way";
		String name2 = "This is the way let go";
		
		name.charAt(3);
		name.length();
		name.indexOf("t");
		name.indexOf("s");
		name.contains(name1);
		
	
		
		System.out.println(name.contains(name1));
        System.out.println(name.charAt(3));
        System.out.println(name.length());
        System.out.println(name.indexOf("t"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.equals(name1));
        System.out.println(name.substring(0, 10));
        
        
  
         String weather[] = name.split(" ");
         
         for (int i=0; i<weather.length;i++)
         System.out.println(weather[i]);
        

	}

}
