package com.banasiak.CalCount.mapper;

import com.banasiak.CalCount.dto.ProductNameDto;
import com.banasiak.CalCount.model.Product;

import java.util.List;

public class ProductDtoMapper {

    public static List<ProductNameDto> mapProductToProductNameDto(List<Product> products){
        return products.stream()
                .map(product -> new ProductNameDto(product.getProductId(), product.getName()))
                .toList();
    }

}
