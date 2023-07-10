package Services;

import Entities.ProductoEntity;
import Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;

    public ProductoEntity buscarProductoPorNombre(String nombre) {
        return productoRepository.buscarProductoPorNombre(nombre);
    }
@Override
    public ProductoEntity buscarProductoPorCategoria(String nombre) {
        return productoRepository.listaDeProductoPorCategoria(nombre);
    }
    @Override
    public List<ProductoEntity> ListaDeProductos(){return productoRepository.findAll();}


}
