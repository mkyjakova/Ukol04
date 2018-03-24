package cz.czechitas.webapp;

public class TelefonniKontakt {
    Long id;
    String jmeno;
    String prijmeni;
    String mesto;
    String stat;
    String telefonniCislo;

    public TelefonniKontakt(){}

    public TelefonniKontakt(Long id, String jmeno, String prijmeni, String mesto, String stat, String telefonniCislo) {
        this.id = id;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.mesto = mesto;
        this.stat = stat;
        this.telefonniCislo = telefonniCislo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long newValue) {
        id = newValue;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String newValue) {
        jmeno = newValue;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String newValue) {
        prijmeni = newValue;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String newValue) {
        mesto = newValue;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String newValue) {
        stat = newValue;
    }

    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    public void setTelefonniCislo(String newValue) {
        telefonniCislo = newValue;
    }
}
