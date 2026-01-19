package BasicsAndSyntax.SystechInternship;

public class SystechInternship1 {
    public void internshipTask(){
        // for (int i = 1; i < 6; i++){
        //     for (int j = 0; j < i; j++){
        //     System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        for (int i = 0; i < 6; i++){// vertical
            for (int j = 0; j <= i; j++){// horizontal
                System.out.print("*");
            }
            System.out.println("");
        }
        // for (int i = 6; i > 0; i--){// vertical
        //     for (int j = 0; j < i; j++){// horizontal
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
    }
}

