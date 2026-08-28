public record fvl(alr a, alr b, alr c, alr d) {
   public fvl(alr $$0, alr $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fvl(alr $$0, alr $$1, alr $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public alr a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
