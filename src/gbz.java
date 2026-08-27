public class gbz<T extends bmf, M extends fjp<T>> extends gcq<T, M> {
   private static final ahd a = new ahd("textures/entity/elytra.png");
   private final fjm<T> b;

   public gbz(gaa<T, M> $$0, fml $$1) {
      super($$0);
      this.b = new fjm<>($$1.a(fmo.T));
   }

   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmr $$10 = $$3.c(blu.e);
      if ($$10.a(cmu.nS)) {
         ahd $$13;
         if ($$3 instanceof fry $$11) {
            gff $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cfc.a)) {
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
         epx $$17 = fzd.a($$1, fth.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
