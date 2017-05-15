package com.emelwerx.card_war;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.emelwerx.card_war.service.GameOrchestrator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext appContext = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
        
        GameOrchestrator game = appContext.getBean(GameOrchestrator.class);
        
        game.start(2);
    }
}
