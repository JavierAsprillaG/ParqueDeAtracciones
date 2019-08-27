package Vista;

import javax. swing .*;
import javax.swing.border.Border;

import java.awt.*;
import java.util.*;
public class FieldPanel extends JPanel {
	String crite,valo;
	String[] cri,vals;
	Boolean[] boo;
	Border blackline, raisedetched, loweredetched,
    raisedbevel, loweredbevel, empty;
	Border compound;
	Border redline = BorderFactory.createLineBorder(Color.red);
	
	public FieldPanel(String criterio,String[] c,String val,String[] v,Boolean[] b) {
		crite=criterio;
		valo=val;
		cri=c;
		vals=v;
		boo=b;
		this.setLayout(new GridLayout(cri.length+1,2,10,10));
		JLabel l = new JLabel(crite);
		JLabel x= new JLabel(valo);
		add(l);
		add(x);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder(5,5,5,5);
		compound = BorderFactory.createCompoundBorder(
                raisedbevel, loweredbevel);
		compound = BorderFactory.createCompoundBorder(
                redline, compound);
		compound = BorderFactory.createCompoundBorder(
                empty, compound);
		l.setBorder(compound);
		x.setBorder(compound);
		for (int i=0;i<(cri.length);i++) {
			JLabel p= new JLabel(cri[i]);
			add(p);
			if(vals.equals(null)) {
				JTextField e= new JTextField();
				add(e);
			}else {
				JTextField e= new JTextField(vals[i]);
				add(e);
			}	
			
			
		}	
	}public String getCriterio() {
		return crite;
		
	}
}