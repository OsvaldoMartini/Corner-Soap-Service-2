//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.14 at 01:15:52 PM GMT+01:00 
//


package ch.corner.service.conveniencecard.configuration.conveniencecardconfiguration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ch.corner.service.conveniencecard.common.conveniencecardconfiguration.BasicResponse;


/**
 * <p>Java class for getDecodedPF20Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDecodedPF20Response">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.conveniencecard.service.corner.ch/convenienceCardConfiguration}basicResponse">
 *       &lt;sequence>
 *         &lt;element name="element" type="{http://configuration.conveniencecard.service.corner.ch/convenienceCardConfiguration}pf20Element" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDecodedPF20Response", propOrder = {
    "element"
})
public class GetDecodedPF20Response
    extends BasicResponse
{

    protected List<Pf20Element> element;

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pf20Element }
     * 
     * 
     */
    public List<Pf20Element> getElement() {
        if (element == null) {
            element = new ArrayList<Pf20Element>();
        }
        return this.element;
    }

}
