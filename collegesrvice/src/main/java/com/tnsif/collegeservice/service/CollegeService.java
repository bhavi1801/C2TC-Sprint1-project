import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.collegesrvice.entity.CollegeEntity;
import com.tnsif.collegesrvice.repository.CollegeRepository;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepo;

    public CollegeEntity saveCollege(CollegeEntity college) {
        return collegeRepo.save(college);
    }

    public CollegeEntity getCollegeById(int id) {
        return collegeRepo.findById(id).orElse(null);
    }

    public void deleteCollege(int id) {
        collegeRepo.deleteById(id);
    }

    public List<CollegeEntity> getColleges() {
        return collegeRepo.findAll();
    }

    public CollegeEntity updateCollege(int id, CollegeEntity college) {
        if (collegeRepo.existsById(id)) {
            college.setId(id);
            return collegeRepo.save(college);
        }
        return null;
    }
}
