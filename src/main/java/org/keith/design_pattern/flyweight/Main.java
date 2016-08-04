package org.keith.design_pattern.flyweight;


public class Main {

	public static void main(String[] args) {
		
		WebsiteFactory wsf = new WebsiteFactory();
		Website ws1 = wsf.createWebSite("新闻");
		ws1.use();
		Website ws2 = wsf.createWebSite("新闻");
		ws2.use();
		Website ws3 = wsf.createWebSite("新闻");
		ws3.use();
		Website ws4 = wsf.createWebSite("博客");
		ws4.use();
		Website ws5 = wsf.createWebSite("博客");
		ws5.use();
		Website ws6 = wsf.createWebSite("博客");
		ws6.use();
		System.out.println(wsf.getWebsiteNames());
		System.out.println(wsf.getWebsiteNum());
	}
}
