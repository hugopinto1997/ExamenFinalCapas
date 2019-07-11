package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dto.CompraDTO;
import com.uca.capas.service.ClienteService;
import com.uca.capas.service.CompraService;
import com.uca.capas.service.ProductoService;

@Controller
public class MainController {
	
	@Autowired
	ClienteService cs;
	
	@Autowired
	ProductoService ps;
	
	@Autowired
	CompraService compraService;
	
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", cs.findAll());
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/ver")
	public ModelAndView initMain2(@RequestParam("idUsuario") Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c",cs.findCliente(id));
		mav.addObject("com",compraService.findComprasXCliente(id));
		mav.setViewName("ver");
		return mav;
	}
	
	@RequestMapping("/compra")
	public ModelAndView initMain1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", cs.findAll());
		mav.addObject("p", ps.findAll());
		mav.setViewName("compra");
		return mav;
	}
	
	@RequestMapping("/compra2")
	public ModelAndView initMain1(@RequestParam("idUsuario") Integer idUsuario,
			@RequestParam("idProducto") Integer idProducto,
			@RequestParam("cantidad") Integer cantidad) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", cs.findCliente(idUsuario));
		mav.addObject("compra", new CompraDTO());
		mav.addObject("p", ps.findOne(idProducto));
		mav.addObject("cantidad", cantidad);
		mav.setViewName("ticket");
		return mav;
	}
	
	@RequestMapping("/comprafinal")
	public ModelAndView initMain12(@ModelAttribute("compra") CompraDTO com) {
		ModelAndView mav = new ModelAndView("redirect:/");
		compraService.insertar(com);
		return mav;
	}
}
