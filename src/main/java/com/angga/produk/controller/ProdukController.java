package com.angga.produk.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angga.produk.entity.Produk;

@RestController
@RequestMapping("/api/produk")
public class ProdukController {
  @GetMapping
  public List<Produk> getAllProduk() {
    List<Produk> produks = List.of(
        new Produk(1, "Mouse", 100000, "Merek 1"),
        new Produk(2, "Mouse", 200000, "Merek 2"));

    return produks;

  }

  @GetMapping("/{id}")
  public ResponseEntity<Produk> getProdukById(@PathVariable("id") int id) {
    if (id == 1) {
      return ResponseEntity.ok(new Produk(1, "Mouse", 10000, "Merek 1"));
    }

    return null;

  }

  @PostMapping
  public ResponseEntity<Produk> createProduk(@RequestBody Produk produk) {
    return ResponseEntity.ok(produk);
  }
}
