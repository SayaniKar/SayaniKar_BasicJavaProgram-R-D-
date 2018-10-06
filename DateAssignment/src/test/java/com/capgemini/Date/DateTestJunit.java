package com.capgemini.Date;

import org.junit.Assert;
import org.junit.Test;

public class DateTestJunit {
	@Test
	public void getTestDifference_1()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(06,04,2011));
		Assert.assertEquals(result,0);
	}
	@Test
	public void getTestDifference_2()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,04,2011));
		Assert.assertEquals(result,12);
	}
	@Test
	public void getTestDifference_3()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,05,2011));
		Assert.assertEquals(result,42);
	}
	@Test
	public void getTestDifference_4()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,06,2011));
		Assert.assertEquals(result,73);
	}
	@Test
	public void getTestDifference_5()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2011));
		Assert.assertEquals(result,256);
	}
	@Test
	public void getTestDifference_6()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2012));
		Assert.assertEquals(result,622);
	}
	@Test
	public void getTestDifference_7()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2013));
		Assert.assertEquals(result,987);
	}
	@Test
	public void getTestDifference_8()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2113));
		Assert.assertEquals(result,37511);
	}
	@Test
	public void getTestDifference_9()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2413));
		Assert.assertEquals(result,147084);
	}
	@Test
	public void getTestDifference_10()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2813));
		Assert.assertEquals(result,293181);
	}
	@Test
	public void getTestDifference_11()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,01,2011),new MyDate(06,03,2011));
		Assert.assertEquals(result,59);
	}
	@Test
	public void getTestDifference_12()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,01,2012),new MyDate(06,03,2012));
		Assert.assertEquals(result,60);
	}
	@Test
	public void getTestDifference_13()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,02,2012),new MyDate(06,03,2012));
		Assert.assertEquals(result,29);
	}
	@Test
	public void getTestDifference_14()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(22,01,2012),new MyDate(15,11,2012));
		Assert.assertEquals(result,298);
	}
	@Test
	public void getTestDifference_15()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06,02,2012),new MyDate(06,12,2012));
		Assert.assertEquals(result,304);
	}
}
