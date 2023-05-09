package ex.experiment;

class WrappersTest {

    public static void main(String[] args) {

        String ageInput = "56";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);

        String populationInput = "8000000000";
        long parseLong = Long.parseLong(populationInput);
        Long populationLong = Long.valueOf(populationInput);

        String salaryInput = "35000.01";
        double salary = Double.parseDouble(salaryInput);
        Double salaryDouble = Double.valueOf(salaryInput);
    }
}