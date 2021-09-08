package com.devsuperior.dsvendas.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;

@Entity
@Table(name = "tb_sellers")
public class Seller {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;

   @OneToMany(mappedBy = "seller")
   private List<Sale> sales = new ArrayList<>();

   public Seller() {
   }

   public Seller(Long id, String name) {
      this.setId(id);
      this.setName(name);
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<Sale> getSales() {
      return this.sales;
   }

   public void setSales(List<Sale> sales) {
      this.sales = sales;
   }
}

