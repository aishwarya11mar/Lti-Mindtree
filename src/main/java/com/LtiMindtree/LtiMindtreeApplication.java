package com.LtiMindtree;

import com.LtiMindtree.excel.UserExcelImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.LtiMindtree.repository.StudentRepository;

@SpringBootApplication
public class LtiMindtreeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LtiMindtreeApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void run(String... args) throws Exception {
	System.out.println("Done");
	UserExcelImporter user=new UserExcelImporter();
	user.excelImport();
	}

}
