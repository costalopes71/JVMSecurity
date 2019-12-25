package com.costalopes;

import java.security.BasicPermission;
import java.security.Permission;

public class WarpPermission extends BasicPermission {

	private static final long serialVersionUID = -4178383317213995487L;
	private final int warp;

	public WarpPermission(String name, String action) {
		super(name, action);
		this.warp = Integer.valueOf(action);
	}

	@Override
	public boolean implies(Permission p) {
		
		if (!(p instanceof WarpPermission))
			return false;
		
		if (super.implies(p)) {
			WarpPermission other = (WarpPermission) p;
			return (warp >= other.warp);
		} else {
			return false;
		}
		
	}
	
}
