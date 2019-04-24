package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import vn.codegym.airbnb.dto.PropertyImageDTO;
import vn.codegym.airbnb.model.Properties;

import java.util.List;

@Mapper
public interface PropertiesMapper {
    List<Properties> selectPaging(int limit);

    Properties findById(int id);

    void insert(Properties properties);

    Properties findByMaxId();

    void updateImagePath(Properties properties);
}
