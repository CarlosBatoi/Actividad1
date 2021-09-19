package es.cipfpbatoi.ad;

import java.io.File;
import java.io.FilenameFilter;

public class App {
    public static void main(String[] args) {
        String directorio = System.getProperty("user.dir");
        System.out.println("\nEste es el directorio actual " + directorio);
        File archivo = new File(directorio);
        FilenameFilter filtro = filtro(args[0]);
        String[] AllFiles = archivo.list();
        String[] UserFiles = archivo.list(filtro);

        if (UserFiles.length <= 0) {

                for (int i = 0; i < AllFiles.length; i++) {
                    System.out.println(AllFiles[i]);
                }
        } else
            for (int i = 0; i < UserFiles.length; i++) {
                System.out.println(UserFiles[i]);
            }

    }


    public static FilenameFilter filtro(final String argumento) {
        FilenameFilter filtro = new FilenameFilter() {
            public boolean accept(File dir, String name) {

                if (name.contains(argumento)) {
                    return true;
                } else
                    return false;

            }
        };

        return filtro;

    }
}

