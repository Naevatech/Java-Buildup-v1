package TestPractise;

public class PersonalComputer {
    private int memorySize;
    private String processorType;

    protected  PersonalComputer(){

    }
    protected PersonalComputer(int check_memorySize){
        memorySize = check_memorySize;
    }


    protected int getMemorySize() {
        return memorySize;
    }

    protected void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    protected String getProcessorType() {
        return processorType;
    }
}
