package com.example.caseStudy.mapper;
import com.example.caseStudy.dto.ProductDTO;
import com.example.caseStudy.entities.Product;
import org.apache.commons.io.FileUtils;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

@Mapper
public interface ProductDTOMapper {
    ProductDTOMapper INSTANCE=Mappers.getMapper(ProductDTOMapper.class);

    default ProductDTO toDTO(Product product){
        try{
            byte[] fileContent = FileUtils.readFileToByteArray(new File(product.getImg()));

            String encodedString = Base64.getEncoder().encodeToString(fileContent);

            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(product.getId());
            productDTO.setName(product.getName());
            productDTO.setImg(encodedString);
            productDTO.setPrice(product.getPrice());
            productDTO.setCount(product.getCount());
            productDTO.setTemperature(product.getTemperature());
            return productDTO;
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
