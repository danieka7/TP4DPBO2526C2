import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PeopleMenu {
    private JTextField idField;
    private JTextField namaField;
    private JTextField tahunField;
    private JTextField emailField;
    private JComboBox kategoriBox;
    private JRadioButton noviceRadioButton;
    private JRadioButton regionalChampionRadioButton;
    private JButton addButton;
    private JButton cancelButton;
    private JTable tabelPlayer;
    private JPanel mainPanel;
    private JLabel dataPemainEsportLabel;

    private ArrayList<Person> personList;

    // konstruktor
    public PeopleMenu(){
        personList = new ArrayList<>();
        // menambahkan data hardcode
        personList.add(new Person("PL001","f0rsakeN","Indonesia",2004,"Duelist", "Masters Champion"));
        personList.add(new Person("PL002","mindfreak","Indonesia",1999,"Controller", "Masters Champion"));
        personList.add(new Person("PL003","Jinggg","Singapura",2003,"Duelist", "Masters Champion"));
        personList.add(new Person("PL004","TenZ","Kanada",2001,"Duelist", "Masters Champion"));
        personList.add(new Person("PL005","aspas","Brasil",2003,"Duelist","World Champion"));

        setTable();
    }

    public void setTable(){
        String[] columnNames = {"ID", "Nama", "Negara", "Tahun Lahir","Kategori", "Skill Level"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // menambahkan data dari ArrayList ke tabel
        for(Person person : personList){
            Object[] rowData = {person.getId(), person.getNama(), person.getNegara(), person.getTahunLahir(), person.getKategori(), person.getSkillLevel()};
            model.addRow(rowData);
        }
        tabelPlayer.setModel(model);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Player Table");
        PeopleMenu peopleTableInstance = new PeopleMenu();

        frame.setContentPane(peopleTableInstance.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
