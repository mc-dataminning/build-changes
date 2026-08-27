public class gbi<T extends blv, M extends fiy<T>> extends gbz<T, M> {
   private static final agt a = new agt("textures/entity/elytra.png");
   private final fiv<T> b;

   public gbi(fzj<T, M> $$0, flu $$1) {
      super($$0);
      this.b = new fiv<>($$1.a(flx.T));
   }

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmh $$10 = $$3.c(blk.e);
      if ($$10.a(cmk.nS)) {
         agt $$13;
         if ($$3 instanceof frh $$11) {
            geo $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(ces.a)) {
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
         eph $$17 = fym.a($$1, fsq.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
