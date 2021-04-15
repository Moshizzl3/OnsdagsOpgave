import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuderendeTest {

  private Studerende studerende;

  @BeforeEach
  private void setup() {
    studerende = new Studerende("Ib");
  }


  @Test
  void getNavn() {
    //Arrange

    String expected = "Ib";

    //Act
    String actual = studerende.getNavn();


    //Assert
    assertEquals(expected,actual);
  }

  @Test
  void getForkertNavn() {
    //Arrange
    String expected = "Lis";

    //Act
    String actual = studerende.getNavn();

    //Assert
    assertNotEquals(expected, actual);

  }


}