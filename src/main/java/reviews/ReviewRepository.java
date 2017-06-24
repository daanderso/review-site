package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	//Creating review map
	Map<Long,Review> reviewMap = new HashMap<Long, Review>();
	
	//Constructor
	public ReviewRepository() {
    
	//Creating review object to place into the map
	Review review = new Review(12345, "Spiderman", "/images/spiderman.jpg", "Action", "Spiderman is a great movie. A young man finds with great power comes responsibility", "2012", "A young man is bitten by a radioactive spider", "tag");
	reviewMap.put(review.getId(),review);
	Review review2 = new Review(13579, "Superman", "/images/superman.jpg", "Action", "Thrilling. Does it get any better.", "1978", "Alien escapes his dying planet to becomes earth's new hero", "tag");
	reviewMap.put(review2.getId(),review2);
	Review review3 = new Review(17777, "Batman Begins", "/images/batman.jpg", "Action", "Christian Bale is Outstanding.", "2005", "Billionaire in bat costume saves Gotham City", "tag");
	reviewMap.put(review3.getId(),review3);
	
	}	
	//Method find all values in review map
    public Collection<Review> findAll() {
    	return reviewMap.values();
    }
    //Find one review in the map
    public Review findOne(Long id) {
    	return reviewMap.get(id);
    }
}

