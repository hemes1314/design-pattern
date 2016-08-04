package org.keith.design_pattern.templateMethod;


public abstract class TestPaper {

	protected void question1() {
		System.out.println("1.杨过得到，后来给了郭靖，炼成倚天、屠龙刀的玄铁是？A：球墨铸铁 B：马口铁 C：高速合金钢 D：碳素纤维");
		System.out.println("答案："+answer1());
	}
	
	protected void question2() {
		System.out.println("2.杨过、程英、陆无双铲除了情花，造成[] A：使这种植物不能再害人 B：是一种珍稀植物灭绝 C：破坏了生态平衡 D：造成地区沙漠化");
		System.out.println("答案："+answer2());
	}
	
	protected void question3() {
		System.out.println("3.蓝凤凰致使华山师徒、桃谷六仙呕吐不止，吃什么药？A：阿司匹林 B：牛黄解毒片 C：氟哌酸 D：喝生牛奶 E：打坐、冥想");
		System.out.println("答案："+answer3());
	}
	
	abstract String answer1();
	
	abstract String answer2();
	
	abstract String answer3();
}
