public class gon implements goj<duc> {
   private final gtb a;

   public gon(gok.a $$0) {
      this.a = $$0.e();
   }

   public void a(duc $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      if ($$0.i() != null) {
         int $$6 = $$0.m().c(dxm.by);
         if ($$6 > 0) {
            jn $$7 = $$0.c();
            if ($$7 != null) {
               cwo $$8 = $$0.d();
               if (!$$8.f()) {
                  $$2.a();
                  $$2.a(0.0F, 0.5F, 0.0F);
                  float[] $$9 = this.a($$7, $$6);
                  $$2.a($$9[0], $$9[1], $$9[2]);
                  $$2.a(a.d.rotationDegrees(75.0F));
                  boolean $$10 = $$7 == jn.f || $$7 == jn.e;
                  $$2.a(a.d.rotationDegrees((float)(($$10 ? 90 : 0) + 11)));
                  $$2.b(0.5F, 0.5F, 0.5F);
                  int $$11 = glt.a($$0.i(), $$0.m(), $$0.aA_().a($$7));
                  this.a.a($$8, cwm.i, $$11, heh.d, $$2, $$3, $$0.i(), 0);
                  $$2.b();
               }
            }
         }
      }
   }

   private float[] a(jn $$0, int $$1) {
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
