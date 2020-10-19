/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobjects;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hassan
 */
public class FileLister {
    protected final File folderToList;

    public FileLister(File folderToList) {
        this.folderToList = folderToList;
    }

    public List<File> getFileList() {
        File[] files = folderToList.listFiles();
        List<File> list = new ArrayList<File>();
        list.addAll(Arrays.asList(files));
        return list;
    }

    public void display() {
        for( File f : this.getFileList()) {
            System.out.println( f);
        }
        System.out.println();
    }
}


