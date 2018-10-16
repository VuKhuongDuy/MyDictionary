package MyDicTionary;

import com.darkprograms.speech.synthesiser.SynthesiserV2;
import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import com.darkprograms.speech.translator.GoogleTranslate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class Dictionary {

    Map<String,String> listWord=new TreeMap<>();
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
            pathFile = pathFILE;
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
                listWord.put(w.getSpelling(), w.getExplain());
            }
            
            buffed.close();
            fileReader.close();

        } catch (IOException ex) {
            System.out.println("LỖI RỒI");
        }
    }

    Map<String,String> search(String spelling) {
        Map<String,String> listResult = new TreeMap<>();
        if(spelling.length()==0)
            return listWord;
        
        spelling =spelling.toLowerCase();
        int x=0;
        for(String key:listWord.keySet())
        {
            if(key.indexOf(spelling)==0)
            {
                listResult.put(key, listWord.get(key));
                x=1;
            }            
            else if(x==1)
                break;
        }
       
        return listResult;
    }

    Boolean add(String spelling, String explain) {
         Word w = new Word(spelling, explain);
        if(listWord.containsKey(w.getSpelling()))
            return false;
        listWord.put(w.getSpelling(), w.getExplain());
        return true;
    }

    Boolean edit(String spellingOld,String spellingNew, String explain) {
        spellingNew=spellingNew.toLowerCase();
        spellingOld=spellingOld.toLowerCase();
        explain=explain.toLowerCase();
        try{
            listWord.remove(spellingOld);
            listWord.put(spellingNew, explain);
            return true;
        }catch(Exception e) {}
        return false;
    }

    Boolean delete(String spelling) {
        spelling=spelling.toLowerCase();
        spelling = spelling.trim();
        if(!listWord.containsKey(spelling))
            return false;
        for(String key:listWord.keySet())
        {
            if(key.equals(spelling))
            {
                listWord.remove(key);
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
        spelling=spelling.toLowerCase();
        String explain = "!!!Không có ý nghĩa!!!";
        try{
            explain = GoogleTranslate.translate(language, spelling);
        }catch(IOException e){}
        return explain;
    }
    
    void ghiFile() {
        //QuickSort(listWord, 0, listWord.size());
        Map<String,String> map = new TreeMap<>();
        try
        {
            FileWriter fileWriter = new FileWriter(pathFILE);
            BufferedWriter buffed = new BufferedWriter(
		   new OutputStreamWriter(new FileOutputStream(pathFILE), "UTF8"));
            for (String key : listWord.keySet())
            {
                    if (!map.containsKey(key)) 
                    {
                        map.put(key, listWord.get(key));
                        String spelling_ = key + "\t";
                        buffed.write(spelling_);
                        String explain_ = listWord.get(key) + "\n";
                        buffed.write(explain_);
                    }
            }
            
            buffed.close();
            fileWriter.close();
        } catch (IOException ex) {}
     }
    
    //    
//    void printList(Map<String,String> list) {
////        CreatList(); 
//        Set<String> keySet= list.keySet();
//        for(String key:keySet)
//        {
//            System.out.print(key);
//            for(int i=0;i<45-key.length();i++)
//                System.out.print(" ");
//            System.out.print(list.get(key)+"\n");
//        }
//    }
}
