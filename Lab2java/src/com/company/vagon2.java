package com.company;

/**
 * Created by ghorn on 28.09.2016.
 */
public class vagon2 extends vagon {
    public void IzmenitxChisloMest (int NovoeChisloMest) {
        this.ChisloMest = NovoeChisloMest;
    }

    public void VagonInfo() {
        System.out.println("Номер вагона: " + NomerEtogoVagona +" "+ " Число свободный мест: " + ChisloMest );
        System.out.println("Информация о свободных местах: ");
        for (int i=0;i<ChisloMest;i++)
            if (Mesta[i]==0) System.out.print((i+1)+" ");
        System.out.println("");
    }

}
