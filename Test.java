interface A {static void test() {} }

interface B{ default int test(int a)
    
    {return 0;} 
}