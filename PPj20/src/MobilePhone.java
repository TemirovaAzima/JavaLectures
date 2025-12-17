public class MobilePhone extends Phone{
    private String[] calls = new String[10];

    public  MobilePhone(String communicationInterface,String color){
        super(communicationInterface,color);
    }

    public void callArr(Phone number){
        for(int i = 0; i < calls.length ; i++){
            if(!calls[calls.length -1].equals(getNumber())){
                calls[i] = number.getNumber();
            }
        }
    }
    @Override
    public void displayCallHistory(){
        for(String num : calls){
            System.out.println(num);
        }
    }
}
