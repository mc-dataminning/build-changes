public class gkr<T extends bsa, M extends fsb<T>> extends gli<T, M> {
   private static final akh a = new akh("textures/entity/elytra.png");
   private final fry<T> b;

   public gkr(gis<T, M> $$0, fux $$1) {
      super($$0);
      this.b = new fry<>($$1.a(fva.W));
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csz $$10 = $$3.d(bro.e);
      if ($$10.a(ctc.nT)) {
         akh $$13;
         if ($$3 instanceof gan $$11) {
            gny $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cli.a)) {
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
         eyb $$17 = ghv.a($$1, gbw.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
