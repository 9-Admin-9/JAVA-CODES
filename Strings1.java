import java.util.Scanner;

class BluePrint{
    public static String reverseString(String str){
        String res = "";
        for(int i = str.length()-1;i>=0;i--){
            res = res +str.charAt(i);
        }
        return res;
    }
    public static String palindromeString(String str){
        /*String rev= reverseString(str);
        if(str.equals(rev)){
            return "given string is palindrome string";
        }
        else{
            return "not a palindrome string";
        }
            or
        */
        int i = 0, j = str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return "not a palindrome";
            }
        }
       return "palindrome string";
    }
    public static int countNumberOfSpacesInTheGivenString(String str){
        int count = 0;
        for(int i = 0;i<str.length()-1;i++){
           if(str.charAt(i)==' '){
            count++;
           }
        }
        return count;
    }
    public static int countNumberOfWordsInAGivenString(String str){
         String[] words = str.split("\\s+");
        return words.length;
    }
    public static int numberOfVowelsInAGivenString(String str){
        str = str.toLowerCase();
        int vcount = 0;
        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vcount++;
            }
        }
        return vcount;
    }public static int numberOfConsonantsInAGivenString(String str){
        str = str.toLowerCase();
        int concount = 0;
        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                concount++;
            }
        }
        return concount;
    }
    public static void countVowelsConsonantsNumericSpecialCharacterInaGivenString(String str){
        str = str.toLowerCase();
        int vc = 0;
        int cc = 0;
        int dc = 0;
        int sc =0;
        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch =='e'||ch=='i'||ch=='o'||ch=='u'){
                vc++;
                }
                else{
                    cc++;
                }
            }
            else if(ch>='0'&&ch<='9'){
                dc++;
            }
            else{
                sc++;
            }
        }
        System.out.println("vowel count: "+vc);
        System.out.println("consonant count: "+cc);
        System.out.println("digits count :"+dc);
        System.out.println("special characters count : "+sc);
    }
    public static void removeSpecialCharacters(String str){
        String res = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(res);
    }
    public static void alterSpecialCharacters(String str){
        String res1=str.replaceAll("[^a-zA-Z]", "");
        String res2=str.replaceAll("[^0-9]", "");
        System.out.println(res1+res2);

    }
    public static void convertToLowerCase(String str){
        String res = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
            res= res+(char)(ch+32);
            }
            else{
                res= res+ch;
            }
        }
        System.out.println(res);
    }
    public static void upperCaseToLowerCaseAndLowerCaseToUpperCase(String str){
        String res = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                res=res+(char)(ch+32);
            }
            else if(ch>='a'&&ch<='z'){
                res= res+(char)(ch-32);
            }
            else{
                res = res+ch;
            }
        }
        System.out.println(res);
    }
    public static void trimAllTheSpacesFromStartingAndEndingOfTheString(String str){
        String res = "";
        int si = 0;
        int ei=0;
        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i)!=' '){
                si=i;
                break;
            }
        }
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                ei=i;
                break;
            }
        }
        for(int i = si;i<=ei;i++){
            res=res+str.charAt(i);
        }
        System.out.println(res);
    }
    public static void removeAllExtraSpacesPresentInTheGivenString(String str){
        int si = 0;
        int ei = 0;
        String res = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                si=i;
                break;
            }
        }
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                ei=i;
                break;
            }
        }
        for(int i = si;i<=ei;i++){
            if(str.charAt(i)!=' '||str.charAt(i)==' '&&str.charAt(i+1)!=' '){
                res=res+str.charAt(i);
            }
        }
        System.out.println(res);
    }
    public static void printAllSubStringsOfLength(String str, int size){
        for(int i = 0;i<=str.length()-size;i++){
            String res = "";
            for(int  j = i;j<i+size;j++){
                res=res+str.charAt(j);
            }
            System.out.println(res);
        }
    }
}
public class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        //System.out.println( BluePrint.reverseString(str));
        //System.out.println(BluePrint.palindromeString(str));
        //System.out.println(BluePrint.countNumberOfSpacesInTheGivenString(str));
        //System.out.println(BluePrint.countNumberOfWordsInAGivenString(str));
        //System.out.println(BluePrint.numberOfVowelsInAGivenString(str));
        //System.out.println(BluePrint.numberOfConsonantsInAGivenString(str));
        //BluePrint.countVowelsConsonantsNumericSpecialCharacterInaGivenString(str);
        //BluePrint.removeSpecialCharacters(str);
        //BluePrint.alterSpecialCharacters(str);
        //BluePrint.convertToLowerCase(str);
        //BluePrint.upperCaseToLowerCaseAndLowerCaseToUpperCase(str);
        //BluePrint.trimAllTheSpacesFromStartingAndEndingOfTheString(str);
        //BluePrint.removeAllExtraSpacesPresentInTheGivenString(str);
        System.out.println("enter size");
        int size=sc.nextInt();
        BluePrint.printAllSubStringsOfLength(str, size);
    }
}
