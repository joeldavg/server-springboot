package com.getarrays.server.service;

import java.io.IOException;
import java.util.Collection;

import com.getarrays.server.model.Server;

public interface ServerService {
	
	public Server create(Server server);
	
	public Collection<Server> list(int limit);
	
	public Server get(Long id);
	
	public Server update(Server server);
	
	public Boolean delete(Long id);
	
	public Server ping(String ipAddress) throws IOException;
	
}
