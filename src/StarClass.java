public class StarClass {
    public static void main(String[] args) {
        int numberOfLines = 4;
        for(  int i = 1; i <= numberOfLines; i++){
            for(int j= 1 ; j <= numberOfLines + i-1 ; j++ ){
                if(j <= numberOfLines - i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}
