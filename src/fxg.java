public class fxg extends fxk<bvb, ffx<bvb>> {
   private final fnv a;

   public fxg(fux<bvb, ffx<bvb>> $$0, fnv $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elk $$0, fnz $$1, int $$2, bvb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cja $$10 = $$3.c(biq.a);
      if ($$3.t() && !$$3.gs()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gg()) {
            $$11 -= 0.2F * ars.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ars.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cix.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
