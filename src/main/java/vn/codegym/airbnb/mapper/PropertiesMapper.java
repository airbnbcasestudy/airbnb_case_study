package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import vn.codegym.airbnb.dto.PropertyImageDTO;
import vn.codegym.airbnb.model.Properties;

import java.util.List;

@Mapper
public interface PropertiesMapper {
    Properties findById(int id);
}
