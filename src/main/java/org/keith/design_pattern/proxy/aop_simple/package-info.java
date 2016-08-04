/**
 * 代理模式-AOP
 *
 * 代理模式其实就是AOP的雏形。 上端代码中talk(String msg, String singname)是一个切面。在代理类中的sing(singname)方法是个后置处理方法。
 * 这样就实现了，其他的辅助方法和业务方法的解耦。业务不需要专门去调用，而是走到talk方法，顺理成章的调用sing方法
 * 再从这段代码看：1、要实现代理方式，必须要定义接口。2、每个业务类，需要一个代理类。
 * @date 2016-7-19
 * @author keith
 */
package org.keith.design_pattern.proxy.aop_simple;