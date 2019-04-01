package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import vn.codegym.airbnb.model.PropertiesImg;

import java.util.List;

@Mapper
public interface PropertiesImgMapper {
    List<PropertiesImg> findById(int id);
}
