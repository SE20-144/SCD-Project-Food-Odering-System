package project;

public class Array {
    String [] items;
    int count;
    public Array(int lenght){
        items=new String[lenght];
    }
    public void insert(String item){
        if (items.length==count){
            String [] U_items=new String[count*2];
            for (int i=0;i<count;i++){
                U_items[i]=items[i];
            }
            items=U_items;
        }
        items[count]=item;
        count++;
    }
    public int indexof(String item){
        for (int i=0;i<count;i++){
            if (items[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
    public  void print(){
        for (int i=0;i<count;i++) System.out.println(items[i].toUpperCase());
    }
}

