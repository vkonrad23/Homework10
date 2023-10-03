package part_2;

public class ProgrammingHobby {
    private String programmingLanguage;
    private int yearsOfExperience;

    public ProgrammingHobby() {
        programmingLanguage = "Java";
        yearsOfExperience = 1;
    }

    public ProgrammingHobby(String language, int experience) {
        programmingLanguage = language;
        yearsOfExperience = experience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String language) {
        programmingLanguage = language;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int experience) {
        yearsOfExperience = experience;
    }

    public String calculateExpertiseLevel() {
        if (yearsOfExperience <= 1) {
            return "Початківець";
        } else if (yearsOfExperience <= 5) {
            return "Середній рівень";
        } else {
            return "Досвідчений";
        }
    }

    public void printHobbyDescription() {
        System.out.println("Мова програмування: " + programmingLanguage);
        System.out.println("Років досвіду: " + yearsOfExperience);
        System.out.println("Рівень експертизи: " + calculateExpertiseLevel());
    }

    public static void main(String[] args) {
        ProgrammingHobby hobby1 = new ProgrammingHobby();
        ProgrammingHobby hobby2 = new ProgrammingHobby("Python", 3);


        System.out.println("Хобі 1:");
        hobby1.printHobbyDescription();

        System.out.println("\nХобі 2:");
        hobby2.printHobbyDescription();
    }
}