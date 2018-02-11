package onlinecoding;

public class SpecialString {

    public void countSpecialSubString(String string) {

        char[] charAraay = string.toCharArray();
        int length = string.length();
        boolean isSpecialString;
        int specialSubStringCount = 0;

        for (int i = 0; i < length; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = i; j < length; j++ ) {
                stringBuffer.append(charAraay[j]);
                String tempString = stringBuffer.toString();
                isSpecialString = isSubStringSpecial(tempString);
                if (isSpecialString) {
                    specialSubStringCount++;
                    System.out.println("special :" + tempString);
                }
                //System.out.print(tempString + " ");
            }
            System.out.println();
        }

        System.out.println(specialSubStringCount);

    }


    private boolean isSubStringSpecial(String subString) {
        char[] charArray = subString.toCharArray();

        if (subString.length() == 1) {
            // return true as length 1 is special string
            return true;
        }
        if (subString.length()%2 != 0) {
            // check with inbuilt method using .equals
            // and return as per that
            int middleValue = subString.length()/2;
            String frontString = subString.substring(0,middleValue);
            String rearString = subString.substring(middleValue+1);

            return frontString.equals(rearString);

        }

        if (subString.length()%2 == 0) {
            // traverse the subString and check if all are equal or not
            char toCheckChar = charArray[0];
            for (int i = 0; i < subString.length(); i++) {
                if (charArray[i] != toCheckChar) {
                    return false;
                }
            }
            return true;
        }

         return false;

    }


    public static void main(String[] args) {
        SpecialString specialString = new SpecialString();

        specialString.countSpecialSubString("aba");
    }



}
