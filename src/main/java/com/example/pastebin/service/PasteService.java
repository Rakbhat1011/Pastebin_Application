package com.example.pastebin.service;

import com.example.pastebin.model.Paste;
import com.example.pastebin.repository.PasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasteService {

    @Autowired
    private PasteRepository pasteRepository;

    public List<Paste> getAllPastes(Integer userId) {
        return pasteRepository.findByUserId(userId);
    }

    public Optional<Paste> getPasteById(Long id) {
        return pasteRepository.findById(id);
    }

    public Paste createPaste(Paste paste) {
        return pasteRepository.save(paste);
    }

    public Paste updatePaste(Long id, Paste pasteDetails) {
        Paste paste = pasteRepository.findById(id).orElseThrow(() -> new RuntimeException("Paste not found"));
        paste.setTitle(pasteDetails.getTitle());
        paste.setContent(pasteDetails.getContent());
        paste.setUserId(pasteDetails.getUserId());
        return pasteRepository.save(paste);
    }

    public void deletePaste(Long id) {
        pasteRepository.deleteById(id);
    }
}



//package com.example.pastebin.service;
//
//import com.example.pastebin.model.Paste;
//import com.example.pastebin.repository.PasteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Transactional
//public class PasteService {
//
//    @Autowired
//    private PasteRepository pasteRepository;
//
////    public Paste createPaste(String content) {
////        Paste paste = new Paste();
////        paste.setContent(content);
////        paste.setCreatedAt(LocalDateTime.now());
////        return pasteRepository.save(paste);
////    }
//public Paste createPaste(Paste paste) {
//    return pasteRepository.save(paste);
//}
//
//
//
//    public Optional<Paste> getPaste(Long id) {
//        return pasteRepository.findById(id);
//    }
//
//    public List<Paste> getAllPastes(Integer userId) {
//        return pasteRepository.findByUserId(userId);
//    }
//
//    public Paste savePaste(Paste paste) {
//        return pasteRepository.save(paste);
//    }
//
//    public Paste getPasteById(Long id) {
//        return pasteRepository.findById(id).orElse(null);
//    }
//    public Paste updatePaste(Long id, Paste pasteDetails) {
//        Paste paste = pasteRepository.findById(id).orElseThrow(() -> new RuntimeException("Paste not found"));
//        paste.setTitle(pasteDetails.getTitle());
//        paste.setContent(pasteDetails.getContent());
//        paste.setUserId(pasteDetails.getUserId());
//        return pasteRepository.save(paste);
//    }
////    public Paste updatePaste(Long id, Paste pasteDetails) {
////        Paste paste = getPasteById(id);
////        if (paste != null) {
////            paste.setContent(pasteDetails.getContent());
////            paste.setCreatedAt(pasteDetails.getCreatedAt());
////            return pasteRepository.save(paste);
////        }
////        return null;
////    }
//
//    public void deletePaste(Long id) {
//        pasteRepository.deleteById(id);
//    }
//}
