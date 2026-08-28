public class gnl<T extends btl, M extends fwj<T>> extends goy<T, M> {
   private final gkb a;

   public gnl(gkd.a $$0, gle<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eQ();
   }

   @Override
   protected void a(fbc $$0, get $$1, int $$2, bsq $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = ayn.c($$4 * $$4 + $$6 * $$6);
      cnd $$9 = new cnd($$3.dQ(), $$3.dv(), $$3.dx(), $$3.dB(), cuo.l, null);
      $$9.s((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.t((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dG();
      $$9.P = $$9.dI();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
