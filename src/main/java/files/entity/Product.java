package files.entity;

import javax.persistence.*;

@Entity
@Table(name = "product", schema = "shop7")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "title", length = 128)
    private String title;
    @Column(name = "price", length = 128)
    private int price;

    @Override
    public String toString() {
        return String.format("id: %s, title: %s, price: %s", id, title, price);
    }


    public Product(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (id == product.id) {
            return true;
        }
        return id == product.id && price == product.price && title.equals(product.title);
    }
}
