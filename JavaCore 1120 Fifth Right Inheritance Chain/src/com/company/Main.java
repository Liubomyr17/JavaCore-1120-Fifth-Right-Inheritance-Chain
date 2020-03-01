package com.company;

/*

1120 Fifth Right Inheritance Chain
Arrange correctly the “chain of inheritance” in the classes: House (house), Cat (cat), Dog (dog), Car (car), Animal (animal), Assets (property).
Requirements:
1. The class House must be inherited from the class Assets.
2. The Cat class must be inherited from the Animal class.
3. The Dog class must be inherited from the Animal class.
4. The Car class must be inherited from the Assets class.
5. The Animal class should not be inherited from our classes.
6. The Assets class should not be inherited from our classes.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    }
    public class House extends Assets {
    }
    public class Cat extends Animal {
    }
    public class Car extends Assets {
    }

    public class Dog extends Animal {
    }
    public class Animal {
    }
    public class Assets {
    }
}


