package com.example.springbootnodb.mapper;

import com.example.springbootnodb.dto.ToyDTO;
import com.example.springbootnodb.model.Toy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToyMapper {
    Toy toToy(ToyDTO toyDTO);

    ToyDTO toToyDTO(Toy toy);
}
