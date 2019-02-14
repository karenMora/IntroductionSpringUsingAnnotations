/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.springdemo.ui;

import edu.eci.arsw.springdemo.GrammarChecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String a[]) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GrammarChecker gc = ac.getBean(GrammarChecker.class);
        //GrammarChecker gc = (GrammarChecker) ac.getBean("GramarChecker");
        System.out.println(gc.check("la la la "));
    }
    @Bean
    public GrammarChecker getGrammarChecker(){
        return new GrammarChecker();
    }
}
