package com.company;

public class Main {

    public static void main(String[] args) {
        ScuolaElementare s1 = new ScuolaElementare("1", "1", "1", "1", 1, 1, 1, 1);
        ScuolaMedia s2 = new ScuolaMedia("1", "1", "1", "1", 1, 1, 1, 1);
        Liceo s3 = new Liceo("1", "1", "1", "1", 1, 1, 1, 1);
        Professionale s4 = new Professionale("1", "1", "1", "1", 1, 1, 1, 1);
        Tecnico s5 = new Tecnico("1", "1", "1", "1", 1, 1, 1, 1);

        System.out.println(s1.contributoAnnuale()+" "+s2.contributoAnnuale()+" "+s3.contributoAnnuale()+" "+s4.contributoAnnuale()+" "+s5.contributoAnnuale());

    }
}
