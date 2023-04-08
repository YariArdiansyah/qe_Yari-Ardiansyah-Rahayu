package restapiassured;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import static  io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.core.IsEqual.equalTo;


public class YariApiSec10 {
    @Test //Mendapatkan semua data post
    public void GetAllPost() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all() //request dari log
                .get("/posts")
                .then()
                .log().all() //response dari log
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("getallpost.json"));
    }
    @Test //Membuat data post baru
    public void PostNewData() {
        int userId = 69;
        String title = "CEK NEW POST";
        String body = "THIS IS YARI ARDIANSYAH";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("title",title);
        bodyRequest.put("body",body);

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(bodyRequest)
                .when()
                .log().all() //request dari log
                .post("/posts")
                .then()
                .log().all() //response dari log
                .statusCode(201)
                .body("id",equalTo(101))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body))
                .body(matchesJsonSchemaInClasspath("postnew.json"));

    }
    @Test //Mendapatkan data post berdasarkan ID
    public void getSpecificPost() {
        int postId = 69 ;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all() //request dari log
                .get("/posts/"+postId)
                .then()
                .log().all() //response dari log
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("getspecificpost.json"));
    }

    @Test //Mengubah data post berdasarkan ID.
    public void editPost() {
        int userId = 23;
        int postId = 69;
        String title = "CEK NEW POST";
        String body = "THIS IS YARI ARDIANSYAH";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("title",title);
        bodyRequest.put("body",body);

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(bodyRequest)
                .when()
                .log().all() //request dari log
                .put("/posts/"+postId)
                .then()
                .log().all() //response dari log
                .statusCode(200)
                .body("id",equalTo(postId))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body))
                .body(matchesJsonSchemaInClasspath("editposts.json"));
    }
    @Test //Menghapus Data Post berdasarkan ID.
    public void DeletePost() {
        int userId = 23;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all() //request dari log
                .delete("/posts/"+userId)
                .then()
                .log().all() //response dari log
                .statusCode(200);
//                .body(matchesJsonSchemaInClasspath("editpost.json"));
    }
}
