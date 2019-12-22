package com.costalopes;

public class Main {

	public Main() {
		System.setSecurityManager(new MySecurityManager());
		MySecurityManager securityManager = (MySecurityManager) System.getSecurityManager();
		securityManager.listPermissions();
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}