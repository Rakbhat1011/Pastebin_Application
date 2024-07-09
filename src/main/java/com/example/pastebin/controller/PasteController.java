package com.example.pastebin.controller;

import com.example.pastebin.model.Paste;
import com.example.pastebin.service.PasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PasteController {

    @Autowired
    private PasteService pasteService;

    @GetMapping("/pastes")
    public List<Paste> getAllPastes(@RequestParam Integer userId) {
        return pasteService.getAllPastes(userId);
    }

    @GetMapping("/pastes/{id}")
    public Paste getPasteById(@PathVariable Long id) {
        return pasteService.getPasteById(id).orElse(null);
    }

    @PostMapping("/pastes")
    public Paste createPaste(@RequestBody Paste paste) {
        return pasteService.createPaste(paste);
    }

    @PutMapping("/pastes/{id}")
    public Paste updatePaste(@PathVariable Long id, @RequestBody Paste pasteDetails) {
        return pasteService.updatePaste(id, pasteDetails);
    }

    @DeleteMapping("/pastes/{id}")
    public void deletePaste(@PathVariable Long id) {
        pasteService.deletePaste(id);
    }
}



//package com.example.pastebin.controller;
//
//import com.example.pastebin.model.Paste;
//import com.example.pastebin.service.PasteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//@RestController
//@RequestMapping("/api/pastes")
//public class PasteController {
//
//    @GetMapping("/")
//    public String welcome() {
//        return "Welcome to Pastebin!";
//    }
//
//    @Autowired
//    private PasteService pasteService;
//
//    @GetMapping("/pastes")
//    public List<Paste> getAllPastes(@RequestParam Integer userId) {
//        return pasteService.getAllPastes(userId);
//    }
//
////    @GetMapping("/pastes/{id}")
////    public Paste getPasteById(@PathVariable Long id) {
////        return pasteService.getPasteById(id);
////    }
//
//    @PostMapping("/pastes")
//    public Paste createPaste(@RequestBody Paste paste) {
//        return pasteService.createPaste(paste);
//    }
//
//    @PutMapping("/pastes/{id}")
//    public Paste updatePaste(@PathVariable Long id, @RequestBody Paste pasteDetails) {
//        return pasteService.updatePaste(id, pasteDetails);
//    }
//
//    @DeleteMapping("/pastes/{id}")
//    public void deletePaste(@PathVariable Long id) {
//        pasteService.deletePaste(id);
//    }
//}
//
//
////    @PostMapping
////    public Paste createPaste(@RequestBody Paste paste) {
////        return pasteService.savePaste(paste);
////    }
////
////    @GetMapping("/{id}")
////    public Optional<Paste> getPaste(@PathVariable Long id) {
////        return pasteService.getPaste(id);
////    }
////
////    @PutMapping("/{id}")
////    public Paste updatePaste(@PathVariable Long id, @RequestBody Paste pasteDetails) {
////        return pasteService.updatePaste(id, pasteDetails);
////    }
////
////    @GetMapping
////    public List<Paste> getAllPastes() {
////        return pasteService.getAllPastes();
////    }
////
////    @DeleteMapping("/{id}")
////    public void deletePaste(@PathVariable Long id) {
////        pasteService.deletePaste(id);
////    }
////}
