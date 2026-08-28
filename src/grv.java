public class grv implements grp<dwu> {
   private static final float a = 0.375F;
   private final gwi b;

   public grv(grq.a $$0) {
      this.b = $$0.e();
   }

   public void a(dwu $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      ja $$6 = $$0.m().c(dmj.e);
      jn<cys> $$7 = $$0.c();
      int $$8 = (int)$$0.aw_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cys $$10 = $$7.get($$9);
         if ($$10 != cys.k) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ja $$11 = ja.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cyq.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
