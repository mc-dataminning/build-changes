public class geh<T extends boi, M extends fnn<T>> extends gfu<T, M> {
   private final gay a;

   public geh(gba.a $$0, gcb<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eP();
   }

   @Override
   protected void a(esh $$0, fvt $$1, int $$2, bnq $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = awi.c($$4 * $$4 + $$6 * $$6);
      cht $$9 = new cht($$3.dM(), $$3.dr(), $$3.dt(), $$3.dx(), cpd.h);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.M = $$9.dC();
      $$9.N = $$9.dE();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
