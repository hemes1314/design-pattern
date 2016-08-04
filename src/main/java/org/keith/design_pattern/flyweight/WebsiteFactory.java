package org.keith.design_pattern.flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class WebsiteFactory {

	private static ConcurrentHashMap<String, Website> websites = new ConcurrentHashMap<String, Website>();
	
	public Website createWebSite(String name) {
		
		if(websites.containsKey(name)) {
			return websites.get(name);
		} else {
			Website website = new ConcreateWebsite(name);
			websites.put(name, website);
			return website;
		}
	}
	
	public int getWebsiteNum() {
		return websites.size();
	}
	
	public String getWebsiteNames() {
		return websites.toString();
	}
}
