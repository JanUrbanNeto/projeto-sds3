package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Integer visited;
   private Integer deals;
   private Double amount;
   private LocalDate date;
   
   @ManyToOne
   @JoinColumn(name = "seller_id")
   private Seller seller;

   public Sale() {
   }

   public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
      this.id = id;
      this.visited = visited;
      this.deals = deals;
      this.amount = amount;
      this.date = date;
      this.seller = seller;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setVisited(Integer visited) {
      this.visited = visited;
   }

   public Integer getVisited() {
      return this.visited;
   }

   public Integer getDeals() {
      return this.deals;
   }

   public void setDeals(Integer deals) {
      this.deals = deals;
   }

   public Double getAmount() {
      return this.amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public LocalDate getDate() {
      return this.date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }

   public Seller getSeller() {
      return this.seller;
   }

   public void setSeller(Seller seller) {
      this.seller = seller;
   }
}
