package org.keith.design_pattern.bridge;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Light light = new Light();
    	Fan fan = new Fan();
    	
        NormalSwitch normalSwitch = new NormalSwitch();
        normalSwitch.setEquip(light);
        normalSwitch.on();
        normalSwitch.off();
        
        FancySwitch fancySwitch = new FancySwitch();
        fancySwitch.setEquip(fan);
        fancySwitch.on();
        fancySwitch.off();
    }
}
