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
public class FilteredRecursiveFileLister1 extends FileLister{
    
    String extension;
    
    public FilteredRecursiveFileLister1(File folderToList, String extension) {
        super(folderToList);
    }
    
    @Override
    public List<File> getFileList() {
        List<File> list = new ArrayList<File>();
        list.add(this.folderToList);
        int position = 0;
        while (position < list.size()) {
            File current = list.get(position++);
            if (current.isDirectory()) {
                File[] files = current.listFiles();
                list.addAll(Arrays.asList(files));
            }
        }
        
        File[] files = folderToList.listFiles();
        //List<File> list = new ArrayList<File>();
        
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.getName().endsWith(this.extension)) {
                list.add(file);
            }

        } 
        return list;
    }
}
