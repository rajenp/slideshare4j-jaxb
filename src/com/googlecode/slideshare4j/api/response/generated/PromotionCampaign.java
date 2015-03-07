/*
 * Copyright 2010 Rajendra Patil
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.21 at 04:29:20 AM GMT+05:30 
//


package com.googlecode.slideshare4j.api.response.generated;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PromotionCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionCampaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SlideshowId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ForTagged" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetedRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SlideshareCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromotionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cpc" type="{}AmountWithCurrency"/>
 *         &lt;element name="Ctr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StartedAt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PausedAt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="UpdatedAt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndedAt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="MaximumDailySpend" type="{}AmountWithCurrency"/>
 *         &lt;element name="ClicksToday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClicksAlltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImpressionsToday" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ForDownload" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PauseCause" type="{}campaignPauseCause"/>
 *         &lt;element name="StateOfCampaign" type="{}campaignState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PromotionCampaign", namespace="")
@XmlType(name = "PromotionCampaign", propOrder = {
    "id",
    "name",
    "slideshowId",
    "forTagged",
    "targetedRegion",
    "slideshareCategory",
    "promotionType",
    "cpc",
    "ctr",
    "startedAt",
    "pausedAt",
    "createdAt",
    "updatedAt",
    "endedAt",
    "maximumDailySpend",
    "clicksToday",
    "clicksAlltime",
    "impressionsToday",
    "forDownload",
    "pauseCause",
    "stateOfCampaign"
})
public class PromotionCampaign {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SlideshowId", required = true)
    protected String slideshowId;
    @XmlElement(name = "ForTagged", required = true)
    protected String forTagged;
    @XmlElement(name = "TargetedRegion", required = true)
    protected String targetedRegion;
    @XmlElement(name = "SlideshareCategory", required = true)
    protected String slideshareCategory;
    @XmlElement(name = "PromotionType", required = true)
    protected String promotionType;
    @XmlElement(name = "Cpc", required = true)
    protected AmountWithCurrency cpc;
    @XmlElement(name = "Ctr")
    protected double ctr;
    @XmlElement(name = "StartedAt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date startedAt;
    @XmlElement(name = "PausedAt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date pausedAt;
    @XmlElement(name = "CreatedAt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date createdAt;
    @XmlElement(name = "UpdatedAt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date updatedAt;
    @XmlElement(name = "EndedAt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date endedAt;
    @XmlElement(name = "MaximumDailySpend", required = true)
    protected AmountWithCurrency maximumDailySpend;
    @XmlElement(name = "ClicksToday")
    protected int clicksToday;
    @XmlElement(name = "ClicksAlltime")
    protected int clicksAlltime;
    @XmlElement(name = "ImpressionsToday")
    protected long impressionsToday;
    @XmlElement(name = "ForDownload")
    protected long forDownload;
    @XmlElement(name = "PauseCause", required = true)
    protected CampaignPauseCause pauseCause;
    @XmlElement(name = "StateOfCampaign", required = true)
    protected CampaignState stateOfCampaign;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the slideshowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlideshowId() {
        return slideshowId;
    }

    /**
     * Sets the value of the slideshowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlideshowId(String value) {
        this.slideshowId = value;
    }

    /**
     * Gets the value of the forTagged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForTagged() {
        return forTagged;
    }

    /**
     * Sets the value of the forTagged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForTagged(String value) {
        this.forTagged = value;
    }

    /**
     * Gets the value of the targetedRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetedRegion() {
        return targetedRegion;
    }

    /**
     * Sets the value of the targetedRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetedRegion(String value) {
        this.targetedRegion = value;
    }

    /**
     * Gets the value of the slideshareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlideshareCategory() {
        return slideshareCategory;
    }

    /**
     * Sets the value of the slideshareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlideshareCategory(String value) {
        this.slideshareCategory = value;
    }

    /**
     * Gets the value of the promotionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * Sets the value of the promotionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionType(String value) {
        this.promotionType = value;
    }

    /**
     * Gets the value of the cpc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountWithCurrency }
     *     
     */
    public AmountWithCurrency getCpc() {
        return cpc;
    }

    /**
     * Sets the value of the cpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountWithCurrency }
     *     
     */
    public void setCpc(AmountWithCurrency value) {
        this.cpc = value;
    }

    /**
     * Gets the value of the ctr property.
     * 
     */
    public double getCtr() {
        return ctr;
    }

    /**
     * Sets the value of the ctr property.
     * 
     */
    public void setCtr(double value) {
        this.ctr = value;
    }

    /**
     * Gets the value of the startedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartedAt() {
        return startedAt;
    }

    /**
     * Sets the value of the startedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartedAt(Date value) {
        this.startedAt = value;
    }

    /**
     * Gets the value of the pausedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPausedAt() {
        return pausedAt;
    }

    /**
     * Sets the value of the pausedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPausedAt(Date value) {
        this.pausedAt = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAt(Date value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAt(Date value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the endedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndedAt() {
        return endedAt;
    }

    /**
     * Sets the value of the endedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndedAt(Date value) {
        this.endedAt = value;
    }

    /**
     * Gets the value of the maximumDailySpend property.
     * 
     * @return
     *     possible object is
     *     {@link AmountWithCurrency }
     *     
     */
    public AmountWithCurrency getMaximumDailySpend() {
        return maximumDailySpend;
    }

    /**
     * Sets the value of the maximumDailySpend property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountWithCurrency }
     *     
     */
    public void setMaximumDailySpend(AmountWithCurrency value) {
        this.maximumDailySpend = value;
    }

    /**
     * Gets the value of the clicksToday property.
     * 
     */
    public int getClicksToday() {
        return clicksToday;
    }

    /**
     * Sets the value of the clicksToday property.
     * 
     */
    public void setClicksToday(int value) {
        this.clicksToday = value;
    }

    /**
     * Gets the value of the clicksAlltime property.
     * 
     */
    public int getClicksAlltime() {
        return clicksAlltime;
    }

    /**
     * Sets the value of the clicksAlltime property.
     * 
     */
    public void setClicksAlltime(int value) {
        this.clicksAlltime = value;
    }

    /**
     * Gets the value of the impressionsToday property.
     * 
     */
    public long getImpressionsToday() {
        return impressionsToday;
    }

    /**
     * Sets the value of the impressionsToday property.
     * 
     */
    public void setImpressionsToday(long value) {
        this.impressionsToday = value;
    }

    /**
     * Gets the value of the forDownload property.
     * 
     */
    public long getForDownload() {
        return forDownload;
    }

    /**
     * Sets the value of the forDownload property.
     * 
     */
    public void setForDownload(long value) {
        this.forDownload = value;
    }

    /**
     * Gets the value of the pauseCause property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignPauseCause }
     *     
     */
    public CampaignPauseCause getPauseCause() {
        return pauseCause;
    }

    /**
     * Sets the value of the pauseCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignPauseCause }
     *     
     */
    public void setPauseCause(CampaignPauseCause value) {
        this.pauseCause = value;
    }

    /**
     * Gets the value of the stateOfCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignState }
     *     
     */
    public CampaignState getStateOfCampaign() {
        return stateOfCampaign;
    }

    /**
     * Sets the value of the stateOfCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignState }
     *     
     */
    public void setStateOfCampaign(CampaignState value) {
        this.stateOfCampaign = value;
    }

}
