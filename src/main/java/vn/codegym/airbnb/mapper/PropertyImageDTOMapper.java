package vn.codegym.airbnb.mapper;


import org.apache.ibatis.annotations.Mapper;
import vn.codegym.airbnb.dto.PropertyImageDTO;

import java.util.List;

@Mapper
public interface PropertyImageDTOMapper {
    List<PropertyImageDTO> selectAll();

    PropertyImageDTO findById(int id);
}
