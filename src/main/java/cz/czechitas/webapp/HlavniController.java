package cz.czechitas.webapp;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    private static final List<TelefonniKontakt> kontakty = Arrays.asList(
            new TelefonniKontakt(500L, "Ada", "Lovelace", "Londýn", "UK", "+44 123 654"),
            new TelefonniKontakt(501L, "Hypatia", "z Alexandrie", "Alexandria", "Egypt", "+20 123 321"),
            new TelefonniKontakt(502L, "Mary", "Wollstonecraft", "Hoxton", "UK", "+44 123 999"),
            new TelefonniKontakt(503L, "Simone", "de Beauvoir", "Paríž", "Francúzsko", "+33 321 879"),
            new TelefonniKontakt(504L, "Amelia", "Earhart", "Atchison", "USA", "+1 321 987"),
            new TelefonniKontakt(505L, "Marie", "Skłodowska-Curie", "Varšava", "Poľsko", "+48 321 465"),
            new TelefonniKontakt(506L, "Marie Zdeňka", "Baborová", "Praha", "Česko", "+420 654 465"),
            new TelefonniKontakt(507L, "Zora", "Jesenská", "Martin", "Slovensko", "+421 963 465"),
            new TelefonniKontakt(508L, "Kráľovná", "Nzinga", "Ndongo", "Angola", "+244 963 465"),
            new TelefonniKontakt(509L, "Sor Juana Inés", "de la Cruz", "San Miguel Nepantla", "Nové Španielsko", "+52 922 465")
    );

    @RequestMapping("/kontakty.html")
    public ModelAndView zobrazKontakty(){
        ModelAndView drzakNaDataAJmenoSablony = new ModelAndView("kontakty");

        drzakNaDataAJmenoSablony.addObject("seznamKontaktu", kontakty);

        return drzakNaDataAJmenoSablony;
    }

    @RequestMapping("/kontakty/{id}.html")
    public ModelAndView zobrazDetail(@PathVariable("id") Long idKontaktu) {
        ModelAndView drzakNaDataAJmenoSablonyKontakt = new ModelAndView("detail");
        TelefonniKontakt jedenKontakt = null;
        
        for (int i = 0; i < kontakty.size(); i++){
            jedenKontakt = kontakty.get(i);
            if (jedenKontakt.getId().equals(idKontaktu)){
                break;
            }
        }
        drzakNaDataAJmenoSablonyKontakt.addObject("jedenKontakt", jedenKontakt);
        return drzakNaDataAJmenoSablonyKontakt;
    }
}


