package com.company;

/**
 * Created by ghorn on 28.09.2016.
 */
public class vagon {
    protected int ChisloMest=36;
    protected int [ ] Mesta;
    public int NomerEtogoVagona;

    public void PustojVagon(int NomerVagona) {
        NomerEtogoVagona=NomerVagona;
        Mesta = new int[ChisloMest];
        for (int i=0;i<ChisloMest;i++) Mesta[i]=0;
        // 0 - признак того, что место свободно
    }

    public int MestoZanyato(int NomerMesta) {
        return Mesta[NomerMesta-1];
    }

    public void ZanyatxMesto(int NomerMesta) {
        if (MestoZanyato(NomerMesta) == 1)  System.out.println("Это место занято, выберете другое \n " + "Номер места " + NomerMesta + " Вагон №: " + NomerEtogoVagona);
        else Mesta[NomerMesta-1]=1;
        // 1 - признак того, что место занято
    }

    public void VagonInfo() {
        System.out.println("Информация о свободных местах:");
        for (int i=0;i<ChisloMest;i++)
            if (Mesta[i]==0) System.out.print((i+1)+" ");
        System.out.println("");
    }

}
