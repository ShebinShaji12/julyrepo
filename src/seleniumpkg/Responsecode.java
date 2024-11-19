package seleniumpkg;


import java.net.HttpURLConnection;
import java.net.URI;


import org.junit.Test;

public class Responsecode {
	
	String link="https://www.google.com";
	
	@Test
	public void test() throws Exception
	{
		URI ob=new URI(link);
		HttpURLConnection h=(HttpURLConnection)ob.toURL().openConnection();
		int code=h.getResponseCode();
		System.out.println("response code="+code);
	
	}

}
