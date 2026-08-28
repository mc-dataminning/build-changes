public record fwa(alk a, alk b, alk c, alk d) {
   public fwa(alk $$0, alk $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fwa(alk $$0, alk $$1, alk $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alk a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
