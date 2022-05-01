package hello.itemservice.domain.item;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ItemRepositoryTest {

    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach() {
        itemRepository.clearStore();
    }

    @Test
    void save() {
        Item item = new Item("itemA", 1000, 10);

        Item savedItem = itemRepository.save(item);

        Item findItem = itemRepository.findById(item.getId());
        assertThat(findItem).isEqualTo(savedItem);
    }

    @Test
    void findAll() {
        Item item1 = new Item("itemA", 1000, 10);
        Item item2 = new Item("itemB", 2000, 15);

        itemRepository.save(item1);
        itemRepository.save(item2);

        List<Item> result = itemRepository.findAll();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).containsExactly(item1, item2);
    }

    @Test
    void updateItem() {
        Item item = new Item("itemA", 1000, 10);

        Item savedItem = itemRepository.save(item);
        Long itemId = savedItem.getId();

        Item updateParam = new Item("item2", 2000, 20);
        itemRepository.update(itemId, updateParam);
        Item updateItem = itemRepository.findById(itemId);

        assertThat(updateItem.getItemName()).isEqualTo("item2");
        assertThat(updateItem.getPrice()).isEqualTo(2000);
        assertThat(updateItem.getQuantity()).isEqualTo(20);
    }
}
