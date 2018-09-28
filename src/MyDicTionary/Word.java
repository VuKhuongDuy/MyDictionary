package MyDicTionary;

public class Word {
    private String Spelling; 
    private String Explain;
    
    Word() 
    {        
        this.Spelling="";
        this.Explain ="";
    }
    
    Word(String spelling,String explain)
    {
        this.Spelling = spelling.trim();
        this.Explain = explain.trim();
    }
    
    void setSpelling(String spelling)
    {
        spelling = spelling.trim();
        this.Spelling = this.Spelling.replaceAll(this.Spelling, spelling);
    }
    
    void setExplain(String explain)
    {
        explain = explain.trim();
        this.Explain = this.Explain.replaceAll(this.Explain, explain);
    }
    
    String getSpelling()
    {
        return Spelling; 
    }
    
    String getExplain()
    {
        return Explain; 
    }
    
    Boolean equalWord(Word w)
    {
        if(this.Spelling.equals(w.getSpelling()))
            return true;
        return false;
    }
}