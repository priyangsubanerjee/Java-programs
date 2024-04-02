package BinaryCompare;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class compare {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Give two files to compare.");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        try (BufferedInputStream fileInput_1 = new BufferedInputStream(new FileInputStream(file1));
             BufferedInputStream fileInput_2 = new BufferedInputStream(new FileInputStream(file2))) {

            int i = 0;
            while (true) {
                try {
                    int binary_1 = fileInput_1.read();
                    int binary_2 = fileInput_2.read();

                    if (binary_1 != binary_2) {
                        System.out.println("First difference at byte position " + i);
                        return;
                    }
                    i++;
                } catch (EOFException e) {
                    // handle the exceptions accordingly :)
                    return;
                }
            }
        }
    }
}
