/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobjects;

import java.io.File;

/**
 *
 * @author hassan
 */
public class FileListerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File targetFolder = new File( ".");
        FileLister lister = new FileLister( targetFolder);
        lister.display();

        lister = new FilteredFileLister( targetFolder, ".xml");
        lister.display();
        
        lister = new RecursiveFileLister( targetFolder);
        lister.display();

        lister = new FilteredRecursiveFileLister1(targetFolder, ".xml");
        lister.display();
        
    }
    
}
