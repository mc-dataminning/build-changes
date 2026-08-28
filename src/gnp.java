public class gnp<T extends btn, M extends fwn<T>> extends gpc<T, M> {
   private final gkf a;

   public gnp(gkh.a $$0, gli<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eQ();
   }

   @Override
   protected void a(fbg $$0, gex $$1, int $$2, bsr $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = ayo.c($$4 * $$4 + $$6 * $$6);
      cnf $$9 = new cnf($$3.dP(), $$3.du(), $$3.dw(), $$3.dA(), cuq.l, null);
      $$9.t((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.u((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dF();
      $$9.P = $$9.dH();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
