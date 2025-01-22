package edu.khcom.jpadao.service;


import edu.khcom.jpadao.entity.KHTProduct;
import edu.khcom.jpadao.entity.KHTUser;
import edu.khcom.jpadao.repository.KHTProductRepository;
import edu.khcom.jpadao.repository.KHTUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class KHTService {
    @Autowired
    private KHTUserRepository khtUserRepository;

    @Autowired
    private KHTProductRepository khtProductRepository;

    @Value("${upload-imgProfiles}")
    private String imgProfiles;

    public List<KHTUser> findAll() {
        return khtUserRepository.findAll(); //user all find
    }
/*
    public KHTUser save(KHTUser khtUser) {
        return khtUserRepository.save(khtUser);
    }
*/
    public KHTUser save(String username,String password, MultipartFile file) {
        String filename = System.currentTimeMillis() + "_ "+file.getOriginalFilename();

        try{
            File saveFile = new File(imgProfiles,filename);
            //저장
            file.transferTo(saveFile);
        } catch (IOException e) {
            System.out.println("이미지 저장에 실패했습니다.");
        }

        // String 타입 저장
        KHTUser User = new KHTUser();
        User.setUsername(username);
        User.setPassword(password);
        User.setImagePath("/image/"+ filename);

        return khtUserRepository.save(User);
    }


    public List<KHTProduct> findAllProducts() {
        return khtProductRepository.findAll();
    }

    public KHTProduct saveProduct(KHTProduct khtProduct) {
        return khtProductRepository.save(khtProduct);
    }

}
