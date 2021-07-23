package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long Id;

    private String city;
    private String street;
    private String zipcode;
    private DelveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
