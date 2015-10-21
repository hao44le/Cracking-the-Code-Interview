//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

public class practice_1 {

    public boolean uniqueCharacters(String string){
        int[] result = new int[128];
        for (int i = 0;i<string.length();i++){
            char c = string.charAt(i);
            int ascii = c;
            if (result[ascii] == 0) {
                result[ascii]++;
            } else {
                return false;
            }
            
            
        }
        return true;
    }

    public static void main(String[] args){
        practice_1 object = new practice_1();
        System.out.println(object.uniqueCharacters("123"));
        System.out.println(object.uniqueCharacters("123321"));
        System.out.println(object.uniqueCharacters("123asdqw"));
        System.out.println(object.uniqueCharacters("123zxcwefad"));
        System.out.println(object.uniqueCharacters("123adadasdqe"));
        System.out.println(object.uniqueCharacters("123qwertyuiop"));
        System.out.println(object.uniqueCharacters("123-=\'/ "));
        System.out.println(object.uniqueCharacters("123!@#$%^*"));
        System.out.println(object.uniqueCharacters("123"));
    }

}

