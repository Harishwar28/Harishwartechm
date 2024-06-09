package com.app.datajpa.repoimpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.app.datajpa.model.Product;
import com.app.datajpa.repo.ProductRepository;

@Component
public class OperationRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	
	public void run(String...args) throws Exception {
		//insert operation
		/*1.************* save**************/
		repo.save(new Product("Pen",6.8,"Blue"));
		repo.save(new Product("Mobile",5000.90,"Black"));
		repo.save(new Product("LapTop",75000.00,"Grey"));
		
		//2 find operations
		Optional <Product> p = repo.findById(5);
		if(p.isPresent())
		{
			System.out.println(p.get());
		}
		else {
			System.out.println("No Data foound");
		}
		//see all the rows of the table.
		repo.findAll().forEach((System.out::println));
	}

}