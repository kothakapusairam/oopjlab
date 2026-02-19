// Demonstrate a two-dimensional array.
class TwoDArray 
	{
    public static void main(String args[])
		{
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        // Fill the array
        for (i = 0; i < 4; i++) 
		{
            for (j = 0; j < 5; j++) 
				{
                twoD[i][j] = k;
                k++;
				}
        }

        // Print the array
        for (i = 0; i < 4; i++) 
		{
            for (j = 0; j < 5; j++) 
			{
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        } // End of printing loop
    } // End of main method
} // End of class