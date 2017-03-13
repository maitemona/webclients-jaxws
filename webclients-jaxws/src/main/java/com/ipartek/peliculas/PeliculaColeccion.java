
package com.ipartek.peliculas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for peliculaColeccion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="peliculaColeccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pelicula" type="{http://com.ipartek.formacion/types}pelicula" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peliculaColeccion", propOrder = {
    "pelicula"
})
public class PeliculaColeccion {

    @XmlElement(nillable = true)
    protected List<Pelicula> pelicula;

    /**
     * Gets the value of the pelicula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pelicula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPelicula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pelicula }
     * 
     * 
     */
    public List<Pelicula> getPelicula() {
        if (pelicula == null) {
            pelicula = new ArrayList<Pelicula>();
        }
        return this.pelicula;
    }

}
