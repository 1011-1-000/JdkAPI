package org.spring.aop;

public class PersonServiceBean implements PersonService {
	
	private String userName = null;
	
	public PersonServiceBean(){}
	
	public PersonServiceBean(String userName){
		this.userName = userName;
	}

	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println("我是SAVE方法");
	}

	@Override
	public void update(String name, Integer id) {
		// TODO Auto-generated method stub
		System.out.println("我是UPDATE方法");
	}

	@Override
	public String getPersonName(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("我是getPersonName方法");
		return "example";	
	}

	public String getUserName() {
		return userName;
	}
}
