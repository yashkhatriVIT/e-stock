package com.stock.micservice.dao;

import com.stock.micservice.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StkDao extends JpaRepository<Stock, Long> {
    @Query(nativeQuery = true, value="select * from stock s where s.compcode = :id and (STR_TO_DATE(s.date, '%d-%m-%Y') between STR_TO_DATE(:startDate, '%Y-%m-%d') and STR_TO_DATE(:endDate, '%Y-%m-%d'))")
    List<Stock> getData_between(@Param("id") long id, @Param("startDate") String startDate, @Param("endDate") String endDate);
    @Modifying
    @Query(nativeQuery = true, value="delete from stock where compcode = :id")
    void deleteAllStocks(@Param("id") long id);

}
