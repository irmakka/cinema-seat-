import java.util.Scanner;


public class Seat{
   
  public static void main(String[] args) {
        int[][] array=new int[5][5];
        int a = 1;
        int nseat = 0;
        for( int i=0; i<5; i++)
            for( int j=0; j<5; j++)
              array[i][j]=a++; 


        System.out.println("The seats:");
          
             
        for( int i=0;i<5;i++){
            for(  int j=0;j<5;j++){
            /* This part prints the seats to  allow user to see the seats.*/
            System.out.printf("%-3d",array[i][j]);
            }
            System.out.println();

        }
            System.out.println();
            Scanner scan=new Scanner(System.in);
            System.out.print("How many seats do you want?\n");
            int ntickets=scan.nextInt();
            int choosenSeats[]=new int [ntickets];
        
            while(nseat<ntickets){

               System.out.printf("Your %d.seat (Choose one )?\n",nseat+1);
               int seat=scan.nextInt();
               //This part checks if seat number is valid.
               if(seat<1||seat>25){
               System.out.println("Invalid seat number.Enter new one from 1 to 25.");
               continue;
            }

            //Here I am finding  the  place of seat in array.
               int row= (seat-1)/5;
               int column=findc(seat);
              /*This part ensures that user choose same seat just once  if enters the same seat again takes another seat by not changing the nseat .
              */  
              if( array[row][column] !=0){
              System.out.println("Your seat is choosen.\n");
              array[row][column]= 0;
              choosenSeats[nseat]=seat;
              nseat++;
              }    
      
              else{
               System.out.print("This seat is Choosen.Please Choose Again.");
              }
            
            
           }
            scan.close(); 

            System.out.print("Your Seats: "); 
               
            for( int i=0; i<ntickets; i++)
              System.out.print(choosenSeats[i]+"\t");
            
          }


  static int findc(int seat ){
        int column=0;

        switch((seat - 1) % 5){

         case 0: 
                 column= 0; 
                 break;
         case 1:  
                 column= 1; 
                 break;
         case 2:   
                 column= 2; 
                 break;
         case 3:  
                 column=3;
                  break;
         case 4:  
                 column=4;
                  break;
        
        }
       
           return column;
        }
      }
