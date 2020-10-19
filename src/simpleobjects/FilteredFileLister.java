/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobjects;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hassan
 */
public class FilteredFileLister extends FileLister {
    
    String extension;
    
    public FilteredFileLister(File folderToList, String extension) {
        super(folderToList);
    }
    
    @Override
    public List<File> getFileList() {
        File[] files = folderToList.listFiles();
        List<File> list = new ArrayList<File>();
        
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.getName().endsWith(this.extension)) {
                list.add(file);
            }

        }   
        return list;
    }
    
}
