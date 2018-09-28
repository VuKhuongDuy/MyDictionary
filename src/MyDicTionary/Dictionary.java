package MyDicTionary;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import com.sun.speech.freetts.VoiceManager;

public class Dictionary {

    LinkedList<Word> listWord = new LinkedList<>();
    final String pathFILE = "tudien.txt";

    Dictionary() {
        CreatList(pathFILE);
    }

    void CreatList(String pathFile) {
        if (pathFile == null) {
            pathFile = pathFile;
        }

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                System.out.println("File not exit");
                return;
            }
            
            Scanner inf = new Scanner(file);
            String s1,s2,s3;
            while ((s1 = inf.nextLine()) != null) {
                Word w;
                s2 = s1.substring(0, s1.indexOf("\t"));
                s3 = s1.substring(s1.indexOf("\t") + 1);
                w = new Word(s2, s3);
                listWord.add(w);
            }
            for(int i=0;i<2;i++)
                System.out.println("adfadf");
            System.out.println(listWord.size());
            
        } catch (Exception e) {
        }
    }

    LinkedList<Word> SearchKeyWord(String spelling) {
        LinkedList<Word> listResult = new LinkedList<>();
        
        if(spelling.length()==0)
            return listWord;
        
        for (int i = 0; i < listWord.size(); i++) {
            if (listWord.get(i).getSpelling().indexOf(spelling) == 0) {
                listResult.add(listWord.get(i));
            }
        }
        if(listResult.size()>0)
            QuickSort(listResult, 0, listResult.size() - 1);
        return listResult;
    }

    Boolean Add(String spelling, String explain) {
        Word w = new Word(spelling, explain);
        for (int i = 0; i < listWord.size(); i++) {
            if (listWord.get(i).getSpelling().equals(w.getSpelling())) {
                return false;
            }
        }
        listWord.add(w);
        GhiFile(pathFILE);
        return true;
    }

    Boolean Edit(String spelling, String explain) {
        //spelling = spelling.trim();
        for (int i = 0; i < listWord.size(); i++) {
            //System.out.println(a +":"+spelling+"\n");
            if (spelling.equals(listWord.get(i).getSpelling())) {
                if (!explain.equals(listWord.get(i).getExplain())) {
                    listWord.get(i).setSpelling(spelling);
                    listWord.get(i).setExplain(explain);
                    GhiFile(pathFILE);
                }
                return true;
            }
        }
        return false;
    }

    Boolean Delete(String spelling) {
        spelling = spelling.trim();
        for (Word item : listWord) {
            if (item.getSpelling().equals(spelling)) {
                listWord.remove(item);
                System.out.println(item.getSpelling()+": "+item.getExplain()+"\n");
                GhiFile(pathFILE);
                return true;
            }
        }
        return false;
    }

    void PrintList(LinkedList<Word> list) {
//        CreatList(); 
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getSpelling()+ ": " + list.get(i).getExplain() + "\n");
        }
    }
    
    void GhiFile(String pathName) {
        try {
            File f = new File(pathFILE);
            FileWriter fw = new FileWriter(f);

            for (Word item : listWord) {
                String spelling_ = item.getSpelling() + "\t";
                fw.write(spelling_);
                String explain_ = item.getExplain() + "\n";
                fw.write(explain_);
            }
            fw.close();
        } catch (Exception ex) {
        }
    }

    public void QuickSort(LinkedList<Word> lstWord, int l, int r) {
        Random rd = new Random();
        int c = rd.nextInt(r - l + 1);
        Word key = lstWord.get(l + c);
        int i = l, j = r;
        while (i <= j) {
            while (lstWord.get(i).getSpelling().compareTo(key.getSpelling()) < 0) {
                i++;
            }
            while (lstWord.get(j).getSpelling().compareTo(key.getSpelling()) > 0) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    Collections.swap(lstWord, i, j);
                }
                i++;
                j--;
            }
            if (l < j) {
                QuickSort(lstWord, l, j);
            }
            if (i < r) {
                QuickSort(lstWord, i, r);
            }
        }
    }
}

//        try {
//            String s1, s2, s3;
//            FileReader fileReader = new FileReader(pathFile);
//            BufferedReader buffed = new BufferedReader(fileReader);
//
//            while ((s1 = buffed.readLine()) != null) {
//                Word w;
//                s2 = s1.substring(0, s1.indexOf("\t"));
//                s3 = s1.substring(s1.indexOf("\t") + 1);
//                w = new Word(s2, s3);
//                listWord.add(w);
//            }
//            //QuickSort(listWord, 0, listWord.    size()-1);
//            buffed.close();
//            fileReader.close();
//
//        } catch (IOException ex) {
//            System.out.println("LỖI RỒI");
//        }
