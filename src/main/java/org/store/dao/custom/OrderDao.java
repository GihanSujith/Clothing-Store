package org.store.dao.custom;



import org.store.dao.CrudDao;
import org.store.dto.OrderDto;
import org.store.dto.tm.ItemTM;
import org.store.dto.tm.OrderTM;

import java.sql.SQLException;
import java.util.List;

public interface OrderDao extends CrudDao <OrderDto,Integer> {
    List<OrderTM> findAll() throws SQLException, ClassNotFoundException;
}