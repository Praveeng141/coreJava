package strings;

public class StringReplace {

	public static void main(String[] args) {
		String str="rgba(36,93,193,1)";
		
		String[] value=str.replace("rgba(", "").replace(")","").split(",");
		
		for(int i=0;i<value.length; i++)
		{
			System.out.println(value[i]);
		}

	}

}
