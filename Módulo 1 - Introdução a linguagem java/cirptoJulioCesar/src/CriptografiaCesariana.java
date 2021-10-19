public class CriptografiaCesariana implements Criptografia {

  @Override
  public String criptografar(String texto) {
    if (texto.length() == 0) {
      throw new IllegalArgumentException("empty text");
    }

    String lcText = texto.toLowerCase();
    int textSize = texto.length();
    int counter = 0;
    String encrypted = "";

    while (counter < textSize) {
      char character = lcText.charAt(counter);

      if(character == ' ') {
        encrypted = (encrypted + character);
        counter++;
        continue;
      }

      int ascii = (int) character;

      if (48 <= ascii && ascii <= 57) {
        character = (char) ascii;
        encrypted = (encrypted + character);
      } else if (97 <= ascii && ascii <= 119) {
        ascii += 3;
        character = (char) ascii;
        encrypted = (encrypted + character);
      } else if (120 <= ascii && ascii <= 122) {
        ascii -= 23;
        character = (char) ascii;
        encrypted = (encrypted + character);
      }

      counter++;
    }

    return encrypted;
  }

  @Override
  public String descriptografar(String texto) {
    if (texto.length() == 0) {
      throw new IllegalArgumentException("empty text");
    }

    String lcText = texto.toLowerCase();
    int textSize = texto.length();
    int counter = 0;
    String encrypted = "";

    while (counter < textSize) {
      char character = lcText.charAt(counter);

      if(character == ' ') {
        encrypted = (encrypted + character);
        counter++;
        continue;
      }

      int ascii = (int) character;

      if (48 <= ascii && ascii <= 57) {
        character = (char) ascii;
        encrypted = (encrypted + character);
      } else if (100 <= ascii && ascii <= 122) {
        ascii -= 3;
        character = (char) ascii;
        encrypted = (encrypted + character);
      } else if (97 <= ascii && ascii <= 99) {
        ascii += 23;
        character = (char) ascii;
        encrypted = (encrypted + character);
      }

      counter++;
    }

    return encrypted;

//    throw new UnsupportedOperationException("esse method nao esta implementado aainda");
  }
}
