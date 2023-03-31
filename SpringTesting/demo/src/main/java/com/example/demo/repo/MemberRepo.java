package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Member;

@Repository
public class MemberRepo {
	
	public List<Member> getMembers()
	{
		List<Member> li = new ArrayList<Member>();
		li.add(new Member("jdjwthwa","Jhanvi", "123", "F"));
		return li;
	}
	
	public Member getMemberByEmail(String email)
	{
		return new Member("jdjwthwa","Jhanvi", "123", "F");
	}
}
