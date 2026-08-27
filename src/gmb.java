public class gmb extends gmf<cev, ftv<cev>> {
   private final gcg a;

   public gmb(gjp<cev, ftv<cev>> $$0, gcg $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eyu $$0, gck $$1, int $$2, cev $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ctq $$10 = $$3.a(bsd.a);
      if ($$3.y() && !$$3.gH()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gv()) {
            $$11 -= 0.2F * ayf.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ayf.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, ctn.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
