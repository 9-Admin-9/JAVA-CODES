import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
class MapConceptBluePrint {
    public static void basics() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 2000);
        hm.put("china", 3000);
        hm.put("pakisthan", 90);
        hm.put("america", 40000);
        hm.put("japan", 300);

        System.out.println("Printing only keys using keySet() method:");
        for (String key : hm.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nPrinting only values using values() method:");
        for (int value : hm.values()) {
            System.out.println(value);
        }

        System.out.println("\nPrinting entries using entrySet() method:");
        Set<Entry<String, Integer>> entries = hm.entrySet();
        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void occurancesOfEachCharcterInAGivenString(String str){

        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        for(char ch:hm.keySet()){
            System.out.println(ch+":"+hm.get(ch));
        }
    }
    public static void valuePairs(int[] a){
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for(int x: a){
            if(hm.containsKey(x)){
                hm.put(x, hm.get(x)+1);
            }
            else{
                hm.put(x, 1);
            }
        }
        int count = 0;
        for(int v:hm.values()){
            count=count+v/2;
        }
        System.out.println("total number of pairs are: "+count);
    }
    public static void printAllWordsThatOccurMoreThanThreeTimes(String str){
        str= str.toLowerCase();
        String[] sa = str.split("\\s+");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s:sa){
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else{
                hm.put(s, 1);
            }
        }
        /*for(String x:hm.keySet()){
            if(hm.get(x)>3){
                System.out.println(x);
            }
        }
        */
        Set<Entry<String,Integer>> entries = hm.entrySet();
        for(Entry<String,Integer> e: entries){
            if(e.getValue()>3){
                System.out.println(e.getKey());
            }
        }
    }
    public static void printOccurancesOfMaxWord(String str){
        str= str.toLowerCase();
        String[] sa = str.split("\\s+");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s:sa){
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else{
                hm.put(s, 1);
            }
        }
        /*for(String x:hm.keySet()){
            if(hm.get(x)>3){
                System.out.println(x);
            }
        }
        */
        int max = 0;
        String maxKey=null;
        Set<Entry<String,Integer>> entries = hm.entrySet();
        for(Entry<String,Integer> e: entries){
            if(e.getValue()>max){
                max=e.getValue();
                maxKey=e.getKey();
            }
        }
        System.out.println(maxKey);
    }
}
public class MapConcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter string");
        //String str = sc.nextLine();
        //MapConceptBluePrint.occurancesOfEachCharcterInAGivenString(str);
        /*System.out.println("enter array size");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("enter elements into an array");
        for(int i = 0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        MapConceptBluePrint.valuePairs(ar);
        */
        System.out.println("enter string");
        String str = sc.nextLine();
        //MapConceptBluePrint.printAllWordsThatOccurMoreThanThreeTimes(str);
        MapConceptBluePrint.printOccurancesOfMaxWord(str);
    }
}
