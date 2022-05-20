package day055;

import java.util.List;

public class MainUnboxing {
    public static void main(String[] args) {

        // Unboxing

        Aygit aygit1 = new ElektronikAygit();
        Aygit aygit2 = new MekanikAygit();

        // ((MekanikAygit)aygit2).     -> Mekanik oldugunu biliyoruz.
        // ((ElektronikAygit)aygit1).  -> Elektronik oldugunu biliyoruz.

    }
}
