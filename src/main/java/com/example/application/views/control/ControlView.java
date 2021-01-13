package com.example.application.views.control;

import java.util.HashMap;
import java.util.Map;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "control", layout = MainView.class)
@PageTitle("Control")

public class ControlView extends VerticalLayout{

	public ControlView(){
		
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
	
}
