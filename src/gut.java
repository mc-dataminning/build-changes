public class gut implements gun<dyj> {
   private static final float a = 0.375F;
   private final gzg b;

   public gut(guo.a $$0) {
      this.b = $$0.e();
   }

   public void a(dyj $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      jb $$7 = $$0.m().c(dns.e);
      jo<czy> $$8 = $$0.c();
      int $$9 = (int)$$0.aB_().a();

      for (int $$10 = 0; $$10 < $$8.size(); $$10++) {
         czy $$11 = $$8.get($$10);
         if ($$11 != czy.k) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            jb $$12 = jb.b(($$10 + $$7.e()) % 4);
            float $$13 = -$$12.p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$11, czw.i, $$4, $$5, $$2, $$3, $$0.i(), $$9 + $$10);
            $$2.b();
         }
      }
   }
}
