package Exception;

public class ThrowKeywordDemo {
	static void validateAge(int age) throws AgeNotValidExcepton
	{
		if (age>=18)
		{
			System.out.println("Eligibale to vote");
		}
		else
			throw new AgeNotValidExcepton("not eligible to vote");
	}
	public static void main(String[] args) {
		try {
			validateAge(19);
		}
		catch(AgeNotValidExcepton e)
		{
			System.out.println(e.getMessage());
		}
	}
}
