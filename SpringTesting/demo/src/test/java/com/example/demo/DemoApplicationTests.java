package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.model.Member;
import com.example.demo.repo.MemberRepo;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	MockMvc mm;
	
	@Autowired
	MemberRepo mr;
	
	
	@Test
	void testContoller() throws Exception{
		 mm.perform(MockMvcRequestBuilders.get("/home")).andExpect(status().isOk());
	}
	@Test
	void negativeController() throws Exception{
		mm.perform(MockMvcRequestBuilders.get("/index123")).andExpect(status().isNotFound());
	}
	@Test
	void checkValues() throws Exception
	{
		mm.perform(MockMvcRequestBuilders.get("/index")).andExpect(content().string(containsString("Hello")));
	}
	
	@Test
	public void testRepoClass() throws Exception
	{
		when(mr.getMemberByEmail("jdjwthwa")).thenReturn(new Member("jdjwthwa","Jhanvi", "123", "F"));
	}
}
