package fist_maven_sample;

public class String_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		StringBuilder sb=new StringBuilder("Lorem Ipsum is simply dummy text.");
		System.out.println(sb);
		
		//append -last -new string -add
				sb.append("append example");
				System.out.println(sb);
				
				//insert -index base -add
				sb.insert(5, "insert_check");
				System.out.println(sb);
				
				//replace
				sb.replace(8, 10, "we");
				System.out.println(sb);
				
				//delete
				sb.delete(11, 17);
				System.out.println(sb);
				
				sb.reverse();
				System.out.println(sb);

	}

}
