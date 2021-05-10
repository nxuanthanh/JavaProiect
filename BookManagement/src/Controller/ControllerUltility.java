/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BookReaderManagement;
import java.util.ArrayList;

/**
 *
 * @author Xuan Thanh
 */
public class ControllerUltility {

    public ArrayList<BookReaderManagement> updateBRMInfo(ArrayList<BookReaderManagement> list, BookReaderManagement brm) {
        boolean isUpdate = false;
        for (int i = 0; i < list.size(); i++) {
            BookReaderManagement b = list.get(i);
            if (b.getBook().getBookID() == brm.getBook().getBookID()
                    && b.getReader().getReaderID() == brm.getReader().getReaderID()) {
                list.set(i, brm); //cập nhật lại đối tượng  quản lí mượn
                isUpdate = true;
            }
        }
        if (!isUpdate) {
            list.add(brm);
        }
        return list;
    }

    public ArrayList<BookReaderManagement> updateTotalBorrowed(ArrayList<BookReaderManagement> list) {
        for (int i = 0; i < list.size(); i++) {
            BookReaderManagement b = list.get(i);
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getReader().getReaderID() == b.getReader().getReaderID()) {
                    count += list.get(j).getNumOfBorrow();
                }
            }
            b.setTotalBorrowed(count); //update totalBorrowed
            list.set(i, b);
        }
        return list;
    }

    public ArrayList<BookReaderManagement> sortByReaderName(ArrayList<BookReaderManagement> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                BookReaderManagement b = list.get(j);
                BookReaderManagement br = list.get(j - 1);
                if (b.getReader().getFullName().substring(b.getReader().getFullName().lastIndexOf(" ")).
                        compareTo(br.getReader().getFullName().substring(br.getReader().getFullName().lastIndexOf(" "))) < 0) {
                    // doi cho
                    list.set(j, br);
                    list.set(j - 1, b);
                }
            }
        }
        return list;
    }

    public ArrayList<BookReaderManagement> sortByTotalBorrowed(ArrayList<BookReaderManagement> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                BookReaderManagement b = list.get(j);
                BookReaderManagement br = list.get(j - 1);
                if (b.getTotalBorrowed() > br.getTotalBorrowed()) {
                    // doi cho
                    list.set(j, br);
                    list.set(j - 1, b);
                }
            }
        }
        return list;
    }

    public ArrayList<BookReaderManagement> searchByreaderName(ArrayList<BookReaderManagement> list, String key) {
        ArrayList<BookReaderManagement> result = new ArrayList<>();
        String pattern = ".*" + key.toLowerCase() + ".*";
        for (int i = 0; i < list.size(); i++) {
            BookReaderManagement b = list.get(i);
            if (b.getReader().getFullName().toLowerCase().matches(pattern)) {
                result.add(b);
            }
        }
        return result;
    }
}
