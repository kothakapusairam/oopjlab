class VJIT implements Runnable
{
       public void run()
         {
              for(int i=1;i<=5;i++)
                {
                      System.out.println("\t From ThreadVJIT: i= "+i);
                }

                 System.out.println("Exit from VJIT");
         }

}


class ThreadRunnableDemo
{
          public static void main(String args[])

           {
                    VJIT c1=new VJIT();
					Thread t=new Thread(c1);
					t.start();
					for(int i=0;i<5;i++)
					{
						System.out.println("Main Thread");
					}
           }

}