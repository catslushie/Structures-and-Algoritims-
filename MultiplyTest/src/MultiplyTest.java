
public class MultiplyTest {

    public static void main(String[] args) {
        Integer x,y;
        do{
            x = Input.getInteger("x: ");
            y = Input.getInteger("y: ");
            System.out.println(multiply(x, y));
        }while(Repeat.repeat());
    }

	private static Integer multiply(Integer x, Integer y) {
		Integer result = 0;
		
		if(y == 1) {
			result = x;
		}
		else {
			result = x + multiply(x,y - 1);
		}
		
		return result;
	}

}
