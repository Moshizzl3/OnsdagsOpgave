import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuderendeTest {

  @Test
  void getNavn() {
    //Arrange
    Studerende studerende = new Studerende("Ib");
    String expected = "Ib";

    //Act
    String actual = studerende.getNavn();


    //Assert
    assertEquals(expected,actual);
  }
}