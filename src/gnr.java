public class gnr<T extends btn, M extends fwp<T>> extends gpe<T, M> {
   private final gkh a;

   public gnr(gkj.a $$0, glk<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eP();
   }

   @Override
   protected void a(fbi $$0, gez $$1, int $$2, bsr $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = ayo.c($$4 * $$4 + $$6 * $$6);
      cnf $$9 = new cnf($$3.dO(), $$3.dt(), $$3.dv(), $$3.dz(), cuq.l, null);
      $$9.t((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.u((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dE();
      $$9.P = $$9.dG();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
