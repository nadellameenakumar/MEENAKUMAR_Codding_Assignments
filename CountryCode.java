package Com.Project.src;

class InvalidCodeException extends Exception{
	InvalidCodeException(String msg){
	super(msg);
	}
}
class Code{
	public String getCountryName(String countrycode) throws InvalidCodeException{
		String country=null;
		int cc=Integer.parseInt(countrycode);
		if(cc>=70 && cc<=99)
			country="Country Name: India";
		else if(cc==908)
			country="Country Name: USA";
		else if(countrycode.equals("011"))
			country="Dail Some where outside";
		else
		{
			try {
				throw new InvalidCodeException("Enter the valid code");
			}
			catch(InvalidCodeException e)
			{
				country="No Country with this code";
			}
		}
		return country;
	}
}

public class CountryCode {
 public static void main(String args[]) throws InvalidCodeException{
	 Code c=new Code();
	 System.out.println(c.getCountryName("908"));
 }
}
