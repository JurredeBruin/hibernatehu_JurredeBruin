package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
@Entity
@Table( name = "Product" )
public class Product {
    public void setProduct_nummer(Long id) {
        this.product_nummer = id;
    }

    @Id
    public Long getProduct_nummer() {
        return product_nummer;
    }
    public Product() {

    }






    private Long product_nummer;
    private String naam;
    private String beschrijving;
    private double prijs;
//    private ArrayList<OVChipkaart> ovlist;

    public Product(Long product_nummer, String naam, String beschrijving, double prijs) {
        this.product_nummer=product_nummer;
        this.naam=naam;
        this.beschrijving=beschrijving;
        this.prijs=prijs;
    }

//    public Long getProduct_nummer() {
//        return product_nummer;
//    }
    public String getNaam(){
        return naam  ;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

//    public void setProduct_nummer(Long product_nummer) {
//        this.product_nummer = product_nummer;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "product_nummer=" + product_nummer +
                ", naam='" + naam + '\'' +
                ", beschrijving='" + beschrijving + '\'' +
                ", prijs=" + prijs +
                '}';
    }

//    public ArrayList<OVChipkaart> getOvChipkaartList() { return ovlist; }
//    public void setOvChipkaartList(ArrayList<OVChipkaart> ovChipkaartList, boolean relationCalled) {
//        this.ovlist = ovChipkaartList;
//
//        for (OVChipkaart ovChipkaart : this.ovlist) {
//            ArrayList<Product> productList = new ArrayList();
//            productList.add(this);
//            ovChipkaart.setProductList(productList, true);
//        }
//    }


}
