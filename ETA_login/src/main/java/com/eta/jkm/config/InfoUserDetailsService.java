package com.eta.jkm.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eta.jkm.domain.Member;
import com.eta.jkm.persistence.MemberRepository;

@Service
public class InfoUserDetailsService {

	@Autowired
	private MemberRepository memberRepo;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional <Member> optional = memberRepo.findById(username);
		if(!optional.isPresent()) {
			throw new UsernameNotFoundException(username + "사용자 없음");
		} else {
			Member m = optional.get();
		return new User(m.getId(), m.getPassword(),
				AuthorityUtils.createAuthorityList(m.getRole().toString()));
		}
	}
}
