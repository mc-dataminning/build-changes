public class gch<T extends bml, M extends fjx<T>> extends gcy<T, M> {
   private static final ahg a = new ahg("textures/entity/elytra.png");
   private final fju<T> b;

   public gch(gai<T, M> $$0, fmt $$1) {
      super($$0);
      this.b = new fju<>($$1.a(fmw.T));
   }

   public void a(eqb $$0, fth $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmy $$10 = $$3.c(bma.e);
      if ($$10.a(cnb.nS)) {
         ahg $$13;
         if ($$3 instanceof fsg $$11) {
            gfm $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cfj.a)) {
               $$13 = $$12.c();
            } else {
               $$13 = a;
            }
         } else {
            $$13 = a;
         }

         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eqf $$17 = fzl.a($$1, ftp.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
