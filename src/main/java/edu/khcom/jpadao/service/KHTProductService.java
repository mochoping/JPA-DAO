package edu.khcom.jpadao.service;


import edu.khcom.jpadao.entity.KHTProduct;
import edu.khcom.jpadao.repository.KHTProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTProductService {

    @Autowired
    private KHTProductRepository khtProductRepository;

    public List<KHTProduct> findAll() {
        return khtProductRepository.findAll();
    }

    public KHTProduct save(KHTProduct khtProduct) {
        return khtProductRepository.save(khtProduct);
    }

    public KHTProduct findById(int id) {
        return khtProductRepository.findById(id);
    }
}