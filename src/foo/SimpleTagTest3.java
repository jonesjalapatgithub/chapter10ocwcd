package foo;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest3 extends SimpleTagSupport  {

	String[] str={"persuit of happiness","saving private ryan","room"};
	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().setAttribute("strArray", str);
		for (int i = 0; i < str.length; i++) {
			
		}
		getJspBody().invoke(null);
	}

	
}
