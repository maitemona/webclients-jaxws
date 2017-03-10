
package com.ipartek.peliculas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipartek.peliculas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Obtenerpoid_QNAME = new QName("http://com.formacion.ipartek/types", "obtenerpoid");
    private final static QName _ObtenerpoidResponse_QNAME = new QName("http://com.formacion.ipartek/types", "obtenerpoidResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipartek.peliculas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerpoidResponse }
     * 
     */
    public ObtenerpoidResponse createObtenerpoidResponse() {
        return new ObtenerpoidResponse();
    }

    /**
     * Create an instance of {@link Obtenerpoid }
     * 
     */
    public Obtenerpoid createObtenerpoid() {
        return new Obtenerpoid();
    }

    /**
     * Create an instance of {@link PeliculaMensaje }
     * 
     */
    public PeliculaMensaje createPeliculaMensaje() {
        return new PeliculaMensaje();
    }

    /**
     * Create an instance of {@link Pelicula }
     * 
     */
    public Pelicula createPelicula() {
        return new Pelicula();
    }

    /**
     * Create an instance of {@link Genero }
     * 
     */
    public Genero createGenero() {
        return new Genero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenerpoid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.formacion.ipartek/types", name = "obtenerpoid")
    public JAXBElement<Obtenerpoid> createObtenerpoid(Obtenerpoid value) {
        return new JAXBElement<Obtenerpoid>(_Obtenerpoid_QNAME, Obtenerpoid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerpoidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.formacion.ipartek/types", name = "obtenerpoidResponse")
    public JAXBElement<ObtenerpoidResponse> createObtenerpoidResponse(ObtenerpoidResponse value) {
        return new JAXBElement<ObtenerpoidResponse>(_ObtenerpoidResponse_QNAME, ObtenerpoidResponse.class, null, value);
    }

}
