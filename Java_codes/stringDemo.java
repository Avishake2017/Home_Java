class stringDemo{
	public static void main(String[] args) {
		String s = "Java 102 \"Programming Course\" ";
		//System.out.println(s);
		String[] s1 = s.split(" ");
		String s2 = s1[0];
		String s3 = s1[1];
		String s4 = s1[2];
		String s5 = s1[3];
		 //System.out.println(s);
		 //System.out.println(s2);
		 //System.out.println(s3);
		 //System.out.println(s4);
		 System.out.println("Course Name :"+s2);
		 System.out.println("Course Number :"+s3);
		 System.out.println("Course Description :"+s4+" "+s5);

	}
}