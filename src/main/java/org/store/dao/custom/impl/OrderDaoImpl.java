package org.store.dao.custom.impl;


import org.store.dao.custom.OrderDao;
import org.store.dto.OrderDto;
import org.store.dto.tm.OrderTM;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    @Override
    public boolean save(OrderDto dto) {
        return false;
    }

    @Override
    public boolean update(OrderDto dto , Integer Id) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public List<OrderTM> findAll() {
        return null;
    }

    @Override
    public Integer findLastId() {
        return null;
    }

    @Override
    public OrderDto find(Integer integer) {
        return null;
    }
}