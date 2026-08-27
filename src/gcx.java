public class gcx<T extends blu & bna, M extends fjv<T>> extends gcw<T, M> {
   private final ahg a;
   private final M b;

   public gcx(gag<T, M> $$0, M $$1, ahg $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eqd $$10 = $$1.getBuffer(ftn.e(this.a));
         this.b.a($$0, $$10, $$2, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
