public class gip<T extends bqo, M extends frr<T>> extends gkc<T, M> {
   private final gfg a;

   public gip(gfi.a $$0, ggj<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eQ();
   }

   @Override
   protected void a(ewi $$0, fzz $$1, int $$2, bpv $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = axk.c($$4 * $$4 + $$6 * $$6);
      ckb $$9 = new ckb($$3.dM(), $$3.dr(), $$3.dt(), $$3.dx(), crj.i);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dC();
      $$9.O = $$9.dE();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
