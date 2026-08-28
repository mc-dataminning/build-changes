public class gtd implements gsy<dxr> {
   private final gxr a;

   public gtd(gsz.a $$0) {
      this.a = $$0.e();
   }

   public void a(dxr $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      if ($$0.i() != null) {
         int $$7 = $$0.m().c(ebe.by);
         if ($$7 > 0) {
            jb $$8 = $$0.c();
            if ($$8 != null) {
               czk $$9 = $$0.d();
               if (!$$9.f()) {
                  $$2.a();
                  $$2.a(0.0F, 0.5F, 0.0F);
                  float[] $$10 = this.a($$8, $$7);
                  $$2.a($$10[0], $$10[1], $$10[2]);
                  $$2.a(a.d.rotationDegrees(75.0F));
                  boolean $$11 = $$8 == jb.f || $$8 == jb.e;
                  $$2.a(a.d.rotationDegrees((float)(($$11 ? 90 : 0) + 11)));
                  $$2.b(0.5F, 0.5F, 0.5F);
                  int $$12 = gqh.a($$0.i(), $$0.m(), $$0.ax_().a($$8));
                  this.a.a($$9, czi.i, $$12, hja.d, $$2, $$3, $$0.i(), 0);
                  $$2.b();
               }
            }
         }
      }
   }

   private float[] a(jb $$0, int $$1) {
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
