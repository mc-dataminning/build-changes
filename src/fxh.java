public class fxh extends fxl<bvm, ffx<bvm>> {
   private final fnw a;

   public fxh(fuy<bvm, ffx<bvm>> $$0, fnw $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elj $$0, foa $$1, int $$2, bvm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjl $$10 = $$3.c(bjb.a);
      if ($$3.y() && !$$3.gw()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gk()) {
            $$11 -= 0.2F * asb.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * asb.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cji.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
