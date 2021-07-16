package com.pega.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttController {
	@ModelAttribute
	public void init(Model model) {
		model.addAttribute("arg", "modelsetting");
	}

	@RequestMapping("/model-attribute")
	public String get() {

		return "model-attribute";
	}
}
