public class gol extends gop<cfr, fwd<cfr>> {
   private final gep a;

   public gol(glz<cfr, fwd<cfr>> $$0, gep $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fbc $$0, get $$1, int $$2, cfr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuo $$10 = $$3.a(bsx.a);
      if ($$3.x() && !$$3.gE()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gn()) {
            $$11 -= 0.2F * ayn.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ayn.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cul.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
