package com.godoro.string;

public class BuilderTest {
	
	public static void main(String[] args) {
		//StringBuilder builder=new StringBuilder("Godoro");
		//işi başka bir sınıf oöuşturmak olan sınıflara BUILDER denir
		/*builder.append(" ").append("C/C++");
		builder.append(" ").append("C#");
		builder.append(" ").append("Java");
		builder.append(" ").append("Python");
		builder.append(" ").append("PHP");
		String string=builder.toString();
		*/
		String string=new StringBuilder("Godoro")
		.append(" ").append("C/C++")
		.append(" ").append("C#")
		.append(" ").append("Java")
		.append(" ").append("Python")
		.append(" ").append("PHP")
	     .toString();
		
		System.out.println("Sicim:  "+string);
		
		
		
	}

}
