package controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

import model.Tinh;
import model.thiSinh;
import view.QLSVview;

public class QLSVcontroller implements ActionListener {
	QLSVview view;

	public QLSVcontroller(QLSVview view) {
		super();
		this.view = view;
	}

	public void actionPerformed(ActionEvent e) {
		String source = e.getActionCommand();
//		JOptionPane.showMessageDialog(view, "You Just Clicked " + source);
		if (source.equals("Add")) {
			this.view.remove();
			this.view.model.setChoose("Add");

		} else if (source.equals("Save")) {
			try {				
				this.view.save();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

//		} else if (source.equals("Edit")) {
//				this.view.hienThi();
			
		}else if (source.equals("Remove")) {
			this.view.removenho();
		}
}
}
