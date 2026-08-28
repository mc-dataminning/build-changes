public record gpv(ale a, fiv b, gpt c) {
   @Override
   public String toString() {
      String $$0 = this.a + " (" + this.b + ")";
      return !this.c.c() ? $$0 + " with " + this.c : $$0;
   }
}
