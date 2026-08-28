public class gzu extends gzy<hcw, ggb> {
   public gzu(gxh<hcw, ggb> $$0) {
      super($$0);
   }

   public void a(fiq $$0, gpd $$1, int $$2, hcw $$3, float $$4, float $$5) {
      hes $$6 = $$3.i;
      if (!$$6.c() && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azk.a($$3.u * 0.6F) + 0.2F;
            $$8 -= 0.09F * azk.a($$3.u * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         $$6.a($$0, $$1, $$2, hhp.d);
         $$0.b();
      }
   }
}
