//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 10:56:31 AM GMT+01:00 
//


package com.shifthunter.conveniencecardconfigurationmock;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tListNapAndCity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tListNapAndCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NapAndCity" type="{http://www.shifthunter.com/convenienceCardConfigurationMock}tNapAndCity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tListNapAndCity", propOrder = {
    "napAndCity"
})
public class TListNapAndCity {

    @XmlElement(name = "NapAndCity")
    protected List<TNapAndCity> napAndCity;

    /**
     * Gets the value of the napAndCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the napAndCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNapAndCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNapAndCity }
     * 
     * 
     */
    public List<TNapAndCity> getNapAndCity() {
        if (napAndCity == null) {
            napAndCity = new ArrayList<TNapAndCity>();
        }
        return this.napAndCity;
    }

}
