package com.capgemini.Logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CarService {
	private final Logger log=LoggerFactory.getLogger(CarService.class);
	public void process(String input)
	{
		if(log.isDebugEnabled())
		{
			log.warn("Processing car:"+input);
		}
	}

}
