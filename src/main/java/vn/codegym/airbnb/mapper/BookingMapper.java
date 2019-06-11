package vn.codegym.airbnb.mapper;

import org.apache.ibatis.annotations.Mapper;
import vn.codegym.airbnb.model.Booking;

@Mapper
public interface BookingMapper {
    void insert(Booking booking);
}
