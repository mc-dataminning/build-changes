public final class fyq {
   private final akt a;
   private final String b;

   public fyq(akt $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public akt a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fyq $$1) ? false : this.a.equals($$1.a) && this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      return 31 * $$0 + this.b.hashCode();
   }

   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
