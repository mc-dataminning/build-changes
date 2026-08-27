public class gob<T extends bso, M extends fww<T>> extends gpr<T, M> {
   private final gko a;

   public gob(gkq.a $$0, glt<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.fb();
   }

   @Override
   protected void a(fbc $$0, gfg $$1, int $$2, brv $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = aym.c($$4 * $$4 + $$6 * $$6);
      cmg $$9 = new cmg($$3.dU(), $$3.dz(), $$3.dB(), $$3.dF(), cuh.i);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.P = $$9.dK();
      $$9.Q = $$9.dM();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
