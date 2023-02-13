/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.principal;
import Modelo.converciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author brand
 */
public class controlador implements ActionListener {

    principal objv = new principal();
    converciones objm = new converciones();

    public controlador() {
        this.objv.getBtnColomExtra().addActionListener(this);
        this.objv.getBtnExtraColom().addActionListener(this);
        this.objv.getBtnConvertColomExtraConv().addActionListener(this);
        this.objv.getBtnConvertExtranColomDolar().addActionListener(this);
        this.objv.getBtnConvertExtranColomEuro().addActionListener(this);
        this.objv.getBtnConvertExtranColomLibra().addActionListener(this);
        this.objv.getBtnConvertExtranColomYen().addActionListener(this);
        this.objv.getBtnConvertExtranColomWon().addActionListener(this);
        this.objv.getBtnConvertColomExtraBack().addActionListener(this);

    }

    public void iniciar() {
        objv.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objv.getBtnColomExtra()) {
            objv.setVisible(false);
            objv.getColomExtran().setVisible(true);
            objv.getColomExtran().setSize(435, 300);
        }
        if (e.getSource() == objv.getBtnExtraColom()) {
            objv.setVisible(false);
            objv.getExtranColom().setVisible(true);
            objv.getExtranColom().setSize(435, 300);
        }
        ///colomextra
        if (e.getSource() == objv.getBtnConvertColomExtraConv()) {

            objv.getTxtColomExtraDolar().setText("" + objm.colomDolar(Float.parseFloat(objv.getTxtColomExtraColom().getText())));
            objv.getTxtColomExtraEuro().setText("" + objm.colomEuro(Float.parseFloat(objv.getTxtColomExtraColom().getText())));
            objv.getTxtColomExtraLibra().setText("" + objm.colomLibra(Float.parseFloat(objv.getTxtColomExtraColom().getText())));
            objv.getTxtColomExtraYen().setText("" + objm.colomYen(Float.parseFloat(objv.getTxtColomExtraColom().getText())));
            objv.getTxtColomExtraWon().setText("" + objm.colomWon(Float.parseFloat(objv.getTxtColomExtraColom().getText())));

        }
        if (e.getSource() == objv.getBtnConvertColomExtraBack()) {
            objv.getColomExtran().setVisible(false);
            objv.setVisible(true);

        }

        //extracolom
        if (e.getSource() == objv.getBtnConvertExtranColomDolar()) {
            objv.getTxtConverExtranColom().setText("" + objm.dolarColom(Float.parseFloat(objv.getTxtExtranColom().getText())));
        }
        if (e.getSource() == objv.getBtnConvertExtranColomEuro()) {
            objv.getTxtConverExtranColom().setText("" + objm.euroColom(Float.parseFloat(objv.getTxtExtranColom().getText())));
        }
        if (e.getSource() == objv.getBtnConvertExtranColomLibra()) {
            objv.getTxtConverExtranColom().setText("" + objm.libraColom(Float.parseFloat(objv.getTxtExtranColom().getText())));
        }
        if (e.getSource() == objv.getBtnConvertExtranColomYen()) {
            objv.getTxtConverExtranColom().setText("" + objm.yenColom(Float.parseFloat(objv.getTxtExtranColom().getText())));
        }
        if (e.getSource() == objv.getBtnConvertExtranColomWon()) {
            objv.getTxtConverExtranColom().setText("" + objm.wonColom(Float.parseFloat(objv.getTxtExtranColom().getText())));
        }
        if (e.getSource() == objv.getBtnConvertExtranColomBack()) {
            objv.getExtranColom().setVisible(false);
            objv.setVisible(true);
        }
    }

}
