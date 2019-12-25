package com.costalopes;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.makeItSo(9);
	}

	private void makeItSo(int warp) {
		
		SecurityManager securityManager = System.getSecurityManager();
	
		if (securityManager != null) {
			securityManager.checkPermission(new WarpPermission("maxWarp", String.valueOf(warp)));
		}
		
		System.out.println("Warp now set to: " + warp);
		
	}
	
}
