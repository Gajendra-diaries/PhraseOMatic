public class PhraseOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[] wordListOne = { "hello","hi","who","wining","you","how","loseing","god","dear"};
       String[] wordListTwo = {"name","Gajendra","Choudhary","dua","lipa","card","code","java","lion"};
       String[] wordListThree = {"raja","flower","mole","atom","kitty","perry","daredevil","ironfist","bahubali"};
       
       int oneLength = wordListOne.length;
       int twoLength = wordListTwo.length;
       int threeLength = wordListThree.length;
       
       int rand1 = (int) (Math.random() * oneLength);
       int rand2 = (int) (Math.random() * twoLength);
       int rand3 = (int) (Math.random() * threeLength);
       
       String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
       System.out.println("What we need is a phrase "+phrase);
    }
    
}
