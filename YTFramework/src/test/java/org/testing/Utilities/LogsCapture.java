package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
	public static void takeLoogs(String ClassName, String Message)
	{
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger logger = Logger.getLogger(ClassName);
		logger.info(Message);
		
	}

}
