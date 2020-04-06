package com.api.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.models.Produto;
import com.api.models.dto.ProdutosPorAno;
import com.api.repository.ProdutoRepository;


@RestController
@RequestMapping(value="/api")
public class ProdutosResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
			
	@GetMapping("/produtos")
	public List<Produto> listarProdutos(){
		
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto listarProduto(@PathVariable(value="id") long id){
		
		return produtoRepository.getOne(id);
	}
	
	@PostMapping("/produto")
	public Produto insereProduto(@RequestBody Produto produto) {
		
		return produtoRepository.save(produto);		 					
	}
	
	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody Produto produto) {
		
		produtoRepository.delete(produto);		 					
	}
	
	@PutMapping("/produto")
	public Produto alteraProduto(@RequestBody Produto produto) {
		
		return produtoRepository.save(produto);		 					
	}
	
	@GetMapping("/produtosporano/{ano}")
	public List<ProdutosPorAno> listarProdutoPorAno(@PathVariable(value="ano") int ano){
		
		List<ProdutosPorAno> lista = new ArrayList<ProdutosPorAno>(); 
		List<Produto> produtos = listarProdutos();
			
		for (Produto produto : produtos) {
			
			if(produto.getAnoFabricação()==ano)
					{
			ProdutosPorAno lp = new ProdutosPorAno();
			lp.setAno(produto.getAnoFabricação());
			lp.setMarca(produto.getMarca());
			lp.setNome(produto.getNome());
			lp.setVencimento(produto.getVencimento());
			lista.add(lp);
			
			}
			
		}
		return lista;
	
	}

}
