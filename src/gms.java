public class gms<T extends btp, M extends fua<T>> extends gnj<T, M> {
   private static final alf a = new alf("textures/entity/elytra.png");
   private final ftx<T> b;

   public gms(gkt<T, M> $$0, fww $$1) {
      super($$0);
      this.b = new ftx<>($$1.a(fwz.W));
   }

   public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cup $$10 = $$3.a(btb.e);
      if ($$10.a(cus.nT)) {
         alf $$13;
         if ($$3 instanceof gcn $$11) {
            gpz $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmy.a)) {
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
         fac $$17 = gjv.a($$1, gdw.a($$13), false, $$10.y());
         this.b.a($$0, $$17, $$2, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
