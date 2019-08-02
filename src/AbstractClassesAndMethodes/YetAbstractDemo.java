package AbstractClassesAndMethodes;

/**
 Абстрактным называют класс, который не может иметь экземпляров и который может содержать абстрактные методы (методы без реализации). Для того, чтобы сделать класс абстрактным необходимо применить ключевое слово abstract. Вот некоторые данные об абстрактных классах:

 Абстрактный класс не может иметь ни одного экземпляра.
 Если мы наследуем абстрактный класс, то мы должны имплементировать все его абстрактные методы (методы без реализации).
 Абстрактный класс может содержать обычные и/или абстрактные методы.
 Если класс содержит хотя бы оди абстарактный метод, то он должен быть объявлен, как абстрактный.
 */

abstract class Profession{
    private String professionName;
    private String industry;

    public Profession(String professionName, String industry){
        this.professionName = professionName;
        this.industry = industry;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public abstract void DoJob();

    @Override
    public String toString(){
        return "Info: " +
                "\nProfession Name: " + professionName +
                "\nIndustry: " + industry;
    }
}

class Developer extends Profession {
    private String speciality;

    public Developer(String professionName, String industry, String speciality) {
        super(professionName, industry);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void DoJob() {
        System.out.println("Developer writes code...");
    }

    @Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality;
    }
}

class Pilot extends Profession{
    private String aircreaftType;

    public Pilot(String professionName, String industry, String aircreaftType) {
        super(professionName, industry);
        this.aircreaftType = aircreaftType;
    }

    public String getAircreaftType() {
        return aircreaftType;
    }

    public void setAircreaftType(String aircreaftType) {
        this.aircreaftType = aircreaftType;
    }

    @Override
    public void DoJob() {
        System.out.println("Pilot controls " + this.aircreaftType);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Aircraft Type: " + this.aircreaftType;
    }
}

public class YetAbstractDemo{
    public static void main(String[] args) {
        Developer JavaDeveloper = new Developer("Developer", "IT", "Java");
        Pilot pilot = new Pilot("Pilot", "Aviation", "Boeing 67675");
        Profession CppDeveloper = new Developer("Developer", "IT", "C#");

        System.out.println(JavaDeveloper);
        System.out.println("\n===============\n");
        System.out.println(pilot);
        System.out.println("\n===============\n");
        System.out.println(CppDeveloper);
    }

}
