    package com.rest.apis.model;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Entity
    @Table(name="products")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false,unique = true)
        private String name;
        @Column(nullable = false,unique = true)
        private String description;
        @Column(nullable = false,unique = true)
        private String brand;
        @Column(nullable = false,unique = true)
        private Integer price;
    }
