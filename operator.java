public class operator {
    static void main (){
        // arithmatic Operators
        
        int lastWeek = 20;
        int PreviousWeek = 30;
        
        int sum = lastWeek + PreviousWeek;
        int sub = lastWeek - PreviousWeek;
        int divide = lastWeek / 5;
        int module = PreviousWeek % 3;
        int multi = lastWeek * 30;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(divide);
        System.out.println(module);
    
        // Relational Operators
        
        int FirstNumr = 50;
        int SecondNum = 60;
        System.out.println(FirstNumr == SecondNum);
        System.out.println( FirstNumr != SecondNum);
        System.out.println(FirstNumr >= SecondNum);
        System.out.println(FirstNumr <= SecondNum);
        
        //Logial operators
        
        boolean CompletedDsa = true;
        boolean CompletedCore = false;
        System.out.println(CompletedDsa && CompletedCore);
        System.out.println(CompletedDsa || CompletedCore);
        System.out.println(!CompletedDsa);
        
        //assignment Operators
        
        int HotelRating = 100;
        HotelRating += 50;
        System.out.println(HotelRating);
        HotelRating -= 50;
        System.out.println(HotelRating);
        HotelRating *= 2;
        System.out.println(HotelRating);
        HotelRating /= 10;
        System.out.println(HotelRating);
        HotelRating %= 6;
        System.out.println(HotelRating);
        
        // increment operators 
        int a = 20;
        System.out.println(a++); // isma kya ho rha hai kii phlea toh value of a will print then increase 
        System.out.println(a); // isma joh value print hona ka baad increase hui hai woh show hoti hai 
        int b = 20;
        System.out.println(++b); // isma phlea increase hui fir print hui 
        
        // Decrement Operators
        int c = 30;
        System.out.println(c--); //isma kya ho rha hai kii phlea toh value of (c) will print then decrease 
        System.out.println(c);   // isma joh value print hona ka baad decrease hui hai woh show hoti hai 
        int d = 30;
        System.out.println(--d); // isma phlea decrease hui fir print hui 
            
    }
    
}
