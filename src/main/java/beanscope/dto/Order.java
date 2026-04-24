package beanscope.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Order {
	
	private final double id = Math.random();

	public Order() {
		System.out.println("Order bean created with hashcode :" + this.hashCode());
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Order bean post construct with hashcode :" + this.hashCode());
	}
	
	public void printId() {
        System.out.println("Order Instance ID: " + id);
    }
}
