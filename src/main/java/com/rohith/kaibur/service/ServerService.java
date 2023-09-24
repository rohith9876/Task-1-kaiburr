package com.rohith.kaibur.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohith.kaibur.model.Server;
import com.rohith.kaibur.repository.ServerRepository;



@Service
public class ServerService {

@Autowired
private ServerRepository serverRepository;

	public Server saveOrUpdate(Server obj) {
		return serverRepository.save(obj);
	}
	public List<Server> findAll(){
		return serverRepository.findAll();
	} 
	public Optional<Server> getServerById(int id) {
        return serverRepository.findById(id);
    }
	public List<Server> getServersByName(String name) {
        List<Server> allServers = serverRepository.findAll();

        return allServers.stream()
                .filter(server -> server.getName().contains(name))
                .collect(Collectors.toList());
    }
	public boolean deleteServerById(int id) {
        if (serverRepository.existsById(id)) {
            serverRepository.deleteById(id);
            return true; // Server deleted successfully
        }
        return false; // Server not found
    }
}
