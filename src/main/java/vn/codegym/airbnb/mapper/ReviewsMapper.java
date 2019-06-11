package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import vn.codegym.airbnb.dto.ReviewsDTO;

import java.util.List;

@Mapper
public interface ReviewsMapper {
    List<ReviewsDTO> selectAllById(int id);
}
