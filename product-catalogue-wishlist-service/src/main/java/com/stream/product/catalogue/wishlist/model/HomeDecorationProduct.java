package com.stream.product.catalogue.wishlist.model;

import com.stream.product.catalogue.wishlist.enums.*;
import com.stream.product.catalogue.wishlist.factory.Product;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "home_decoration_product")
public class HomeDecorationProduct implements Product {
    //Step 1: Define the Product Interface or abstract class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID productId;//findByProductId
    private String skuCode;// findBySkuCode
    private String brandName;
    private ProductCategory productCategory;
    private ProductSubCategory productSubCategory;
    private AgeGroup ageGroup;
    private Gender gender;
    private Color color;
    private Size size;



    private String productName;
    private String imageUrl;
    private BigDecimal price;
    private Double discount;
    private String arrival;// old, new
    private String manufacturedCompany;
    private String manufacturedCompanyLocation;//address
    private String manufacturedCompanyCountry;
    private String manufacturedDate;
    private String featureDetails;// like Electronics -> SmartPhone->>200mega pixel camera, dual camera, AI based adjustments etc
    private String description;


    @Override
    public String getProductInformation() {
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeDecorationProduct that = (HomeDecorationProduct) o;

        if (! Objects.equals(id, that.id)) return false;
        if (! Objects.equals(productId, that.productId)) return false;
        if (! Objects.equals(skuCode, that.skuCode)) return false;
        if (! Objects.equals(brandName, that.brandName)) return false;
        if (productCategory != that.productCategory) return false;
        if (productSubCategory != that.productSubCategory) return false;
        if (ageGroup != that.ageGroup) return false;
        if (gender != that.gender) return false;
        if (color != that.color) return false;
        if (size != that.size) return false;
        if (! Objects.equals(productName, that.productName)) return false;
        if (! Objects.equals(imageUrl, that.imageUrl)) return false;
        if (! Objects.equals(price, that.price)) return false;
        if (! Objects.equals(discount, that.discount)) return false;
        if (! Objects.equals(arrival, that.arrival)) return false;
        if (! Objects.equals(manufacturedCompany, that.manufacturedCompany))
            return false;
        if (! Objects.equals(manufacturedCompanyLocation, that.manufacturedCompanyLocation))
            return false;
        if (! Objects.equals(manufacturedCompanyCountry, that.manufacturedCompanyCountry))
            return false;
        if (! Objects.equals(manufacturedDate, that.manufacturedDate))
            return false;
        if (! Objects.equals(featureDetails, that.featureDetails))
            return false;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (productCategory != null ? productCategory.hashCode() : 0);
        result = 31 * result + (productSubCategory != null ? productSubCategory.hashCode() : 0);
        result = 31 * result + (ageGroup != null ? ageGroup.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        result = 31 * result + (manufacturedCompany != null ? manufacturedCompany.hashCode() : 0);
        result = 31 * result + (manufacturedCompanyLocation != null ? manufacturedCompanyLocation.hashCode() : 0);
        result = 31 * result + (manufacturedCompanyCountry != null ? manufacturedCompanyCountry.hashCode() : 0);
        result = 31 * result + (manufacturedDate != null ? manufacturedDate.hashCode() : 0);
        result = 31 * result + (featureDetails != null ? featureDetails.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HomeDecorationProduct{" +
                "id=" + id +
                ", productId=" + productId +
                ", skuCode='" + skuCode + '\'' +
                ", brandName='" + brandName + '\'' +
                ", productCategory=" + productCategory +
                ", productSubCategory=" + productSubCategory +
                ", ageGroup=" + ageGroup +
                ", gender=" + gender +
                ", color=" + color +
                ", size=" + size +
                ", productName='" + productName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", arrival='" + arrival + '\'' +
                ", manufacturedCompany='" + manufacturedCompany + '\'' +
                ", manufacturedCompanyLocation='" + manufacturedCompanyLocation + '\'' +
                ", manufacturedCompanyCountry='" + manufacturedCompanyCountry + '\'' +
                ", manufacturedDate='" + manufacturedDate + '\'' +
                ", featureDetails='" + featureDetails + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
