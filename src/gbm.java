public class gbm<T extends bmf, M extends fku<T>> extends gcz<T, M> {
   private final fyd a;

   public gbm(fyf.a $$0, fzg<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eO();
   }

   @Override
   protected void a(ept $$0, fsz $$1, int $$2, blp $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = aui.c($$4 * $$4 + $$6 * $$6);
      cfj $$9 = new cfj($$3.dM(), $$3.dr(), $$3.dt(), $$3.dx(), cmr.f);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dC();
      $$9.O = $$9.dE();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
