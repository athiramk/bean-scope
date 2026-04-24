package beanscope.dto;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	Order order;
	
	public User(Order order) {
		System.out.println("User bean initiated :" + this.hashCode() +
				"\n and Order bean : " + order.hashCode());
	}

}
