package com.company;

public class Main {
        public static void main(String[] args) {

            vagon2 v1 = new vagon2();
            v1.PustojVagon(10);
            v1.ZanyatxMesto(1);
            v1.ZanyatxMesto(10);
            v1.ZanyatxMesto(15);
            v1.VagonInfo();
            vagon2 v2 = new vagon2();
            v2.IzmenitxChisloMest(16);
            v2.PustojVagon(14);
            v2.ZanyatxMesto(5);
            v2.ZanyatxMesto(11);
            v2.ZanyatxMesto(7);
            v2.ZanyatxMesto(11);
            v2.ZanyatxMesto(5);
            v2.VagonInfo();
        }
}
