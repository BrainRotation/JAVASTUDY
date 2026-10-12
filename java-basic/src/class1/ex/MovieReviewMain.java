package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.title = "인셉션";
        review1.review = "인생은 무한 루프";

        MovieReview review2 = new MovieReview();
        review2.title = "어바웃 타임";
        review2.review = "인생 시간 영화!";

        MovieReview[] Reviews = {review1, review2};

        for (int i = 0; i < Reviews.length; i++){
            System.out.println("영화 제목: " + Reviews[i].title + ", 리뷰: " + Reviews[i].review);

        }

        for (MovieReview r : Reviews) {
            System.out.println("영화 제목: " + r.title + ", 리뷰: " + r.review);
        }
    }
}
