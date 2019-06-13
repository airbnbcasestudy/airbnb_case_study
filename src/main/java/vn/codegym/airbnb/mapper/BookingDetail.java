package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import vn.codegym.airbnb.dto.BookingDTO;

import java.util.List;

@Mapper
public interface BookingDetail {

    List<BookingDetail> selectAllBooking(int id);
}
