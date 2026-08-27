public class gcf<T extends bmk, M extends fjv<T>> extends gcw<T, M> {
   private static final ahg a = new ahg("textures/entity/elytra.png");
   private final fjs<T> b;

   public gcf(gag<T, M> $$0, fmr $$1) {
      super($$0);
      this.b = new fjs<>($$1.a(fmu.T));
   }

   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmx $$10 = $$3.c(blz.e);
      if ($$10.a(cna.nS)) {
         ahg $$13;
         if ($$3 instanceof fse $$11) {
            gfk $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cfi.a)) {
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
         eqd $$17 = fzj.a($$1, ftn.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
