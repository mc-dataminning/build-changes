public class gbt<T extends bmk, M extends flb<T>> extends gdg<T, M> {
   private final fyk a;

   public gbt(fym.a $$0, fzn<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eO();
   }

   @Override
   protected void a(eqa $$0, ftg $$1, int $$2, blu $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = aun.c($$4 * $$4 + $$6 * $$6);
      cfp $$9 = new cfp($$3.dM(), $$3.dr(), $$3.dt(), $$3.dx(), cmx.f);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dC();
      $$9.O = $$9.dE();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
