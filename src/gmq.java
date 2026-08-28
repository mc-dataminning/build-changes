public record gmq(akv a, ffz b, gmo c) {
   @Override
   public String toString() {
      String $$0 = this.a + " (" + this.b + ")";
      return !this.c.c() ? $$0 + " with " + this.c : $$0;
   }
}
