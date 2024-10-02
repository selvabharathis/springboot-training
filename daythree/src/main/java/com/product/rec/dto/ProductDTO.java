package com.product.rec.dto;

import javax.validation.constraints.*;

import lombok.Data;

@Data
public class ProductDTO {

    private Long productId;

    @NotNull(message = "Product availability is mandatory")
    @PositiveOrZero(message = "Product availability must be zero or a positive number")
    private Long productAvailability;

    private String description;

    @NotBlank(message = "Product name is mandatory")
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String productName;

    @NotNull(message = "Product price is mandatory")
    @Positive(message = "Product price must be a positive number")
    private Long productPrice;

}
