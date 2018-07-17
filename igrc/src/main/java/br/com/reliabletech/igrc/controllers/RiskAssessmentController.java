package br.com.reliabletech.igrc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.RiskAssessment;
import br.com.reliabletech.igrc.services.RiskAssessmentService;

@Controller
@RequestMapping("/riskassessment")
public class RiskAssessmentController {

	@Autowired
	private RiskAssessmentService riskassessmentService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String riskassessmentForm(RiskAssessment riskassessment, Model model){

		return "riskassessment";
	}
	
	@RequestMapping(value="/assess", method=RequestMethod.POST)
	public String createRiskAssessment(RiskAssessment riskassessment, Model model){
		
		riskassessmentService.save(riskassessment);
		model.addAttribute("successMessage", "Risk Assessment saved sucessfully!");
		
		return "riskassessment";
		
	}
	
}
