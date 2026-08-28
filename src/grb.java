public class grb extends grf<gua, fxx> {
   private final gnq a;

   public grb(goo<gua, fxx> $$0, gnq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fcu $$0, ggv $$1, int $$2, gua $$3, float $$4, float $$5) {
      gym $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azc.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azc.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cvl $$9 = $$3.aY_();
         this.a.a($$9, cvi.h, false, $$0, $$1, $$2, gwb.d, $$6);
         $$0.b();
      }
   }
}
