
package tp2_soap_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idOffre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbLits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dateDispo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="urlImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offre", propOrder = {
    "idOffre",
    "nbLits",
    "prix",
    "dateDispo",
    "urlImage"
})
public class Offre {

    protected String idOffre;
    protected int nbLits;
    protected double prix;
    protected int dateDispo;
    protected String urlImage;

    /**
     * Obtient la valeur de la propriété idOffre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOffre() {
        return idOffre;
    }

    /**
     * Définit la valeur de la propriété idOffre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOffre(String value) {
        this.idOffre = value;
    }

    /**
     * Obtient la valeur de la propriété nbLits.
     * 
     */
    public int getNbLits() {
        return nbLits;
    }

    /**
     * Définit la valeur de la propriété nbLits.
     * 
     */
    public void setNbLits(int value) {
        this.nbLits = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété dateDispo.
     * 
     */
    public int getDateDispo() {
        return dateDispo;
    }

    /**
     * Définit la valeur de la propriété dateDispo.
     * 
     */
    public void setDateDispo(int value) {
        this.dateDispo = value;
    }

    /**
     * Obtient la valeur de la propriété urlImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImage() {
        return urlImage;
    }

    /**
     * Définit la valeur de la propriété urlImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImage(String value) {
        this.urlImage = value;
    }

}
