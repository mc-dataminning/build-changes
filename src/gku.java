public class gku extends gky<cdi, fsq<cdi>> {
   private final gba a;

   public gku(gii<cdi, fsq<cdi>> $$0, gba $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(exn $$0, gbe $$1, int $$2, cdi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csd $$10 = $$3.d(bqs.a);
      if ($$3.y() && !$$3.gH()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gv()) {
            $$11 -= 0.2F * axw.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * axw.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, csa.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
