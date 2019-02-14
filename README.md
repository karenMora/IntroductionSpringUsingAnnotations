# Introduction to Spring and Configuration using annotations




# Part I - Basic workshop

- Making use of the Spring configuration based on annotations mark with the annotations @Autowired and @Service the dependencies that must be injected, and the 'beans' candidates to be injected -respectively-:

1. GrammarChecker will be a bean, which depends on something like 'SpellChecker'.

2. EnglishSpellChecker and SpanishSpellChecker are the two possible candidates to be injected. One must be selected, or another, but NOT both (there would be dependency resolution conflict). For now, have EnglishSpellChecker used.

![](/img/SpringMain.png)
![](/img/springGrammar.png)
![](/img/SpringEnglish.png)
![](/img/springOutput.png)

* ---> @Autowired: 
* ---> @Service: 
* ---> @Component: 
* ---> @Bean: 


# Part II
- Modify the configuration with annotations so that the Bean 'GrammarChecker' now makes use of the SpanishSpellChecker class (so that GrammarChecker is injected with EnglishSpellChecker instead of SpanishSpellChecker.) Verify the new result.

![]()
![]()
![]()
![]()
![]()
![]()
![]()

