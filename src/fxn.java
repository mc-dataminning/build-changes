public class fxn extends fxr<bvi, fge<bvi>> {
   private final foc a;

   public fxn(fve<bvi, fge<bvi>> $$0, foc $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elr $$0, fog $$1, int $$2, bvi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjh $$10 = $$3.c(bix.a);
      if ($$3.y() && !$$3.gv()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gj()) {
            $$11 -= 0.2F * ary.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ary.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cje.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
