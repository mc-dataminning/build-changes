public class ghk implements ghg<dqg> {
   private final glp a;

   public ghk(ghh.a $$0) {
      this.a = $$0.d();
   }

   public void a(dqg $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      if ($$0.i() != null) {
         int $$6 = $$0.n().c(dts.bv);
         if ($$6 > 0) {
            iw $$7 = $$0.d();
            if ($$7 != null) {
               cuh $$8 = $$0.f();
               if (!$$8.d()) {
                  $$2.a();
                  $$2.a(0.0F, 0.5F, 0.0F);
                  float[] $$9 = this.a($$7, $$6);
                  $$2.a($$9[0], $$9[1], $$9[2]);
                  $$2.a(a.d.rotationDegrees(75.0F));
                  boolean $$10 = $$7 == iw.f || $$7 == iw.e;
                  $$2.a(a.d.rotationDegrees((float)(($$10 ? 90 : 0) + 11)));
                  $$2.b(0.5F, 0.5F, 0.5F);
                  int $$11 = gfe.a($$0.i(), $$0.n(), $$0.az_().a($$7));
                  this.a.a($$8, cue.i, $$11, gqp.d, $$2, $$3, $$0.i(), 0);
                  $$2.b();
               }
            }
         }
      }
   }

   private float[] a(iw $$0, int $$1) {
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
