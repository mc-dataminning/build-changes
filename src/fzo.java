public class fzo<T extends blg, M extends fhp<T>> extends gaf<T, M> {
   private static final agi a = new agi("textures/entity/elytra.png");
   private final fhm<T> b;

   public fzo(fxs<T, M> $$0, fkk $$1) {
      super($$0);
      this.b = new fhm<>($$1.a(fkn.Q));
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clj $$10 = $$3.c(bkv.e);
      if ($$10.a(clm.nS)) {
         agi $$13;
         if ($$3 instanceof fpt $$11) {
            gcu $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cdv.a)) {
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
         eoa $$17 = fwv.a($$1, frc.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
