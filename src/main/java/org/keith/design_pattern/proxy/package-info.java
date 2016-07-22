/**
 * 代理模式
 * 为其他对象提供一种代理，控制对这个对象的访问
 * 使用场景：
 * 1.远程代理：也就是为一个对象在不同地址空间提供一个局部的代理，来隐藏对象存在不同地址空间的事实(WebService,本地代理类)
 * 2.虚拟代理：创建一个开销很大的对象，通过他来存取一个需要实例化很长时间的真实对象（浏览器使用代理模式优化图片下载，文字先显示，图片以框的形式慢慢加载，代理存储了图片的大小和尺寸）
 * 3.安全代理：控制真实对象访问时的权限
 * 4.
 * @date 2016-7-19
 * @author keith
 */
package org.keith.design_pattern.proxy;