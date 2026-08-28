public record gfc(akv a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
