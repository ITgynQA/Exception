
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    Product product1 = new Product(15, "Хлеб", 40);
    Product product2 = new Product(20, "Молоко", 60);
    Product product3 = new Product(25, "Колбаса", 200);

    @Test
    public void testRemoveProductExist() {
        ShopRepository repo = new ShopRepository();

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        repo.removeById(25);

        Product[] expected = {product1, product2};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void tests() {
        ShopRepository repo = new ShopRepository();

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(10);
        });
    }
}


