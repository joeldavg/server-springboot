package com.getarrays.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getarrays.server.model.Server;

public interface ServerRepository extends JpaRepository<Server, Long> {
	
	public Server findByIpAddress(String ipAddress);
	
}
