package org.store.dao.custom;


import org.store.dao.CrudDao;
import org.store.dto.ItemDto;
import org.store.dto.tm.EmployeeTM;
import org.store.dto.tm.ItemTM;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao extends CrudDao<ItemDto,Integer> {
    List<ItemTM> findAll() throws SQLException, ClassNotFoundException;
}