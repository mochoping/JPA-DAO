package edu.khcom.jpadao.service;


import edu.khcom.jpadao.dao.KHTProduct;
import edu.khcom.jpadao.dao.KHTUser;
import edu.khcom.jpadao.repository.KHTProductRepository;
import edu.khcom.jpadao.repository.KHTUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTService {
    @Autowired
    private KHTUserRepository khtUserRepository;

    @Autowired
    private KHTProductRepository khtProductRepository;

    public List<KHTUser> findAll() {
        return khtUserRepository.findAll(); //user all find
    }

    public KHTUser save(KHTUser khtUser) {
        return khtUserRepository.save(khtUser);
    }

    public List<KHTProduct> findAllProducts() {
        return khtProductRepository.findAll();
    }

    public KHTProduct saveProduct(KHTProduct khtProduct) {
        return khtProductRepository.save(khtProduct);
    }

}
