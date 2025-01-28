package com.interfaces;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Product implements Comparable<Product>{
    private Integer id;
    private String name;
    private Double price;

    @Override
    public int compareTo(Product p) {
        if (this.id < p.id)
            return -1;
        else if (this.id > p.id)
            return 1;
        else
            return 0;
    }
}
