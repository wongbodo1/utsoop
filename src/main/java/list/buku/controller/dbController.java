/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.buku.controller;

import list.buku.entity.Buku;
import list.buku.repo.BukuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Cahyo
 */
@Controller
public class dbController {
    @Autowired
    private BukuRepo bukuRepo;
    @RequestMapping("/home")
    public void daftarBuku(Model model){
        model.addAttribute("daftarBuku", bukuRepo.findAll());
    }
    @RequestMapping(value = "/tambah", method = RequestMethod.GET)
    public void addData(@ModelAttribute("buku") Buku buku,
            BindingResult bind){}
    @RequestMapping(value = "/tambah", method = RequestMethod.POST)
    public String addDataProcessing(@ModelAttribute("buku") Buku buku,
            BindingResult bind){
    System.out.println(buku.getId());
    System.out.println(buku.getNama());
    System.out.println(buku.getJudul_buku());
    bukuRepo.save(buku);
    return "redirect:home";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public void getEdit(@RequestParam("id") String id, 
            Model model) {
        Buku data = bukuRepo.findOne(id);
        model.addAttribute("buku", data);
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveEdit(@ModelAttribute("buku") Buku buku,
            BindingResult result) {
        System.out.println("id: " + buku.getId());
        System.out.println("nama: " + buku.getNama());
        System.out.println("judul buku: " + buku.getJudul_buku());
        bukuRepo.save(buku);
        return "redirect:home";
    }
    @RequestMapping("/hapus")
    public String hapusData(@RequestParam("id") String id) {
        bukuRepo.delete(id);
        return "redirect:home";
}
}
    