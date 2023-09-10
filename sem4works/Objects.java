package sem4works;


/**
 * InnerObjects
 */
class PrintArray {
    public  <T> void printArray(T[] items) { // принимаем массив неопределенного типа и печатаем его
        for (T t : items) {
            System.out.print(t + " ");

        }
        System.out.println("\n");

    }
}    



class Objects {

    public static <T> void printElement(T obj) { // принимаем элемент неопределенного типа и печатаем его
        System.out.println(obj);
    }




    public static void main(String[] args) {
        printElement("Hello world");
        printElement(32);
        printElement(23.2);

        PrintArray printArray = new PrintArray();

        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
        String[] stringArray = { "Hello", "World", "!" };
        // printArray(intArray);
        // printArray(stringArray);
        printArray.printArray(intArray);
        printArray.printArray(stringArray);

        

    }
}

