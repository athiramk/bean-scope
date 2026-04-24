package beanscope.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beanscope.dto.Invoice;
import beanscope.dto.Order;
import beanscope.dto.User;

@RestController
@Scope("prototype")
@RequestMapping(path = "/api")
public class TestController {

	User user;
	Order order;
	Invoice invoice;
	
	public TestController(User user, Order order, Invoice invoice) {
		this.user = user;
		this.order = order;
		this.invoice = invoice;
		System.out.println("TestController bean initialized : " + this.hashCode() + "\n and user bean : "+ user.hashCode() + "\n and order bean : "
				+ order.hashCode() + " \n and Invoice nean : " + invoice.hashCode());
	}

	@GetMapping(path = "/welcome")
	public String welcome() {
		
		 order.printId();
		System.out.println("TestController bean in the http request : " + this.hashCode() + "\n and user bean : "+ user.hashCode() + "\n and order bean : "
				+ order.hashCode());
		return "hello";
	}
	
}
