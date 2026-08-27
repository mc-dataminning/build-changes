public class fxr implements fxm<diz> {
   private static final float a = 0.375F;
   private final gbr b;

   public fxr(fxn.a $$0) {
      this.b = $$0.d();
   }

   public void a(diz $$0, float $$1, esa $$2, fvm $$3, int $$4, int $$5) {
      ie $$6 = $$0.r().c(czc.f);
      is<coz> $$7 = $$0.c();
      int $$8 = (int)$$0.aE_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         coz $$10 = $$7.get($$9);
         if ($$10 != coz.h) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ie $$11 = ie.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cow.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
