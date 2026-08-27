public class fzo extends fzs<bwy, fib<bwy>> {
   private final fqd a;

   public fzo(fxf<bwy, fib<bwy>> $$0, fqd $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(enk $$0, fqh $$1, int $$2, bwy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clb $$10 = $$3.c(bkn.a);
      if ($$3.y() && !$$3.gw()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gk()) {
            $$11 -= 0.2F * ati.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ati.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cky.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
