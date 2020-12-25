public class Project_Class {
	
	
    static int[] left_stations;
    static int[] right_stations;
    static int max_capacity;
    static Scanner input;
    
   public static void main(String[] args)
{
    left_stations = new int[8];
    right_stations = new int[8];
    max_capacity = 4;
    
    int res  = 1;
    System.out.println("Initially robot is at pickup station:");
    while(res!=5){
    
    System.out.println("Enter 1 for loading from pickup to station.");
    System.out.println("Enter 2 for unloading from station 5 to refrigerator");
    System.out.println("Enter 3 for loading from pickup to delivery stations - 9,10,11");
    System.out.println("Enter 4 for loading from pickup to defective storage station - 12");
    System.out.println("Enter 5 exiting!");
    
    input = new Scanner(System.in);
    
    res = input.nextInt();
    if (res==1)
        load_station();
    else if (res==2)
        load_refrigerator();
    else if (res==3)
        load_delivery_st();
    else if (res==4)
        load_defective_st();
    else if (res!=5)
        System.out.println("Invalid input!");
    }
        
}

private static void load_defective_st() { // this is for station 4.
    // TODO Auto-generated method stub
    System.out.println("Picking up the item");
    int target_st = 12;
    System.out.println("\n\nMoving " + target_st + " steps south. Moving 1 step left and"
            + " placing item"
            + " to the left side of station " + target_st);
    
    System.out.println("Returning back to pick up station, "
            + " moving 1 step right and " + target_st + " steps north.");
}

private static void load_delivery_st() { // this is when i press 3. Pickup delivery station.
    // TODO Auto-generated method stub
    System.out.println("Enter target station(out of 9/10/11) depending upon type of delivery");
    int target_st = input.nextInt();
    System.out.println("Picking up the item");
    
    System.out.println("\n\nMoving " + target_st + " steps south. Moving 1 step left and"
            + " placing item"
            + " to the left side of station " + target_st);
    
    System.out.println("Returning back to pick up station, "
            + " moving 1 step right and " + target_st + " steps north.");
}

private static void load_refrigerator() { // this is for station 2 for unloading from register 5 to refrigetor.
    // TODO Auto-generated method stub
    System.out.println("Preparing to move items from station 5 to refrigerator");
    System.out.println("Moving 5 steps south, 1 step right");
    for (int i=0;i<right_stations[4];i++)
        System.out.println("Moving item " + i + " to refrigerator.");
    right_stations[4]=0;
    System.out.println("Moving back to pick up point.");
    System.out.println();
    
}

private static void load_station() { // This method is for loading from pickup station. For number 1.
    // TODO Auto-generated method stub
    System.out.println("Picking up the item, please enter the 5 digit "
            + "serial number : ");
    int serial = input.nextInt();
    System.out.println("Enter weight of the item.");
    int weight = input.nextInt();
    System.out.println("Picked up the item, preparing to place it to station.");
    
    
    if (serial%2!=0) // this is when it is odd.
    {
        int target_st = 0;
        for(int i=0;i<8;i+=1)
        {
            if(left_stations[i] < 4)
                {left_stations[i] ++;
                target_st = i+ 1;
                break;}
        }
        if (serial/10000== 5)
        {
            System.out.println("MSB is 5, so placing the item in refrigerator");
            target_st = 5;
        }
        if(weight>60)
        {
            System.out.println("Weight > 60, so placing it in station 7");
            target_st = 7;
        }
        System.out.println("\n\nMoving " + target_st + " steps south. Moving 1 step left and"
                + " placing item"
                + " to the left side of station " + target_st);
        
        System.out.println("Returning back to pick up station, "
                + " moving 1 step right and " + target_st + " steps north.");
    }
    else // this is when it is even.
    {
        int target_st = 0;
        for(int i=0;i<8;i++)
        {
            if(right_stations[i] < 4)
            {
                right_stations[i] += 1;
                target_st = i+ 1;
                break;
            }
                
        }
        if (serial/10000== 5)
        {
            System.out.println("MSB is 5, so placing the item in refrigerator");
            target_st = 5;
        }
        if(weight>60)
        {
            System.out.println("Weight > 60, so placing it in station 7");
            target_st = 7;
        }
        System.out.println("\n\nMoving " + target_st + " steps south. Moving 1 step right and"
                + " placing item"
                + " to the right side of station " + target_st);
        
        System.out.println("Returning back to pick up station, "
                + " moving 1 step left and " + target_st + " steps north.");
    }
}
 
}
