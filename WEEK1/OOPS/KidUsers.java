package WEEK1.OOPS;

class KidUsers implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered under a kids account");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if(bookType.equalsIgnoreCase("Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("oops, you are not allowed to take only kids books");
        }
    }
    
}
