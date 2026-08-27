public class ghl implements ghg<dqi> {
   private static final float a = 0.375F;
   private final glp b;

   public ghl(ghh.a $$0) {
      this.b = $$0.d();
   }

   public void a(dqi $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      boolean $$6 = $$0.a;
      iw $$7 = $$0.n().c(dfq.g);
      jj<cuh> $$8 = $$0.b();
      int $$9 = (int)$$0.az_().a();
      float $$10 = $$6 ? -2.5F : -5.0F;
      float $$11 = $$6 ? 11.0F : 7.0F;

      for (int $$12 = 0; $$12 < $$8.size(); $$12++) {
         cuh $$13 = $$8.get($$12);
         if ($$13 != cuh.i) {
            $$2.a();
            $$2.a(0.5F, ($$11 + 0.1875F) / 16.0F, 0.5F);
            iw $$14 = iw.b(($$12 + $$7.e()) % 4);
            float $$15 = -$$14.p();
            $$2.a(a.d.rotationDegrees($$15));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a($$10 / 16.0F, $$10 / 16.0F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$13, cue.i, $$4, $$5, $$2, $$3, $$0.i(), $$9 + $$12);
            $$2.b();
         }
      }
   }
}
