package com.zipintelligence.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.zipintelligence.model.Permission;
import com.zipintelligence.model.Role;
import com.zipintelligence.model.RolePermission;
import com.zipintelligence.repository.PermissionRepository;
import com.zipintelligence.repository.RolePermissionRepository;
import com.zipintelligence.repository.RoleRepository;

@RestController
@RequestMapping("api/v1/rolepermission")
public class RolePermissionController {

	@Autowired
	private RolePermissionRepository rolePermissionrepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PermissionRepository permissionRepository;

	@GetMapping("{rolePermissionId}")
	public RolePermission getRolePermission(@PathVariable int rolePermissionId) {
		return rolePermissionrepository.findById(rolePermissionId).get();
	}

	@PostMapping("/associate")
	public boolean associatePermissionToRole(@RequestBody String rolePermissionJsonString) {
		System.out.println("Received JSON string from Postman : " + rolePermissionJsonString);

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			//Permission rolePermissionNewObject = objectMapper.readValue(permissionInput, Permission.class);
			//System.out.println("RolePermission Translated successfully : " + rolePermissionNewObject);
			
			JsonNode jsonNode = new ObjectMapper().readTree(rolePermissionJsonString) ;
			System.out.println("Permission object's permission attribute"+jsonNode.get("Permission").get("permission"));
			
			/*
			 * First create Permission Object. This is one row/record in the Permission
			 * table */
			 Permission permissionObject = new Permission();
			 permissionObject.setPermission(jsonNode.get("Permission").get("permission").toString());
			 permissionObject.setDescription(jsonNode.get("Permission").get("description").toString()) ;
			 permissionRepository.save(permissionObject) ;
			  
			  
			 /* Second, create Role Object. This is one row/record in the Role table */
			 Role roleObject = new Role(); roleObject.setRoleName(jsonNode.get("Role").get("roleName").toString());
			 roleObject.setDescription(jsonNode.get("Role").get("description").toString()) ;
			 roleRepository.save(roleObject) ;
			  
			 /* Third, create RolePermission Object. This is one row/record in the
			 * RolePermission table */
			 RolePermission rolePermission = new RolePermission();
			 rolePermission.setPermission(permissionObject);
			 rolePermission.setRole(roleObject);
			  
			 /* Create Permission, Role, RolePermission in the database */
			  RolePermission saveRolePermissionObject = rolePermissionrepository.save(rolePermission) ;
				
		} catch (Exception e) {
			e.printStackTrace();
		} 

		return true;
	}
	
	@GetMapping("/associate-permission-role")
	public boolean associatePermissionToRole(@RequestParam("permissionId") int permissionId, @RequestParam("roleId") int roleId) {
	    System.out.println("Received from associate-permission-role");
		Permission permission = permissionRepository.findById(permissionId).get();
	    Role role = roleRepository.findById(roleId).get();

	    RolePermission rolePermission = new RolePermission();
	    rolePermission.setPermission(permission);
	    rolePermission.setRole(role);

	    rolePermissionrepository.save(rolePermission);
	    System.out.println("Saved successfully");

	    return true;
	}
	
	@DeleteMapping("/remove-permission")
	public boolean removePermissionFromRole(@RequestParam("permissionId") int permissionId, @RequestParam("roleId") int roleId) {
		System.out.println("Received from remove-permission | PermissionId: "+permissionId + "| Role Id: "+roleId);
	    /*Permission permission = permissionRepository.findById(permissionId).get();
	    Role role = roleRepository.findById(roleId).get();
	    
	    RolePermission rolePermission = new RolePermission();
	    rolePermission.setPermission(permission);
	    rolePermission.setRole(role);*/
	    
	    List<RolePermission> allRolePermissionObjects = rolePermissionrepository.findAll();
	    for (Iterator iterator = allRolePermissionObjects.iterator(); iterator.hasNext();) {
			RolePermission rolePermission = (RolePermission) iterator.next();
			if(rolePermission.getPermission().getId()==permissionId && rolePermission.getRole().getId()==roleId) {
				rolePermissionrepository.delete(rolePermission);
				break;
			}
			
		}

	    System.out.println("Removed successfully");

	    return true; 
	}

	


}
