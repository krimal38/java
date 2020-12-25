package name;
import java.io.IOException;
import java.util.ArrayList;
public class CS_202 {
	
	
	public static void main(String[]args)  {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		try {
		System.out.println(Max(list));
		}
		catch (Exception ex) {
			System.out.println("Error occured");
		}
		
	}
	public static Integer Max(ArrayList<Integer> list) throws IOException{
			if(list.size() == 0) return null;
			
			Integer max = list.get(0);
			for(int i =0; i< list.size(); i++) {
				if(list.get(i) > max)
					max = list.get(i);
			}
			return max;
	}
}	
// output : 5






