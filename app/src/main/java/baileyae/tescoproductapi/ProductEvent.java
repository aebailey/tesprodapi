/**
 * Copyright (C) 2014 Gimbal, Inc. All rights reserved.
 *
 * This software is the confidential and proprietary information of Gimbal, Inc.
 *
 * The following sample code illustrates various aspects of the Gimbal SDK.
 *
 * The sample code herein is provided for your convenience, and has not been
 * tested or designed to work on any particular system configuration. It is
 * provided AS IS and your use of this sample code, whether as provided or
 * with any modification, is at your own risk. Neither Gimbal, Inc.
 * nor any affiliate takes any liability nor responsibility with respect
 * to the sample code, and disclaims all warranties, express and
 * implied, including without limitation warranties on merchantability,
 * fitness for a specified purpose, and against infringement.
 */
package baileyae.tescoproductapi;

import java.io.Serializable;
import java.util.Date;

public class ProductEvent implements Serializable {


    private Long BaseProductId;
    private String EANBarcode;
    //CheaperAlternativeProductId: "",
    //HealthierAlternativeProductId: "",
    private String ImagePath; //: "http://img.tesco.com/Groceries/pi/966/4015400621966/IDShot_90x90.jpg",
    //private int MaximumPurchaseQuantity; //: 99,
    private String prodName; //: "Pampers Sensitive Baby Wipes 56 Pack",
    private String OfferPromotion; //: "Half Price Was £9.00 Now £4.50",
    private String OfferValidity; //: "valid from 14/1/2015 until 4/2/2015",
    private String OfferLabelImagePath; //: "http://www.tesco.com/Groceries/UIAssets/I/Sites/Retail/Superstore/Online/Product/pos/halfprice.png",
    private String ShelfCategory; //: "",
    private String ShelfCategoryName; //: "",
    private Long Price; //: 4.5,
    private String PriceDescription; //: "£0.02 each",
    private String ProductId; //: "282151867",
    private String ProductType; //: "QuantityOnlyProduct",
    private Long UnitPrice; //: 0.016,
    private String UnitType; //: "EACH"



    public ProductEvent(Long BaseProductId,String EANBarcode,String ImagePath,String prodName) {
    }

    public ProductEvent() {
        this.BaseProductId = BaseProductId;
        this.EANBarcode = EANBarcode;
        this.ImagePath = ImagePath;
        this.prodName = prodName;
    }

    public Long getBaseProductId() {
        return BaseProductId;
    }

    public void setBaseProductId(Long BaseProductId) {
        this.BaseProductId = BaseProductId;
    }

    public String getEANBarcode() {
        return EANBarcode;
    }

    public void setEANBarcode(String EANBarcode) {
        this.EANBarcode = EANBarcode;
    }

    public String getImagePath() {
        return ImagePath;
    }


    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }

    public String getprodName() {
        return prodName;
    }

    public void setprodName(String prodName) {
        this.prodName = prodName;
    }

}
