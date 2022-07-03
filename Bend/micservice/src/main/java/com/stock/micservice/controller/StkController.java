package com.stock.micservice.controller;


import com.stock.micservice.entities.Stock;
import com.stock.micservice.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
@RestController
public class StkController {
    @Autowired
    private StockService stockService;
    @GetMapping("/")
    public String getStocks(){
        return "Hello";
    }
    @GetMapping("/api/v1.0/market/stock/get/{id}/{startDate}/{endDate}")
    public List<Stock> getStocks(@PathVariable String id, @PathVariable String startDate, @PathVariable String endDate){
        return this.stockService.getStocks(Long.parseLong(id), startDate, endDate);
    }

    @PostMapping("/api/v1.0/market/stock/add/{id}")
    public Stock addStock(@PathVariable String id, @RequestBody String stkPrice){
        BigDecimal bigDecimal = new BigDecimal(stkPrice);
        return this.stockService.addStock(Long.parseLong(id), bigDecimal);
    }

    @DeleteMapping("/api/v1.0/market/stock/delete/{id}")
    public void deleteStock(@PathVariable String id){
        this.stockService.deleteAllStocks(Long.parseLong(id));
        return;
    }
}
