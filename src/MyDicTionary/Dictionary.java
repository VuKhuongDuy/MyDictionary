package MyDicTionary;

import com.darkprograms.speech.synthesiser.SynthesiserV2;
import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import com.darkprograms.speech.translator.GoogleTranslate;

public final class Dictionary {

    LinkedList<Word> listWord=new LinkedList<>();;
    final String pathAnhViet = "Anh-Viet.txt";
    final String pathVietAnh ="Viet-Anh.txt";
    final String pathFILE;

    Dictionary() {        
        pathFILE = pathAnhViet;
        creatList(pathFILE);
    }
    
    Dictionary(String path){
        if(path.equals("Anh-Viet"))
        {
            pathFILE=pathAnhViet;
            creatList(pathFILE);
        }
        else
        {
            pathFILE=pathVietAnh;
            creatList(pathFILE);
        }
    }
    
    //Dictionary(String)

    void creatList(String pathFile) {
        if (pathFile == null) {
            pathFile = pathFile;
        }
        
        String s1, s2, s3;
        Word w;
        
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader buffed = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(pathFile), "UTF8"));
            
            // Xử lí từ đầu tiên của từ điển,,nếu là txt có utf8, từ đầu tiên chứa kí tự rác
            while ((s1 = buffed.readLine()) != null) {
                s2 = s1.substring(0, s1.indexOf("\t"));
                s3 = s1.substring(s1.indexOf("\t") + 1);
                w = new Word(s2, s3);
                listWord.add(w);
            }
            
            buffed.close();
            fileReader.close();

        } catch (IOException ex) {
            System.out.println("LỖI RỒI");
        }
    }

    LinkedList<Word> searchKeyWord(String spelling) {
        LinkedList<Word> listResult = new LinkedList<>();
        
        if(spelling.length()==0)
            return listWord;
        
        for (int i = 0; i < listWord.size(); i++) {
            if (listWord.get(i).getSpelling().indexOf(spelling) == 0) {
                listResult.add(listWord.get(i));
            }
        }
        if(listResult.size()>0)
            quickSort(listResult, 0, listResult.size() - 1);
        
        return listResult;
    }

    Boolean add(String spelling, String explain) {
        Word w = new Word(spelling, explain);
        for (int i = 0; i < listWord.size(); i++) {
            if (listWord.get(i).getSpelling().equals(w.getSpelling())) {
                return false;
            }
        }
        listWord.add(w);
        ghiFile();
        return true;
    }

    Boolean edit(String spellingOld,String spellingNew, String explain) {
        for (int i = 0; i < listWord.size(); i++) {
            if (spellingOld.equals(listWord.get(i).getSpelling())) {
                if(spellingOld.equals(spellingNew) || !contain(listWord,spellingNew))
                {
                    Word w=new Word(spellingNew,explain);
                    listWord.add(i+1, w);
                    listWord.remove(i);
                    ghiFile();
                    return true;
                }
            }
        }
        return false;
    }

    Boolean delete(String spelling) {
        spelling = spelling.trim();
        for (Word item : listWord) {
            if (item.getSpelling().equals(spelling)) {
                listWord.remove(item);
                System.out.println(item.getSpelling()+": "+item.getExplain()+"\n");
                ghiFile();
                return true;
            }
        }
        return false;
    }
    
    void speak(String text,double speed)
    {
        SynthesiserV2 synthesizer = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");
        
        Thread thread;
        thread = new Thread(() -> {
            try {
                synthesizer.setSpeed(speed);
                AdvancedPlayer player = new AdvancedPlayer(synthesizer.getMP3Data(text));
                player.play();
            } catch (IOException | JavaLayerException e) {
            }
        });
		
        thread.setDaemon(false);
		
        thread.start();
    }
    
    String translateByGoogle(String language,String spelling)
    {
        String explain = "!!!Không có ý nghĩa!!!";
        Boolean internet=false;
        try{
            explain = GoogleTranslate.translate(language, spelling);
            internet=true;
        }catch(IOException e){}
        return explain;
    }
    
    void printList(LinkedList<Word> list) {
//        CreatList(); 
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getSpelling()+ ": " + list.get(i).getExplain() + "\n");
        }
    }
    
    void ghiFile() {
        //QuickSort(listWord, 0, listWord.size());
        try {
            File f = new File(pathFILE);
            try (FileWriter fw = new FileWriter(f)) {
                for (Word item : listWord) {
                    String spelling_ = item.getSpelling() + "\t";
                    fw.write(spelling_);
                    String explain_ = item.getExplain() + "\n";
                    fw.write(explain_);
                }
            }
        } catch (IOException ex) {
        }
    }

    public void quickSort(LinkedList<Word> lstWord, int l, int r) {
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
                quickSort(lstWord, l, j);
            }
            if (i < r) {
                quickSort(lstWord, i, r);
            }
        }
    }
    
    public boolean contain(LinkedList<Word> listword,String spelling)
    {
        for(Word item:listword)
        {
            if(item.getSpelling().equals(spelling))
                return true;
        }
        return false;
    }
}
