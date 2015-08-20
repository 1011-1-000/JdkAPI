package org.spring.aop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AOPTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void jdkProxyTest() {
		JDKProxyFactory factory = new JDKProxyFactory();
		PersonService personService = (PersonService) factory.createProxyInstance(new PersonServiceBean("111"));
		personService.save("111111");
	}
	
	@Test
	public void cglibProxyTest() {
		CGLIBProxyFactory factory = new CGLIBProxyFactory();
		PersonServiceBean personServiceBean = (PersonServiceBean)factory.createProxyInstance(new PersonServiceBean("111"));
		personServiceBean.save("111");
	}

}
