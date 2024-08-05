package com.study.mybatis.member.service;

import com.study.mybatis.member.vo.Member;

public interface MemberService {
     /*publicabstract*/  int checkId(String userId); 
     int insertMember(Member m);
     
     Member loginMember(Member m);
}
