package org.store.dao.custom.impl;


import org.store.dao.custom.ItemDao;
import org.store.dto.ItemDto;
import org.store.dto.tm.ItemTM;

import java.util.List;

public class ItemDaoImpl implements ItemDao {
    @Override
    public boolean save(ItemDto dto) {
        return false;
    }

    @Override
    public boolean update(ItemDto dto, Integer id) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public List<ItemTM> findAll() {
        return null;
    }

    @Override
    public Integer findLastId() {
        return null;
    }

    @Override
    public ItemDto find(Integer integer) {
        return null;
    }
}