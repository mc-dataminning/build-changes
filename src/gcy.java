public class gcy<T extends blu & bna, M extends fjw<T>> extends gcx<T, M> {
   private final ahg a;
   private final M b;

   public gcy(gah<T, M> $$0, M $$1, ahg $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(eqa $$0, ftg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eqe $$10 = $$1.getBuffer(fto.e(this.a));
         this.b.a($$0, $$10, $$2, ged.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
