public class fxl extends fxp<bvg, fgc<bvg>> {
   private final foa a;

   public fxl(fvc<bvg, fgc<bvg>> $$0, foa $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elp $$0, foe $$1, int $$2, bvg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjf $$10 = $$3.c(biv.a);
      if ($$3.y() && !$$3.gv()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gj()) {
            $$11 -= 0.2F * arx.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * arx.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cjc.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
