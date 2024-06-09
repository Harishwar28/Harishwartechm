package com.app.cmd_line;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmdLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmdLineApplication.class, args);
		System.out.println("starter run");
	}

}
