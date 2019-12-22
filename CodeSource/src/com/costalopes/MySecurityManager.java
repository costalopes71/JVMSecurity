package com.costalopes;

import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Enumeration;

public class MySecurityManager extends SecurityManager {

	public void listPermissions() {
		
		// obtendo o arquivo policy
		Policy policy = Policy.getPolicy();
		Class<?>[] classes = getClassContext();
		
		for (Class<?> cls : classes) {
			ProtectionDomain pd = cls.getProtectionDomain();
			CodeSource codeSource = pd.getCodeSource();
			
			PermissionCollection permissionCollection = policy.getPermissions(codeSource);
			Enumeration<Permission> permissions = permissionCollection.elements();
			
			while(permissions.hasMoreElements()) {
				System.out.println(permissions.nextElement());
			}
			
		}
		
	}

}
