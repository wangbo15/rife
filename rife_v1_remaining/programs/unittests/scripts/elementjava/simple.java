package elementjava;

import com.uwyn.rife.engine.Element;

public class simple extends Element
{
	public void processElement()
	{
		if (hasSubmission("login"))
		{
			print(getParameter("login")+","+getParameter("password"));
		}
		else
		{
			if (getInput("input1").equals("form"))
			{
				print("<html><body>\n");
				print("<form action=\""+getSubmissionQueryUrl("login")+"\" method=\"post\">\n");
				print("<input name=\"login\" type=\"text\">\n");
				print("<input name=\"password\" type=\"password\">\n");
				print("<input type=\"submit\">\n");
				print("</form>\n");
				print("</body></html>\n");
			}
			else
			{
				print(new Inner().getOutput());
			}
		}
	}
	
	class Inner
	{
		public Inner()
		{
		}
		
		public String getOutput()
		{
			return getInput("input1")+","+getInput("input2");
		}
	}
}
