public class StringCalculator {
	public static void main(String[] args){
		String[] tests = {"",
			"1",
			"1,2","1,2,3,4,5,6,7,8,9",
			"34\n222,23	99;\t12-5",
			"43,33. -23[******]77"
		};
		for(int i = 0; i< tests.length; i++){
			System.out.println(Add(tests[i]));
		}
	}

	public static int Add(String input){
		int result = 0;
		String delimiters = "([^\\d+])";
		String[] numbers = input.replaceAll("\\s","").split(delimiters);
		for(int i = 0; i < numbers.length;i++){
			System.out.println(numbers[i]);
			//int number = Integer.parseInt(validate(numbers[i]));
			//result += number;
		}
		return result;
	}

	public static String validate(String item){
		String out = "negative numbers not allowed - %s";
		if(item == "")
			return "0";
		if(Integer.parseInt(item) < 0 )
			return out.format(item);

		return item;
	}
}

