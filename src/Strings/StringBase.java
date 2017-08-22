package Strings;

public class StringBase {

    public static void main(String[] args) {
        String greeting = "HelloWorld!";
        int strLength = greeting.length();
        int cpCount = greeting.codePointCount(0, strLength);

        System.out.println("cpCount is " + cpCount);


        int index = greeting.offsetByCodePoints(0, 3);

        System.out.println("index = " + index);
        System.out.println(greeting.codePointAt(index));



    }

    public void overWriteFunc(){
        return ;
    }
}

class SubStringBase extends StringBase{

    @Override
    public void overWriteFunc() {
        super.overWriteFunc();
    }


}
