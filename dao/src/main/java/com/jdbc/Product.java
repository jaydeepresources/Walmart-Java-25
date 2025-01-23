package com.jdbc;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Product {
    private Long productId;
    private String productName;
    private Float productPrice;
    private Float productRating;
}
