package hibernate;

import javax.persistence.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
@Entity
@Table( name = "reiziger" )
public class Reiziger {

    public Reiziger() {

    }

    public void setReiziger_id(Long id) {
        this.reiziger_id = id;
    }

    @javax.persistence.Id
    public Long getReiziger_id() {
        return reiziger_id;
    }
    @Column(name = "reiziger_id")
    private Long reiziger_id;
    private String voorletters;
    private String tussenvoegsel;
    private String achternaam;
    private Date geboortedatum;
    @OneToOne(
            mappedBy = "Adres",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )    private Adres adres;

    public Adres getAdres() {
        return adres;
    }
    public void setAdres(Adres adres) {
        this.adres = adres;
    }
//    private ArrayList<OVChipkaart> OvChipkaartList;

    public Reiziger(Long id, String vl, String tv, String an, Date gd) {
        this.reiziger_id=id;
        this.voorletters=vl;
        this.tussenvoegsel=tv;
        this.achternaam=an;
        this.geboortedatum=gd;
    }
//    public String getInfo() {
//        return  "{ " + this.extrainfo() + " }";
//    }


//    public String toString() {
//        String AdresObjString = "";
//
//        if (this.adres != null) {
//            AdresObjString += "Adres" + this.adres.getInfo();
//        } else {
//            AdresObjString += "null";
//        }
//
//        String OvChipkaartList = "";
//        if (this.OvChipkaartList != null && !this.OvChipkaartList.isEmpty()) {
//            OvChipkaartList += "chip kaarten lijst[";
//            for (int i=0; i <this.OvChipkaartList.size(); i++) {
//                if (i > 1) {
//                    OvChipkaartList += ", ";
//                }
//                OvChipkaartList += " OvChipkaart" + this.OvChipkaartList.get(i).getInfo();
//            }
//            OvChipkaartList += " ]";
//        } else {
//            OvChipkaartList = "null";
//        }
//
//        String rs = "Reiziger{ ";
//        rs += extrainfo() + ", ";
//        rs += AdresObjString + ", ";
//        rs += OvChipkaartList;
//        rs += " }";
//
//        return rs;
//    }


    private String extrainfo() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String gDatumStr = dateFormat.format(this.geboortedatum);

        String reizigerStr = "";
        reizigerStr += this.reiziger_id + ", ";
        reizigerStr += this.voorletters + ", ";
        reizigerStr += this.tussenvoegsel + ", ";
        reizigerStr += this.achternaam + ", ";
        reizigerStr += gDatumStr;
        return reizigerStr;
    }

//    public Long getId() {
//        return Id;
//    }
//    public void setId(Long id) {
//        Id = id;
//    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

//    public void setAdres(Adres adresObj, boolean relationCalled) {
//        this.adres = adresObj;
//        if (!relationCalled){
//            this.adres.setReiziger(this, true);
//        }
//    }
//    public Adres getAdres() {
//        return adres;
//    }
//
//    public ArrayList<OVChipkaart> getOvChipkaartList() {return this.OvChipkaartList;}
//    public void setOvChipkaartList(ArrayList<OVChipkaart> ovChipkaartList, boolean relationCalled) {
//        this.OvChipkaartList = ovChipkaartList;
//        if (!relationCalled) {
//            for (OVChipkaart ovChipkaart : this.OvChipkaartList) {
//                ovChipkaart.setReiziger(this, true);
//            }
//        }
//    }


    @Override
    public String toString() {
        return "Reiziger{" +
                "reiziger_id=" + reiziger_id +
                ", voorletters='" + voorletters + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboortedatum=" + geboortedatum +
                ", adres=" + adres +

                '}';
    }
}
