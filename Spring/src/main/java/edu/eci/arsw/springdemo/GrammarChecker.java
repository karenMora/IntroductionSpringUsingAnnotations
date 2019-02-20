package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GrammarChecker implements SpellChecker{
    
    @Autowired
    private SpellChecker sc;
    @Qualifier("SpanishSpellChecker")
    //@Qualifier("EnglishSpellChecker")

    String x;

    public SpellChecker getSpellChecker() {
        return sc;
    }

    public void setSpellChecker(SpellChecker sc) {
        this.sc = sc;
    }

    public String check(String text) {
        StringBuffer sb = new StringBuffer();
        sb.append("Spell checking output:" + sc.checkSpell(text));
        sb.append("Plagiarism checking output: Not available yet");
        return sb.toString();

    }

    @Override
    public String checkSpell(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
