package com.example.application.views.ascensor;

import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.jni.Buffer;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "ascensores", layout = MainView.class)
@PageTitle("Ascensores")
public class AscensorView extends Div{
	
	public AscensorView() {
		Tabs tabs = new Tabs(); //Contendrá todos los tabs de la vista
		Div pages = new Div(); //Contendrá todos los divs de la vista
		Map<Tab, Component> tabsToPages = new HashMap<>(); //Para relacionar cada tab con cada page
		
		for(int i = 1; i <= 3; i++) {
			Tab tab = new Tab("Ascensor " + i);
			Div page = new Div();
			page.add(panelAscensor());			
			
			if(i!=1) page.setVisible(false); //Inicialmente se visualiza solo el primer ascensor
						
			tabs.add(tab);
			pages.add(page);
			tabsToPages.put(tab, page);
		}
		
		tabs.addSelectedChangeListener(event ->{
			tabsToPages.values().forEach(page -> page.setVisible(false)); //Se quita la visibilidad de todas las páginas
			Component selectedPage = tabsToPages.get(tabs.getSelectedTab()); //Se obtiene el tab selecionado
			selectedPage.setVisible(true); //Se pone visible el tab seleccionado
		});
		
		add(tabs, pages);
	}
	
	public VerticalLayout panelAscensor() {
		
		TextField pantallaPlanta = new TextField();
		pantallaPlanta.setReadOnly(true);
		pantallaPlanta.setLabel("Planta");
		pantallaPlanta.setValue("4"); //Obtener de un objeto de tipo ascensor
		pantallaPlanta.setWidthFull();
		
		
		NumberField pisoDestino = new NumberField();
		pisoDestino.setValue(1d);
		pisoDestino.setHasControls(true);		
		pisoDestino.setMin(1);		
		pisoDestino.setMax(7);
		pisoDestino.setWidth("50%");
		
		Button botonConfirmar = new Button("Ok"); //Añadir clickListener para boton
		botonConfirmar.setWidth("50%");
		Button botonAbrirCerrar = new Button("Abir/Cerrar");
		botonAbrirCerrar.setWidth("50%");
		Button botonEmergencia = new Button("Emergencia");
		botonEmergencia.setWidth("50%");
				
		HorizontalLayout seleccionPiso = new HorizontalLayout(pisoDestino, botonConfirmar);
		seleccionPiso.setWidthFull();
		HorizontalLayout botonera = new HorizontalLayout(botonAbrirCerrar, botonEmergencia);
		botonera.setWidthFull();
						
		VerticalLayout panelAscensor = new VerticalLayout();
						
		panelAscensor.setPadding(true);
		panelAscensor.setMargin(true);
		panelAscensor.setSpacing(true);
		panelAscensor.getStyle().set("border", "1px solid #9E9E9E");
		panelAscensor.setWidth("80%");		
		panelAscensor.add(pantallaPlanta, seleccionPiso, botonera);
		
		return panelAscensor;
	}
}
