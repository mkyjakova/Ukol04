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
            new TelefonniKontakt(500L, "Jan", "Cimrman", "Brno", "Cesko", "+420 123 654"),
            new TelefonniKontakt(501L, "Petr", "Hastrman", "Bratislava", "Slovensko", "+420 123 321"),
            new TelefonniKontakt(502L, "Izák", "Piloman", "Viden", "Cesko", "+420 123 999")
    );

    @RequestMapping("/kontakty.html")
    public ModelAndView zobrazKontakty(){
    ModelAndView drzakNaDataAJmenoSablony = new ModelAndView("kontakty");

    drzakNaDataAJmenoSablony.addObject("seznamKontaktu", kontakty);

    return drzakNaDataAJmenoSablony;
}

    @RequestMapping("/kontakty/{id}.html")
    public ModelAndView zobrazDetail(@PathVariable("id") Long id){
    ModelAndView drzakNaDataAJmenoSablony2 = new ModelAndView("detail");

    for (int i =0; i < kontakty.size(); i++){
        TelefonniKontakt kontakt = kontakty.get(i);
        if (kontakt.getId() == id){
            drzakNaDataAJmenoSablony2.addObject("jedenKontakt", kontakt);
        }
    }
        return drzakNaDataAJmenoSablony2;
    }
}


