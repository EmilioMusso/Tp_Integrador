package Musso.Tp_Integrador.gui;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Musso.Tp_Integrador.App;
import Musso.Tp_Integrador.AppEmpresa;
import Musso.Tp_Integrador.modelo.GrafoPlantas;
import Musso.Tp_Integrador.modelo.Planta;

public class PanelAņadirRuta extends JPanel {
	
	public PanelAņadirRuta(List<Planta> list){
		super();
		this.armarPanel(list);
	}

	public void armarPanel(List<Planta> plantas) {

		this.setBackground(Color.BLACK);
		JComponent labelPresentacion = new JLabel("AŅADIR NUEVA RUTA");
		labelPresentacion.setFont(new Font("Calibri", Font.BOLD, 24));
		labelPresentacion.setForeground(Color.ORANGE);
		
		JComponent labelPlantaOrigen = new JLabel("Planta de origen");
		labelPlantaOrigen.setFont(new Font("Calibri", Font.ITALIC, 18));
		labelPlantaOrigen.setForeground(Color.WHITE);
		
		String[] plantasBox = new String[plantas.size()];
		int i=0;
		for( Planta unaPlanta : plantas ) {
			plantasBox[i] = unaPlanta.getNombre();
			i++;
		}
		JComboBox<String> boxPlantaOrigen = new JComboBox<String>(plantasBox);
		
		JComponent labelPlantaDestino = new JLabel("Planta destino");
		labelPlantaDestino.setFont(new Font("Calibri", Font.ITALIC, 18));
		labelPlantaDestino.setForeground(Color.WHITE);
		JComboBox<String> boxPlantaDestino = new JComboBox<String>(plantasBox);
		

		this.add(labelPresentacion);
		this.add(labelPlantaOrigen);
		this.add(boxPlantaOrigen);
		this.add(labelPlantaDestino);
		this.add(boxPlantaDestino);
	}
}
