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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.corner.service.conveniencecard.common.conveniencecardconfiguration.BasicResponse;


/**
 * <p>Java class for getNapAndCityListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNapAndCityListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.conveniencecard.service.corner.ch/convenienceCardConfiguration}basicResponse">
 *       &lt;sequence>
 *         &lt;element name="napAndCity" type="{http://configuration.conveniencecard.service.corner.ch/convenienceCardConfiguration}napAndCity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listNapAndCity" type="{http://configuration.conveniencecard.service.corner.ch/convenienceCardConfiguration}tListNapAndCity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNapAndCityListResponse", propOrder = {
    "napAndCity",
    "listNapAndCity"
})
public class GetNapAndCityListResponse
    extends BasicResponse
{

    protected List<NapAndCity> napAndCity;
    @XmlElement(required = true)
    protected TListNapAndCity listNapAndCity;

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
     * {@link NapAndCity }
     * 
     * 
     */
    public List<NapAndCity> getNapAndCity() {
        if (napAndCity == null) {
            napAndCity = new ArrayList<NapAndCity>();
        }
        return this.napAndCity;
    }

    /**
     * Gets the value of the listNapAndCity property.
     * 
     * @return
     *     possible object is
     *     {@link TListNapAndCity }
     *     
     */
    public TListNapAndCity getListNapAndCity() {
        return listNapAndCity;
    }

    /**
     * Sets the value of the listNapAndCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TListNapAndCity }
     *     
     */
    public void setListNapAndCity(TListNapAndCity value) {
        this.listNapAndCity = value;
    }

}
