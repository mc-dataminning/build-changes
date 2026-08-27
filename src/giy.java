public class giy<T extends bqt, M extends fsa<T>> extends gkl<T, M> {
   private final gfp a;

   public giy(gfr.a $$0, ggs<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eQ();
   }

   @Override
   protected void a(ewr $$0, gai $$1, int $$2, bqa $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = axm.c($$4 * $$4 + $$6 * $$6);
      cki $$9 = new cki($$3.dM(), $$3.dr(), $$3.dt(), $$3.dx(), crs.i);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dC();
      $$9.O = $$9.dE();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
