package lk.ijse.restorisespring.service.impl;

import lk.ijse.restorisespring.dto.ItemStatus;
import lk.ijse.restorisespring.dto.impl.ItemDTO;
import lk.ijse.restorisespring.service.ItemService;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Override
    public void saveItem(ItemDTO itemDTO) {

    }

    @Override
    public void deleteItem(String itemDTO) {

    }

    @Override
    public void updateItem(String itemId, ItemDTO itemDTO) {

    }

    @Override
    public List<ItemDTO> getAllItems() {
        return List.of();
    }

    @Override
    public ItemStatus getItem(String itemId) {
        return null;
    }
}
