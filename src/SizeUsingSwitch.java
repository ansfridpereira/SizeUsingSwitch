class SizeUsingSwitch {
    public static void main(String[] args) {
        System.out.println("the numbers will be only between 1 to 5");
        int number = 2;
        String size;

        // switch statement to check size
        switch (number) {

            case 1:
                size = "Small";
                break;

            case 2:
                size = "Medium";
                break;

            case 3:
                size = "Large";
                break;

            case 4:
                size = "Extra Large";
                break;

            case 5:
                size = "Largest";
                break;

            default:
                size = "Unknown";
                break;

        }
        System.out.println("Size: " + size);
    }
}