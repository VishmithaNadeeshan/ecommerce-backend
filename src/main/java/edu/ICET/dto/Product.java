package edu.ICET.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Integer code;
    private String category;
    private String name;
    private Double price;
    private String image;
}
