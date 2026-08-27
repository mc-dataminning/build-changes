public class gmb extends gmf<cet, ftv<cet>> {
   private final gcg a;

   public gmb(gjp<cet, ftv<cet>> $$0, gcg $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eys $$0, gck $$1, int $$2, cet $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cto $$10 = $$3.a(bsb.a);
      if ($$3.y() && !$$3.gH()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gv()) {
            $$11 -= 0.2F * ayd.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ayd.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, ctl.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
