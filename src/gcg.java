public class gcg<T extends bmk, M extends fjw<T>> extends gcx<T, M> {
   private static final ahg a = new ahg("textures/entity/elytra.png");
   private final fjt<T> b;

   public gcg(gah<T, M> $$0, fms $$1) {
      super($$0);
      this.b = new fjt<>($$1.a(fmv.T));
   }

   public void a(eqa $$0, ftg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmx $$10 = $$3.c(blz.e);
      if ($$10.a(cna.nS)) {
         ahg $$13;
         if ($$3 instanceof fsf $$11) {
            gfl $$12 = $$11.b();
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
         eqe $$17 = fzk.a($$1, fto.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, ged.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
