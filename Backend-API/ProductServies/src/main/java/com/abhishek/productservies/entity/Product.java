package com.abhishek.productservies.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

  @Id

@GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

@Column(name = "PRODUCT_NAME")
    private  String productName;

@Column(name = "PRICE")
private  long price;

@Column(name = "QUANTITY")
private long quantity;


@Column(name = "PRODUCT_DESC")
private String discription;

}
