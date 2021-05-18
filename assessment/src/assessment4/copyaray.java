package assessment4;

public class copyaray {

	public static void main(String[] args) {
		 int [] arr1 = new int [] {1, 2, 3, 4, 5,8,6,2,3,5};     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length];    
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }  
        System.out.println();
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr1.length-1; i >= 0; i--) {  
            System.out.print(arr1[i] + " ");  
        } 
        System.out.println();
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr1.length; i++) {  
            for(int j = i + 1; j < arr1.length; j++) {  
                if(arr1[i] == arr1[j])  
                    System.out.print(arr1[j]+" ");  
            }  
        }  
	}

}
