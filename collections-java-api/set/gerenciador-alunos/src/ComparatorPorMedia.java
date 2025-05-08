import java.util.Comparator;

public class ComparatorPorMedia implements Comparator<Aluno> {

    @Override
    public int compare(Aluno p1, Aluno p2) {
        return Double.compare(p1.getMatricula(), p2.getMatricula());
    }
    

}
