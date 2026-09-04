package com.angga.produk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produk")
public class ProdukController {
  @GetMapping
  public String ping() {
    return "ping";
  }

  @GetMapping("/{id}")
  public String getProdukById(@PathVariable("id") int id) {
    if (id == 1) {
      return "Produk 1";
    }

    return "Produk tidak ditemukan";

  }
}
