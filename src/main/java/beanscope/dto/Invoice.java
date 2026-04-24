package beanscope.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session")
public class Invoice {
	 
	public Invoice() {
		System.out.println("Invoice bean created : " + this.hashCode());
	}
	

}
