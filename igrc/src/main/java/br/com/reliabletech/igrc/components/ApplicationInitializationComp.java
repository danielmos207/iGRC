package br.com.reliabletech.igrc.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ParameterService;

@Component
public class ApplicationInitializationComp {

	@Autowired
	ParameterService parameterService;
	
	@PostConstruct
	public void initIGRCParameters(){
		
		if(parameterService.findByParamid("dbparamstd") == null){
			
			Parameter parameter2 = new Parameter();	
			parameter2.setParatype("ctrlclass");
			parameter2.setParamid("ctrlclass00");
			parameter2.setName("--- Unspecified");
			parameter2.setDescription("Empty value");
			parameter2.setKind("Combo value");
			parameter2.setVisible(true);
			parameter2.setEnabled(true);
			parameter2.setLanguage("EN");
			parameterService.save(parameter2);
			
			Parameter parameter3 = new Parameter();		
			parameter3.setParamid("ctrlclass01");
			parameter3.setParatype("ctrlclass");
			parameter3.setName("Predictive");
			parameter3.setDescription("");
			parameter3.setKind("Combo value");
			parameter3.setVisible(true);
			parameter3.setEnabled(true);
			parameter3.setLanguage("EN");
			parameterService.save(parameter3);
			
			Parameter parameter4 = new Parameter();	
			parameter4.setParatype("ctrlclass");
			parameter4.setParamid("ctrlclass02");
			parameter4.setName("Preventive");
			parameter4.setDescription("");
			parameter4.setKind("Combo value");
			parameter4.setVisible(true);
			parameter4.setEnabled(true);
			parameter4.setLanguage("EN");
			parameterService.save(parameter4);
			
			Parameter parameter5 = new Parameter();	
			parameter5.setParatype("ctrlfreq");
			parameter5.setParamid("ctrlfreq00");
			parameter5.setName("--- Unspecified");
			parameter5.setDescription("Empty value");
			parameter5.setKind("Combo value");
			parameter5.setVisible(true);
			parameter5.setEnabled(true);
			parameter5.setLanguage("EN");
			parameterService.save(parameter5);
			
			Parameter parameter6 = new Parameter();
			parameter6.setParatype("ctrlfreq");
			parameter6.setParamid("ctrlfreq01");
			parameter6.setName("On Demand");
			parameter6.setDescription("");
			parameter6.setKind("Combo value");
			parameter6.setVisible(true);
			parameter6.setEnabled(true);
			parameter6.setLanguage("EN");
			parameterService.save(parameter6);
			
			Parameter parameter7 = new Parameter();
			parameter7.setParatype("ctrlfreq");
			parameter7.setParamid("ctrlfreq02");
			parameter7.setName("Daily");
			parameter7.setDescription("");
			parameter7.setKind("Combo value");
			parameter7.setVisible(true);
			parameter7.setEnabled(true);
			parameter7.setLanguage("EN");
			parameterService.save(parameter7);

			Parameter parameter8 = new Parameter();
			parameter8.setParatype("ctrlfreq");
			parameter8.setParamid("ctrlfreq03");
			parameter8.setName("Weekly");
			parameter8.setDescription("");
			parameter8.setKind("Combo value");
			parameter8.setVisible(true);
			parameter8.setEnabled(true);
			parameter8.setLanguage("EN");
			parameterService.save(parameter8);
			
			Parameter parameter9 = new Parameter();
			parameter9.setParatype("ctrlfreq");
			parameter9.setParamid("ctrlfreq04");
			parameter9.setName("Monthly");
			parameter9.setDescription("");
			parameter9.setKind("Combo value");
			parameter9.setVisible(true);
			parameter9.setEnabled(true);
			parameter9.setLanguage("EN");
			parameterService.save(parameter9);
			
			Parameter parameter10 = new Parameter();
			parameter10.setParatype("ctrlfreq");
			parameter10.setParamid("ctrlfreq05");
			parameter10.setName("Quarterly");
			parameter10.setDescription("");
			parameter10.setKind("Combo value");
			parameter10.setVisible(true);
			parameter10.setEnabled(true);
			parameter10.setLanguage("EN");
			parameterService.save(parameter10);
			
			Parameter parameter11 = new Parameter();
			parameter11.setParatype("ctrlfreq");
			parameter11.setParamid("ctrlfreq06");
			parameter11.setName("Semiannually");
			parameter11.setDescription("");
			parameter11.setKind("Combo value");
			parameter11.setVisible(true);
			parameter11.setEnabled(true);
			parameter11.setLanguage("EN");
			parameterService.save(parameter11);
			
			Parameter parameter12 = new Parameter();
			parameter12.setParatype("ctrlfreq");
			parameter12.setParamid("ctrlfreq07");
			parameter12.setName("Annually");
			parameter12.setDescription("");
			parameter12.setKind("Combo value");
			parameter12.setVisible(true);
			parameter12.setEnabled(true);
			parameter12.setLanguage("EN");
			parameterService.save(parameter12);
			
			Parameter parameter13 = new Parameter();
			parameter13.setParatype("ctrlfreq");
			parameter13.setParamid("ctrlfreq08");
			parameter13.setName("Event Driven");
			parameter13.setDescription("");
			parameter13.setKind("Combo value");
			parameter13.setVisible(true);
			parameter13.setEnabled(true);
			parameter13.setLanguage("EN");
			parameterService.save(parameter13);
			
			Parameter parameter14 = new Parameter();
			parameter14.setParatype("ctrltype");
			parameter14.setParamid("ctrltype00");
			parameter14.setName("--- Unspecified");
			parameter14.setDescription("Empty value");
			parameter14.setKind("Combo value");
			parameter14.setVisible(true);
			parameter14.setEnabled(true);
			parameter14.setLanguage("EN");
			parameterService.save(parameter14);
			
			Parameter parameter15 = new Parameter();
			parameter15.setParatype("ctrltype");
			parameter15.setParamid("ctrltype01");
			parameter15.setName("Manual");
			parameter15.setDescription("");
			parameter15.setKind("Combo value");
			parameter15.setVisible(true);
			parameter15.setEnabled(true);
			parameter15.setLanguage("EN");
			parameterService.save(parameter15);
			
			Parameter parameter16 = new Parameter();
			parameter16.setParatype("ctrltype");
			parameter16.setParamid("ctrltype02");
			parameter16.setName("Automatic");
			parameter16.setDescription("");
			parameter16.setKind("Combo value");
			parameter16.setVisible(true);
			parameter16.setEnabled(true);
			parameter16.setLanguage("EN");
			parameterService.save(parameter16);
			
			Parameter parameter17 = new Parameter();
			parameter17.setParatype("ctrltype");
			parameter17.setParamid("ctrltype03");
			parameter17.setName("IT Managed");
			parameter17.setDescription("");
			parameter17.setKind("Combo value");
			parameter17.setVisible(true);
			parameter17.setEnabled(true);
			parameter17.setLanguage("EN");
			parameterService.save(parameter17);
			

			
			
			Parameter parameter18 = new Parameter();	
			parameter18.setParatype("stdfreq");
			parameter18.setParamid("stdfreq00");
			parameter18.setName("--- Unspecified");
			parameter18.setDescription("Empty value");
			parameter18.setKind("Combo value");
			parameter18.setVisible(true);
			parameter18.setEnabled(true);
			parameter18.setLanguage("EN");
			parameterService.save(parameter18);
			
			Parameter parameter19 = new Parameter();
			parameter19.setParatype("stdfreq");
			parameter19.setParamid("stdfreq01");
			parameter19.setName("On Demand");
			parameter19.setDescription("");
			parameter19.setKind("Combo value");
			parameter19.setVisible(true);
			parameter19.setEnabled(true);
			parameter19.setLanguage("EN");
			parameterService.save(parameter19);
			
			Parameter parameter20 = new Parameter();
			parameter20.setParatype("stdfreq");
			parameter20.setParamid("stdfreq02");
			parameter20.setName("Daily");
			parameter20.setDescription("");
			parameter20.setKind("Combo value");
			parameter20.setVisible(true);
			parameter20.setEnabled(true);
			parameter20.setLanguage("EN");
			parameterService.save(parameter20);

			Parameter parameter21 = new Parameter();
			parameter21.setParatype("stdfreq");
			parameter21.setParamid("stdfreq03");
			parameter21.setName("Weekly");
			parameter21.setDescription("");
			parameter21.setKind("Combo value");
			parameter21.setVisible(true);
			parameter21.setEnabled(true);
			parameter21.setLanguage("EN");
			parameterService.save(parameter21);
			
			Parameter parameter22 = new Parameter();
			parameter22.setParatype("stdfreq");
			parameter22.setParamid("stdfreq04");
			parameter22.setName("Monthly");
			parameter22.setDescription("");
			parameter22.setKind("Combo value");
			parameter22.setVisible(true);
			parameter22.setEnabled(true);
			parameter22.setLanguage("EN");
			parameterService.save(parameter22);
			
			Parameter parameter23 = new Parameter();
			parameter23.setParatype("stdfreq");
			parameter23.setParamid("stdfreq05");
			parameter23.setName("Quarterly");
			parameter23.setDescription("");
			parameter23.setKind("Combo value");
			parameter23.setVisible(true);
			parameter23.setEnabled(true);
			parameter23.setLanguage("EN");
			parameterService.save(parameter23);
			
			Parameter parameter24 = new Parameter();
			parameter24.setParatype("stdfreq");
			parameter24.setParamid("stdfreq06");
			parameter24.setName("Semiannually");
			parameter24.setDescription("");
			parameter24.setKind("Combo value");
			parameter24.setVisible(true);
			parameter24.setEnabled(true);
			parameter24.setLanguage("EN");
			parameterService.save(parameter24);
			
			Parameter parameter25 = new Parameter();
			parameter25.setParatype("stdfreq");
			parameter25.setParamid("stdfreq07");
			parameter25.setName("Annually");
			parameter25.setDescription("");
			parameter25.setKind("Combo value");
			parameter25.setVisible(true);
			parameter25.setEnabled(true);
			parameter25.setLanguage("EN");
			parameterService.save(parameter25);
			
			Parameter parameter26 = new Parameter();
			parameter26.setParatype("stdfreq");
			parameter26.setParamid("stdfreq08");
			parameter26.setName("Event Driven");
			parameter26.setDescription("");
			parameter26.setKind("Combo value");
			parameter26.setVisible(true);
			parameter26.setEnabled(true);
			parameter26.setLanguage("EN");
			parameterService.save(parameter26);			
			
			
			
			
			//Não edite este bloco!
			Parameter parameterz = new Parameter();		
			parameterz.setParamid("dbparamstd");
			parameterz.setParatype("std_init");
			parameterz.setName("Stantard Parameter Table");
			parameterz.setDescription("Stantard parameter to check if the table is fulfilled.");
			parameterz.setVisible(false);
			parameterz.setEnabled(true);
			parameterz.setLanguage("EN");
			parameterz.setKind("System Check");
			parameterService.save(parameterz);
			
			
		}
		
	}
	
}
