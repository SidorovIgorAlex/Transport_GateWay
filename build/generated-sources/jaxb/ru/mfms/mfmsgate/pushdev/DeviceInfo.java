//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.25 at 05:50:09 PM MSK 
//


package ru.mfms.mfmsgate.pushdev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isPushActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isMain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = {
    "deviceName",
    "deviceUID",
    "deviceToken",
    "isPushActive",
    "isMain"
})
public class DeviceInfo {

    @XmlElement(required = true)
    protected String deviceName;
    @XmlElement(required = true)
    protected String deviceUID;
    @XmlElement(required = true)
    protected String deviceToken;
    protected boolean isPushActive;
    protected Boolean isMain;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceUID() {
        return deviceUID;
    }

    /**
     * Sets the value of the deviceUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceUID(String value) {
        this.deviceUID = value;
    }

    /**
     * Gets the value of the deviceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * Sets the value of the deviceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceToken(String value) {
        this.deviceToken = value;
    }

    /**
     * Gets the value of the isPushActive property.
     * 
     */
    public boolean isIsPushActive() {
        return isPushActive;
    }

    /**
     * Sets the value of the isPushActive property.
     * 
     */
    public void setIsPushActive(boolean value) {
        this.isPushActive = value;
    }

    /**
     * Gets the value of the isMain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMain() {
        return isMain;
    }

    /**
     * Sets the value of the isMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMain(Boolean value) {
        this.isMain = value;
    }

}
