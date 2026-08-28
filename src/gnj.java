public class gnj<T extends btc, M extends fuq<T>> extends goa<T, M> {
   private static final akk a = new akk("textures/entity/elytra.png");
   private final fun<T> b;

   public gnj(glk<T, M> $$0, fxm $$1) {
      super($$0);
      this.b = new fun<>($$1.a(fxp.W));
   }

   public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cud $$10 = $$3.a(bso.e);
      if ($$10.a(cug.nT)) {
         akk $$13;
         if ($$3 instanceof gde $$11) {
            gqq $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmm.a)) {
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
         fas $$17 = gkm.a($$1, gen.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
