public class gru implements grp<dws> {
   private final gwi a;

   public gru(grq.a $$0) {
      this.a = $$0.e();
   }

   public void a(dws $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      if ($$0.i() != null) {
         int $$6 = $$0.m().c(eae.by);
         if ($$6 > 0) {
            ja $$7 = $$0.c();
            if ($$7 != null) {
               cys $$8 = $$0.d();
               if (!$$8.f()) {
                  $$2.a();
                  $$2.a(0.0F, 0.5F, 0.0F);
                  float[] $$9 = this.a($$7, $$6);
                  $$2.a($$9[0], $$9[1], $$9[2]);
                  $$2.a(a.d.rotationDegrees(75.0F));
                  boolean $$10 = $$7 == ja.f || $$7 == ja.e;
                  $$2.a(a.d.rotationDegrees((float)(($$10 ? 90 : 0) + 11)));
                  $$2.b(0.5F, 0.5F, 0.5F);
                  int $$11 = goy.a($$0.i(), $$0.m(), $$0.aw_().a($$7));
                  this.a.a($$8, cyq.i, $$11, hhp.d, $$2, $$3, $$0.i(), 0);
                  $$2.b();
               }
            }
         }
      }
   }

   private float[] a(ja $$0, int $$1) {
      float[] $$2 = new float[]{0.5F, 0.0F, 0.5F};
      float $$3 = (float)$$1 / 10.0F * 0.75F;
      switch ($$0) {
         case f:
            $$2[0] = 0.73F + $$3;
            break;
         case e:
            $$2[0] = 0.25F - $$3;
            break;
         case b:
            $$2[1] = 0.25F + $$3;
            break;
         case a:
            $$2[1] = -0.23F - $$3;
            break;
         case c:
            $$2[2] = 0.25F - $$3;
            break;
         case d:
            $$2[2] = 0.73F + $$3;
      }

      return $$2;
   }
}
