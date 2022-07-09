package com.syntax.class15class16.class16;

public class Access1 {
    //Access Modifiers:private,default,protected, public. AccessMods keywords
    // we put in front of the variables or class or method.


    //Default AccessMods is set by Java automatically if we don't specify otherwise. Can access files methods or classes
    //within the same package.

    //Public AccessMods allows to access info  anywhere inside the same project( in any packages, any classes)

    //Private:When we use private keyword with a method or field it is only accessible within the same file or class.
    //It is most restricted access modifier.

    //Protected:When we use keyword protected access modifier it gives us access only to files(methods, classes, variables)
    //within the same package, unless we extend it to another class (we use word "extends" for it , for example:
    // public class Access3 extends Access1 )

    // Important: in order to access methods or variables, even if the public(if within the same project) or default
    // ( if withing the same package) we must have  public or default CLASS correspondingly
    public int hours=3;
    public int minutes=47;

    protected int getHours(){
        return hours;
    }
}
