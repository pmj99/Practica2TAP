package com.example.application.views.control;

import java.util.HashMap;
import java.util.Map;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "control", layout = MainView.class)
@PageTitle("Control")

public class ControlView extends VerticalLayout{

	public ControlView(){
		
		Tabs tabs = new Tabs();
		Div pages = new Div();
		Map<Tab, Component> tabsToPages = new HashMap<>();
		
		for (int i = 1; i <= 3; i++) {
			Tab tab = new Tab("Ascensor " + i);
			Div page = new Div();
			page.add(controlLayout());
			
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

	public Component controlLayout() {
		
		TextField pantallaPiso = new TextField();
		pantallaPiso.setReadOnly(true);
		pantallaPiso.setLabel("Planta actual");
		pantallaPiso.setValue("4");
		pantallaPiso.setWidthFull();		
		
		TextField pantallaEmergencia = new TextField();
		pantallaEmergencia.setLabel("Funcionamiento");
		pantallaEmergencia.setValue("Correcto");
		pantallaEmergencia.setReadOnly(true);
		//pantallaEmergencia.setValue("Emergencia");
		pantallaEmergencia.setWidthFull();
		
		TextField pantallaEstado = new TextField();
		pantallaEstado.setReadOnly(true);
		pantallaEstado.setLabel("Estado");
		pantallaEstado.setValue("En movimiento");
		//pantallaEstado.setValue("Parado");
		pantallaEstado.setWidthFull();
		
		VerticalLayout controlLayout = new VerticalLayout();

		controlLayout.setHorizontalComponentAlignment(Alignment.CENTER, pantallaPiso);
		controlLayout.getStyle().set("border", "1px solid #9E9E9E");
		controlLayout.add(pantallaPiso, pantallaEmergencia, pantallaEstado);
		
		return controlLayout;
	}
	
}
