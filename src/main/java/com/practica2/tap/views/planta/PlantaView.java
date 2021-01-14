package com.practica2.tap.views.planta;

import java.util.HashMap;
import java.util.Map;

import com.practica2.tap.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "plantas", layout = MainView.class)
@PageTitle("Plantas")
public class PlantaView extends VerticalLayout{
	
	public PlantaView() {
		Tabs tabs = new Tabs();
		Div pages = new Div();
		Map<Tab, Component> tabsToPages = new HashMap<>();
		
		for (int i = 1; i <= 7; i++) {
			Tab tab = new Tab("Planta " + i);
			Div page = new Div();
			page.add(plantaLayout());
			
			if(i!=1) page.setVisible(false);
			
			tabs.add(tab);
			pages.add(page);
			tabsToPages.put(tab, page);
		}			
		
		tabs.addSelectedChangeListener(event ->{
			tabsToPages.values().forEach(page -> page.setVisible(false));
			Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
			selectedPage.setVisible(true);
		});
						
		this.setHorizontalComponentAlignment(Alignment.CENTER, pages);
		add(tabs, pages);
	}
	
	public Component plantaLayout() {
		
		FormLayout plantaLayout = new FormLayout();		
		plantaLayout.setResponsiveSteps(new ResponsiveStep("40em", 3));
				
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
		plantaLayout.setWidth("70%");		
		
		return plantaLayout;
	}
	
}
