public record gaj(alc a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
