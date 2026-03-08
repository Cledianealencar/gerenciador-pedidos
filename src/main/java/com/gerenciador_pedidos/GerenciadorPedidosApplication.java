package com.gerenciador_pedidos;

import com.gerenciador_pedidos.model.Categoria;
import com.gerenciador_pedidos.model.Pedido;
import com.gerenciador_pedidos.model.Produto;
import com.gerenciador_pedidos.repository.CategoriaRepository;
import com.gerenciador_pedidos.repository.PedidoRepository;
import com.gerenciador_pedidos.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Produto produto = new Produto("Donut", 5.0);
		Categoria categoria = new Categoria("Doces");
		Pedido pedido = new Pedido(LocalDate.now());

		produtoRepository.save(produto);
		categoriaRepository.save(categoria);
		pedidoRepository.save(pedido);
	}
}