public class gmu<T extends btb, M extends fvt<T>> extends goh<T, M> {
   private final gjk a;

   public gmu(gjm.a $$0, gkn<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eQ();
   }

   @Override
   protected void a(fam $$0, ged $$1, int $$2, bsg $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = ayg.c($$4 * $$4 + $$6 * $$6);
      cms $$9 = new cms($$3.dQ(), $$3.dv(), $$3.dx(), $$3.dB(), cuc.l, null);
      $$9.s((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.t((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dG();
      $$9.P = $$9.dI();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
