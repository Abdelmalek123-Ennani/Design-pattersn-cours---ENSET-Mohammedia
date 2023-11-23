package ma.abdelmalek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TemplateClass templateClass = new TemplateClassImpl();
        System.out.println(templateClass.templateMethode());

        templateClass = new TemplateClassImpl2();
        System.out.println(templateClass.templateMethode());

    }
}