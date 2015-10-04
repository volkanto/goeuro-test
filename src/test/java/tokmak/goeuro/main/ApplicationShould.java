package tokmak.goeuro.main;

import java.io.IOException;

import org.junit.Test;

/**
 * <b>Project GoEuroTest</b><br />
 * ApplicationShould.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class ApplicationShould 
{
	@Test(expected=IllegalArgumentException.class) public void
	throws_exception_when_argument_is_null() throws IOException
	{
		Application.main(null);
	}
	
	@Test(expected=IllegalArgumentException.class) public void
	throws_exception_when_argument_is_empty() throws IOException
	{
		String[] arguments = {}; 
		Application.main(arguments);
	}
	
	@Test(expected=IllegalArgumentException.class) public void
	throws_exception_when_argument_is_more_than_one() throws IOException
	{
		String[] arguments = {"Ankara", "Berlin"}; 
		Application.main(arguments);
	}
	
	@Test(expected=IllegalArgumentException.class) public void
	throws_exception_when_suggest_list_is_empty() throws IOException 
	{
		String[] arguments = {"Unknown city"};
		Application.main(arguments);
	}
}
