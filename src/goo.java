public class goo implements goj<due> {
   private static final float a = 0.375F;
   private final gtb b;

   public goo(gok.a $$0) {
      this.b = $$0.e();
   }

   public void a(due $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      jn $$6 = $$0.m().c(dka.f);
      ka<cwo> $$7 = $$0.b();
      int $$8 = (int)$$0.aA_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cwo $$10 = $$7.get($$9);
         if ($$10 != cwo.j) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            jn $$11 = jn.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cwm.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
