class Main {
    
    public static void main(String[] args) {
    
        Student student = new Student("Janice Gayangan", "IT21C", "Be the change you wish to see in the world");
        
        System.out.println("Name: "  + student.getName());
        System.out.println("Section: " + student.getSection());
        System.out.println("Motto: " + student.getMotto());
    }
}
