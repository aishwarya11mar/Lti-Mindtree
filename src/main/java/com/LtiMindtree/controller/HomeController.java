package com.LtiMindtree.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.LtiMindtree.excel.UserExcelImporter;
import com.LtiMindtree.model.Student;
import com.LtiMindtree.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web")
public class HomeController {
	@RequestMapping("/home")
	public String homePage() {
		return "HomePage";
	}

	@Autowired
	private StudentRepository studentRepo;



	@RequestMapping("/import/excel")
	@ResponseBody
	public String importFromExcel() {
		UserExcelImporter excelImporter=new UserExcelImporter();
		List<Student> listStudent= excelImporter.excelImport();
		studentRepo.saveAll(listStudent);
		return "Import Successfully";
	}

}
