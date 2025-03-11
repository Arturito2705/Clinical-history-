import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Patient {
    private String fullName;
    private int id;
    private Date birthDate;
    private boolean sex; // true for male, false for female
    private double weight;
    private double height;
    private String address;
    private List<Picture> pictures;
    private List<Diseases> diseases;

    // Constructor por defecto
    public Patient() {
        this.pictures = new ArrayList<>();
        this.diseases = new ArrayList<>();
    }

    // Constructor con parámetros
    public Patient(String fullName, int id, Date birthDate, boolean sex, double weight, double height, String address) {
        this.fullName = fullName;
        this.id = id;
        this.birthDate = birthDate;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.address = address;
        this.pictures = new ArrayList<>();
        this.diseases = new ArrayList<>();
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public int getID() {
        return id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getAddress() {
        return address;
    }

    // Métodos para manejar imágenes
    public void addPicture(Picture picture) {
        pictures.add(picture);
    }

    public void deletePicture(Picture picture) {
        pictures.remove(picture);
    }

    // Métodos para manejar enfermedades
    public void addDiseases(Diseases disease) {
        diseases.add(disease);
    }

    public void deleteDiseases(Diseases disease) {
        diseases.remove(disease);
    }
}

class Diseases {
    private String name;
    private Date date;
    private String remedy;

    // Constructor por defecto
    public Diseases() {}

    // Constructor con parámetros
    public Diseases(String name, Date date, String remedy) {
        this.name = name;
        this.date = date;
        this.remedy = remedy;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemedy() {
        return remedy;
    }

    public void setRemedy(String remedy) {
        this.remedy = remedy;
    }
}

class Picture {
    private Date date;
    private String type;
    private String advisement;

    // Constructor por defecto
    public Picture() {}

    // Constructor con parámetros
    public Picture(Date date, String type, String advisement) {
        this.date = date;
        this.type = type;
        this.advisement = advisement;
    }

    // Getters y Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdvisement() {
        return advisement;
    }

    public void setAdvisement(String advisement) {
        this.advisement = advisement;
    }
}
