package com.example.application.views.planta;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "plantas", layout = MainView.class)
@PageTitle("Plantas")
public class PlantaView extends VerticalLayout{
	
	public PlantaView() {
		FormLayout plantaLayout = new FormLayout();
		
		plantaLayout.setResponsiveSteps(
		           new ResponsiveStep("25em", 1),
		           new ResponsiveStep("32em", 2),
		           new ResponsiveStep("40em", 3));
		
		
		TextField altavoz = new TextField();
		altavoz.setReadOnly(true);
		TextField pantallaAscensor1 = new TextField("Planta");
		pantallaAscensor1.setReadOnly(true);
		Button botonAscensor1 = new Button("Llamar");
		TextField pantallaAscensor2 = new TextField("Planta");
		pantallaAscensor2.setReadOnly(true);
		Button botonAscensor2 = new Button("Llamar");
		TextField pantallaAscensor3 = new TextField("Planta");
		pantallaAscensor3.setReadOnly(true);
		Button botonAscensor3 = new Button("Llamar");
		
		plantaLayout.add(altavoz, 3);
		plantaLayout.add(pantallaAscensor1, pantallaAscensor2, pantallaAscensor3);
		plantaLayout.add(botonAscensor1, botonAscensor2, botonAscensor3);
							
		this.setHorizontalComponentAlignment(Alignment.CENTER, plantaLayout);
		plantaLayout.setWidth("80%");
		add(plantaLayout);
	}		
}
