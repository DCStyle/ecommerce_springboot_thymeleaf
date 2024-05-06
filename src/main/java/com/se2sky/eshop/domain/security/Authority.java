package com.se2sky.eshop.domain.security;

import org.springframework.security.core.GrantedAuthority;

@SuppressWarnings("serial")
public class Authority implements GrantedAuthority {

	private final String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}
	
	public String getAuthority() {
		return authority;
	}

}
