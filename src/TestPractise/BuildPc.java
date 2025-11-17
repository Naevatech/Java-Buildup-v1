package TestPractise;

public class BuildPc {
    public static void main(String[] args) {
        int memorySize=0;
        //instance of a class
        PersonalComputer computer = new PersonalComputer();
        PersonalComputer computer1 = new PersonalComputer(90);
        computer1.setProcessorType("Intel Core i9");

        System.out.println(computer1.getMemorySize());
        System.out.println(computer1.getProcessorType());
    }
}
