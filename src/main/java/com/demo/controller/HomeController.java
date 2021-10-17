package com.demo.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@GetMapping("/Accueil")
    public String viewHomePage() {
    	return "index";
    }
	
	@GetMapping("/blank")
    public String viewBlankpage() {
    	return "blank";
    }
	

	@GetMapping("/checkout")
    public String viewCheckoutpage() {
    	return "checkout";
    }

	@GetMapping("/product")
    public String viewProductPage() {
    	return "product";
    }
	
	@GetMapping("/store")
    public String viewStorePage() {
    	return "store";
    }
	
	@GetMapping("/memoires")
    public String viewMemoiresPage() {
    	return "memoires";
    }
	
	@GetMapping("/memoiresdram")
    public String viewMemoiresdramPage() {
    	return "memoiresdram";
    }
	
	@GetMapping("/nvidia")
    public String viewCarteGraphique1Page() {
    	return "cartegraphic1";
    }
	
	@GetMapping("/amd")
    public String viewCarteGraphique2Page() {
    	return "cartegraphic2";
    }
	
	@GetMapping("/prof")
    public String viewCarteGraphique3Page() {
    	return "cartegraphic3";
    }

	@GetMapping("/cartemere1")
    public String viewcartemere1Page() {
    	return "cartemere1";
    }
	
	@GetMapping("/cartemere2")
    public String viewcartemere2Page() {
    	return "cartemere2";
    }
	
	@GetMapping("/cartemere3")
    public String viewcartemere3Page() {
    	return "cartemere3";
    }
	
	@GetMapping("/cartemere4")
    public String viewcartemere4Page() {
    	return "cartemere4";
    }
	
	@GetMapping("/cartemere5")
    public String viewcartemere5Page() {
    	return "cartemere5";
    }
	
	@GetMapping("/cartemere6")
    public String viewcartemere6Page() {
    	return "cartemere6";
    }
	
	@GetMapping("/carteson")
    public String viewcartesonPage() {
    	return "carteson";
    }

}
